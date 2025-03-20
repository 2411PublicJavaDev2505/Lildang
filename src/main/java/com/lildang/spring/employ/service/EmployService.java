package com.lildang.spring.employ.service;

import java.util.List;

import com.lildang.spring.employ.domain.EmployVO;

public interface EmployService {
	//공고 전체 조회 리스트
	List<EmployVO> selectList();

}
