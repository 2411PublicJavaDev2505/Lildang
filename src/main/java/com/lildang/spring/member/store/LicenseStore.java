package com.lildang.spring.member.store;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.lildang.spring.member.controller.dto.LicenseInsertRequest;
import com.lildang.spring.member.domain.LicenseVO;

public interface LicenseStore {

	int licenseInsert(SqlSession session, List<LicenseInsertRequest> getlList);

	List<LicenseVO> selectLicenseById(SqlSession session, String id);

	int licenseDelete(SqlSession session, String id);

}
