package com.lildang.spring.employ.service;

import java.util.List;

import org.springframework.ui.Model;

import com.lildang.spring.employ.domain.EmployVO;

public interface EmployService {

	List<EmployVO> selectList();
	

}
