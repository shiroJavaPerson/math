package com.helian.health.util;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

public class HttpResult<T> implements Serializable {
	private static final long serialVersionUID = 1L;

	@ApiModelProperty("0-成功, 非0-失败")
	private int code;
	
	@ApiModelProperty("总数(需要时返回)")
	private long total;
	
	@ApiModelProperty("返回结果")
	private T result;
	
	@ApiModelProperty("错误信息")
	private String errorMsg;

	public HttpResult() {
	}

	public HttpResult(int code) {
		super();
		this.code = code;
	}

	public HttpResult(int code, String errorMsg) {
		super();
		this.code = code;
		this.errorMsg = errorMsg;
	}

	public HttpResult(HttpStatus httpStatus, String errorMsg) {
		super();
		this.code = httpStatus.value();
		this.errorMsg = errorMsg;
	}

	public HttpResult(int code, T result) {
		super();
		this.code = code;
		this.result = result;
	}

	public HttpResult(int code, long total, T result) {
		super();
		this.code = code;
		this.total = total;
		this.result = result;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

}
