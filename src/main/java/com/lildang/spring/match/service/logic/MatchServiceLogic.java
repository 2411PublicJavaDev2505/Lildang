package com.lildang.spring.match.service.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lildang.spring.match.controller.dto.ApplyRequest;
import com.lildang.spring.match.domain.MatchVO;
import com.lildang.spring.match.service.MatchService;
import com.lildang.spring.match.store.MatchStore;
import com.lildang.spring.member.controller.dto.MatchJoinRequest;

@Service
public class MatchServiceLogic implements MatchService{

	private MatchStore mStore;
	private SqlSession session;
	
	@Autowired
	public MatchServiceLogic(MatchStore mStore,SqlSession session) {
		this.mStore = mStore;
		this.session = session;
	}
	
	@Override
	public int apply(ApplyRequest match) {
		return mStore.apply(session, match);
	}

	@Override
	public MatchVO selectOne(ApplyRequest match) {
		return mStore.selectOne(session, match);
	}

	@Override
	public int applyUpdate(ApplyRequest match) {
		return mStore.applyUpdate(session, match);
	}

	@Override
	public int offerUpdate(ApplyRequest match) {
		return mStore.offerUpdate(session, match);
	}

	@Override
	public int offer(ApplyRequest match) {
		return mStore.offer(session, match);
	}

	@Override
	public List<MatchJoinRequest> selectEList(String id) {
		return mStore.selectEList(session, id);
	}

	@Override
	public List<MatchJoinRequest> selectEEList(String id) {
		return mStore.selectEEList(session, id);
	}

	@Override
	public int startJob(ApplyRequest match) {
		return mStore.startJob(session, match);
	}

	@Override
	public int matchDelete(ApplyRequest match) {
		return mStore.matchDelete(session, match);
	}

	@Override
	public int matchFinish(ApplyRequest match) {
		return mStore.matchFinish(session, match);
	}

	@Override
	public int matchAccept(ApplyRequest match) {
		return mStore.matchAccept(session, match);
	}

}
