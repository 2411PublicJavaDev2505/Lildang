package com.lildang.spring.manager.service.logic;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lildang.spring.manager.service.ManagerService;
import com.lildang.spring.manager.store.ManagerStore;
import com.lildang.spring.member.domain.MemberVO;

@Service
public class ManagerServiceLogic implements ManagerService{
	
	private ManagerStore mStore;
	private SqlSession session;
	@Autowired
	public ManagerServiceLogic(ManagerStore mStore, SqlSession session) {
		this.mStore = mStore;
		this.session = session;
	}
	
	
	
	@Override
	public List<MemberVO> selectList() {
		List<MemberVO> mList = mStore.selectList(session);
		return mList;
	}

}
