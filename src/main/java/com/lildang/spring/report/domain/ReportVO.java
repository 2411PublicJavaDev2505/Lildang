package com.lildang.spring.report.domain;

import java.sql.Date;

public class ReportVO {
	private int reportNo;
	private Date reportDate;
	private String checkYN;
	private Date checkDate;
	private String reportDetail;
	private String reportWriterId;
	private String reportReason;
	private int reportEmployNo;
	private int reportChatNo;
	private String reportChatWriterId;
	private String reportTarget;
	private String reportEmployeeId;
	
	public ReportVO() {}
	
	public String getReportReason() {
		return reportReason;
	}

	public void setReportReason(String reportReason) {
		this.reportReason = reportReason;
	}

	public int getReportEmployNo() {
		return reportEmployNo;
	}

	public void setReportEmployNo(int reportEmployNo) {
		this.reportEmployNo = reportEmployNo;
	}

	public int getReportChatNo() {
		return reportChatNo;
	}

	public void setReportChatNo(int reportChatNo) {
		this.reportChatNo = reportChatNo;
	}

	public String getReportChatWriterId() {
		return reportChatWriterId;
	}

	public void setReportChatWriterId(String reportChatWriterId) {
		this.reportChatWriterId = reportChatWriterId;
	}

	public String getReportTarget() {
		return reportTarget;
	}

	public void setReportTarget(String reportTarget) {
		this.reportTarget = reportTarget;
	}

	public String getReportEmployeeId() {
		return reportEmployeeId;
	}

	public void setReportEmployeeId(String reportEmployeeId) {
		this.reportEmployeeId = reportEmployeeId;
	}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getCheckYN() {
		return checkYN;
	}

	public void setCheckYN(String checkYN) {
		this.checkYN = checkYN;
	}

	public Date getCheckDate() {
		return checkDate;
	}

	public void setCheckDate(Date checkDate) {
		this.checkDate = checkDate;
	}

	public String getReportDetail() {
		return reportDetail;
	}

	public void setReportDetail(String reportDetail) {
		this.reportDetail = reportDetail;
	}

	public String getReportWriterId() {
		return reportWriterId;
	}

	public void setReportWriterId(String reportWriterId) {
		this.reportWriterId = reportWriterId;
	}

	@Override
	public String toString() {
		return "ReportVO [reportNo=" + reportNo + ", reportDate=" + reportDate + ", checkYN=" + checkYN + ", checkDate="
				+ checkDate + ", reportDetail=" + reportDetail + ", reportWriterId=" + reportWriterId
				+ ", reportReason=" + reportReason + ", reportEmployNo=" + reportEmployNo + ", reportChatNo="
				+ reportChatNo + ", reportChatWriterId=" + reportChatWriterId + ", reportTarget=" + reportTarget
				+ ", reportEmployeeId=" + reportEmployeeId + "]";
	}

	
	
	
}
