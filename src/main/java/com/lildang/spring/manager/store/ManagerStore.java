package com.lildang.spring.manager.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.member.domain.MemberVO;

public interface ManagerStore {

	List<MemberVO> selectList(SqlSession session);

}
