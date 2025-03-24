package com.lildang.spring.member.domain;

import java.sql.Timestamp;

public class ReviewMemberVO {

	private int reviewNo;
	private String reviewWriter;
	private int reviewScore;
	private String reviewDetail;
	private Timestamp writeTime;
	private Timestamp updateTime;
	private String employeeId;
	private int employNo;
	
	public ReviewMemberVO() {}
	
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
	public String getEmployeeId() {
		return employeeId;
	}
	
	public int getEmployNo() {
		return employNo;
	}

	@Override
	public String toString() {
		return "ReviewMemberVO [reviewNo=" + reviewNo + ", reviewWriter=" + reviewWriter + ", reviewScore="
				+ reviewScore + ", reviewDetail=" + reviewDetail + ", writeTime=" + writeTime + ", updateTime="
				+ updateTime + ", employeeId=" + employeeId + ", employNo=" + employNo + "]";
	}

}
