package com.lildang.spring.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
	
	@GetMapping("employee/list")
	public String showEmployeeList() {
		return "employee/list";
	}
	
}
