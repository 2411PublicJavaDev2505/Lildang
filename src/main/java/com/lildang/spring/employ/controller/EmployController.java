 package com.lildang.spring.employ.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployController {

	
	@GetMapping("employ/detail")
	public String employDetail() {
		return "employ/detail";
	}
	
	@GetMapping("employ/insert")
	public String employInsert() {
		return "employ/insert";
	}
	
	@GetMapping("employ/update")
	public String employUpdate() {
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
