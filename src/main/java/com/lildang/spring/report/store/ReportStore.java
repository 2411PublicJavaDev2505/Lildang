package com.lildang.spring.report.store;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;

public interface ReportStore {
	
	//사장님 입장에서 알바생 신고
	int reportEInsert(SqlSession session, ReportEmployee report);
	// 알바생 입장에서 사장님 신고
	int reportBInsert(SqlSession session, ReportEmploy report);

}
