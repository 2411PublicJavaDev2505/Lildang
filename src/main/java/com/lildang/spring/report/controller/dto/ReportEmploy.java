package com.lildang.spring.report.controller.dto;

public class ReportEmploy {
	private String reportDetail;
	private String reportWriterId;
	private String reportReason;
	private int reportEmployNo;
	
	public ReportEmploy() {}

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



	public Integer getReportEmployNo() {
		return reportEmployNo;
	}

	public void setReportEmployNo(Integer reportEmployNo) {
		this.reportEmployNo = reportEmployNo;
	}

	@Override
	public String toString() {
		return "ReportEmploy [reportDetail=" + reportDetail + ", reportWriterId=" + reportWriterId + ", reportReason="
				+ reportReason + ", reportEmployNo=" + reportEmployNo + "]";
	}
	
}
