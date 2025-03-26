package com.lildang.spring.report.store.logic;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;
import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.store.ReportStore;

@Repository
public class ReportStoreLogic implements ReportStore{
	//관리자 신고리스트 (페이징처리 신고게시글 페이징 처리작업전 확인!!)
	@Override
	public List<ReportVO> selectList(SqlSession session, int currentPage) {
		//여기부터 페이징처리 시작코드!!!중간에 커밋하면 주석처리하고 컴밋할것!!!
		int limit =10;
		int offset =(currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<ReportVO> rList = session.selectList("ReportMapper.reportList",session, rowBounds);
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
	//신고 관리 페이징처리!!!!3/26/15:31 맵퍼적어주면 jsp 건들기!!!
	@Override
	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("ReportMapper.getTotalCount");
		return totalCount;
	}
}
