package com.lildang.spring.member.service.logic;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.ProfileUpdateRequest;
import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;
import com.lildang.spring.member.controller.dto.UpdateRequest;
import com.lildang.spring.employ.controller.dto.EmployReviewRequest;
import com.lildang.spring.employ.store.EmployStore;
import com.lildang.spring.employee.controller.dto.RERequest;
import com.lildang.spring.member.controller.dto.CvInsertRequest;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.CareerVO;
import com.lildang.spring.member.domain.DesiredJobVO;
import com.lildang.spring.member.domain.EducationVO;
import com.lildang.spring.member.domain.LicenseVO;
import com.lildang.spring.member.domain.MemberVO;
import com.lildang.spring.member.domain.ReviewEmployVO;
import com.lildang.spring.member.domain.ReviewMemberVO;
import com.lildang.spring.member.service.MemberService;
import com.lildang.spring.member.store.CareerStore;
import com.lildang.spring.member.store.DesiredJobStore;
import com.lildang.spring.member.store.EducationStore;
import com.lildang.spring.member.store.LicenseStore;
import com.lildang.spring.member.store.MemberStore;
import com.lildang.spring.member.store.ReviewStore;

@Service
public class MemberServiceLogic implements MemberService{
	
	private MemberStore mStore;
	private SqlSession session;
	private EducationStore eStore;
	private LicenseStore lStore;
	private CareerStore cStore;
	private DesiredJobStore dStore;
	private ReviewStore rStore;
	private EmployStore emStore;
	
	@Autowired
	public MemberServiceLogic(MemberStore mStore, EducationStore eStore
			, LicenseStore lStore, CareerStore cStore
			, DesiredJobStore dStore, ReviewStore rStore
			, EmployStore emStore
			, SqlSession session) {
		this.mStore = mStore;
		this.eStore = eStore;
		this.lStore = lStore;
		this.cStore = cStore;
		this.dStore = dStore;
		this.rStore = rStore;
		this.emStore = emStore;
		this.session = session;
	}
	
	//로그인!
	@Override
	public MemberVO selectOneByLogin(LoginRequest member) {
		MemberVO result = mStore.selectOneByLogin(session, member);
		return result;
	}

	
	@Override
	public int memberRegister(MemberRegisterRequest member) {
		return mStore.memberRegister(session, member);
	}
	//회원탈퇴
	@Override
	public int deleteMember(String id) {
		int result = mStore.deleteMember(session,id);
		return result;
	}

	@Override
	public MemberVO selectOneById(String id) {
		MemberVO member = mStore.selectOneById(session, id);
		return member;
	}

	@Override
	public int updateMember(UpdateRequest member) {
		int result = mStore.updateMember(session, member);
		return result;
	}

	@Override
	public int cvInsert(CvInsertRequest cv) {
		int result = mStore.cvInsert(session, cv);
		result += eStore.educationInsert(session, cv.geteList());
		result += lStore.licenseInsert(session, cv.getlList());
		result += cStore.careerInsert(session, cv.getcList());
		result += dStore.desiredJobInsert(session, cv.getjList());
		return result;
	}

	@Override
	public MemberVO selectCvById(String id) {
		MemberVO member = mStore.selectOneById(session, id);
		List<EducationVO> eList = eStore.selectEducationById(session, id);
		List<LicenseVO> lList = lStore.selectLicenseById(session, id);
		List<CareerVO> cList = cStore.selectCareerById(session, id);
		List<DesiredJobVO> dList = dStore.selectDesiredJobById(session, id);
		member.setcList(cList);
		member.seteList(eList);
		member.setjList(dList);
		member.setlList(lList);
		return member;
	}

	@Override
	public int cvDelete(String id) {
		int result = mStore.cvDelete(session, id);
		result += eStore.educationDelete(session, id);
		result += lStore.licenseDelete(session, id);
		result += cStore.careerDelete(session, id);
		result += dStore.desiredJobDelete(session, id);
		return result; 
	}
	//페이징코드추가!에러나서 지울때 return은 놔두고 ()안에만 바꿔줄것!!!
	@Override
	public List<MemberVO> selectMemberList(Map<String, String> map, int currentPage) {
		return mStore.selectMemberList(session, map, currentPage);
	}

	@Override
	public int reviewEmployeeInsert(ReviewEmployeeRequest review) {
		int result = rStore.reviewEmployeeInsert(session, review);
		result += mStore.updateEmployeeScore(session, review);
		return result;
	}

	@Override
	public List<ReviewMemberVO> selectReviewList(String id) {
		return rStore.selectReviewList(session, id);
	}

	@Override
	public int reviewEmployeeUpdate(ReviewEmployeeRequest review) {
		int result = rStore.reviewEmployeeUpdate(session, review);
		result += mStore.updateEmployeeScore(session, review);
		return result;
	}

	@Override
	public int reviewEmployInsert(ReviewEmployeeRequest review) {
		int result = rStore.reviewEmployInsert(session, review);
		result += emStore.updateEmployScore(session, review);
		return result;
	}

	@Override
	public List<ReviewEmployVO> selectReviewEmployList(String id) {
		return rStore.selectReviewEmployList(session, id);
	}

	@Override
	public int reviewEmployUpdate(ReviewEmployeeRequest review) {
		int result = rStore.reviewEmployUpdate(session, review);
		result += emStore.updateEmployScore(session, review);
		return result;
	}

	@Override
	public List<EmployReviewRequest> selectERList(int employNo) {
		return rStore.selectERList(session, employNo);
	}
	
	// 신고 상세페이지에서 알바생 삭제
	@Override
	public int reportDeleteE(String id) {
		int result = mStore.reportDeleteE(session, id);
		return result;
	}
	//페이지코드 추가!!!(***틀리면 여기볼것!!****)
	@Override
	public int getTotalCount(Map<String, String> map) {
		int totalCount = mStore.getTotalCount(session, map);
		return totalCount;
		
	}

	@Override
	public List<RERequest> selectEMList(String id) {
		return rStore.selectEMList(session, id);
	}

	@Override
	public int updateProfile(ProfileUpdateRequest profile) {
		return mStore.updateProfile(session, profile);
	}

	@Override
	public int cvUpdate(CvInsertRequest cv) {
		int result = mStore.cvUdpate(session, cv);
		result += eStore.educationDelete(session, cv.getId());
		result += lStore.licenseDelete(session, cv.getId());
		result += cStore.careerDelete(session, cv.getId());
		result += dStore.desiredJobDelete(session, cv.getId());
		result += eStore.educationInsert(session, cv.geteList());
		result += lStore.licenseInsert(session, cv.getlList());
		result += cStore.careerInsert(session, cv.getcList());
		result += dStore.desiredJobInsert(session, cv.getjList());
		return result;
	}

	@Override
	public int getSearchTotalCount(Map<String, String> map) {
		return mStore.getSearchTotalCount(session, map);
	}

	@Override
	public List<MemberVO> selectSearchList(Map<String, String> map, int currentPage) {
		return mStore.selectSearchList(session, map, currentPage);
	}

	@Override
	public int getTotal() {
		return mStore.getTotal(session);
	}

	@Override
	public String selectNameById(String receiverId) {
		return mStore.selectNameById(session, receiverId);
	}

}
