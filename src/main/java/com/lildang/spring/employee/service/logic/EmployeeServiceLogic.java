package com.lildang.spring.employee.service.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.lildang.spring.employee.service.EmployeeService;
import com.lildang.spring.employee.store.EmployeeStore;
import com.lildang.spring.member.domain.MemberVO;
@Service
public class EmployeeServiceLogic implements EmployeeService{
	
	private EmployeeStore eStore;
	private SqlSession session;
	
	public EmployeeServiceLogic(EmployeeStore eStore, SqlSession session) {
		this.eStore = eStore;
		this.session = session;
	}
	@Override
	public List<MemberVO> selectMemberList() {
		List<MemberVO> eList = eStore.selectEmployeeList(session);
		return eList;
	}

}
