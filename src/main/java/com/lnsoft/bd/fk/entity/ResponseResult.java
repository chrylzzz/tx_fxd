package com.lnsoft.bd.fk.entity;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class ResponseResult {
	
	@JSONField(ordinal=1,name="AimType")
	private String aimType;
	@JSONField(ordinal=2,name="Aim")
	private List<ResponseAim> aim;
	
	public ResponseResult(){};
	public ResponseResult(String AimType,List<ResponseAim> Aim){
		
		this.aimType = AimType;
		this.aim = Aim;
		
	}
	public String getAimType() {
		return aimType;
	}
	public void setAimType(String aimType) {
		this.aimType = aimType;
	}
	public List<ResponseAim> getAim() {
		return aim;
	}
	public void setAim(List<ResponseAim> aim) {
		this.aim = aim;
	};

}
