package com.lildang.spring.report.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.service.EmployService;
import com.lildang.spring.member.service.MemberService;
import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;
import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.service.ReportService;

import oracle.jdbc.proxy.annotation.Post;

@Controller
public class ReportController {
	
	private ReportService rService;
	private EmployService eService;
	private MemberService mService;
	
	@Autowired
	public ReportController(ReportService rService, EmployService eService,MemberService mService) {
		this.rService = rService;
		this.eService = eService;
		this.mService = mService;
	}
	
	// 신고목록 클릭해서 상세사항으로 들어가기
	@GetMapping("/report/detail")
	public String showReportDetail(@RequestParam("reportNo") int reportNo
			,Model model) {
		try {
			ReportVO report = rService.selectOneByNo(reportNo);
			EmployVO employ = eService.selectOneByNo(report.getReportEmployNo());
			if(report != null) {
				model.addAttribute("report", report);
				model.addAttribute("employ", employ);
				String reportTarget = report.getReportTarget();
				switch(reportTarget) {
					case "EMPLOY" : 
						return "manager/reportemploy";
					case "EMPLOYEE" :
						return "manager/reportemployee";
					default :
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
	
	// 사장입장에서 알바생 신고
	@GetMapping("report/einsert")
	public String showReportEInsert(Model model) {
		try {
			return "employee/detail";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";	
		}
	}
	
	@PostMapping("report/einsert")
	public String reportEInsert(Model model
			,@ModelAttribute ReportEmployee report) {
		try {
			int result = rService.reportEInsert(report);
			if(result > 0) {
				return "redirect:/";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}
	}
	
	// 알바생입장에서 사장님 신고
	@GetMapping("report/binsert")
	public String showReportBInsert(Model model) {
		try {
			return "employ/detail";
		} catch (Exception e) {
			return "common/error";
		}
	}
	@PostMapping("report/binsert")
	public String reportBInsert(Model model
			,@ModelAttribute ReportEmploy report) {
		try {
			int result = rService.reportBInsert(report);
			model.addAttribute("report", report);
			if(result > 0) {
				return "redirect:/";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}
	}
	@GetMapping("report/reportdel")
	public String reportDelete(Model model
			,@RequestParam("reportNo") int reportNo) {
		try {
			int result = rService.deleteReport(reportNo);
			if(result > 0) {
				return "redirect:/manager/reportlist";
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
	@GetMapping("report/reportdelb")
	public String reportDeleteB(Model model
			,@RequestParam("employNo") int employNo){
		try {
			int result = eService.deleteEmployNo(employNo);
			if(result > 0) {
				return "redirect:/manager/reportlist";
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
	
	@GetMapping("report/reportdele")
	public String reportDeleteE(Model model
			,@RequestParam("id") String id) {
		try {
			int result = mService.reportDeleteE(id);
			if(result > 0) {
				model.addAttribute("id", id);
				return "redirect:/manager/reportlist";
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
	
}
