package com.lildang.spring.member.controller.dto;

import java.sql.Timestamp;

public class MatchJoinRequest {

	private String employeeId;
	private String employeeName;
	private int employNo;
	private String employName;
	private String employeeYn;
	private String employerYn; 
	private Timestamp jobStartTime;
	private Timestamp jobEndTime;
	private String jobEndYn;
	private String jobStartYn;
	
	public MatchJoinRequest() {}

	public MatchJoinRequest(String employeeId, String employeeName, int employNo, String employName, String employeeYn,
			String employerYn, Timestamp jobStartTime, Timestamp jobEndTime, String jobEndYn, String jobStartYn) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employNo = employNo;
		this.employName = employName;
		this.employeeYn = employeeYn;
		this.employerYn = employerYn;
		this.jobStartTime = jobStartTime;
		this.jobEndTime = jobEndTime;
		this.jobEndYn = jobEndYn;
		this.jobStartYn = jobStartYn;
	}

	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployNo() {
		return employNo;
	}
	public void setEmployNo(int employNo) {
		this.employNo = employNo;
	}
	
	public String getEmployName() {
		return employName;
	}

	public void setEmployName(String employName) {
		this.employName = employName;
	}

	public String getEmployeeYn() {
		return employeeYn;
	}

	public void setEmployeeYn(String employeeYn) {
		this.employeeYn = employeeYn;
	}

	public String getEmployerYn() {
		return employerYn;
	}

	public void setEmployerYn(String employerYn) {
		this.employerYn = employerYn;
	}

	public Timestamp getJobStartTime() {
		return jobStartTime;
	}

	public void setJobStartTime(Timestamp jobStartTime) {
		this.jobStartTime = jobStartTime;
	}

	public Timestamp getJobEndTime() {
		return jobEndTime;
	}

	public void setJobEndTime(Timestamp jobEndTime) {
		this.jobEndTime = jobEndTime;
	}

	public String getJobEndYn() {
		return jobEndYn;
	}

	public void setJobEndYn(String jobEndYn) {
		this.jobEndYn = jobEndYn;
	}

	public String getJobStartYn() {
		return jobStartYn;
	}

	public void setJobStartYn(String jobStartYn) {
		this.jobStartYn = jobStartYn;
	}

	@Override
	public String toString() {
		return "MatchJoinRequest [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employNo="
				+ employNo + ", employName=" + employName + ", employeeYn=" + employeeYn + ", employerYn=" + employerYn
				+ ", jobStartTime=" + jobStartTime + ", jobEndTime=" + jobEndTime + ", jobEndYn=" + jobEndYn
				+ ", jobStartYn=" + jobStartYn + "]";
	}

}
