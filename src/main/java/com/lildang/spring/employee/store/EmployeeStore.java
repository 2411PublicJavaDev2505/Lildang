package com.lildang.spring.employee.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.member.domain.MemberVO;

public interface EmployeeStore {

	List<MemberVO> selectEmployeeList(SqlSession session);

}

