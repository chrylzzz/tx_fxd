package com.lnsoft.bd.fk.resultVo;

import java.io.Serializable;

public class ResponseData implements Serializable {

	private static final long serialVersionUID = -285975820729043706L;

	 private Integer status;
	
	private String message;
	
	private Object data;

	public ResponseData(Object data){
		this.status = 200;
		this.message = "success";
		this.data = data;
	}
	
	public ResponseData(Integer status, String message) {
		this.status = status;
		this.message = message;
	}
	public ResponseData(Integer status, String message,Object data) {
		this.status = status;
		this.message = message;
		this.data = data;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static ResponseData ok(Object data){
		return new ResponseData(200, "success",data);
	}
	public static ResponseData ok(){
		return new ResponseData(null);
	}

	public static ResponseData ok(Integer code,String message,Object data){
		return new ResponseData(code,message,data);
	}
	public static ResponseData error(Object data){
		return new ResponseData(500,"error",data);
	}
	public static ResponseData error(Integer code,String message,Object data){
		return new ResponseData(code,message,data);
	}
	public static ResponseData error(Integer code,String message){
		return new ResponseData(code,message,null);
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
