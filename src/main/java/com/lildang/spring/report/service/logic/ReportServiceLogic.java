package com.lildang.spring.report.service.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;
import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.service.ReportService;
import com.lildang.spring.report.store.ReportStore;

@Service
public class ReportServiceLogic implements ReportService{
	
	private ReportStore rStore;
	private SqlSession session;
	
	@Autowired
	public ReportServiceLogic(ReportStore rStore, SqlSession session) {
		this.rStore = rStore;
		this.session = session;
	}
	
	//신고전체리스트(페이징처리 시작전 확인작업)코드추가!!
	@Override
	public List<ReportVO> selectList(int currentPage) {
		List<ReportVO> rList = rStore.selectList(session, currentPage);
		return rList;
	}
	//3/24 신고내용 출력?reportemployee.jsp로 보내기!
	@Override
	public ReportVO selectOneByDetail(String reportDetail) {
		ReportVO report = rStore.selectOneByDetail(session,reportDetail);
		return report;
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
	// 신고 상세페이지 보기
	@Override
	public ReportVO selectOneByNo(int reportNo) {
		ReportVO report = rStore.selectOneByNo(session, reportNo);
		return report;
	}
	// 신고글 삭제
	@Override
	public int deleteReport(int reportNo) {
		int result = rStore.deleteReport(session, reportNo);
		return result;
	}
	//페이징처리 오후작업 코드추가!!
	@Override
	public int getTotalCount() {
		int totalCount = rStore.getTotalCount(session);
		return totalCount;
	}

}
