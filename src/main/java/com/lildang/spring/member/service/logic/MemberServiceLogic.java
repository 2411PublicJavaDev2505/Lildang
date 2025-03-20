package com.lildang.spring.member.service.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.service.MemberService;
import com.lildang.spring.member.store.MemberStore;

@Service
public class MemberServiceLogic implements MemberService{

	private MemberStore mStore;
	private SqlSession session;
	
	public MemberServiceLogic(MemberStore mStore, SqlSession session) {
		this.mStore = mStore;
		this.session = session;
	}
	
	@Override
	public int memberRegister(MemberRegisterRequest member) {
		return mStore.memberRegister(session, member);
	}

}
