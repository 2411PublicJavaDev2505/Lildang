package com.lildang.spring.report.service.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	
	//신고전체리스트
	@Override
	public List<ReportVO> selectList() {
		List<ReportVO> rList = rStore.selectList(session);
		return rList;
	}

}
