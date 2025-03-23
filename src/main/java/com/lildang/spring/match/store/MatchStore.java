package com.lildang.spring.match.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.match.controller.dto.ApplyRequest;
import com.lildang.spring.match.domain.MatchVO;
import com.lildang.spring.member.controller.dto.MatchJoinRequest;

public interface MatchStore {

	int apply(SqlSession session, ApplyRequest match);

	MatchVO selectOne(SqlSession session, ApplyRequest match);

	int applyUpdate(SqlSession session, ApplyRequest match);

	int offerUpdate(SqlSession session, ApplyRequest match);

	int offer(SqlSession session, ApplyRequest match);

	List<MatchJoinRequest> selectEList(SqlSession session, String id);

	List<MatchJoinRequest> selectEEList(SqlSession session, String id);

}
