package com.lnsoft.bd.fk.entity;

public class VideoResponseTask {

	private String taskid;			//任务id
	private String videoid;         //视频id
	private String tasktype;		//任务类型
	private String status;	 //结果状态（任务是否成功）
	private String info;	 //结果状态详细信息
	private String equipmenttype;	 //设备类型，只在红外分析时使用
	
	private ResponsePicture[] pictures;		//图片集合

	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public String getVideoid() {
		return videoid;
	}

	public void setVideoid(String videoid) {
		this.videoid = videoid;
	}

	public String getTasktype() {
		return tasktype;
	}

	public void setTasktype(String tasktype) {
		this.tasktype = tasktype;
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

	public String getEquipmenttype() {
		return equipmenttype;
	}

	public void setEquipmenttype(String equipmenttype) {
		this.equipmenttype = equipmenttype;
	}

	public ResponsePicture[] getPictures() {
		return pictures;
	}

	public void setPictures(ResponsePicture[] pictures) {
		this.pictures = pictures;
	}
	
}
