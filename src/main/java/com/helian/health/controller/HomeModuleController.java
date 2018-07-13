/**
 * 
 */
package com.helian.health.controller;

import com.alibaba.fastjson.JSON;
import com.helian.health.cache.RedisService;
import com.helian.health.domain.HomeModule;
import com.helian.health.service.HomeModuleService;
import com.helian.health.util.JsonResult;
import com.helian.health.util.JsonUtil;
import com.helian.health.util.RedisKeyConstants;
import com.helian.health.util.StringUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.Map.Entry;

/**
 * 首页模块
 * @author jiangcong@helianhealth.com
 * @date 2016年12月30日 下午3:52:06
 *
 */
@RestController
@RequestMapping(value="/V2.0/module")
@Api(value="首页模块相关" ,tags="module")
public class HomeModuleController {
	
    @Autowired
    private HomeModuleService homeModuleService;
	
    @Value("${h5.url}")
    private String H5_URL;
    
    @Value("${img.url}")
    private String IMG_URL;
    
    @Autowired
    private RedisService redisService;
    
	@ApiOperation(value = "首页模块", notes = "登录后首页的模块列表，首页中间的几个菜单项")
    @RequestMapping(value = "/getHomePageModule.json", method = RequestMethod.GET)
    public Object getHomePageModule(
    		@ApiParam(value = "系统类型") @RequestHeader("os") String os,
    		@ApiParam(value = "版本") @RequestHeader("version") String version){
    	String json = (String)this.redisService.get(RedisKeyConstants.HOME_PAGE_MODULE);
    	List<HomeModule> list = null;
    	if(json==null){
    		list = this.homeModuleService.listHomePageModule();
    		redisService.set(RedisKeyConstants.HOME_PAGE_MODULE, JSON.toJSONString(list), 30*30*24L*7);
    	}  else {
    		list = JSON.parseArray(json, HomeModule.class);
    	}
    	
    	//数据组装
    	List<Map<String, String>> result = this.convertDto2Result(list, version, os, true);
    	return ResponseEntity.ok(new JsonResult<List<Map<String, String>>>(result));
    }
    
    /**
     * 所有的模块接口
     * @param os
     * @param version
     * @return
     * @throws Exception 
     */
	@ApiOperation(value = "所有模块接口", notes = "点击所有的icon后的接口")
    @RequestMapping(value = "/getAllModule.json", method = RequestMethod.GET)
    public Object getAllModule( 
    		@ApiParam(value = "系统类型") @RequestHeader("os") String os,
    		@ApiParam(value = "版本") @RequestHeader("version") String version) throws Exception{
    	String json = (String)this.redisService.get(RedisKeyConstants.HOME_ALL_MODULE);
    	List<Map<String, Object>> result = null;
    	if(json==null){
			result =  this.getModule(version, os);
			this.redisService.set(RedisKeyConstants.HOME_ALL_MODULE, JSON.toJSONString(result), 30*30*24*7L);
		} else {
			json = (String) this.redisService.get(RedisKeyConstants.HOME_ALL_MODULE);
			result = JsonUtil.getBeanMapList(json);
		}
    	
    	return  ResponseEntity.ok(new JsonResult<List<Map<String, Object>>>(result));
    }
    
    /**
     * 搜索模块
     * @param os
     * @param version
     * @param key
     * @return
     */
    @ApiOperation(value = "搜索模块", notes = "搜索模块接口")
    @RequestMapping(value = "/findModule.json", method = RequestMethod.GET)
    public Object findModule(
    		@ApiParam(value = "系统类型") @RequestHeader("os") String os,
    		@ApiParam(value = "版本") @RequestHeader("version") String version,
    		@ApiParam(value = "搜索关键词") @RequestParam("key") String key){
    	HomeModule module = new HomeModule();
    	module.setModule_name(key);
    	module.setModule_level(2);
    	List<HomeModule> list = this.homeModuleService.findAllModule(module);
    	
    	List<Map<String, String>> result = this.convertDto2Result(list, version, os, false);
    	return ResponseEntity.ok(new JsonResult<>(result)) ;
    }
    
    //转换到返回值格式
    private List<Map<String, String>> convertDto2Result(List<HomeModule> list, String version, String os, Boolean isHomePage){
    	List<Map<String, String>> result = new ArrayList<Map<String, String>>();
    	if(list==null||list.size()<1){
    		return result;
    	} else {
        	//数据组装
        	for(HomeModule module : list){
        		//控制H5和版本，  原生模块并且app版本号小于设置的版本号,跳过
        		if(module.getIs_h5()==0&&StringUtil.isLargerOrEqualVersion(module.getApp_version(),version))
        			continue;
        		
        		//app类型控制  0:所有app 
        		if(!StringUtils.equals("0", module.getApp_type().toString())  //所有app类型
        				&&!StringUtils.equals(os, module.getApp_type().toString())){  //不是当前模块app类型
        			continue;
        		}
        		
        		Map<String, String> map = new HashMap<>();
        		map.put("id", module.getId().toString());
        		map.put("name", module.getModule_name());
        		String imgUrl = module.getImg_url();
        		 //如果首页图标默认为空, 设置为模块默认图片
        		if(StringUtils.isNotBlank(module.getHome_page_img_url())&&isHomePage){
        			imgUrl = module.getHome_page_img_url();
        			if(!module.getHome_page_img_url().startsWith("/")){
        				imgUrl = "/"+imgUrl;
        			}
        		}
        		map.put("version", module.getApp_version());
        		map.put("native_id", module.getNative_id()==null?"":module.getNative_id().toString());
        		map.put("imgUrl", IMG_URL+imgUrl);
        		if(module.getNative_id()!=null&&module.getNative_id()==0){
        			map.put("h5_url", H5_URL+module.getH5_url());
        		}else{
        			map.put("h5_url", "");
        		}
        		
        		result.add(map);
        	}
    	}
    	
    	return result;
    }
    
    //获取所有模块
    private List<Map<String, Object>> getModule(String version, String os){
    	List<Map<String, Object>> result = new ArrayList<>();
    	
    	//获取推荐的模块 
    	Map<String, Object> recommend = new HashMap<>();
    	HomeModule params1 = new HomeModule();
    	params1.setModule_level(2);
    	params1.setRecommend_order(1);
    	params1.setOrder_clause(" a.recommend_order asc");
    	List<HomeModule> recommendModules = this.homeModuleService.findAllModule(params1);
    	List<Map<String, String>> recommendList = convertDto2Result(recommendModules, version, os, false);
    	recommend.put("data", recommendList);
    	recommend.put("title", "禾连推荐");
    	
    	//获取常规的模块
    	//获取一级模块
    	HomeModule params2 = new HomeModule();
    	params2.setModule_level(1);
    	params2.setOrder_clause(" a.is_third asc, a.id asc ");
    	List<HomeModule> pModules = this.homeModuleService.findAllModule(params2);
    	//获取二级模块
    	HomeModule params3 = new HomeModule();
    	params3.setModule_level(2);
//    	params3.setRecommend_order(0);
    	params3.setOrder_clause(" a.parent_id, a.module_order asc ");
    	List<HomeModule> cModules = this.homeModuleService.findAllModule(params3);
    	//组装一二级模块关系
    	Map<String, List<HomeModule>> commonModule = new LinkedHashMap<>();
    	for(HomeModule pmodule : pModules){
    		for(HomeModule cmodule : cModules){
    			if(pmodule.getId().longValue()==cmodule.getParent_id().longValue()){
    				if(commonModule.get(pmodule.getModule_name())==null){
    					List<HomeModule> newList = new ArrayList<>();
    					newList.add(cmodule);
    					commonModule.put(pmodule.getModule_name(),  newList);
    				} else {
    					commonModule.get(pmodule.getModule_name()).add(cmodule);
    				}
    			}
    		}
    	}
    	
    	//规范返回数据格式
    	//添加推荐
    	result.add(recommend);
    	//普通非推荐
    	for(Entry<String, List<HomeModule>> entry : commonModule.entrySet()){
    		Map<String,  Object> tmpMap = new LinkedHashMap<>();
    		tmpMap.put("title", entry.getKey());
    		tmpMap.put("data", convertDto2Result(entry.getValue(), version, os, false));
    		result.add(tmpMap);
    	}
    	
    	return result;
    }
    
}
