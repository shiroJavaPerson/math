package com.helian.health.util;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;



public class JsonResult<T> implements Serializable{

	/**
     * 
     */
    private static final long serialVersionUID = -873736659882836986L;

	@ApiModelProperty("0-成功, 非0-失败")
    private String code;

    @ApiModelProperty("返回结果")
	private T result;

    @ApiModelProperty("错误信息")
	private String errorMsg;

    @ApiModelProperty("是否成功，成功-ture，失败-false")
	private boolean isSuccess = true;

	private JsonResult() {
		result = (T) "";
		this.code = ResultCode.NORMAL.getCode();
		this.errorMsg = ResultCode.NORMAL.getMsg();
	}

	public JsonResult(ResultCode resultCode) {
		if (resultCode == null) {
			this.code = ResultCode.ERROR_SYSTEM.getCode();
			this.errorMsg = ResultCode.ERROR_SYSTEM.getMsg();
		} else {
			this.code = resultCode.getCode();
			this.errorMsg = resultCode.getMsg();
		}
		if(!ResultCode.NORMAL.getCode().equals(code)){
        	isSuccess = false;
        }
		this.result = (T)"";
	}

	
	public JsonResult(T result) {
		this.code = ResultCode.NORMAL.getCode();
		this.errorMsg = ResultCode.NORMAL.getMsg();
		this.result = result;
		if(!ResultCode.NORMAL.getCode().equals(code)){
        	isSuccess = false;
        }
	}

	
	public JsonResult(String code, T result, String errorMsg, boolean isSuccess){
        super();
        this.code = code;
        this.result = result;
        this.errorMsg = errorMsg;
        if(!ResultCode.NORMAL.getCode().equals(code)){
        	isSuccess = false;
        }
    }

	public JsonResult(T result,ResultCode resultCode){
        super();
        this.code = resultCode.getCode();
        this.result = result;
        this.errorMsg = resultCode.getMsg();
        if(!ResultCode.NORMAL.getCode().equals(code)){
        	isSuccess = false;
        }
    }

    public static JsonResult create(ResultCode resultCode) {
		return new JsonResult(resultCode);
	}

	public static JsonResult create() {
		return new JsonResult();
	}

	@XmlElement
	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	@XmlElement
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@XmlElement
	public T getResult() {
		return result;
	}

	public void setResult(T result) {
		this.result = result;
	}

	@XmlElement
	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

}
