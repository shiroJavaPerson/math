/**
 * 
 */
package com.helian.health.mapper;

import java.util.List;

import com.helian.health.domain.HomeModule;

/**
 * 首页模块mapper
 * @author jiangcong@helianhealth.com
 * @date 2016年12月30日 下午4:33:29
 *
 */
public interface HomeModuleMapper {

	/**
	 * 模块列表
	 * @param module
	 * @return
	 */
	public List<HomeModule> findAllModule(HomeModule homeModule);

	/**
	 * 首页模块列表
	 * @return
	 */
	public List<HomeModule> listHomePageModule();
}
