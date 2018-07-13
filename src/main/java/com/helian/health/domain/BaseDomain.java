/**
 * 
 */
package com.helian.health.domain;

import java.io.Serializable;

/**
 *
 * @author jiangcong@helianhealth.com
 * @date 2017年1月3日 上午11:19:22
 *
 */
public class BaseDomain implements Serializable {

	private static final long serialVersionUID = -7418690054102568873L;

	private String 		order_clause;				//排序字段

	public String getOrder_clause() {
		return order_clause;
	}

	public void setOrder_clause(String order_clause) {
		this.order_clause = order_clause;
	}
	
	
}
