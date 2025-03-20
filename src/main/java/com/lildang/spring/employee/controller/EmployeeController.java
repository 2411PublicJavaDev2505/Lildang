package com.lildang.spring.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.lildang.spring.employee.service.EmployeeService;
import com.lildang.spring.member.domain.MemberVO;

@Controller
public class EmployeeController {
	
	private EmployeeService eService;
	@Autowired
	public EmployeeController(EmployeeService eService) {
		this.eService = eService;
	}
	@GetMapping("employee/list")
	public String showEmployeeList() {
		try {
			List<MemberVO> eList = eService.selectMemberList(); 
			return "employee/list";
			
		} catch (Exception e) {
			e.printStackTrace();
			return "common/error";
		}
	}
	
}
