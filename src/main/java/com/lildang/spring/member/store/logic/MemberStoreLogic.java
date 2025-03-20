package com.lildang.spring.member.store.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.store.MemberStore;

@Repository
public class MemberStoreLogic implements MemberStore{

	@Override
	public int memberRegister(SqlSession session, MemberRegisterRequest member) {
		System.out.println(member.getId());
		int result = session.insert("MemberMapper.memberRegister", member);
		System.out.println(result);
		return session.insert("MemberMapper.memberRegister", member);
	}

}
