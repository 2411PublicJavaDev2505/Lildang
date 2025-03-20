package com.lildang.spring.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ManagerController {

	@GetMapping("manager/mlist")
	public String memberList() {
		return "manager/memberlist";
	}
	
	@GetMapping("manager/rlist")
	public String reportList() {
		return "manager/reportlist";
	}
	
	@GetMapping("manager/remploy")
	public String reportEmploy() {
		return "manager/reportemploy";
	}
	
	@GetMapping("manager/rmployee")
	public String reportEmployee() {
		return "manager/reportemployee";
	}
}
