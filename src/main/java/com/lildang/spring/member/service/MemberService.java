package com.lildang.spring.member.service;

import org.springframework.stereotype.Service;

import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;

public interface MemberService {
	
	//로그인
	MemberVO selectOneByLogin(LoginRequest member);

	/**
	 * 회원가입 메소드
	 * @param member
	 * @return int
	 */
	int memberRegister(MemberRegisterRequest member);

}
