 package com.lildang.spring.employ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployController {

	
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
	
}
