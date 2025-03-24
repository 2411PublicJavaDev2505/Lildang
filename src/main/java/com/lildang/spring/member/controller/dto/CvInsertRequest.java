package com.lildang.spring.member.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.lildang.spring.member.domain.DesiredJobVO;

public class CvInsertRequest {

	private String id;
	private String profileFileName;
	private String profileFileRename;
	private String profileFilePath;
	private String memberComment;
	private String introduction;
	private List<DesiredJobVO> jList;
	private List<EducationInsertRequest> eList;
	private List<CareerInsertRequest> cList;
	private List<LicenseInsertRequest> lList;
	
	public CvInsertRequest(String id, String profileFileName, String profileFileRename, String profileFilePath,
			String memberComment, String introduction, List<DesiredJobVO> jList, List<EducationInsertRequest> eList,
			List<CareerInsertRequest> cList, List<LicenseInsertRequest> lList) {
		super();
		this.id = id;
		this.profileFileName = profileFileName;
		this.profileFileRename = profileFileRename;
		this.profileFilePath = profileFilePath;
		this.memberComment = memberComment;
		this.introduction = introduction;
		this.jList = new ArrayList<DesiredJobVO>();
		this.eList = new ArrayList<EducationInsertRequest>();
		this.cList = new ArrayList<CareerInsertRequest>();
		this.lList = new ArrayList<LicenseInsertRequest>();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProfileFileName() {
		return profileFileName;
	}
	public void setProfileFileName(String profileFileName) {
		this.profileFileName = profileFileName;
	}
	public String getProfileFileRename() {
		return profileFileRename;
	}
	public void setProfileFileRename(String profileFileRename) {
		this.profileFileRename = profileFileRename;
	}
	public String getProfileFilePath() {
		return profileFilePath;
	}
	public void setProfileFilePath(String profileFilePath) {
		this.profileFilePath = profileFilePath;
	}
	public String getMemberComment() {
		return memberComment;
	}
	public void setMemberComment(String memberComment) {
		this.memberComment = memberComment;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	public List<EducationInsertRequest> geteList() {
		return eList;
	}
	public void seteList(List<EducationInsertRequest> eList) {
		this.eList = eList;
	}
	public List<CareerInsertRequest> getcList() {
		return cList;
	}
	public void setcList(List<CareerInsertRequest> cList) {
		this.cList = cList;
	}
	public List<LicenseInsertRequest> getlList() {
		return lList;
	}
	public void setlList(List<LicenseInsertRequest> lList) {
		this.lList = lList;
	}
	public List<DesiredJobVO> getjList() {
		return jList;
	}
	public void setjList(List<DesiredJobVO> jList) {
		this.jList = jList;
	}
	@Override
	public String toString() {
		return "CvInsertRequest [id=" + id + ", profileFileName=" + profileFileName + ", profileFileRename="
				+ profileFileRename + ", profileFilePath=" + profileFilePath + ", memberComment=" + memberComment
				+ ", introduction=" + introduction + ", jList=" + jList + ", eList=" + eList + ", cList=" + cList
				+ ", lList=" + lList + "]";
	}
	
	
}
