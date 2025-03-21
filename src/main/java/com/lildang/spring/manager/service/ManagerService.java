package com.lildang.spring.manager.service;

import java.util.List;

import com.lildang.spring.member.domain.MemberVO;

public interface ManagerService {

	List<MemberVO> selectList();

}
