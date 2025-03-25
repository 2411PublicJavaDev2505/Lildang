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

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;
import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.service.ReportService;

import oracle.jdbc.proxy.annotation.Post;

@Controller
public class ReportController {
	
	private  ReportService rService;
	
	@Autowired
	public ReportController(ReportService rService) {
		this.rService = rService;
	}
	
	//에러나서 아래 어노테이션 주석처리함!
	//@GetMapping("manager/reportlist")
	//ManagerController로 옮겨버림!!
	//이밑에 코드는 어떻게 함??
	public String showReportList(Model model) {
		//신고전체리스트
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
	// 신고목록 클릭해서 상세사항으로 들어가기
	@GetMapping("/report/detail")
	public String showReportDetail(@RequestParam("reportNo") int reportNo
			,Model model) {
		try {
			ReportVO report = rService.selectOneByNo(reportNo);
			if(report != null) {
				model.addAttribute("report", report);
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
}
