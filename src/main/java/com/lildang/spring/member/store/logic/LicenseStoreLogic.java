package com.lildang.spring.member.store.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.lildang.spring.member.controller.dto.LicenseInsertRequest;
import com.lildang.spring.member.domain.LicenseVO;
import com.lildang.spring.member.store.LicenseStore;

@Repository
public class LicenseStoreLogic implements LicenseStore{

	@Override
	public int licenseInsert(SqlSession session, List<LicenseInsertRequest> getlList) {
		int result = 0;
		for(int i=0;i<getlList.size();i++) {
			result += session.insert("LicenseMapper.licenseInsert",getlList.get(i));
		}
		return result;
	}

	@Override
	public List<LicenseVO> selectLicenseById(SqlSession session, String id) {
		return session.selectList("LicenseMapper.selectLicenseById",id);
	}

	@Override
	public int licenseDelete(SqlSession session, String id) {
		return session.delete("LicenseMapper.licenseDelete",id);
	}

}
