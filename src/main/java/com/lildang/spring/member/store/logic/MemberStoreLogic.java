package com.lildang.spring.member.store.logic;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.ProfileUpdateRequest;
import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;
import com.lildang.spring.member.controller.dto.UpdateRequest;
import com.lildang.spring.member.controller.dto.CvInsertRequest;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.store.MemberStore;

@Repository
public class MemberStoreLogic implements MemberStore{
	
	//로그인!
	@Override
	public MemberVO selectOneByLogin(SqlSession session, LoginRequest member) {
		MemberVO result = session.selectOne("MemberMapper.selectOneByLogin",member);
		return result;
	}

	@Override
	public int memberRegister(SqlSession session, MemberRegisterRequest member) {
		return session.insert("MemberMapper.memberRegister", member);
	}
	// 마이페이지 조회
	@Override
	public MemberVO selectOneById(SqlSession session, String id) {
		MemberVO member = session.selectOne("MemberMapper.selectOneById", id);
		return member;
	}

	@Override
	public int updateMember(SqlSession session, UpdateRequest member) {
		int result = session.update("MemberMapper.updateMember", member);
		return result;
	}
	//회원탈퇴
	@Override
	public int deleteMember(SqlSession session, String id) {
		int result = session.delete("MemberMapper.deleteMember",id);
		return result;
	}

	@Override
	public int cvInsert(SqlSession session, CvInsertRequest cv) {
		return session.update("MemberMapper.cvInsert",cv);
	}

	@Override
	public int cvDelete(SqlSession session, String id) {
		return session.update("MemberMapper.cvDelete",id);
	}
	//페이징처리!코드추가!(여기도 에러나서 지울때 코드 return 조심할것!!!작성후다시 employee콘트롤러로!!
	@Override
	public List<MemberVO> selectMemberList(SqlSession session, int currentPage) {
		int limit =9;
		int offset =(currentPage-1)*limit;
		RowBounds rowBounds = new RowBounds(offset, limit);
		return session.selectList("MemberMapper.selectMemberList",null,rowBounds);
	}

	@Override
	public int updateEmployeeScore(SqlSession session, ReviewEmployeeRequest review) {
		return session.update("MemberMapper.updateEmployeeScore",review);
	}

	@Override
	public List<MemberVO> selectSearchList(SqlSession session, String searchKeyword) {
		return session.selectList("MemberMapper.selectSearchList", searchKeyword);
	}
	
	// 신고 상세페이지에서 알바생 삭제
	@Override
	public int reportDeleteE(SqlSession session, String memberId) {
		int result = session.delete("MemberMapper.reportDeleteE", memberId);
		return result;
	}

	//페이징추가!!
	@Override
	public int getTotalCount(SqlSession session) {
		int totalCount = session.selectOne("MemberMapper.getTotalCount");
		return totalCount;

	}
	@Override
	public int updateProfile(SqlSession session, ProfileUpdateRequest profile) {
		return session.update("MemberMapper.updateProfile", profile);

	}

	@Override
	public int cvUdpate(SqlSession session, CvInsertRequest cv) {
		return session.update("MemberMapper.cvUpdate", cv);
	}

	@Override
	public List<MemberVO> selectEmployeeOption(SqlSession session, String selectOption) {
		// TODO Auto-generated method stub
		return session.selectList("MemberMapper.selectEmployeeOption", selectOption);
	}
}
