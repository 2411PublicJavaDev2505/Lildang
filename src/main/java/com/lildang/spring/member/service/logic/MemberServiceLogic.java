package com.lildang.spring.member.service.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.service.MemberService;
import com.lildang.spring.member.store.MemberStore;

@Service
public class MemberServiceLogic implements MemberService{
	
	@Autowired
	private MemberStore mStore;
	@Autowired
	private SqlSession session; 
	
	//로그인!
	@Override
	public MemberVO selectOneByLogin(LoginRequest member) {
		MemberVO result = mStore.selectOneByLogin(session, member);
		return result;
	}

}
