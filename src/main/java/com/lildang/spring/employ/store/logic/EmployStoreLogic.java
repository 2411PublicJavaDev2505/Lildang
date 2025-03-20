package com.lildang.spring.employ.store.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.store.EmployStore;

@Repository
public class EmployStoreLogic implements EmployStore{

	public List<EmployVO> selectList() {
		List<EmployVO> eList = new ArrayList<EmployVO>();
		return null;
	}

}
