package com.lildang.spring.employ.controller.dto;

public class EmployAddRequest {
	
	//첨부파일지워주기!!
	private String employFileName;
	private String employFileRename;
	private String employFilePath;
	
	public EmployAddRequest() {}

	public EmployAddRequest(String employFileName, String employFileRename, String employFilePath) {
		super();
		this.employFileName = employFileName;
		this.employFileRename = employFileRename;
		this.employFilePath = employFilePath;
	}



	public String getEmployFileName() {
		return employFileName;
	}

	public void setEmployFileName(String employFileName) {
		this.employFileName = employFileName;
	}

	public String getEmployFileRename() {
		return employFileRename;
	}

	public void setEmployFileRename(String employFileRename) {
		this.employFileRename = employFileRename;
	}

	public String getEmployFilePath() {
		return employFilePath;
	}

	public void setEmployFilePath(String employFilePath) {
		this.employFilePath = employFilePath;
	}

	@Override
	public String toString() {
		return "EmployAddRequest [employFileName=" + employFileName + ", employFileRename=" + employFileRename
				+ ", employFilePath=" + employFilePath + "]";
	}
	
	
	
}
