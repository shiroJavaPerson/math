package com.helian.health.controller;

import com.helian.health.cache.RedisService;
import com.helian.health.domain.level.LevelReward;
import com.helian.health.domain.level.LevelRightDTO;
import com.helian.health.domain.level.UserHscoreLevel;
import com.helian.health.service.UserHscoreLevelService;
import com.helian.health.util.JsonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/12/28.
 */
@RestController
@RequestMapping("/V2.0/level")
@Api(value = "经验值等级权益相关", tags = "UserHscoreLevel", consumes = "application/json, application/xml")
public class UserHscoreLevelController {
    private Logger logger = Logger.getLogger(UserHscoreLevelController.class);

    @Autowired
    private RedisService redisService;

    @Autowired
    private UserHscoreLevelService userHscoreLevelService;

    @ApiOperation(notes = "等级权益列表", value = "等级权益列表", responseContainer = "List")
    @RequestMapping(value = "getLevelRight", method = RequestMethod.GET)
    public ResponseEntity<JsonResult<List<LevelRightDTO>>> getLevelRight(
    @ApiParam(value = "用户ID", name = "uid", required = true) @RequestHeader("uid") String uid,
    @ApiParam(value = "用户TOKEN", name = "token", required = true) @RequestHeader("token") String token
    ) {
//        if (StringUtils.isAnyBlank(uid, token)) return ResponseEntity.ok(new JsonResult<List<LevelRightDTO>>(ResultCode.PARAM_WRONG));
//        if (!redisService.validate(uid, token)) return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        UserHscoreLevel level = userHscoreLevelService.findLevelByUserId(uid);
        List<LevelReward> rewardList = userHscoreLevelService.findLevelReward();
        List<LevelRightDTO> list = new ArrayList<LevelRightDTO>();
        LevelRightDTO dto;
        StringBuilder sb;
        for (LevelReward reward : rewardList) {
            sb = new StringBuilder();
            sb.append(getHscoreByLevel(reward.getLevel()));
            sb.append("经验");
            dto = new LevelRightDTO(sb.toString(),reward.getLevel().toString(),reward.getRewardName(),
                level == null ? "1" : level.getLevel().toString());
            list.add(dto);
        }
        return ResponseEntity.ok(new JsonResult<>(list));
    }

    //获取该等级所需经验
    private int getHscoreByLevel(int level) {
        //如果下一等级为26级，则返回最高等级25所需经验值
        if (level == 26) {
            return (level - 1) * (level + 3) * 200;
        }
        return level * (level + 4) * 200;
    }
}
