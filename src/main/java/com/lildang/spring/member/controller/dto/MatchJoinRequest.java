package com.lildang.spring.member.controller.dto;

public class MatchJoinRequest {

	private String employeeId;
	private String employeeName;
	private int employNo;
	private String employName;
	private String employeeYn;
	private String employerYn; 
	
	public MatchJoinRequest() {}
	
	public MatchJoinRequest(String employeeId, String employeeName, int employNo, String employName, String employeeYn,
			String employerYn) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employNo = employNo;
		this.employName = employName;
		this.employeeYn = employeeYn;
		this.employerYn = employerYn;
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

	@Override
	public String toString() {
		return "MatchJoinRequest [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employNo="
				+ employNo + ", employName=" + employName + ", employeeYn=" + employeeYn + ", employerYn=" + employerYn
				+ "]";
	}

}
