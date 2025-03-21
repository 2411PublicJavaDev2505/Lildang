package com.lildang.spring.member.controller.dto;

public class UpdateRequest {
	private String id;
	private String pw;
	private String email;
	private String address;
	private String phone;
	
	public UpdateRequest() {}

	public String getId() {
		return id;
	}


	public String getPw() {
		return pw;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "UpdateRequest [id=" + id + ", pw=" + pw + ", email=" + email + ", address=" + address + ", phone="
				+ phone + "]";
	}
		
}
