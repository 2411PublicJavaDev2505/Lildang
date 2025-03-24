package com.lildang.spring.match.domain;

import java.sql.Timestamp;

public class MatchVO {
	private int matchNo;
	private String employeeId;
	private int employNo;
	private String employeeYn;
	private String employerYn;
	private Timestamp jobStartTime;
	private Timestamp jobEndTime;
	private String jobEndYn;
	private String jobStartYn;
	
	public MatchVO() {}

	public int getMatchNo() {
		return matchNo;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public int getEmployNo() {
		return employNo;
	}

	public String getEmployeeYn() {
		return employeeYn;
	}

	public String getEmployerYn() {
		return employerYn;
	}

	public Timestamp getJobStartTime() {
		return jobStartTime;
	}

	public Timestamp getJobEndTime() {
		return jobEndTime;
	}

	public String getJobEndYn() {
		return jobEndYn;
	}

	public String getJobStartYn() {
		return jobStartYn;
	}

	@Override
	public String toString() {
		return "MatchVO [matchNo=" + matchNo + ", employeeId=" + employeeId + ", employNo=" + employNo + ", employeeYn="
				+ employeeYn + ", employerYn=" + employerYn + ", jobStartTime=" + jobStartTime + ", jobEndTime="
				+ jobEndTime + ", jobEndYn=" + jobEndYn + ", jobStartYn=" + jobStartYn + "]";
	}
	
}
