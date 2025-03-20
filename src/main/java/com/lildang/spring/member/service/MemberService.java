package com.lildang.spring.member.service;

import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;

public interface MemberService {
	
	//로그인
	MemberVO selectOneByLogin(LoginRequest member);

}
