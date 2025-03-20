package com.lildang.spring.member.controller.dto;

import java.sql.Date;

public class MemberRegisterRequest {
	
	private String role;
	private String id;
	private String name;
	private String pw;
	private String phone;
	private String email;
	private Date birth;
	
	public MemberRegisterRequest(String role, String id, String name, String pw, String phone, String email,
			Date birth) {
		super();
		this.role = role;
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.phone = phone;
		this.email = email;
		this.birth = birth;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role.toUpperCase();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	@Override
	public String toString() {
		return "MemberRegisterRequest [role=" + role + ", id=" + id + ", name=" + name + ", pw=" + pw + ", phone="
				+ phone + ", email=" + email + ", birth=" + birth + "]";
	}
	
	
}
