package com.lildang.spring.member.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.member.domain.DesiredJobVO;
import com.lildang.spring.member.store.DesiredJobStore;

@Repository
public class DesiredJobStoreLogic implements DesiredJobStore{

	@Override
	public int desiredJobInsert(SqlSession session, List<DesiredJobVO> getjList) {
		int result = 0;
		for(int i=0;i<getjList.size();i++) {
			result += session.insert("DesiredJobMapper.desiredJobInsert",getjList.get(i));
		}
		return result;
	}

	@Override
	public List<DesiredJobVO> selectDesiredJobById(SqlSession session, String id) {
		return session.selectList("DesiredJobMapper.selectDesiredJobById",id);
	}

	@Override
	public int desiredJobDelete(SqlSession session, String id) {
		return session.delete("DesiredJobMapper.desiredJobDelete",id);
	}

}
