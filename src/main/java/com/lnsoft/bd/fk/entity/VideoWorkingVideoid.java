package com.lnsoft.bd.fk.entity;

import java.util.ArrayList;

public class VideoWorkingVideoid {

	private String workingvideoid;
//	private String[] workingequipmenttypes;
	private ArrayList<String> workingequipmenttypes;

//	public String[] getWorkingequipmenttypes() {
//		return workingequipmenttypes;
//	}
//
//	public void setWorkingequipmenttypes(String[] workingequipmenttypes) {
//		this.workingequipmenttypes = workingequipmenttypes;
//	}
	
	

	public String getWorkingvideoid() {
		return workingvideoid;
	}

	public void setWorkingvideoid(String workingvideoid) {
		this.workingvideoid = workingvideoid;
	}
	
	
	public ArrayList<String> getWorkingequipmenttypes() {
		return workingequipmenttypes;
	}

	public void setWorkingequipmenttypes(ArrayList<String> workingequipmenttypes) {
		this.workingequipmenttypes = workingequipmenttypes;
	}
	
	
}
