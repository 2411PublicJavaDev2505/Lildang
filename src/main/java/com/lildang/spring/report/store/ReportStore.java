package com.lildang.spring.report.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;
import com.lildang.spring.report.domain.ReportVO;

public interface ReportStore {
	/**
	 * 관리자 신고리스트(페이징처리 시작전 확인2!!) int currentPage추가!!
	 * @param session
	 * @return
	 */
	List<ReportVO> selectList(SqlSession session, int currentPage);
 	//3/24 신고내용 출력?reportemployee.jsp로 보내기!
 	ReportVO selectOneByDetail(SqlSession session, String reportDetail);
 	//사장님 입장에서 알바생 신고
	int reportEInsert(SqlSession session, ReportEmployee report);
	// 알바생 입장에서 사장님 신고
	int reportBInsert(SqlSession session, ReportEmploy report);
	// 신고 상세페이지 보기
	ReportVO selectOneByNo(SqlSession session, int reportNo);
	// 신고글 삭제
	int deleteReport(SqlSession session, int reportNo);
	//페이징처리 03/2615:30 코드추가!!!
	int getTotalCount(SqlSession session);
	

}
