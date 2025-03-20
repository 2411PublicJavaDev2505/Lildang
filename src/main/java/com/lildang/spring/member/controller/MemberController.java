package com.lildang.spring.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

	
	

	@GetMapping("member/login")
	public String showMemberLogin(Model model) {
		
		try {
			
			return "member/common/login";
			
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/register")
	public String showMemberRegister() {
		return "member/common/register";
	}
	
	@GetMapping("member/delete")
	public String showMemberDelete() {
		return "member/common/delete";
	}
	
	@GetMapping("member/update")
	public String showMemberUpdate() {
		return "member/common/update";
	}
	
	@GetMapping("member/bdetail")
	public String showBossDetail() {
		return "member/boss/detail";
	}
	
	@GetMapping("member/edetail")
	public String showEmployeeDetail() {
		return "member/employee/detail";
	}
	
	@GetMapping("member/cvinsert")
	public String showCvInsert() {
		return "member/cv/insert";
	}
	
	@GetMapping("member/cvupdate")
	public String showCvUpdate() {
		return "member/cv/update";
	}
}
