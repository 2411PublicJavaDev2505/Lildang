package com.lildang.spring.match.controller.dto;

public class ApplyRequest {

	private String employeeId;
	private int employNo;
	
	public ApplyRequest(String employeeId, int employNo) {
		super();
		this.employeeId = employeeId;
		this.employNo = employNo;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public int getEmployNo() {
		return employNo;
	}
	public void setEmployNo(int employNo) {
		this.employNo = employNo;
	}
	@Override
	public String toString() {
		return "ApplyRequest [employeeId=" + employeeId + ", employNo=" + employNo + "]";
	}
	
	
}
