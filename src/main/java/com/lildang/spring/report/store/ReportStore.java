package com.lildang.spring.report.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

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

}
