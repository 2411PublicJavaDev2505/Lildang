package com.lildang.spring.report.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;
import com.lildang.spring.report.domain.ReportVO;

public interface ReportStore {
	/**
	 * 관리자 신고리스트
	 * @param session
	 * @return
	 */
	List<ReportVO> selectList(SqlSession session);
 	//3/24 신고내용 출력?reportemployee.jsp로 보내기!
 	ReportVO selectOneByDetail(SqlSession session, String reportDetail);
 	//사장님 입장에서 알바생 신고
	int reportEInsert(SqlSession session, ReportEmployee report);
	// 알바생 입장에서 사장님 신고
	int reportBInsert(SqlSession session, ReportEmploy report);
}
