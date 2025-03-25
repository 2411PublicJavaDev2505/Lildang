package com.lildang.spring.report.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;
import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.store.ReportStore;

@Repository
public class ReportStoreLogic implements ReportStore{
	//관리자 신고리스트
	@Override
	public List<ReportVO> selectList(SqlSession session) {
		List<ReportVO> rList = session.selectList("ReportMapper.reportList",session);
		return rList;
	}

	//3/24 신고내용 출력?reportemployee.jsp로 보내기!
	@Override
	public ReportVO selectOneByDetail(SqlSession session, String reportDetail) {
		ReportVO report = session.selectOne("ReportMapper.selectOneByDetail",reportDetail); 
		return report;
	}

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
	// 신고 상세페이지
	@Override
	public ReportVO selectOneByNo(SqlSession session, int reportNo) {
		ReportVO report = session.selectOne("ReportMapper.selectOneByNo", reportNo);
		return report;
	}
	// 신고글 삭제
	@Override
	public int deleteReport(SqlSession session, int reportNo) {
		int result = session.delete("ReportMapper.deleteReport", reportNo);
		return result;
	}
}
