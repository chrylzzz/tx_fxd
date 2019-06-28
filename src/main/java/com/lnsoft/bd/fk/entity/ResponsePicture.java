package com.lnsoft.bd.fk.entity;

import java.util.List;

/**
 * 返回结果中的一张图片
 * @author SongTianhang
 *
 */
public class ResponsePicture {

	private String picid;		//图片id
	private String picname;		//图片名称
	private String infor;       //识别信息
	private String url;			//图片url
	private Resuls[] results;		//识别结果
	
	public String getPicid() {
		return picid;
	}
	public void setPicid(String picid) {
		this.picid = picid;
	}
	
	public String getPicname() {
		return picname;
	}
	public void setPicname(String picname) {
		this.picname = picname;
	}
	
	public String getInfor() {
		return infor;
	}
	public void setInfor(String infor) {
		this.infor = infor;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Resuls[] getResults() {
		return results;
	}
	public void setResults(Resuls[] results) {
		this.results = results;
	}
    
}


	
	