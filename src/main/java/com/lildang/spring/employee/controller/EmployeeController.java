package com.lildang.spring.employee.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.common.PageUtil;
import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.service.EmployService;
import com.lildang.spring.employee.controller.dto.RERequest;
import com.lildang.spring.employee.service.EmployeeService;
import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.service.MemberService;

@Controller
public class EmployeeController {
	
	private MemberService mService;
	private EmployService eService;
	//페이지 유틸코드추가!
	private PageUtil pageUtil;
	
	@Autowired
	public EmployeeController(MemberService mService, EmployService eService, PageUtil pageUtil) {
		this.mService = mService;
		this.eService = eService;
		this.pageUtil = pageUtil;
	}
	@GetMapping("employee/detail")
	public String showEmployeeDetail(Model model
			,@RequestParam("id") String id
			,HttpSession session) {
		
		try {
			MemberVO member = mService.selectCvById(id);
			List<EmployVO> eList = eService.selectListById((String)session.getAttribute("id"));
			List<RERequest> reList = mService.selectEMList(member.getId());
			if(member != null) {
				model.addAttribute("reList",reList);
				model.addAttribute("member",member);
				model.addAttribute("eList",eList);
				return "employee/detail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}		
	}
	
	@GetMapping("employee/list")//알바생리스트페이징시작점!!안되면 지워주기!!3/25 18:33
	public String showEmployeeList(
			@RequestParam(value="page", defaultValue="1") int currentPage
			,@RequestParam(value="searchKeyword", defaultValue="") String searchKeyword
			,@RequestParam(value="selectOption", defaultValue="none") String selectOption
			,Model model) {
		try {
			
			List<MemberVO> eList = null;
			int totalCount = 0;
			Map<String,String> map = new HashMap<String, String>();
			map.put("searchKeyword", searchKeyword);
			map.put("selectOption", selectOption);
			
			if(searchKeyword.isEmpty()) {
				eList = mService.selectMemberList(map, currentPage);
				//페이징코드추가!
				totalCount = mService.getTotalCount(map);//여기옆에 currentpage만들고 와서 e를 바꿔주기!!
			}else {
				eList = mService.selectSearchList(map, currentPage);
				totalCount = mService.getSearchTotalCount(map);
			}
			int total = mService.getTotal();
			Map<String, Integer> pageInfo = pageUtil.generatePageInfo(totalCount, currentPage);
			model.addAttribute("maxPage", pageInfo.get("maxPage"));
			model.addAttribute("startNavi", pageInfo.get("startNavi"));
			model.addAttribute("endNavi", pageInfo.get("endNavi"));
			model.addAttribute("eList",eList);
			model.addAttribute("total",total);
			model.addAttribute("searchKeyword",searchKeyword);
			model.addAttribute("selectOption",selectOption);
			return "employee/list";				
		} catch (Exception e) {
			e.printStackTrace();
			return "common/error";
		}
	}
}
