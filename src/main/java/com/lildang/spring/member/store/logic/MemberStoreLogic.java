package com.lildang.spring.member.store.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.store.MemberStore;

@Repository
public class MemberStoreLogic implements MemberStore{
	
	//로그인!
	@Override
	public MemberVO selectOneByLogin(SqlSession session, LoginRequest member) {
		MemberVO result = session.selectOne("MemberMapper.selectOneByLogin",member);
		return result;
	}

	@Override
	public int memberRegister(SqlSession session, MemberRegisterRequest member) {
		return session.insert("MemberMapper.memberRegister", member);
	}

}
