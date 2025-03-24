package com.lildang.spring.member.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.member.controller.dto.CareerInsertRequest;
import com.lildang.spring.member.domain.CareerVO;
import com.lildang.spring.member.store.CareerStore;

@Repository
public class CareerStoreLogic implements CareerStore{

	@Override
	public int careerInsert(SqlSession session, List<CareerInsertRequest> getcList) {
		int result = 0;
		for(int i=0;i<getcList.size();i++) {
			result += session.insert("CareerMapper.careerInsert",getcList.get(i));
		}
		return result;
	}

	@Override
	public List<CareerVO> selectCareerById(SqlSession session, String id) {
		return session.selectList("CareerMapper.selectCareerById",id);
	}

	@Override
	public int careerDelete(SqlSession session, String id) {
		return session.delete("CareerMapper.careerDelete",id);
	}

}
