package com.lildang.spring.manager.service.logic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lildang.spring.manager.service.ManagerService;
import com.lildang.spring.manager.store.ManagerStore;
import com.lildang.spring.member.domain.MemberVO;

@Service
public class ManagerServiceLogic implements ManagerService{
	
	private ManagerStore mStore;
	private SqlSession session;
	
	@Autowired
	public ManagerServiceLogic(ManagerStore mStore, SqlSession session) {
		this.mStore = mStore;
		this.session = session;
	}
	
	
	// 관리자 입장에서 회원전체 조회
	//페이징추가작업!
	@Override
	public List<MemberVO> selectList(int currentPage) {
		List<MemberVO> mList = mStore.selectList(session,currentPage);
		return mList;
	}

	//페이징추가!
	@Override
	public int getTotalCount() {
		int totalCount = mStore.getTotalCount(session);
		return totalCount;
	}



	@Override
	public List<MemberVO> selectMemberSearchList(Map<String, String> searchMap, int currentPage) {
		List<MemberVO> mList = mStore.selectMemberSearchList(session, searchMap, currentPage);
		return mList;
	}

	


}
