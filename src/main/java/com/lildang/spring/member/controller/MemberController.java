package com.lildang.spring.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	@GetMapping("member/login")
	public String memberLogin() {
		return "member/common/login";
	}
	@GetMapping("member/register")
	public String memberRegister() {
		return "member/common/register";
	}
	@GetMapping("member/delete")
	public String memberDelete() {
		return "member/common/delete";
	}
	@GetMapping("member/update")
	public String memberUpdate() {
		return "member/common/update";
	}
	
	@GetMapping("member/bdetail")
	public String bossDetail() {
		return "member/boss/detail";
	}
	@GetMapping("member/edetail")
	public String employeeDetail() {
		return "member/employee/detail";
	}
	
	@GetMapping("member/cvinsert")
	public String cvInsert() {
		return "member/cv/insert";
	}
	@GetMapping("member/cvupdate")
	public String cvUpdate() {
		return "member/cv/update";
	}
}
