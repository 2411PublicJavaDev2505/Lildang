package com.lildang.spring.report.domain;

import java.sql.Date;

public class ReportVO {
	private int reportNo;
	private Date reportDate;
	private String checkYN;
	private Date checkDate;
	private String reportDetail;
	private String reportWriterId;
	
	public ReportVO() {}

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
				+ checkDate + ", reportDetail=" + reportDetail + ", reportWriterId=" + reportWriterId + "]";
	}
	
	
}
