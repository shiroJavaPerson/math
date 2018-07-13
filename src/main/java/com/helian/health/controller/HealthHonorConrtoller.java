package com.helian.health.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.helian.health.cache.RedisService;
import com.helian.health.domain.honor.HealthHonorInfo;
import com.helian.health.service.HealthHonorService;
import com.helian.health.util.JsonResult;
import com.helian.health.util.JsonUtil;
import com.helian.health.util.ResultCode;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@RestController
@ControllerAdvice
@RequestMapping(value = "/V2.0/honor")
@Api(value = "荣誉任务相关", tags = "honor",consumes="application/json, application/xml")
public class HealthHonorConrtoller {

    private Logger logger = Logger.getLogger(HealthHonorConrtoller.class);

    @Autowired
    private HealthHonorService healthHonorService;

    @Value("${img.url}")
    private String IMG_URL;

    @Autowired
    private RedisService redisService;

    @ApiOperation(value = "获取荣誉列表", notes = "根据userId获取用户未完成和已完成的荣誉列表")
    @RequestMapping(value = "/getHonor.json", method = RequestMethod.GET)
    public ResponseEntity<JsonResult<List<JSONObject>>> getHonorByUserId(
            @ApiParam(value = "用户ID") @RequestHeader("uid") String user_id,
            @ApiParam(value = "用户token") @RequestHeader("token") String token) {
        if(StringUtils.isAnyBlank(user_id,token)) return ResponseEntity.ok(new JsonResult<List<JSONObject>>(ResultCode.PARAM_WRONG));
        if (!redisService.validate(user_id, token)) return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);

        List<JSONObject> list = Lists.newLinkedList();
        //该list只存储阅读资讯获得的勋章
        List<JSONObject> readInfoList = Lists.newArrayList();
        healthHonorService.addPatientInfoHonor(user_id);
        JSONObject json;
        List<HealthHonorInfo> resultList = healthHonorService.getHonorInfo(user_id, null);
        //如果isShow等于A,则未获得勋章也显示；否则只有获得勋章时才显示，不获得不显示
        String[] key = {"img_url", "id", "name"};
        for (HealthHonorInfo info : resultList) {
            if (info.getHealthHonor().getIsShow().equals("A")) {
                //如果userId不为空，则该任务已完成；否则未完成
                if (StringUtils.isNotBlank(info.getUserId())) {
                    String[] value = {IMG_URL + info.getHealthHonor().getImgUrl(), info.getId().toString(), info.getHealthHonor().getName()};
                    json = JsonUtil.putStringInJson(key, value);
                    json.put("isFinished", true);
                    //如果type等于2，则将json放入readInfoList中；另外一个List不存储
                    logger.info("type:" + info.getHealthHonor().getType());
                    if (info.getHealthHonor().getType() == 2) {
                        readInfoList.add(json);
                    } else {
                        list.add(json);
                    }
                } else {
                    String[] value = {IMG_URL + info.getHealthHonor().getNotFinishedImgUrl(), info.getId().toString(), info.getHealthHonor().getName()};
                    json = JsonUtil.putStringInJson(key, value);
                    json.put("isFinished", false);
                    list.add(json);
                }
            } else if (StringUtils.isNotBlank(info.getUserId())) {
                String[] value = {IMG_URL + info.getHealthHonor().getImgUrl(), info.getId().toString(), info.getHealthHonor().getName()};
                json = JsonUtil.putStringInJson(key, value);
                json.put("isFinished", true);
                if (info.getHealthHonor().getType() == 2) {
                    readInfoList.add(json);
                } else {
                    list.add(json);
                }
            }
        }
        //如果readInfoList的尺寸大于1，则只取第一个元素，以达到只显示最高级的阅读资讯勋章的目的，
        // 因为最高级的勋章一定是最后获得的
        if (readInfoList.size() > 0) {
            list.add(0,readInfoList.get(0));
        }
        return  ResponseEntity.ok(new JsonResult<>(list));
    }

    @ApiOperation(value = "根据荣誉Id和userId获取单个荣誉勋章的详细信息", notes = "根据荣誉Id和userId获取单个荣誉勋章的详细信息")
    @RequestMapping(value = "/honorInfoById.json", method = RequestMethod.GET)
    public ResponseEntity<JsonResult<JSONObject>> honorInfoById(
            @ApiParam(value = "用户ID") @RequestHeader("uid") String user_id,
            @ApiParam(value = "用户Token") @RequestHeader("token") String token,
            @ApiParam(value = "荣誉勋章Id", required = true) @RequestParam("id") String id
    ) {
        if (StringUtils.isAnyBlank(user_id, token, id)) return ResponseEntity.ok(new JsonResult<JSONObject>(ResultCode.PARAM_WRONG));
        if (!redisService.validate(user_id, token)) return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        List<HealthHonorInfo> resultList = healthHonorService.getHonorInfo(user_id, Integer.valueOf(id));
        JSONObject json = null;
        for (HealthHonorInfo info : resultList) {
            json = new JSONObject();
            //如果userId不为空，则该任务已完成；否则未完成
            if (StringUtils.isNotBlank(info.getUserId())) {
                json.put("img_url", IMG_URL + info.getHealthHonor().getImgUrl());
                json.put("id", info.getId().toString());
                json.put("conditions", info.getHealthHonor().getDescription());
                json.put("name", info.getHealthHonor().getName());
                json.put("isFinished", true);
            } else {
                json.put("img_url", IMG_URL + info.getHealthHonor().getNotFinishedImgUrl());
                json.put("id", info.getId().toString());
                json.put("conditions", info.getHealthHonor().getDescription());
                json.put("name", info.getHealthHonor().getName());
                json.put("isFinished", false);
            }
        }
        return ResponseEntity.ok(new JsonResult<>(json));
    }

    @ApiOperation(value = "获取客户端IP地址",notes = "获取客户端IP地址")
    @RequestMapping(value = "/getIp.json",method = RequestMethod.GET)
    public ResponseEntity<JsonResult<String>> getIp() {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        String ip = request.getHeader("x-forwarded-for");

        String localIP = "127.0.0.1";

        if ((ip == null) || (ip.length() == 0) || (ip.equalsIgnoreCase(localIP)) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }

        if ((ip == null) || (ip.length() == 0) || (ip.equalsIgnoreCase(localIP)) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }

        if ((ip == null) || (ip.length() == 0) || (ip.equalsIgnoreCase(localIP)) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ResponseEntity.ok(new JsonResult<>(ip));
    }
}