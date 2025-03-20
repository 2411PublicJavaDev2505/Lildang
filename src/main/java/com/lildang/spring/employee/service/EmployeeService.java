package com.lildang.spring.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lildang.spring.member.domain.MemberVO;
@Service
public interface EmployeeService {


	List<MemberVO> selectMemberList();

}
