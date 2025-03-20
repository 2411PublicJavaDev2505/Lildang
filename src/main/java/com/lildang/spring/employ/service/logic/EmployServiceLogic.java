package com.lildang.spring.employ.service.logic;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

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

	@Override
	public List<EmployVO> selectList() {
		List<EmployVO> eList = eStore.selectList(session);
		return eList;
	}


}
