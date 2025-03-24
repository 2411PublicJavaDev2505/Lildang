package com.lildang.spring.report.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.report.controller.dto.ReportEmploy;
import com.lildang.spring.report.controller.dto.ReportEmployee;
import com.lildang.spring.report.service.ReportService;

import oracle.jdbc.proxy.annotation.Post;

@Controller
public class ReportController {
	
	private  ReportService rService;
	
	@Autowired
	public ReportController(ReportService rService) {
		this.rService = rService;
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
