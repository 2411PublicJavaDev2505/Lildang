package com.lildang.spring.employ.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.employ.controller.dto.EmployInsertRequest;
import com.lildang.spring.employ.controller.dto.EmployUpdateRequest;
import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;

public interface EmployStore {
	//공고 전체 조회 리스트

	public List<EmployVO> selectList(SqlSession session);
	//공고글 작성페이지
	public int insertEmploy(SqlSession session, EmployInsertRequest employ);
	//공고글 상세페이지
	public EmployVO selectOneDetail(SqlSession session, int employNo);
	//공고글 삭제
	public int deleteEmploy(SqlSession session, int employNo);
	//공고글 수정
	public int updateEmploy(SqlSession session, EmployUpdateRequest employ);
	// 공고글 리스트
	public List<EmployVO> selectListById(SqlSession session, String id);
	
	public int updateEmployScore(SqlSession session, ReviewEmployeeRequest review);
	// 신고 상세페이지에서 사장님 정보 가져오기
	public EmployVO selectOneByNo(SqlSession session, int employNo);
	// 신고 상세페이지에서 공고글 삭제하기
	public int deleteEmployNo(SqlSession session, int employNo);
	//공고글 검색
	public List<EmployVO> selectSearchList(SqlSession session, String eSearchKeyword);
	//헤더 공고글 검색
	public List<EmployVO> headerSearchList(SqlSession session, String searchKeyword);

}
