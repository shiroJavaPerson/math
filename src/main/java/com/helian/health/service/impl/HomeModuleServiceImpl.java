/**
 * 
 */
package com.helian.health.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.helian.health.domain.HomeModule;
import com.helian.health.mapper.HomeModuleMapper;
import com.helian.health.service.HomeModuleService;

/**
 * 首页模块
 * @author jiangcong@helianhealth.com
 * @date 2016年12月30日 下午4:31:34
 *
 */
@Service
public class HomeModuleServiceImpl implements HomeModuleService {

	@Autowired
	private HomeModuleMapper homeModuleMapper;

	@Override
	public List<HomeModule> listHomePageModule() {
		return this.homeModuleMapper.listHomePageModule();
	}

	
	@Override
	public List<HomeModule> findAllModule(HomeModule homeModule){
		return this.homeModuleMapper.findAllModule(homeModule);
	}
	
}
