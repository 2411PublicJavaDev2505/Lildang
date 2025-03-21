package com.lildang.spring.employ.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.employ.controller.dto.EmployInsertRequest;
import com.lildang.spring.employ.domain.EmployVO;

public interface EmployStore {
	//공고 전체 조회 리스트
	public List<EmployVO> selectList(SqlSession session);
	//공고글 작성페이지
	public int insertEmploy(SqlSession session, EmployInsertRequest employ);
	//공고글 상세페이지
	public EmployVO selectOneDetail(SqlSession session, int employNo);

	
}

