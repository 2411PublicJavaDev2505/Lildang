package com.lildang.spring.report.controller.dto;

public class ReportEmployee {
	private String reportDetail;
	private String reportWriterId;
	private String reportReason;
	private String reportEmployeeId;
	
	public ReportEmployee () {}

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

	public String getReportReason() {
		return reportReason;
	}

	public void setReportReason(String reportReason) {
		this.reportReason = reportReason;
	}

	public String getReportEmployeeId() {
		return reportEmployeeId;
	}

	public void setReportEmployeeId(String reportEmployeeId) {
		this.reportEmployeeId = reportEmployeeId;
	}

	@Override
	public String toString() {
		return "ReportEmployee [reportDetail=" + reportDetail + ", reportWriterId=" + reportWriterId + ", reportReason="
				+ reportReason + ", reportEmployeeId=" + reportEmployeeId + "]";
	}
	
}
