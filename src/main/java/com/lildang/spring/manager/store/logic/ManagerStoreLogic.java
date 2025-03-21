package com.lildang.spring.manager.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.manager.store.ManagerStore;
import com.lildang.spring.member.domain.MemberVO;

@Repository
public class ManagerStoreLogic implements ManagerStore{

	@Override
	public List<MemberVO> selectList(SqlSession session) {
		List<MemberVO> mList = session.selectList("memberList");
		return mList;
	}

}
