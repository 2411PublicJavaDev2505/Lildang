package com.lildang.spring.employ.controller.dto;

public class EmployReviewRequest {

	private int reviewScore;
	private String reviewDetail;
	private String id;
	
	public EmployReviewRequest(int reviewScore, String reviewDetail, String id) {
		super();
		this.reviewScore = reviewScore;
		this.reviewDetail = reviewDetail;
		this.id = id;
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
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "EmployReviewRequest [reviewScore=" + reviewScore + ", reviewDetail=" + reviewDetail + ", id=" + id
				+ "]";
	}
	
	
}
