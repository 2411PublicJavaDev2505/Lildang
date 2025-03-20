package com.lildang.spring.member.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class MemberVO {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String phone;
	private String gender;
	private String address;
	private int age;
	private Date birth;
	private String outYn;
	private Date outDate;
	private String profileFileName;
	private String profileFileRename;
	private String profileFilePath;
	private String memberComment;
	private String introduction;
	private Timestamp cvWriteTime;
	private Timestamp cvUpdateTime;
	private String role;
	
	public MemberVO() {}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getGender() {
		return gender;
	}

	public String getAddress() {
		return address;
	}

	public int getAge() {
		return age;
	}

	public Date getBirth() {
		return birth;
	}

	public String getOutYn() {
		return outYn;
	}

	public Date getOutDate() {
		return outDate;
	}

	public String getProfileFileName() {
		return profileFileName;
	}

	public String getProfileFileRename() {
		return profileFileRename;
	}

	public String getProfileFilePath() {
		return profileFilePath;
	}

	public String getMemberComment() {
		return memberComment;
	}

	public String getIntroduction() {
		return introduction;
	}

	public Timestamp getCvWriteTime() {
		return cvWriteTime;
	}

	public Timestamp getCvUpdateTime() {
		return cvUpdateTime;
	}

	public String getRole() {
		return role;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", gender=" + gender + ", address=" + address + ", age=" + age + ", birth=" + birth + ", outYn="
				+ outYn + ", outDate=" + outDate + ", profileFileName=" + profileFileName + ", profileFileRename="
				+ profileFileRename + ", profileFilePath=" + profileFilePath + ", memberComment=" + memberComment
				+ ", introduction=" + introduction + ", cvWriteTime=" + cvWriteTime + ", cvUpdateTime=" + cvUpdateTime
				+ ", role=" + role + "]";
	}
	
}
