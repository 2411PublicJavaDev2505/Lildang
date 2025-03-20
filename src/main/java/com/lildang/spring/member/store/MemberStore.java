package com.lildang.spring.member.store;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;

public interface MemberStore {
	
	//로그인!!
	MemberVO selectOneByLogin(SqlSession session, LoginRequest member);

	/**
	 * 회원가입 메소드
	 * @param session
	 * @param member
	 * @return int
	 */
	int memberRegister(SqlSession session, MemberRegisterRequest member);

}
