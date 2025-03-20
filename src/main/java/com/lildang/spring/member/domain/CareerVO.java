package com.lildang.spring.member.domain;

public class CareerVO {

	private int careerNo;
	private String companyName;
	private String workingPeriod;
	private String position;
	private String work;
	private String id;
	
	public CareerVO() {}
	
	public int getCareerNo() {
		return careerNo;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getWorkingPeriod() {
		return workingPeriod;
	}
	public String getPosition() {
		return position;
	}
	public String getWork() {
		return work;
	}
	public String getId() {
		return id;
	}
	@Override
	public String toString() {
		return "CareerVO [careerNo=" + careerNo + ", companyName=" + companyName + ", workingPeriod=" + workingPeriod
				+ ", position=" + position + ", work=" + work + ", id=" + id + "]";
	}
	
}
