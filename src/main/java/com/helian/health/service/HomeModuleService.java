/**
 * 
 */
package com.helian.health.service;

import java.util.List;

import com.helian.health.domain.HomeModule;

/**
 * 首页模块service
 * @author jiangcong@helianhealth.com
 * @date 2016年12月30日 下午3:59:15
 *
 */
public interface HomeModuleService {

	/**
	 * 首页模块列表
	 * @return
	 */
	public List<HomeModule> listHomePageModule();
	
	/**
	 * 查找所有的菜单
	 * @param homeModule TODO
	 * @return
	 */
	public List<HomeModule> findAllModule(HomeModule homeModule);
	
}
