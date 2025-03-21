package com.lildang.spring.member.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.UpdateRequest;

import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.service.EmployService;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.service.MemberService;

import oracle.jdbc.proxy.annotation.Post;

@Controller
public class MemberController {

	private MemberService mService;
	private EmployService eService;
	
	@Autowired
	public MemberController(MemberService mService, EmployService eService) {
		this.mService = mService;
		this.eService = eService;
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
	
	@PostMapping("member/login")
	public String memberLogin(
			@ModelAttribute LoginRequest member
			,HttpSession session
			,Model model) {
		try {
			MemberVO result = mService.selectOneByLogin(member);
			if(result != null) {
				session.setAttribute("id", result.getId());
				session.setAttribute("name", result.getName());
				session.setAttribute("role", result.getRole());
				return "redirect:/";
			}else {
				//실패시 에러페이지로이동
				model.addAttribute("errorMsg", "존재하지않은 정보입니다");
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg",e.getMessage());
			return "common/error";
		}
	}
	@GetMapping("member/logout")
	public String memberLogout(HttpSession session) {
		//로그아웃	
		if(session != null) {
			session.invalidate();
		}
		return "redirect:/";
	}
	
	
	
	@GetMapping("member/delete")
	public String showMemberDelete(HttpSession session, Model model) {
		try {
			return "member/common/delete";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/del")
	public String memberDelete(HttpSession session, Model model) {
		try {
			String id = (String)session.getAttribute("id");
			int result = mService.deleteMember(id);
			if(result > 0) {
				session.invalidate();
				return"redirect:/";
			}else {
				model.addAttribute("errorMsg","서비스가 완료되지않았습니다");
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/update")
	public String showMemberUpdate(HttpSession session
			,Model model) {
		try {
			String id = (String)session.getAttribute("id");
			MemberVO member = mService.selectOneById(id);
			model.addAttribute("member", member);
			return "member/common/update";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}
	}
	@PostMapping("member/update")
	public String showMemberUpdate(
			HttpSession session,
			@ModelAttribute UpdateRequest member
			,Model model) {
		try {
			int result = mService.updateMember(member);
			if(result > 0) {
				String role = (String)session.getAttribute("role");
				switch(role) {
					case "EMPLOYER" : 
						return "redirect:/member/bdetail";
					case "EMPLOYEE" :
						return "redirect:/member/edetail";
					default:
						return "common/error";
				}
				
			}else {
				model.addAttribute("errorMsg", "서비스가 완료되지 않았습니다.");
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/bdetail")
	public String showBossDetail(HttpSession session
			,Model model) {
		try {
			String id = (String)session.getAttribute("id");
			List<EmployVO> eList = eService.selectListById(id);
			MemberVO member = mService.selectOneById(id);
			model.addAttribute("member", member);
			model.addAttribute("eList", eList);
			return "member/boss/detail";
		} catch (Exception e) {
			// TODO: handle exception
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/edetail")
	public String showEmployeeDetail(HttpSession session
			,Model model) {
		try {
			String id = (String)session.getAttribute("id");
			MemberVO member = mService.selectOneById(id);
			model.addAttribute("member", member);
			return "member/employee/detail";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
		
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
