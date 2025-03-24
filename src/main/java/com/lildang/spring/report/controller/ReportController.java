package com.lildang.spring.report.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.service.ReportService;

@Controller
public class ReportController {
	private ReportService rService;
	
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
	
	
	
}
