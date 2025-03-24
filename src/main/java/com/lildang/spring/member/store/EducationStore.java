package com.lildang.spring.member.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.member.controller.dto.EducationInsertRequest;
import com.lildang.spring.member.domain.EducationVO;

public interface EducationStore {

	int educationInsert(SqlSession session, List<EducationInsertRequest> geteList);

	List<EducationVO> selectEducationById(SqlSession session, String id);

	int educationDelete(SqlSession session, String id);

}
