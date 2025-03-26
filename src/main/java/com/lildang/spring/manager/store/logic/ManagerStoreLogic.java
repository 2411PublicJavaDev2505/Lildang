package com.lildang.spring.manager.store.logic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.manager.store.ManagerStore;
import com.lildang.spring.member.domain.MemberVO;

@Repository
public class ManagerStoreLogic implements ManagerStore{
	
	
	//03-25 11:11분부터 페이징처리시작 **mybatis-config에 추가할거있음!)
	@Override
	public List<MemberVO> selectList(SqlSession session,int currentPage) {
		int limit =10;
		int offset =(currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<MemberVO> mList = session.selectList("MemberMapper.selectMemberList", null, rowBounds);
		return mList;
	}
	//페이징추가! 
	@Override
	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("MemberMapper.getTotalCount");
		return totalCount;
	}
	// 관리자 입장에서 회원 검색
	@Override
	public List<MemberVO> selectMemberSearchList(SqlSession session, Map<String, String> searchMap, int currentPage) {
		int limit =10;
		int offset =(currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		List<MemberVO> mList = session.selectList("MemberMapper.selectMemberSearchList", searchMap, rowBounds);
		return mList;
	}

	
}

