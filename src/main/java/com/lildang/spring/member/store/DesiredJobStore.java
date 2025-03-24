package com.lildang.spring.member.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.member.domain.DesiredJobVO;

public interface DesiredJobStore {

	int desiredJobInsert(SqlSession session, List<DesiredJobVO> getjList);

	List<DesiredJobVO> selectDesiredJobById(SqlSession session, String id);

	int desiredJobDelete(SqlSession session, String id);

}
