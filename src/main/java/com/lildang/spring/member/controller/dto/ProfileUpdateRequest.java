package com.lildang.spring.member.controller.dto;

public class ProfileUpdateRequest {

	private String id;
	private String profileFileName;
	private String profileFileRename;
	private String profileFilePath;
	
	public ProfileUpdateRequest(String id, String profileFileName, String profileFileRename, String profileFilePath) {
		super();
		this.id = id;
		this.profileFileName = profileFileName;
		this.profileFileRename = profileFileRename;
		this.profileFilePath = profileFilePath;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProfileFileName() {
		return profileFileName;
	}
	public void setProfileFileName(String profileFileName) {
		this.profileFileName = profileFileName;
	}
	public String getProfileFileRename() {
		return profileFileRename;
	}
	public void setProfileFileRename(String profileFileRename) {
		this.profileFileRename = profileFileRename;
	}
	public String getProfileFilePath() {
		return profileFilePath;
	}
	public void setProfileFilePath(String profileFilePath) {
		this.profileFilePath = profileFilePath;
	}
	@Override
	public String toString() {
		return "ProfileUpdateRequest [id=" + id + ", profileFileName=" + profileFileName + ", profileFileRename="
				+ profileFileRename + ", profileFilePath=" + profileFilePath + "]";
	}
	
	
}
