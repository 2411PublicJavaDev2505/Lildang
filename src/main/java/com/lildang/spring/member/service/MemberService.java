package com.lildang.spring.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.UpdateRequest;
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
	// 회원정보 본인걸로 나오게 하기
	MemberVO selectOneById(String id);
	
	// 회원정보 수정
	int updateMember(UpdateRequest member);
	

}
