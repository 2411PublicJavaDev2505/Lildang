package com.lildang.spring.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerController {

	@GetMapping("manager/mlist")
	public String showMemberList() {
		return "manager/memberlist";
	}
	
	@GetMapping("manager/rlist")
	public String showReportList() {
		return "manager/reportlist";
	}
	
	@GetMapping("manager/remploy")
	public String showReportEmploy() {
		return "manager/reportemploy";
	}
	
	@GetMapping("manager/rmployee")
	public String showReportEmployee() {
		return "manager/reportemployee";
	}
}
