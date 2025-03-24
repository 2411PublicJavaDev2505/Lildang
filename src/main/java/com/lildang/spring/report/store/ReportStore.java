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

}
