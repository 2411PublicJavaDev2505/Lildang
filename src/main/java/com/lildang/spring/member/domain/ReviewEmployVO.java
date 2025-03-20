package com.lildang.spring.member.domain;

import java.sql.Timestamp;

public class ReviewEmployVO {

	private int reviewNo;
	private String reviewWriter;
	private int reviewScore;
	private String reviewDetail;
	private Timestamp writeTime;
	private Timestamp updateTime;
	private int employNo;
	
	public ReviewEmployVO() {}
	
	public int getReviewNo() {
		return reviewNo;
	}
	public String getReviewWriter() {
		return reviewWriter;
	}
	public int getReviewScore() {
		return reviewScore;
	}
	public String getReviewDetail() {
		return reviewDetail;
	}
	public Timestamp getWriteTime() {
		return writeTime;
	}
	public Timestamp getUpdateTime() {
		return updateTime;
	}
	public int getEmployNo() {
		return employNo;
	}
	@Override
	public String toString() {
		return "ReviewEmployVO [reviewNo=" + reviewNo + ", reviewWriter=" + reviewWriter + ", reviewScore="
				+ reviewScore + ", reviewDetail=" + reviewDetail + ", writeTime=" + writeTime + ", updateTime="
				+ updateTime + ", employNo=" + employNo + "]";
	}
	
	
}
