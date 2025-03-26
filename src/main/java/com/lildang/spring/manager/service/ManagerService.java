package com.lildang.spring.manager.service;

import java.util.List;
import java.util.Map;

import com.lildang.spring.member.domain.MemberVO;

public interface ManagerService {
	//페이징추가!current추가!
	List<MemberVO> selectList(int currentPage);
	//페이징!
	int getTotalCount();
	// 관리자 페이지에서 회원검색
	List<MemberVO> selectMemberSearchList(Map<String, String> searchMap);

}
