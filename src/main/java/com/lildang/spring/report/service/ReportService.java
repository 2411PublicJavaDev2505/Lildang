package com.lildang.spring.report.service;

import java.util.List;

import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;

public interface ReportService {
	/**
	 * 신고전체리스트
	 * @return
	 */
	List<ReportVO> selectList();
	//3/24 신고내용 출력?reportemployee.jsp로 보내기!
	ReportVO selectOneByDetail(String reportDetail);
	// 사장님이 알바생을 신고
	int reportEInsert(ReportEmployee report);
	// 알바생이 사장님을 신고
	int reportBInsert(ReportEmploy report);
	// 신고 상세페이지 보기
	ReportVO selectOneByNo(int reportNo);

}
