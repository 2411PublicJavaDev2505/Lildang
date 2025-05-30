package com.lildang.spring.member.controller;


import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.ProfileUpdateRequest;
import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;
import com.lildang.spring.member.controller.dto.UpdateRequest;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lildang.spring.common.FileUtil;
import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.service.EmployService;
import com.lildang.spring.match.service.MatchService;
import com.lildang.spring.member.controller.dto.CareerInsertRequest;
import com.lildang.spring.member.controller.dto.CvInsertRequest;
import com.lildang.spring.member.controller.dto.EducationInsertRequest;
import com.lildang.spring.member.controller.dto.LicenseInsertRequest;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.controller.dto.MatchJoinRequest;
import com.lildang.spring.member.domain.DesiredJobVO;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.domain.ReviewEmployVO;
import com.lildang.spring.member.domain.ReviewMemberVO;
import com.lildang.spring.member.service.MemberService;

import oracle.jdbc.proxy.annotation.Post;

@Controller
public class MemberController {

	private MemberService mService;
	private EmployService eService;
	private MatchService matchService;
	private FileUtil fileUtil;
	
	@Autowired
	public MemberController(MemberService mService, EmployService eService, MatchService matchService, FileUtil fileUtil) {
		this.mService = mService;
		this.eService = eService;
		this.matchService = matchService;
		this.fileUtil = fileUtil;
	}
	

	@GetMapping("member/login")
	public String showMemberLogin(Model model) {
		// 로그인 화면 띄우는 메소드
		try {
			return "member/common/login";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/register")
	public String showMemberRegister(Model model) {
		// 회원가입 화면 띄우는 메소드
		try {
			return "member/common/register";			
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("/member/register")
	public String memberRegister(Model model,
			@ModelAttribute MemberRegisterRequest member) {
		try {
			int result = mService.memberRegister(member);
			if(result > 0) {
				return "redirect:/";				
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage",e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("member/login")
	public String memberLogin(
			@ModelAttribute LoginRequest member
			,HttpSession session
			,Model model) {
		try {
			MemberVO result = mService.selectOneByLogin(member);
			if(result != null) {
				session.setAttribute("id", result.getId());
				session.setAttribute("name", result.getName());
				session.setAttribute("role", result.getRole());
				return "redirect:/";
			}else {
				return "redirect:/member/login";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg",e.getMessage());
			return "common/error";
		}
	}
	@GetMapping("member/logout")
	public String memberLogout(HttpSession session) {
		//로그아웃	
		if(session != null) {
			session.invalidate();
		}
		return "redirect:/";
	}
	
	
	
	@GetMapping("member/delete")
	public String showMemberDelete(HttpSession session, Model model) {
		try {
			MemberVO member = mService.selectOneById((String)session.getAttribute("id"));
			if(member != null) {
				model.addAttribute("member",member);
				return "member/common/delete";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/del")
	public String memberDelete(HttpSession session, Model model) {
		try {
			String id = (String)session.getAttribute("id");
			int result = mService.deleteMember(id);
			if(result > 0) {
				session.invalidate();
				return"redirect:/";
			}else {
				model.addAttribute("errorMsg","서비스가 완료되지않았습니다");
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg",e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/update")
	public String showMemberUpdate(HttpSession session
			,Model model) {
		try {
			String id = (String)session.getAttribute("id");
			MemberVO member = mService.selectOneById(id);
			model.addAttribute("member", member);
			return "member/common/update";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMessage", e.getMessage());
			return "common/error";
		}
	}
	@PostMapping("member/update")
	public String showMemberUpdate(
			HttpSession session,
			@ModelAttribute UpdateRequest member
			,Model model) {
		try {
			int result = mService.updateMember(member);
			if(result > 0) {
				String role = (String)session.getAttribute("role");
				switch(role) {
					case "EMPLOYER" : 
						return "redirect:/member/bdetail";
					case "EMPLOYEE" :
						return "redirect:/member/edetail";
					default:
						return "common/error";
				}
				
			}else {
				model.addAttribute("errorMsg", "서비스가 완료되지 않았습니다.");
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/bdetail")
	public String showBossDetail(HttpSession session
			,Model model) {
		try {
			String id = (String)session.getAttribute("id");
			List<EmployVO> eList = eService.selectListById(id);
			MemberVO member = mService.selectOneById(id);
			List<ReviewMemberVO> rmList = mService.selectReviewList(id);
			model.addAttribute("rmList",rmList);
			
			model.addAttribute("num",0);
			
			List<MatchJoinRequest> emList = matchService.selectEList(id);
			model.addAttribute("emList",emList);
			
			model.addAttribute("member", member);
			model.addAttribute("eList", eList);
			return "member/boss/detail";
		} catch (Exception e) {
			// TODO: handle exception
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/edetail")
	public String showEmployeeDetail(HttpSession session
			,Model model) {
		try {
			String id = (String)session.getAttribute("id");
			MemberVO member = mService.selectOneById(id);
			
			// 리뷰리스트
			List<ReviewEmployVO> reList = mService.selectReviewEmployList(id); 
			model.addAttribute("reList",reList);
			model.addAttribute("num",0);
			
			// 매칭리스트
			List<MatchJoinRequest> emList = matchService.selectEEList(id);
			model.addAttribute("emList",emList);
			
			int size = 0;
			for(int i=0;i<emList.size();i++) {
				if(emList.get(i).getEmployerYn().equals("Y"))
					size++;
			}
			model.addAttribute("size",size);
			
			model.addAttribute("member", member);
			return "member/employee/detail";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
		
	}
	
	@PostMapping("member/pupdate")
	public String updateProfile(Model model
			,@ModelAttribute ProfileUpdateRequest profile
			,MultipartFile reloadFile
			,HttpSession session) {
		try {
			String profileFilename = null;
			String profileFileRename = null;
			String profileFilepath = null;
			if(reloadFile != null && !reloadFile.getOriginalFilename().isBlank()) {
				Map<String,String> fileInfo = fileUtil.saveFile(reloadFile, session, "cv");
				profileFilename = fileInfo.get("cFilename");
				profileFileRename = fileInfo.get("cFileRename");
				profileFilepath = fileInfo.get("cFilepath");
				
				profile.setProfileFileName(profileFilename);
				profile.setProfileFileRename(profileFileRename);
				profile.setProfileFilePath(profileFilepath);
			}
			int result = mService.updateProfile(profile);
			if(result > 0) {
				String role = (String)session.getAttribute("role");
				switch(role){
					case "EMPLOYEE" : 
						role = "e";
						break;
					case "EMPLOYER" :
						role= "b";
						break;
				}
				return "redirect:/member/"+role+"detail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/cvinsert")
	public String showCvInsert(Model model
			,HttpSession session) {
		
		try {
			String id = (String)session.getAttribute("id");
			MemberVO member = mService.selectOneById(id);
			if(member != null) {
				model.addAttribute("member",member);
				return "member/cv/insert";
			}else {
				return "common/error";
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
		
	}
	
	@PostMapping("member/cvinsert")
	public String cvInsert(Model model
			,@RequestParam("schoolName") List<String> schoolNames
			,@RequestParam("entranceDate") List<Date> entranceDates
			,@RequestParam("graduateDate") List<Date> graduateDates
			,@RequestParam("comanyName") List<String> comanyNames
			,@RequestParam("workingPeriod") List<String> workingPeriods
			,@RequestParam("position") List<String> positions
			,@RequestParam("work") List<String> works
			,@RequestParam("institution") List<String> institutions
			,@RequestParam("licenseName") List<String> licenseNames
			,@RequestParam("getDate") List<Date> getDates
			,@RequestParam("jobNo") List<Integer> jobNos
			,@RequestParam("uploadFile") MultipartFile uploadFile
			,HttpSession session
			,@ModelAttribute CvInsertRequest cv
			) {
		try {
			for(int i=0;i<schoolNames.size();i++) {
				cv.geteList().add(new EducationInsertRequest(schoolNames.get(i), entranceDates.get(i), graduateDates.get(i), cv.getId()));
			}
			for(int i=0;i<comanyNames.size(); i++) {
				cv.getcList().add(new CareerInsertRequest(comanyNames.get(i), workingPeriods.get(i), positions.get(i), works.get(i), cv.getId()));
			}
			for(int i=0;i<institutions.size();i++) {
				cv.getlList().add(new LicenseInsertRequest(institutions.get(i), licenseNames.get(i), getDates.get(i), cv.getId()));
			}
			for(int i=0;i<jobNos.size();i++) {
				cv.getjList().add(new DesiredJobVO(jobNos.get(i), cv.getId()));
			}
			if(uploadFile != null && !uploadFile.getOriginalFilename().isBlank()) {
				Map<String, String> fileInfo = fileUtil.saveFile(uploadFile, session, "cv");
				cv.setProfileFileName(fileInfo.get("cFilename"));
				cv.setProfileFileRename(fileInfo.get("cFileRename"));
				cv.setProfileFilePath(fileInfo.get("cFilepath"));
			}
			int check = schoolNames.size() + comanyNames.size() + institutions.size() + jobNos.size() +1;
			int result = mService.cvInsert(cv);
			if(result < check) {
				return "common/error";
			}else {
				return "redirect:/member/edetail";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/cvdetail")
	public String cvDetail(Model model, HttpSession session) {
		
		try {
			String id = (String)session.getAttribute("id");
			MemberVO member = mService.selectCvById(id);
			if(member != null) {
				model.addAttribute("member",member);
				return "member/cv/detail";
			}else {
				return "common/error";				
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
		
	}
	
	@GetMapping("member/cvupdate")
	public String showCvUpdate(Model model, HttpSession session) {
		try {
			String id = (String)session.getAttribute("id");
			MemberVO member = mService.selectCvById(id);
			if(member != null) {
				model.addAttribute("member",member);
				return "member/cv/update";
			}else {
				return "common/error";				
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("member/cvupdate")
	public String cvUpdate(Model model
			,@RequestParam("schoolName") List<String> schoolNames
			,@RequestParam("entranceDate") List<Date> entranceDates
			,@RequestParam("graduateDate") List<Date> graduateDates
			,@RequestParam("comanyName") List<String> comanyNames
			,@RequestParam("workingPeriod") List<String> workingPeriods
			,@RequestParam("position") List<String> positions
			,@RequestParam("work") List<String> works
			,@RequestParam("institution") List<String> institutions
			,@RequestParam("licenseName") List<String> licenseNames
			,@RequestParam("getDate") List<Date> getDates
			,@RequestParam("jobNo") List<Integer> jobNos
			,HttpSession session
			,@ModelAttribute CvInsertRequest cv) {
		try {
			for(int i=0;i<schoolNames.size();i++) {
				cv.geteList().add(new EducationInsertRequest(schoolNames.get(i), entranceDates.get(i), graduateDates.get(i), cv.getId()));
			}
			for(int i=0;i<comanyNames.size(); i++) {
				cv.getcList().add(new CareerInsertRequest(comanyNames.get(i), workingPeriods.get(i), positions.get(i), works.get(i), cv.getId()));
			}
			for(int i=0;i<institutions.size();i++) {
				cv.getlList().add(new LicenseInsertRequest(institutions.get(i), licenseNames.get(i), getDates.get(i), cv.getId()));
			}
			for(int i=0;i<jobNos.size();i++) {
				cv.getjList().add(new DesiredJobVO(jobNos.get(i), cv.getId()));
			}
			int result = mService.cvUpdate(cv);
			if(result > 0) {
				return "redirect:/member/edetail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@GetMapping("member/cvdelete")
	public String cvDelete(Model model, HttpSession session) {
		try {
			String id = (String)session.getAttribute("id");
			int result = mService.cvDelete(id);
			if(result > 0){
				return "redirect:/member/edetail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		} 
	}
		
	@PostMapping("review/employee")
	public String reviewEmployeeInsert(Model model
			,@ModelAttribute ReviewEmployeeRequest review) {
		try {
			int result = mService.reviewEmployeeInsert(review);
			if(result > 0){
				return "redirect:/member/bdetail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("review/employee/update")
	public String reviewEmployeeUpdate(Model model
			,@ModelAttribute ReviewEmployeeRequest review) {
		try {
			int result = mService.reviewEmployeeUpdate(review);
			if(result > 0){
				return "redirect:/member/bdetail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("review/employ")
	public String reviewEmployInsert(Model model,
			@ModelAttribute ReviewEmployeeRequest review) {
		try {
			int result = mService.reviewEmployInsert(review);
			if(result > 0){
				return "redirect:/member/edetail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
	@PostMapping("review/employ/update")
	public String reviewEmployUpdate(Model model
			,@ModelAttribute ReviewEmployeeRequest review) {
		try {
			int result = mService.reviewEmployUpdate(review);
			if(result > 0){
				return "redirect:/member/edetail";
			}else {
				return "common/error";
			}
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("errorMsg", e.getMessage());
			return "common/error";
		}
	}
	
}
