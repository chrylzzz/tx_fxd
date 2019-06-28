package com.lnsoft.bd.fk.entity;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class VideoWorkingList {

//	private VideoWorkingVideoid[] VideoWorkingVideoids;
	private ArrayList<VideoWorkingVideoid> VideoWorkingVideoids;

	
	public ArrayList<VideoWorkingVideoid> getVideoWorkingVideoids() {
		return VideoWorkingVideoids;
	}

	public void setVideoWorkingVideoids(
			ArrayList<VideoWorkingVideoid> videoWorkingVideoids) {
		VideoWorkingVideoids = videoWorkingVideoids;
	}

//	public VideoWorkingVideoid[] getVideoWorkingVideoids() {
//		return VideoWorkingVideoids;
//	}
//
//	public void setVideoWorkingVideoids(VideoWorkingVideoid[] videoWorkingVideoids) {
//		VideoWorkingVideoids = videoWorkingVideoids;
//	}
	
	
	
	
}
