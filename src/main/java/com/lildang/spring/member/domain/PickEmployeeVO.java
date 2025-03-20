package com.lildang.spring.member.domain;

public class PickEmployeeVO {

	private int pickNo;
	private String pickerId;
	private String pickedId;
	
	public PickEmployeeVO() {}
	
	public int getPickNo() {
		return pickNo;
	}
	public String getPickerId() {
		return pickerId;
	}
	public String getPickedId() {
		return pickedId;
	}
	@Override
	public String toString() {
		return "PickEmployeeVO [pickNo=" + pickNo + ", pickerId=" + pickerId + ", pickedId=" + pickedId + "]";
	}
	
	
}
