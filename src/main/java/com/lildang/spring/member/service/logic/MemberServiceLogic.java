package com.lildang.spring.member.service.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.lildang.spring.member.controller.dto.MemberRegisterRequest;
import com.lildang.spring.member.controller.dto.ReviewEmployeeRequest;
import com.lildang.spring.member.controller.dto.UpdateRequest;
import com.lildang.spring.member.controller.dto.CvInsertRequest;
import com.lildang.spring.member.controller.dto.LoginRequest;
import com.lildang.spring.member.domain.CareerVO;
import com.lildang.spring.member.domain.DesiredJobVO;
import com.lildang.spring.member.domain.EducationVO;
import com.lildang.spring.member.domain.LicenseVO;
import com.lildang.spring.member.domain.MemberVO;
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
	
	@Autowired
	public MemberServiceLogic(MemberStore mStore, EducationStore eStore
			, LicenseStore lStore, CareerStore cStore
			, DesiredJobStore dStore, ReviewStore rStore
			, SqlSession session) {
		this.mStore = mStore;
		this.eStore = eStore;
		this.lStore = lStore;
		this.cStore = cStore;
		this.dStore = dStore;
		this.rStore = rStore;
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
		int cvResult = mStore.cvInsert(session, cv);
		int eResult = eStore.educationInsert(session, cv.geteList());
		int lResult = lStore.licenseInsert(session, cv.getlList());
		int cResult = cStore.careerInsert(session, cv.getcList());
		int dResult = dStore.desiredJobInsert(session, cv.getjList());
		return cvResult+eResult+lResult+cResult+dResult;
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
		int cvResult = mStore.cvDelete(session, id);
		int eResult = eStore.educationDelete(session, id);
		int lResult = lStore.licenseDelete(session, id);
		int cResult = cStore.careerDelete(session, id);
		int dResult = dStore.desiredJobDelete(session, id);
		return cvResult + eResult + lResult + cResult + dResult; 
	}

	@Override
	public List<MemberVO> selectMemberList() {
		return mStore.selectMemberList(session);
	}

	@Override
	public int reviewEmployeeInsert(ReviewEmployeeRequest review) {
		return rStore.reviewEmployeeInsert(session, review);
	}

	@Override
	public List<ReviewMemberVO> selectReviewList(String id) {
		return rStore.selectReviewList(session, id);
	}

	@Override
	public int reviewEmployeeUpdate(ReviewEmployeeRequest review) {
		return rStore.reviewEmployeeUpdate(session, review);
	}


}
