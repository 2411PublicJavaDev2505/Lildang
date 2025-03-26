package com.lildang.spring.employee.controller.dto;

public class RERequest {

	private int reviewScore;
	private String reviewDetail;
	private String employName;
	
	public RERequest(int reviewScore, String reviewDetail, String employName) {
		super();
		this.reviewScore = reviewScore;
		this.reviewDetail = reviewDetail;
		this.employName = employName;
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
	public String getEmployName() {
		return employName;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	@Override
	public String toString() {
		return "reivewEmployeeRequest [reviewScore=" + reviewScore + ", reviewDetail=" + reviewDetail + ", employName="
				+ employName + "]";
	}
	
	
}
