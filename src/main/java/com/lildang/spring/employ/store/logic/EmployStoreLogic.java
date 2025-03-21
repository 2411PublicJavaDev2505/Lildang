package com.lildang.spring.employ.store.logic;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.store.EmployStore;

@Repository
public class EmployStoreLogic implements EmployStore{

	@Override
	public List<EmployVO> selectList(SqlSession session) {
		List<EmployVO> eList = session.selectList("EmployMapper.selectList");
		return eList;
	}
}

