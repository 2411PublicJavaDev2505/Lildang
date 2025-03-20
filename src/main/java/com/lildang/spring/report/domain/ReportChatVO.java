package com.lildang.spring.report.domain;

public class ReportChatVO {
	private int reportNo;
	private int chatNo;
	private String writerId;
	
	public ReportChatVO() {}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public int getChatNo() {
		return chatNo;
	}

	public void setChatNo(int chatNo) {
		this.chatNo = chatNo;
	}

	public String getWriterId() {
		return writerId;
	}

	public void setWriterId(String writerId) {
		this.writerId = writerId;
	}

	@Override
	public String toString() {
		return "ReportChatVO [reportNo=" + reportNo + ", chatNo=" + chatNo + ", writerId=" + writerId + "]";
	}
	
	
}
