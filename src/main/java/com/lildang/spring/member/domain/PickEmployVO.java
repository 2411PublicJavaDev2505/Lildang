package com.lildang.spring.member.domain;

public class PickEmployVO {

	private int pickerId;
	private int EmployNo;
	
	public PickEmployVO() {}
	
	public int getPickerId() {
		return pickerId;
	}
	public int getEmployNo() {
		return EmployNo;
	}
	@Override
	public String toString() {
		return "PickEmployVO [pickerId=" + pickerId + ", EmployNo=" + EmployNo + "]";
	}
	
	
}
