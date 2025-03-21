package com.lildang.spring.member.service.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.UpdateRequest;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.service.MemberService;
import com.lildang.spring.member.store.MemberStore;

@Service
public class MemberServiceLogic implements MemberService{
	
	private MemberStore mStore;
	private SqlSession session;
	
	@Autowired
	public MemberServiceLogic(MemberStore mStore, SqlSession session) {
		this.mStore = mStore;
		this.session = session;
	}
	
	//로그인!
	@Override
	public MemberVO selectOneByLogin(LoginRequest member) {
		MemberVO result = mStore.selectOneByLogin(session, member);
		return result;
	}

	
	@Override
	public int memberRegister(MemberRegisterRequest member) {
		return mStore.memberRegister(session, member);
	}
	//회원탈퇴
	@Override
	public int deleteMember(String id) {
		int result = mStore.deleteMember(session,id);
		return result;
	}

	@Override
	public MemberVO selectOneById(String id) {
		MemberVO member = mStore.selectOneById(session, id);
		return member;
	}

	@Override
	public int updateMember(UpdateRequest member) {
		int result = mStore.updateMember(session, member);
		return result;
	}


}
