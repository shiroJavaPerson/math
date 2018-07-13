package com.helian.health.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 首页模块 DTO
 * @author jiangcong@helianhealth.com
 * @date 2016年12月28日 下午2:21:45
 *
 */
public class HomeModule extends BaseDomain implements Serializable {

	private static final long serialVersionUID = 4248073372092450607L;
	private Long 		id;
	private Integer		module_level;				//菜单层级 1:父菜单  2:子菜单
	private String		module_name;
	private String		img_url;					//模块链接
	private String 		home_page_img_url;			//首页模块图标链接
	private String		app_version;
	private Integer		app_type;					//0:所有类型,   1:android,  2:ios
	private Long		parent_id;
	private Integer		module_order;
	private Integer		recommend_order;			//禾连推荐  0为不推荐
	private Integer		home_page_order;			//首页推荐  0为不推荐
	private Integer		is_third;					//是否第三方 0:禾连菜单 1:第三方
	private Integer		is_h5;						//是否h5 0:否 1:是
	private Integer		native_id;					//app对应的native id
	private String 		h5_url;						//h5 url
	private Integer		isdelete;
	private Date		gmt_createtime;
	private Date		gmt_modifytime;
	private String  	p_module_name;				//父模块名字
	private String 		c_module_name;				//子模块名
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getModule_level() {
		return module_level;
	}
	public void setModule_level(Integer module_level) {
		this.module_level = module_level;
	}
	public String getModule_name() {
		return module_name;
	}
	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}
	public String getImg_url() {
		return img_url;
	}
	public void setImg_url(String img_url) {
		this.img_url = img_url;
	}
	public String getApp_version() {
		return app_version;
	}
	public void setApp_version(String app_version) {
		this.app_version = app_version;
	}
	public Integer getApp_type() {
		return app_type;
	}
	public void setApp_type(Integer app_type) {
		this.app_type = app_type;
	}
	public Long getParent_id() {
		return parent_id;
	}
	public void setParent_id(Long parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getModule_order() {
		return module_order;
	}
	public void setModule_order(Integer module_order) {
		this.module_order = module_order;
	}
	public Integer getIs_third() {
		return is_third;
	}
	public void setIs_third(Integer is_third) {
		this.is_third = is_third;
	}
	public Integer getIs_h5() {
		return is_h5;
	}
	public void setIs_h5(Integer is_h5) {
		this.is_h5 = is_h5;
	}
	public Integer getNative_id() {
		return native_id;
	}
	public void setNative_id(Integer native_id) {
		this.native_id = native_id;
	}
	public Integer getIsdelete() {
		return isdelete;
	}
	public void setIsdelete(Integer isdelete) {
		this.isdelete = isdelete;
	}
	public Date getGmt_createtime() {
		return gmt_createtime;
	}
	public void setGmt_createtime(Date gmt_createtime) {
		this.gmt_createtime = gmt_createtime;
	}
	public Date getGmt_modifytime() {
		return gmt_modifytime;
	}
	public void setGmt_modifytime(Date gmt_modifytime) {
		this.gmt_modifytime = gmt_modifytime;
	}
	public String getP_module_name() {
		return p_module_name;
	}
	public void setP_module_name(String p_module_name) {
		this.p_module_name = p_module_name;
	}
	public String getC_module_name() {
		return c_module_name;
	}
	public void setC_module_name(String c_module_name) {
		this.c_module_name = c_module_name;
	}
	public String getHome_page_img_url() {
		return home_page_img_url;
	}
	public void setHome_page_img_url(String home_page_img_url) {
		this.home_page_img_url = home_page_img_url;
	}
	public Integer getRecommend_order() {
		return recommend_order;
	}
	public void setRecommend_order(Integer recommend_order) {
		this.recommend_order = recommend_order;
	}
	public Integer getHome_page_order() {
		return home_page_order;
	}
	public void setHome_page_order(Integer home_page_order) {
		this.home_page_order = home_page_order;
	}
	public String getH5_url() {
		return h5_url;
	}
	public void setH5_url(String h5_url) {
		this.h5_url = h5_url;
	}
	
}
