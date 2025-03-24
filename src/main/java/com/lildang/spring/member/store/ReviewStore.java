package com.lildang.spring.member.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;
import com.lildang.spring.member.domain.ReviewEmployVO;
import com.lildang.spring.member.domain.ReviewMemberVO;

public interface ReviewStore {

	int reviewEmployeeInsert(SqlSession session, ReviewEmployeeRequest review);

	List<ReviewMemberVO> selectReviewList(SqlSession session, String id);

	int reviewEmployeeUpdate(SqlSession session, ReviewEmployeeRequest review);

	int reviewEmployInsert(SqlSession session, ReviewEmployeeRequest review);

	List<ReviewEmployVO> selectReviewEmployList(SqlSession session, String id);

	int reviewEmployUpdate(SqlSession session, ReviewEmployeeRequest review);

}
