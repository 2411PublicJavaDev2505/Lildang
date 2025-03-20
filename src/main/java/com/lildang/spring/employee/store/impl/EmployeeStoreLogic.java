package com.lildang.spring.employee.store.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.employee.store.EmployeeStore;
import com.lildang.spring.member.domain.MemberVO;

@Repository
public class EmployeeStoreLogic implements EmployeeStore{

	@Override
	public List<MemberVO> selectEmployeeList(SqlSession session) {
		List<MemberVO> eList = session.selectList("");
		return eList;
	}

}
