package com.lildang.spring.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lildang.spring.manager.service.ManagerService;
import com.lildang.spring.member.domain.MemberVO;

@Controller
public class ManagerController {
	private ManagerService mService;
	
	@Autowired
	public ManagerController(ManagerService mService) {
		this.mService =mService;
	}
	
	@GetMapping("manager/memberlist")
	public String showMemberList(Model model) {
		try {
			List<MemberVO> mList = mService.selectList();
			model.addAttribute("mList", mList);
			return "manager/memberlist";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("manager/reportlist")
	public String showReportList() {
		System.out.println("확인");
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
