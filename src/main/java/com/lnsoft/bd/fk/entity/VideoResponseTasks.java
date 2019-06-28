package com.lnsoft.bd.fk.entity;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class VideoResponseTasks {

	private String responseid;                   //对应requestid
	private String status;
	private String info;
	private VideoResponseTask[] tasks;			//任务集合
	
	
	public String getResponseid() {
		return responseid;
	}
	public void setResponseid(String responseid) {
		this.responseid = responseid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public VideoResponseTask[] getTasks() {
		return tasks;
	}
	public void setTasks(VideoResponseTask[] tasks) {
		this.tasks = tasks;
	}

}
