package com.lildang.spring.member.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.member.controller.dto.CareerInsertRequest;
import com.lildang.spring.member.domain.CareerVO;

public interface CareerStore {

	int careerInsert(SqlSession session, List<CareerInsertRequest> getcList);

	List<CareerVO> selectCareerById(SqlSession session, String id);

	int careerDelete(SqlSession session, String id);

}
