package com.lildang.spring.member.controller.dto;

public class CareerInsertRequest {

	private String companyName;
	private String workingPeriod;
	private String position;
	private String work;
	private String id;
	
	public CareerInsertRequest(String companyName, String workingPeriod, String position, String work, String id) {
		super();
		this.companyName = companyName;
		this.workingPeriod = workingPeriod;
		this.position = position;
		this.work = work;
		this.id = id;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getWorkingPeriod() {
		return workingPeriod;
	}
	public void setWorkingPeriod(String workingPeriod) {
		this.workingPeriod = workingPeriod;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "CareerInsertRequest [companyName=" + companyName + ", workingPeriod=" + workingPeriod + ", position="
				+ position + ", work=" + work + ", id=" + id + "]";
	}
	
	
}
