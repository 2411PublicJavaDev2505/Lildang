package com.lildang.spring.member.controller.dto;

public class LoginRequest {
	
	private String id;
	private String pw;
	
	public LoginRequest() {}
	
	public LoginRequest(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "LoginRequest [id=" + id + ", pw=" + pw + "]";
	}
	
	
}
