package com.lildang.spring.employ.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.employ.domain.EmployVO;

public interface EmployStore {
	//공고 전체 조회 리스트

	public List<EmployVO> selectList(SqlSession session);
}


