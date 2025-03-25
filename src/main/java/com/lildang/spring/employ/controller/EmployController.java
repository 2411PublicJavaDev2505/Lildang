package com.lildang.spring.employ.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.employ.controller.dto.EmployInsertRequest;
import com.lildang.spring.employ.controller.dto.EmployReviewRequest;
import com.lildang.spring.employ.controller.dto.EmployUpdateRequest;
import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.service.EmployService;
import com.lildang.spring.member.service.MemberService;

@Controller
public class EmployController {
	
	private EmployService eService;
	private MemberService mService;
	
	@Autowired
	public EmployController(EmployService eService, MemberService mService) {
		this.eService = eService;
		this.mService = mService;
	}

	@GetMapping("employ/detail")//공고글 상세
	public String showEmployDetail(Model model,
			@RequestParam("employNo") int employNo
			,HttpSession session) {	
		try {
			EmployVO result = eService.selectOneDetail(employNo);
			List<EmployReviewRequest> rList = mService.selectERList(employNo);
			if(result != null) {
				model.addAttribute("result", result);
				model.addAttribute("rList",rList);
				return "employ/detail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
		
	}
	
	@GetMapping("employ/insert")
	public String showEmployInsert() {
		return "employ/insert";
	}
	
	@GetMapping("employ/update")//공고글 수정하기 GET
	public String showEmployUpdate(Model model, @RequestParam("employNo") int employNo) {
		try {
			EmployVO employ = eService.selectOneDetail(employNo);
			model.addAttribute("employ",employ);
			return "employ/update";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("employ/update")//공고글 수정하기 POST
	public String employUpdate(Model model,  @ModelAttribute EmployUpdateRequest employ) {
		try {
			int result = eService.updateEmploy(employ);
			if(result >0) {
				return "redirect:/employ/detail?employNo="+employ.getEmployNo();
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("employ/search")
	public String employSearch() {
		return "employ/search";
	}
	
	@GetMapping("employ/list") //공고글 전체 정보 조회
	public String showEmployList(Model model) {
		try {
			List<EmployVO> eList = eService.selectList();
			model.addAttribute("eList",eList);
			return "employ/list";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}	
	}
	@PostMapping("employ/insert")//공고글 작성 페이지 (**03-24!15:00분부터 수정시작 첨부파일작성!전dto추가하고 오겠음!)
	public String insertEmployList(Model model,
			@ModelAttribute EmployInsertRequest employ) {
		try {
			int result = eService.insertEmploy(employ);
			if(result >0) {
				return "redirect:/employ/list";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	@GetMapping("employ/delete")//공고글 삭제 페이지
	public String deleteEmploy(Model model, @RequestParam("employNo") int employNo) {
		try {
			int result = eService.deleteEmploy(employNo);
			if(result > 0) {
				return "redirect:/employee/list";				
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
}
