package com.lildang.spring.member.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;
import com.lildang.spring.member.domain.ReviewMemberVO;
import com.lildang.spring.member.store.ReviewStore;

@Repository
public class ReviewStoreLogic implements ReviewStore{

	@Override
	public int reviewEmployeeInsert(SqlSession session, ReviewEmployeeRequest review) {
		return session.insert("ReviewMapper.reviewEmployeeInsert",review);
	}

	@Override
	public List<ReviewMemberVO> selectReviewList(SqlSession session, String id) {
		return session.selectList("ReviewMapper.selectReviewList",id);
	}

	@Override
	public int reviewEmployeeUpdate(SqlSession session, ReviewEmployeeRequest review) {
		return session.update("ReviewMapper.reviewEmployeeUpdate",review);
	}

}
