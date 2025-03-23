package com.lildang.spring.member.controller.dto;

import java.sql.Date;

public class LicenseInsertRequest {
	
	private String institution;
	private String licenseName;
	private Date getDate;
	private String id;
	
	public LicenseInsertRequest(String institution, String licenseName, Date getDate, String id) {
		super();
		this.institution = institution;
		this.licenseName = licenseName;
		this.getDate = getDate;
		this.id = id;
	}
	
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
	public String getLicenseName() {
		return licenseName;
	}
	public void setLicenseName(String licenseName) {
		this.licenseName = licenseName;
	}
	public Date getGetDate() {
		return getDate;
	}
	public void setGetDate(Date getDate) {
		this.getDate = getDate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "LicenseInsertRequest [institution=" + institution + ", licenseName=" + licenseName + ", getDate="
				+ getDate + ", id=" + id + "]";
	}
	
}
