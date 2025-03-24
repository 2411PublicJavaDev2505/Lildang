package com.lildang.spring.report.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.store.ReportStore;

@Repository
public class ReportStoreLogic implements ReportStore{
	//관리자 신고리스트
	@Override
	public List<ReportVO> selectList(SqlSession session) {
		List<ReportVO> rList = session.selectList("ReportMapper.reportList");
		return rList;
	}

	//3/24 신고내용 출력?reportemployee.jsp로 보내기!
	@Override
	public ReportVO selectOneByDetail(SqlSession session, String reportDetail) {
		ReportVO report = session.selectOne("ReportMapper.selectOneByDetail",reportDetail); 
		return report;
	}

}
