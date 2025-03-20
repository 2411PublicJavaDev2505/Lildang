package com.lildang.spring.member.domain;

import java.sql.Date;

public class EducationVO {
	
	private int educationNo;
	private String schoolName;
	private Date entranceDate;
	private Date graduateDate;
	private String state;
	private String id;
	
	public EducationVO() {}
	
	public int getEducationNo() {
		return educationNo;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public Date getEntranceDate() {
		return entranceDate;
	}
	public Date getGraduateDate() {
		return graduateDate;
	}
	public String getState() {
		return state;
	}
	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "EducationVO [educationNo=" + educationNo + ", schoolName=" + schoolName + ", entranceDate="
				+ entranceDate + ", graduateDate=" + graduateDate + ", state=" + state + ", id=" + id + "]";
	}
	
}
