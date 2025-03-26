package com.lildang.spring.employ.service;

import java.util.List;

import org.springframework.ui.Model;

import com.lildang.spring.employ.controller.dto.EmployInsertRequest;
import com.lildang.spring.employ.controller.dto.EmployUpdateRequest;
import com.lildang.spring.employ.domain.EmployVO;

public interface EmployService {

	//페이징코드추가!
	List<EmployVO> selectList(int currentPage);//공고글 전체 정보 조회

	int insertEmploy(EmployInsertRequest employ);//공고글 작성

	EmployVO selectOneDetail(int employNo);//공고글 상세페이지

	int deleteEmploy(int employNo);

	int updateEmploy(EmployUpdateRequest employ);//공고글 수정

	List<EmployVO> selectListById(String id); // 공고글 리스트

	EmployVO selectOneByNo(int employNo); // 신고 상세페이지에서 사장님 정보 가져오기

	int deleteEmployNo(int employNo); // 신고 상세페이지에서 공고글 삭제하기

	List<EmployVO> headerSearchList(String searchKeyword, int currentPage, String selectOption);
	//페이징처리코드추가!
	int getTotalCount();

	String selectIdByEmployNo(int employNo);
	
	List<EmployVO> selectSearchList(String eSearchKeyword, int currentPage, String selectOption);

	int getCountSearchList(String eSearchKeyword, String selectOption);

	int getCountHeaderSearchList(String searchKeyword, String selectOption);

}
