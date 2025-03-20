package com.lildang.spring.member.domain;

public class DesiredJobVO {

	private int jobNo;
	private String id;
	
	public DesiredJobVO() {}
	
	public int getJobNo() {
		return jobNo;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "DesiredJobVO [jobNo=" + jobNo + ", id=" + id + "]";
	}
	
	
}
