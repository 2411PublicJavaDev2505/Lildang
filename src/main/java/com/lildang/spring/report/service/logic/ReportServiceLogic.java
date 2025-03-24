package com.lildang.spring.report.service.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;
import com.lildang.spring.report.service.ReportService;
import com.lildang.spring.report.store.ReportStore;

@Service
public class ReportServiceLogic implements ReportService{

	private ReportStore rStore;
	private SqlSession session;
	
	public ReportServiceLogic(ReportStore rStore, SqlSession session) {
		this.rStore = rStore;
		this.session = session;
	}
	// 사장 입장에서 알바생 신고
	@Override
	public int reportEInsert(ReportEmployee report) {
		int result = rStore.reportEInsert(session, report); 
		return result;
	}
	// 알바 입장에서 사장님 신고
	@Override
	public int reportBInsert(ReportEmploy report) {
		int result = rStore.reportBInsert(session, report);
		return result;
	}

}
