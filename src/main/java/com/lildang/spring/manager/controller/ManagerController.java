package com.lildang.spring.manager.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lildang.spring.common.PageUtil;
import com.lildang.spring.manager.service.ManagerService;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.report.domain.ReportVO;
import com.lildang.spring.report.service.ReportService;

@Controller
public class ManagerController {
	
	private ManagerService mService;
	private ReportService rService;
	//페이지 코드추가
	private PageUtil pageUtil;
	
	@Autowired
	public ManagerController(ManagerService mService, ReportService rService, PageUtil pageUtil) {
		this.mService =mService;
		this.rService= rService;
		this.pageUtil = pageUtil;
	}
	@GetMapping("manager/search")// 회원정보 검색
	public String memberSearch(
			@RequestParam("memberSearch") String memberSearch
			,@RequestParam("searchKeyword") String searchKeyword
			,@RequestParam(value="page", defaultValue="1") int currentPage
			,Model model) {
		try {
			Map<String, String> searchMap = new HashMap<String, String>();
			int totalCount = mService.getTotalCount();
			Map<String, Integer> pageInfo=pageUtil.generatePageInfo(totalCount, currentPage);
			searchMap.put("searchKeyword", searchKeyword);
			searchMap.put("memberSearch", memberSearch);
			searchMap.put("currentPage", String.valueOf(currentPage));
			List<MemberVO>  mList = mService.selectMemberSearchList(searchMap, currentPage);
			model.addAttribute("mList", mList);
			model.addAttribute("maxPage", pageInfo.get("maxPage"));
			model.addAttribute("startNavi", pageInfo.get("startNavi"));
			model.addAttribute("endNavi", pageInfo.get("endNavi"));
			return "manager/search";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("manager/memberlist") //페이징처리추가코드해주기!
	public String showMemberList(
			@RequestParam(value="page", defaultValue="1") int currentPage
			,Model model) {
		try {
			List<MemberVO> mList = mService.selectList(currentPage);
			//페이징 코드추가!하고 getTotalCount만들어주기!
			int totalCount = mService.getTotalCount();
			Map<String, Integer> pageInfo=pageUtil.generatePageInfo(totalCount, currentPage);
			model.addAttribute("maxPage", pageInfo.get("maxPage"));
			model.addAttribute("startNavi", pageInfo.get("startNavi"));
			model.addAttribute("endNavi", pageInfo.get("endNavi"));
			model.addAttribute("mList", mList);
			return "manager/memberlist";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("manager/reportlist") //관리자 신고 게시글관리 페이징처리 시작!!!!
	public String showReportList(
			@RequestParam(value="page",defaultValue="1") int currnetPage
			,Model model) {
		try {
			List<ReportVO> rList = rService.selectList(currnetPage);
			//페이징코드 추가해줌!
			int totalCount = rService.getTotalCount(); //rService로
			Map<String, Integer> pageInfo
			=pageUtil.generatePageInfo(totalCount, currnetPage);
			model.addAttribute("maxPage", pageInfo.get("maxPage"));
			model.addAttribute("startNavi", pageInfo.get("startNavi"));
			model.addAttribute("endNavi", pageInfo.get("endNavi"));
			model.addAttribute("rList", rList);
			return "manager/reportlist";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("manager/remploy")
	public String showReportEmploy() {
		return "manager/reportemploy";
	}
	
	@GetMapping("manager/rmployee")
	public String showReportEmployee(
			@RequestParam("reportDetail") String reportDetail
			,Model model) {
			//여기위부터 아래까지 작성!! 03/24/틀리면 지울것!!
			try {
				ReportVO  report = rService.selectOneByDetail(reportDetail);
				model.addAttribute("reportDetail",reportDetail);
				return "manager/reportemployee";
			} catch (Exception e) {
				model.addAttribute("errorMsg", e.getMessage());
				return "common/error";
			}
	}

}
