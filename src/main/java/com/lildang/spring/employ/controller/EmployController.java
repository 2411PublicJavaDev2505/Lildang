 package com.lildang.spring.employ.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.service.EmployService;

@Controller
public class EmployController {
	
	private EmployService eService;
	
	public EmployController(EmployService eService) {
		this.eService = eService;
	}

	
	@GetMapping("employ/detail")
	public String showEmployDetail() {
		return "employ/detail";
	}
	
	@GetMapping("employ/insert")
	public String showEmployInsert() {
		return "employ/insert";
	}
	
	@GetMapping("employ/update")
	public String showEmployUpdate() {
		return "employ/update";
	}
	

	@GetMapping("employ/list")
	public String employList() {
		return "employ/list";
	}
	
	@GetMapping("employ/search")
	public String employSearch() {
		return "employ/search";
	}
	
	@GetMapping("employ/list")
	public String showEmployList(
			) {
		try {
			List<EmployVO> eList = eService.selectList();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "employ/list";		
	}
	
}
