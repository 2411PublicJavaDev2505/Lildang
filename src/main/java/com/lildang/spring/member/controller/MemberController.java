package com.lildang.spring.member.controller;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.service.MemberService;

@Controller
public class MemberController {

	private MemberService mService;
	
	@Autowired
	public MemberController(MemberService mService) {
		this.mService = mService;
	}
	

	@GetMapping("member/login")
	public String showMemberLogin(Model model) {
		// 로그인 화면 띄우는 메소드
		try {
			return "member/common/login";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/register")
	public String showMemberRegister(Model model) {
		// 회원가입 화면 띄우는 메소드
		try {
			return "member/common/register";			
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("member/login")
	public String showMemberLogin(
			@ModelAttribute LoginRequest member
			,HttpSession session
			,Model model) {
		try {
			MemberVO member1 = mService.selectOneByLogin(member);
			if(member1 != null) {
				//내가 가지고 있는코드는 member1로 되어있음...왜??
				//name은???
				session.setAttribute("id", member1.getId());
				session.setAttribute("name", member1.getName());
				//return "member/common/login";
				return "redirect:/";
			}else {
				//실패시 에러페이지로이동
				model.addAttribute("errorMsg", "존재하지않은 정보입니다");
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("/member/register")
	public String memberRegister(Model model,
			@ModelAttribute MemberRegisterRequest member) {
		try {
			int result = mService.memberRegister(member);
			if(result > 0) {
				return "redirect:/";				
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
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
