package com.lildang.spring.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.manager.service.ManagerService;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.service.ReportService;

@Controller
public class ManagerController {
	
	private ManagerService mService;
	private ReportService rService;
	
	@Autowired
	public ManagerController(ManagerService mService, ReportService rService) {
		this.mService =mService;
		this.rService= rService;
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
	public String showReportList(Model model) {
		try {
			List<ReportVO> rList = rService.selectList();
			model.addAttribute("rList", rList);
			return "manager/reportlist";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("manager/remploy")
	public String showReportEmploy() {
		return "manager/reportemploy";
	}
	
	@GetMapping("manager/rmployee")
	public String showReportEmployee(
			@RequestParam("reportDetail") String reportDetail
			,Model model) {
			//여기위부터 아래까지 작성!! 03/24/틀리면 지울것!!
			try {
				ReportVO  report = rService.selectOneByDetail(reportDetail);
				model.addAttribute("reportDetail",reportDetail);
				return "manager/reportemployee";
			} catch (Exception e) {
				model.addAttribute("errorMsg", e.getMessage());
				return "common/error";
			}
	}

}
