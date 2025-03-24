package com.lildang.spring.match.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.match.controller.dto.ApplyRequest;
import com.lildang.spring.match.domain.MatchVO;
import com.lildang.spring.match.service.MatchService;

@Controller
public class MatchController {

	private MatchService mService;
	
	@Autowired
	public MatchController(MatchService mService) {
		this.mService = mService;
	}
	
	@GetMapping("/match/apply")
	public String applyInsert(Model model
			,@RequestParam("employNo") int employNo
			,HttpSession session) {
		try {
			String employeeId = (String)session.getAttribute("id");
			ApplyRequest match = new ApplyRequest(employeeId, employNo);
			MatchVO exist = mService.selectOne(match);
			int result = 0;
			if(exist != null) {
				result = mService.applyUpdate(match);
			}else {
				result = mService.apply(match);				
			}
			if(result > 0) {
				return "redirect:/employ/detail?employNo="+employNo;
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("/match/offer")
	public String offerInsert(Model model
			,@ModelAttribute ApplyRequest match) {
		try {
			MatchVO exist = mService.selectOne(match);
			int result = 0;
			if(exist !=null) {
				result = mService.offerUpdate(match);
			}else {
				result = mService.offer(match);
			}
			if(result > 0) {
				return "redirect:/employee/detail?id="+match.getEmployeeId();
			}else {
				return "common/error";				
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("/match/start")
	public String startJob(Model model
			,@ModelAttribute ApplyRequest match
			,HttpSession session) {
		try {
			int result = mService.startJob(match);
			if(result > 0) {
				return "redirect:/member/bdetail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("match/delete")
	public String matchDelete(Model model
			,@ModelAttribute ApplyRequest match) {
		try {
			int result = mService.matchDelete(match);
			if(result > 0) {
				return "redirect:/member/bdetail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("match/finish")
	public String matchFinish(Model model
			,@ModelAttribute ApplyRequest match) {
		try {
			int result = mService.matchFinish(match);
			if(result > 0) {
				return "redirect:/member/bdetail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
}
