package com.lildang.spring.member.domain;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.lildang.spring.member.controller.dto.CareerInsertRequest;
import com.lildang.spring.member.controller.dto.EducationInsertRequest;
import com.lildang.spring.member.controller.dto.LicenseInsertRequest;

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
	private String cvYn;
	private List<DesiredJobVO> jList;
	private List<EducationVO> eList;
	private List<CareerVO> cList;
	private List<LicenseVO> lList;
	
	public MemberVO() {}
	
	public MemberVO(String id, String pw, String name, String email, String phone, String gender, String address,
			int age, Date birth, String outYn, Date outDate, String profileFileName, String profileFileRename,
			String profileFilePath, String memberComment, String introduction, Timestamp cvWriteTime,
			Timestamp cvUpdateTime, String role, String cvYn, List<DesiredJobVO> jList, List<EducationVO> eList,
			List<CareerVO> cList, List<LicenseVO> lList) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.address = address;
		this.age = age;
		this.birth = birth;
		this.outYn = outYn;
		this.outDate = outDate;
		this.profileFileName = profileFileName;
		this.profileFileRename = profileFileRename;
		this.profileFilePath = profileFilePath;
		this.memberComment = memberComment;
		this.introduction = introduction;
		this.cvWriteTime = cvWriteTime;
		this.cvUpdateTime = cvUpdateTime;
		this.role = role;
		this.cvYn = cvYn;
		this.jList = new ArrayList<DesiredJobVO>();
		this.eList = new ArrayList<EducationVO>();
		this.cList = new ArrayList<CareerVO>();
		this.lList = new ArrayList<LicenseVO>();
	}

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
	
	public String getCvYn() {
		return cvYn;
	}

	public List<DesiredJobVO> getjList() {
		return jList;
	}

	public List<EducationVO> geteList() {
		return eList;
	}

	public List<CareerVO> getcList() {
		return cList;
	}

	public List<LicenseVO> getlList() {
		return lList;
	}
	
	public void setjList(List<DesiredJobVO> jList) {
		this.jList = jList;
	}

	public void seteList(List<EducationVO> eList) {
		this.eList = eList;
	}

	public void setcList(List<CareerVO> cList) {
		this.cList = cList;
	}

	public void setlList(List<LicenseVO> lList) {
		this.lList = lList;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", pw=" + pw + ", name=" + name + ", email=" + email + ", phone=" + phone
				+ ", gender=" + gender + ", address=" + address + ", age=" + age + ", birth=" + birth + ", outYn="
				+ outYn + ", outDate=" + outDate + ", profileFileName=" + profileFileName + ", profileFileRename="
				+ profileFileRename + ", profileFilePath=" + profileFilePath + ", memberComment=" + memberComment
				+ ", introduction=" + introduction + ", cvWriteTime=" + cvWriteTime + ", cvUpdateTime=" + cvUpdateTime
				+ ", role=" + role + ", cvYn=" + cvYn + ", jList=" + jList + ", eList=" + eList + ", cList=" + cList
				+ ", lList=" + lList + "]";
	}


}
