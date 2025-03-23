package com.lildang.spring.employee.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.service.EmployService;
import com.lildang.spring.employee.service.EmployeeService;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.service.MemberService;

@Controller
public class EmployeeController {
	
	private MemberService mService;
	private EmployService eService;
	
	@Autowired
	public EmployeeController(MemberService mService, EmployService eService) {
		this.mService = mService;
		this.eService = eService;
	}
	@GetMapping("employee/list")
	public String showEmployeeList(Model model) {
		try {
			List<MemberVO> eList = mService.selectMemberList();
			model.addAttribute("eList",eList);
			return "employee/list";				
		} catch (Exception e) {
			e.printStackTrace();
			return "common/error";
		}
	}
	
	@GetMapping("employee/detail")
	public String showEmployeeDetail(Model model
			,@RequestParam("id") String id
			,HttpSession session) {
		
		try {
			MemberVO member = mService.selectCvById(id);
			List<EmployVO> eList = eService.selectListById((String)session.getAttribute("id"));
			if(member != null) {
				model.addAttribute("member",member);
				model.addAttribute("eList",eList);
				return "employee/detail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
		
	}
	
}
