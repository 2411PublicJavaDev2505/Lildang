package com.lildang.spring.employ.controller.dto;

import java.sql.Date;
import java.sql.Timestamp;

public class EmployInsertRequest {
	
	private String employName;
	private Date recruitStartDate;
	private Date recruitEndDate;
	private int recruitNumber;
	private String education;
	private String workplaceName;
	private String workplaceAddress;
	private int salary;
	private String workingPeriod;
	private String workingStartTime;
	private String workingEndTime;
	private String workingDay;
	private String employDetail;
	private String employFileName;
	private String employFileRename;
	private String employFilePath;
	private String writerId;
	private int jobNo;
	
	public EmployInsertRequest(String employName, Date recruitStartDate, Date recruitEndDate, int recruitNumber,
			String education, String workplaceAddress, String workplaceName, int salary, String workingPeriod,
			String workingStartTime, String workingEndTime, String workingDay, String employDetail,
			String employFileName, String employFileRename, String employFilePath, String writerId, int jobNo) {
		super();
		this.employName = employName;
		this.recruitStartDate = recruitStartDate;
		this.recruitEndDate = recruitEndDate;
		this.recruitNumber = recruitNumber;
		this.education = education;
		this.workplaceAddress = workplaceAddress;
		this.workplaceName = workplaceName;
		this.salary = salary;
		this.workingPeriod = workingPeriod;
		this.workingStartTime = workingStartTime;
		this.workingEndTime = workingEndTime;
		this.workingDay = workingDay;
		this.employDetail = employDetail;
		this.employFileName = employFileName;
		this.employFileRename = employFileRename;
		this.employFilePath = employFilePath;
		this.writerId = writerId;
		this.jobNo = jobNo;
	}
	public String getEmployName() {
		return employName;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	public Date getRecruitStartDate() {
		return recruitStartDate;
	}
	public void setRecruitStartDate(Date recruitStartDate) {
		this.recruitStartDate = recruitStartDate;
	}
	public Date getRecruitEndDate() {
		return recruitEndDate;
	}
	public void setRecruitEndDate(Date recruitEndDate) {
		this.recruitEndDate = recruitEndDate;
	}
	public int getRecruitNumber() {
		return recruitNumber;
	}
	public void setRecruitNumber(int recruitNumber) {
		this.recruitNumber = recruitNumber;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	public String getWorkplaceAddress() {
		return workplaceAddress;
	}
	public void setWorkplaceAddress(String workplaceAddress) {
		this.workplaceAddress = workplaceAddress;
	}
	public String getWorkplaceName() {
		return workplaceName;
	}
	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getWorkingPeriod() {
		return workingPeriod;
	}
	public void setWorkingPeriod(String workingPeriod) {
		this.workingPeriod = workingPeriod;
	}
	public String getWorkingStartTime() {
		return workingStartTime;
	}
	public void setWorkingStartTime(String workingStartTime) {
		this.workingStartTime = workingStartTime;
	}
	public String getWorkingEndTime() {
		return workingEndTime;
	}
	public void setWorkingEndTime(String workingEndTime) {
		this.workingEndTime = workingEndTime;
	}
	public String getWorkingDay() {
		return workingDay;
	}
	public void setWorkingDay(String workingDay) {
		this.workingDay = workingDay;
	}
	public String getEmployDetail() {
		return employDetail;
	}
	public void setEmployDetail(String employDetail) {
		this.employDetail = employDetail;
	}
	public String getEmployFileName() {
		return employFileName;
	}
	public void setEmployFileName(String employFileName) {
		this.employFileName = employFileName;
	}
	public String getEmployFileRename() {
		return employFileRename;
	}
	public void setEmployFileRename(String employFileRename) {
		this.employFileRename = employFileRename;
	}
	public String getEmployFilePath() {
		return employFilePath;
	}
	public void setEmployFilePath(String employFilePath) {
		this.employFilePath = employFilePath;
	}
	public String getWriterId() {
		return writerId;
	}
	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}
	public int getJobNo() {
		return jobNo;
	}
	public void setJobNo(int jobNo) {
		this.jobNo = jobNo;
	}
	
	@Override
	public String toString() {
		return "EmployInsertRequest [employName=" + employName + ", recruitStartDate=" + recruitStartDate
				+ ", recruitEndDate=" + recruitEndDate + ", recruitNumber=" + recruitNumber + ", education=" + education
				+ ", workplaceAddress=" + workplaceAddress + ", workplaceName=" + workplaceName + ", salary=" + salary
				+ ", workingPeriod=" + workingPeriod + ", workingStartTime=" + workingStartTime + ", workingEndTime="
				+ workingEndTime + ", workingDay=" + workingDay + ", employDetail=" + employDetail + ", employFileName="
				+ employFileName + ", employFileRename=" + employFileRename + ", employFilePath=" + employFilePath
				+ ", writerId=" + writerId + ", jobNo=" + jobNo + "]";
	}
	
}
