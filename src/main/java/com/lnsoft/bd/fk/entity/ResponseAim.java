package com.lnsoft.bd.fk.entity;

import com.alibaba.fastjson.annotation.JSONField;

public class ResponseAim {
	
	@JSONField(ordinal=1,name="AimID")
	private String aimID;
	@JSONField(ordinal=2,name="AimName")
	private String aimName;
	@JSONField(ordinal=3,name="AimMax")
	private String aimMax;
	@JSONField(ordinal=4,name="AimMin")
	private String aimMin;
	@JSONField(ordinal=5,name="AimMean")
	private String aimMean;
	@JSONField(ordinal=6,name="AimClass")
	private String aimClass;
	@JSONField(ordinal=7,name="Xmin")
	private String xmin;
	@JSONField(ordinal=8,name="Ymin")
	private String ymin;
	@JSONField(ordinal=9,name="Xmax")
	private String xmax;
	@JSONField(ordinal=10,name="Ymax")
	private String ymax;
	
	public ResponseAim(){};
	public ResponseAim(String aimID,String aimName,String aimMax,String aimMin,String aimMean,String aimClass,
			String xmin,String ymin,String xmax,String ymax){
		this.aimID = aimID;
		this.aimName = aimName;
		this.aimMax = aimMax;
		this.aimMin = aimMin;
		this.aimMean = aimMean;
		this.aimClass = aimClass;
		this.xmin = xmin;
		this.ymin = ymin;
		this.xmax = xmax;
		this.ymax = ymax;
	}
	public String getAimID() {
		return aimID;
	}
	public void setAimID(String aimID) {
		this.aimID = aimID;
	}
	public String getAimName() {
		return aimName;
	}
	public void setAimName(String aimName) {
		this.aimName = aimName;
	}
	public String getAimMax() {
		return aimMax;
	}
	public void setAimMax(String aimMax) {
		this.aimMax = aimMax;
	}
	public String getAimMin() {
		return aimMin;
	}
	public void setAimMin(String aimMin) {
		this.aimMin = aimMin;
	}
	public String getAimMean() {
		return aimMean;
	}
	public void setAimMean(String aimMean) {
		this.aimMean = aimMean;
	}
	public String getAimClass() {
		return aimClass;
	}
	public void setAimClass(String aimClass) {
		this.aimClass = aimClass;
	}
	public String getXmin() {
		return xmin;
	}
	public void setXmin(String xmin) {
		this.xmin = xmin;
	}
	public String getYmin() {
		return ymin;
	}
	public void setYmin(String ymin) {
		this.ymin = ymin;
	}
	public String getXmax() {
		return xmax;
	}
	public void setXmax(String xmax) {
		this.xmax = xmax;
	}
	public String getYmax() {
		return ymax;
	}
	public void setYmax(String ymax) {
		this.ymax = ymax;
	};
	
			
}
