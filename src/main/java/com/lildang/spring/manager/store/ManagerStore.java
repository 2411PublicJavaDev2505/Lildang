package com.lildang.spring.manager.store;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.member.domain.MemberVO;

public interface ManagerStore {
	//페이징추가!
	List<MemberVO> selectList(SqlSession session,int currentPage);
	//페이징추가코드!
	int getTotalCount(SqlSession session);
	// 관리자 입장에서 회원 검색
	List<MemberVO> selectMemberSearchList(SqlSession session, Map<String, String> searchMap, int currentPage);

}
