package com.lildang.spring.member.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.member.controller.dto.EducationInsertRequest;
import com.lildang.spring.member.domain.EducationVO;
import com.lildang.spring.member.store.EducationStore;

@Repository
public class EducationStoreLogic implements EducationStore{

	@Override
	public int educationInsert(SqlSession session, List<EducationInsertRequest> geteList) {
		int result = 0;
		for(int i=0;i<geteList.size();i++) {
			result += session.insert("EducationMapper.educationInsert",geteList.get(i));
		}
		return result;
	}

	@Override
	public List<EducationVO> selectEducationById(SqlSession session, String id) {
		return session.selectList("EducationMapper.selectEducationById",id);
	}

	@Override
	public int educationDelete(SqlSession session, String id) {
		return session.delete("EducationMapper.educationDelete",id);
	}

}
