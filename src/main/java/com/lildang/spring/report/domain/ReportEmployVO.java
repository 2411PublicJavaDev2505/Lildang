package com.lildang.spring.report.domain;

public class ReportEmployVO {
	private int reportNo;
	private int employNo;
	
	public ReportEmployVO() {}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public int getEmployNo() {
		return employNo;
	}

	public void setEmployNo(int employNo) {
		this.employNo = employNo;
	}

	@Override
	public String toString() {
		return "ReportEmployVO [reportNo=" + reportNo + ", employNo=" + employNo + "]";
	}
	
	
}
