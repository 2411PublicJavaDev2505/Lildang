package com.lildang.spring.match.service;

import java.util.List;

import com.lildang.spring.match.controller.dto.ApplyRequest;
import com.lildang.spring.match.domain.MatchVO;
import com.lildang.spring.member.controller.dto.MatchJoinRequest;

public interface MatchService {

	int apply(ApplyRequest match);

	MatchVO selectOne(ApplyRequest match);

	int applyUpdate(ApplyRequest match);

	int offerUpdate(ApplyRequest match);

	int offer(ApplyRequest match);

	List<MatchJoinRequest> selectEList(String id);

	List<MatchJoinRequest> selectEEList(String id);

}
