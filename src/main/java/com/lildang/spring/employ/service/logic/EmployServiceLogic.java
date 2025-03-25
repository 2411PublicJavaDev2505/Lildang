package com.lildang.spring.employ.service.logic;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.lildang.spring.employ.controller.dto.EmployInsertRequest;
import com.lildang.spring.employ.controller.dto.EmployUpdateRequest;
import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.service.EmployService;
import com.lildang.spring.employ.store.EmployStore;
import com.lildang.spring.member.store.MemberStore;

@Service
public class EmployServiceLogic implements EmployService{
	
	private EmployStore eStore;
	private SqlSession session;
	
	@Autowired
	public void MemberServiceLogic(EmployStore eStore, SqlSession session) {
		this.eStore = eStore;
		this.session = session;
	}

	@Override//공고글 전체 정보 조회
	public List<EmployVO> selectList() {
		List<EmployVO> eList = eStore.selectList(session);
		return eList;
	}

	@Override//공고글 작성
	public int insertEmploy(EmployInsertRequest employ) {
		int result = eStore.insertEmploy(session, employ);
		return result;
	}

	@Override//공고글 상세페이지
	public EmployVO selectOneDetail(int employNo) {
		EmployVO result = eStore.selectOneDetail(session, employNo);
		return result;
	}

	@Override//공고글 삭제
	public int deleteEmploy(int employNo) {
		int result = eStore.deleteEmploy(session, employNo);
		return result;
	}

	@Override
	public List<EmployVO> selectListById(String id) {
		List<EmployVO> eList = eStore.selectListById(session, id);
		return eList;
	}

	@Override
	public int updateEmploy(EmployUpdateRequest employ) {
		int result = eStore.updateEmploy(session, employ);
		return result;
	}

	@Override
	public List<EmployVO> selectSearchList(String eSearchKeyword) {
		return eStore.selectSearchList(session, eSearchKeyword);
	}

	@Override
	public List<EmployVO> headerSearchList(String searchKeyword) {
		// TODO Auto-generated method stub
		return eStore.headerSearchList(session, searchKeyword);
	}

}


