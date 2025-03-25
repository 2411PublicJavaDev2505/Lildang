package com.lildang.spring.employ.service;

import java.util.List;

import org.springframework.ui.Model;

import com.lildang.spring.employ.controller.dto.EmployInsertRequest;
import com.lildang.spring.employ.controller.dto.EmployUpdateRequest;
import com.lildang.spring.employ.domain.EmployVO;

public interface EmployService {


	List<EmployVO> selectList();//공고글 전체 정보 조회

	int insertEmploy(EmployInsertRequest employ);//공고글 작성

	EmployVO selectOneDetail(int employNo);//공고글 상세페이지

	int deleteEmploy(int employNo);

	int updateEmploy(EmployUpdateRequest employ);//공고글 수정

	List<EmployVO> selectListById(String id); // 공고글 리스트

}
