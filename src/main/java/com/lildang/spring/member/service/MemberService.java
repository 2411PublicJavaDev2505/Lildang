package com.lildang.spring.member.service;

import org.springframework.stereotype.Service;

import com.lildang.spring.member.controller.dto.MemberRegisterRequest;

public interface MemberService {

	/**
	 * 회원가입 메소드
	 * @param member
	 * @return int
	 */
	int memberRegister(MemberRegisterRequest member);

}
