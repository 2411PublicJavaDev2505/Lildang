package com.lildang.spring.match.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.match.controller.dto.ApplyRequest;
import com.lildang.spring.match.domain.MatchVO;
import com.lildang.spring.match.store.MatchStore;
import com.lildang.spring.member.controller.dto.MatchJoinRequest;

@Repository
public class MatchStoreLogic implements MatchStore{

	@Override
	public int apply(SqlSession session, ApplyRequest match) {
		return session.insert("MatchMapper.apply",match);
	}

	@Override
	public MatchVO selectOne(SqlSession session, ApplyRequest match) {
		return session.selectOne("MatchMapper.selectOne",match);
	}

	@Override
	public int applyUpdate(SqlSession session, ApplyRequest match) {
		return session.update("MatchMapper.applyUpdate",match);
	}

	@Override
	public int offerUpdate(SqlSession session, ApplyRequest match) {
		return session.update("MatchMapper.offerUpdate",match);
	}

	@Override
	public int offer(SqlSession session, ApplyRequest match) {
		return session.insert("MatchMapper.offer",match);
	}

	@Override
	public List<MatchJoinRequest> selectEList(SqlSession session, String id) {
		return session.selectList("MatchMapper.selectEList",id);
	}

	@Override
	public List<MatchJoinRequest> selectEEList(SqlSession session, String id) {
		return session.selectList("MatchMapper.selectEEList",id);
	}

	@Override
	public int startJob(SqlSession session, ApplyRequest match) {
		return session.update("MatchMapper.startJob",match);
	}

	@Override
	public int matchDelete(SqlSession session, ApplyRequest match) {
		return session.delete("MatchMapper.matchDelete",match);
	}

	@Override
	public int matchFinish(SqlSession session, ApplyRequest match) {
		return session.update("MatchMapper.matchFinish", match);
	}

	@Override
	public int matchAccept(SqlSession session, ApplyRequest match) {
		return session.update("MatchMapper.matchAccept",match);
	}

}
