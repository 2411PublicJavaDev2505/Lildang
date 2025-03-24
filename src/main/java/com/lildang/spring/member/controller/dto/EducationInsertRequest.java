package com.lildang.spring.member.controller.dto;

import java.sql.Date;

public class EducationInsertRequest {
	
	private String schoolName;
	private Date entranceDate;
	private Date graduateDate;
	private String id;
	
	public EducationInsertRequest(String schoolName, Date entranceDate, Date graduateDate, String id) {
		super();
		this.schoolName = schoolName;
		this.entranceDate = entranceDate;
		this.graduateDate = graduateDate;
		this.id = id;
	}
	
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Date getEntranceDate() {
		return entranceDate;
	}
	public void setEntranceDate(Date entranceDate) {
		this.entranceDate = entranceDate;
	}
	public Date getGraduateDate() {
		return graduateDate;
	}
	public void setGraduateDate(Date graduateDate) {
		this.graduateDate = graduateDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "EducationInsertRequest [schoolName=" + schoolName + ", entranceDate=" + entranceDate + ", graduateDate="
				+ graduateDate + ", id=" + id + "]";
	}
	
	
}
