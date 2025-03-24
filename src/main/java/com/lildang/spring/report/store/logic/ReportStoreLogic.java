package com.lildang.spring.report.store.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;
import com.lildang.spring.report.store.ReportStore;

@Repository
public class ReportStoreLogic implements ReportStore{
	
	// 사장 입장에서 알바생 신고
	@Override
	public int reportEInsert(SqlSession session, ReportEmployee report) {
		int result = session.insert("ReportMapper.eInsert", report);
		return result;
	}
	// 알바생 입장에서 사장님 신고
	@Override
	public int reportBInsert(SqlSession session, ReportEmploy report) {
		int result = session.insert("ReportMapper.bInsert", report);
		return result;
	}

}
