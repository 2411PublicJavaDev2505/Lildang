package com.lildang.spring.report.domain;

public class ReportEmployeeVO {
	private int reportNo;
	private String id;
	
	public ReportEmployeeVO() {}

	public int getReportNo() {
		return reportNo;
	}

	public void setReportNo(int reportNo) {
		this.reportNo = reportNo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ReportEmployeeVO [reportNo=" + reportNo + ", id=" + id + "]";
	}
	
	
}
