package com.lildang.spring.report.service;

import java.util.List;

import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;

public interface ReportService {
	/**
	 * 신고전체리스트(페이징 처리 시작하기전) 시작하고 아래 코드추가!!
	 * @return  
	 */
	List<ReportVO> selectList(int currentPage);
	//3/24 신고내용 출력?reportemployee.jsp로 보내기!
	ReportVO selectOneByDetail(String reportDetail);
	// 사장님이 알바생을 신고
	int reportEInsert(ReportEmployee report);
	// 알바생이 사장님을 신고
	int reportBInsert(ReportEmploy report);
	// 신고 상세페이지 보기
	ReportVO selectOneByNo(int reportNo);
	// 신고글 삭제
	int deleteReport(int reportNo);
	//페이징처리(0325)오후작업!!
	int getTotalCount();


}
