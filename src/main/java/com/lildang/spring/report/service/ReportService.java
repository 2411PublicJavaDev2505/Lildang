package com.lildang.spring.report.service;

import java.util.List;

import com.lildang.spring.report.domain.ReportVO;

public interface ReportService {
	/**
	 * 신고전체리스트
	 * @return
	 */
	List<ReportVO> selectList();

}
