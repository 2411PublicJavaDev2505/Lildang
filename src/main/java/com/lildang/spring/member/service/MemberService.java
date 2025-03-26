package com.lildang.spring.member.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.ProfileUpdateRequest;
import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;
import com.lildang.spring.member.controller.dto.UpdateRequest;
import com.lildang.spring.employ.controller.dto.EmployReviewRequest;
import com.lildang.spring.employee.controller.dto.RERequest;
import com.lildang.spring.member.controller.dto.CvInsertRequest;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.domain.ReviewEmployVO;
import com.lildang.spring.member.domain.ReviewMemberVO;

public interface MemberService {
	
	//로그인
	MemberVO selectOneByLogin(LoginRequest member);

	/**
	 * 회원가입 메소드
	 * @param member
	 * @return int
	 */
	int memberRegister(MemberRegisterRequest member);
	// 회원정보 본인걸로 나오게 하기
	MemberVO selectOneById(String id);
	
	// 회원정보 수정
	int updateMember(UpdateRequest member);
	

	/**
	 * 회원탈퇴
	 * @param id
	 * @return 
	 */
	int deleteMember(String id);

	// 이력서 작성
	int cvInsert(CvInsertRequest cv);

	MemberVO selectCvById(String id);

	int cvDelete(String id);
	//employee에서 넘어옴??페이징작성!
	List<MemberVO> selectMemberList(int currentPage);

	int reviewEmployeeInsert(ReviewEmployeeRequest review);

	List<ReviewMemberVO> selectReviewList(String id);

	int reviewEmployeeUpdate(ReviewEmployeeRequest review);

	int reviewEmployInsert(ReviewEmployeeRequest review);

	List<ReviewEmployVO> selectReviewEmployList(String id);

	int reviewEmployUpdate(ReviewEmployeeRequest review);
	
	List<MemberVO> selectSearchList(String searchKeyword);

	List<EmployReviewRequest> selectERList(int employNo);
	// 신고 상세페이지에서 알바생 삭제
	int reportDeleteE(String id);

	//페이징코드추가!EmployeeController에서옴!
	int getTotalCount();

	List<RERequest> selectEMList(String id);

	int updateProfile(ProfileUpdateRequest profile);

	int cvUpdate(CvInsertRequest cv);
	
}
