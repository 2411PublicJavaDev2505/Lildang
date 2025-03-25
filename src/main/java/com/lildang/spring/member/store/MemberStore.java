package com.lildang.spring.member.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.ProfileUpdateRequest;
import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;
import com.lildang.spring.member.controller.dto.UpdateRequest;
import com.lildang.spring.member.controller.dto.CvInsertRequest;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;

public interface MemberStore {
	
	//로그인!!
	MemberVO selectOneByLogin(SqlSession session, LoginRequest member);

	/**
	 * 회원가입 메소드
	 * @param session
	 * @param member
	 * @return int
	 */
	int memberRegister(SqlSession session, MemberRegisterRequest member);
	
	// 아이디로 회원정보 가져와서 출력
	MemberVO selectOneById(SqlSession session, String id);
	
	// 회원정보 수정
	int updateMember(SqlSession session, UpdateRequest member);
	
	/**
	 * 회원탈퇴
	 * @param session
	 * @param id
	 * @return
	 */
	int deleteMember(SqlSession session, String id);

	int cvInsert(SqlSession session, CvInsertRequest cv);

	int cvDelete(SqlSession session, String id);

	List<MemberVO> selectMemberList(SqlSession session);

	int updateEmployeeScore(SqlSession session, ReviewEmployeeRequest review);
	
	List<MemberVO> selectSearchList(SqlSession session, String searchKeyword);
	// 신고 상세페이지에서 알바생 삭제
	int reportDeleteE(SqlSession session, String id);

	int updateProfile(SqlSession session, ProfileUpdateRequest profile);

}
