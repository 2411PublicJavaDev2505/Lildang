package com.lildang.spring.member.controller.dto;

public class ReviewEmployeeRequest {

	private String reviewWriter;
	private int reviewScore;
	private String reviewDetail;
	private String employeeId;
	private int employNo;
	
	public ReviewEmployeeRequest(String reviewWriter, int reviewScore, String reviewDetail, String employeeId,
			int employNo) {
		super();
		this.reviewWriter = reviewWriter;
		this.reviewScore = reviewScore;
		this.reviewDetail = reviewDetail;
		this.employeeId = employeeId;
		this.employNo = employNo;
	}
	public String getReviewWriter() {
		return reviewWriter;
	}
	public void setReviewWriter(String reviewWriter) {
		this.reviewWriter = reviewWriter;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public void setReviewScore(int reviewScore) {
		this.reviewScore = reviewScore;
	}
	public String getReviewDetail() {
		return reviewDetail;
	}
	public void setReviewDetail(String reviewDetail) {
		this.reviewDetail = reviewDetail;
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
		return "ReviewEmployeeRequest [reviewWriter=" + reviewWriter + ", reviewScore=" + reviewScore
				+ ", reviewDetail=" + reviewDetail + ", employeeId=" + employeeId + ", employNo=" + employNo + "]";
	}

	
}
