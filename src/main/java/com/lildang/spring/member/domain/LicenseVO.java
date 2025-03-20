package com.lildang.spring.member.domain;

import java.sql.Date;

public class LicenseVO {

	private int licenseNo;
	private String institution;
	private String licenseName;
	private Date getDate;
	private String id;
	
	public LicenseVO() {}
	
	public int getLicenseNo() {
		return licenseNo;
	}
	public String getInstitution() {
		return institution;
	}
	public String getLicenseName() {
		return licenseName;
	}
	public Date getGetDate() {
		return getDate;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "LicenseVO [licenseNo=" + licenseNo + ", institution=" + institution + ", licenseName=" + licenseName
				+ ", getDate=" + getDate + ", id=" + id + "]";
	}
	
	
}
