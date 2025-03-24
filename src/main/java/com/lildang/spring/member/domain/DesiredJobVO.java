package com.lildang.spring.member.domain;

public class DesiredJobVO {

	private int jobNo;
	private String id;
	
	public DesiredJobVO() {}
	
	public DesiredJobVO(int jobNo, String id) {
		super();
		this.jobNo = jobNo;
		this.id = id;
	}

	public int getJobNo() {
		return jobNo;
	}
	public String getId() {
		return id;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "DesiredJobVO [jobNo=" + jobNo + ", id=" + id + "]";
	}
	
	
}
