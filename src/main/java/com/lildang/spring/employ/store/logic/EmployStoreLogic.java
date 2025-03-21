package com.lildang.spring.employ.store.logic;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.employ.controller.dto.EmployInsertRequest;
import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.store.EmployStore;

@Repository
public class EmployStoreLogic implements EmployStore{

	@Override//공고글 전체 정보 조회
	public List<EmployVO> selectList(SqlSession session) {
		List<EmployVO> eList = session.selectList("EmployMapper.selectList");
		return eList;
	}

	@Override//공고글 작성 페이지
	public int insertEmploy(SqlSession session, EmployInsertRequest employ) {
		return session.insert("EmployMapper.insertEmploy", employ);
		
	}

	@Override
	public EmployVO selectOneDetail(SqlSession session, int employNo) {
		EmployVO result = session.selectOne("EmployMapper.selectOneDetail", employNo);
		return result;
	}

	@Override
	public int deleteEmploy(SqlSession session, int employNo) {
		return session.delete("EmployMapper.deleteEmploy", employNo);
	}

	@Override
	public int updateEmploy(SqlSession session, int employNo) {
		return session.update("EmployMapper.updateEmploy", employNo);
	}

	@Override
	public List<EmployVO> selectListById(SqlSession session, String id) {
		List<EmployVO> eList = session.selectList("EmployMapper.selectListById", id);
		return eList;
	}
}
