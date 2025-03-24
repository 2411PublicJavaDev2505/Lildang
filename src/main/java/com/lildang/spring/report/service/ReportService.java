package com.lildang.spring.report.service;

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;

public interface ReportService {
	// 사장님이 알바생을 신고
	int reportEInsert(ReportEmployee report);
	// 알바생이 사장님을 신고
	int reportBInsert(ReportEmploy report);

}
