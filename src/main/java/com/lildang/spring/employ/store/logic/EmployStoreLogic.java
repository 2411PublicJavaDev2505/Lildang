package com.lildang.spring.employ.store.logic;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.employ.controller.dto.EmployInsertRequest;
import com.lildang.spring.employ.controller.dto.EmployUpdateRequest;
import com.lildang.spring.employ.domain.EmployVO;
import com.lildang.spring.employ.store.EmployStore;
import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;

@Repository
public class EmployStoreLogic implements EmployStore{

	@Override//공고글 전체 정보 조회 03-25-16:33분 페이징 처리 시작(시작전 jsp작성하고옴!)
	public List<EmployVO> selectList(SqlSession session, int currentPage) {
		int limit =10;
		int offset =(currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<EmployVO> eList = session.selectList("EmployMapper.selectList",null, rowBounds);
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
	public List<EmployVO> selectListById(SqlSession session, String id) {
		List<EmployVO> eList = session.selectList("EmployMapper.selectListById", id);
		return eList;
	}

	@Override
	public int updateEmploy(SqlSession session, EmployUpdateRequest employ) {
		return session.update("EmployMapper.updateEmploy", employ);
	}

	@Override
	public int updateEmployScore(SqlSession session, ReviewEmployeeRequest review) {
		return session.update("EmployMapper.updateEmployScore",review);
	}

	@Override // 신고 상세페이지에서 사장님 정보 가져오기
	public EmployVO selectOneByNo(SqlSession session, int employNo) {
		EmployVO employ = session.selectOne("EmployMapper.selectOneByNo", employNo);
		return employ;
	}

	@Override // 신고 상세페이지에서 공고글 삭제하기
	public int deleteEmployNo(SqlSession session, int employNo) {
		int result = session.delete("EmployMapper.deleteEmployNo", employNo);
		return result;
	}
	
	@Override
	public List<EmployVO> selectSearchList(SqlSession session, String eSearchKeyword) {
		// TODO Auto-generated method stub
		return session.selectList("EmployMapper.selectSearchList", eSearchKeyword);
	}

	@Override
	public List<EmployVO> headerSearchList(SqlSession session, String searchKeyword) {
		// TODO Auto-generated method stub
		return session.selectList("EmployMapper.headerSearchList", searchKeyword);
	}
	//페이징추가!
	@Override
	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("EmployMapper.getTotalCount");
		return totalCount;
	}
}

