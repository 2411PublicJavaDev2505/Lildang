package com.lildang.spring.employ.domain;

import java.sql.Date;
import java.sql.Timestamp;

public class EmployVO {
	private int employNo;
	private String employName;
	private Date recruitStartDate;
	private Date recruitEndDate;
	private int recruitNumber;
	private String education;
	private String workplaceAddress;
	private String workplaceName;
	private int salary;
	private String workingPeriod;
	private String workingStartTime;
	private String workingEndTime;
	private String workingDay;
	private String employDetail;
	private Timestamp writeTime;
	private Timestamp updateTime;
	private String employFileName;
	private String employFileRename;
	private String employFilePath;
	private String writerId;
	private int jobNo;
	private int score;
	
	public EmployVO() {}

	public int getEmployNo() {
		return employNo;
	}

	public String getEmployName() {
		return employName;
	}

	public Date getRecruitStartDate() {
		return recruitStartDate;
	}

	public Date getRecruitEndDate() {
		return recruitEndDate;
	}

	public int getRecruitNumber() {
		return recruitNumber;
	}

	public String getEducation() {
		return education;
	}

	public String getWorkplaceAddress() {
		return workplaceAddress;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public int getSalary() {
		return salary;
	}

	public String getWorkingPeriod() {
		return workingPeriod;
	}

	public String getWorkingStartTime() {
		return workingStartTime;
	}

	public String getWorkingEndTime() {
		return workingEndTime;
	}

	public String getWorkingDay() {
		return workingDay;
	}

	public String getEmployDetail() {
		return employDetail;
	}

	public Timestamp getWriteTime() {
		return writeTime;
	}

	public Timestamp getUpdateTime() {
		return updateTime;
	}

	public String getEmployFileName() {
		return employFileName;
	}

	public String getEmployFileRename() {
		return employFileRename;
	}

	public String getEmployFilePath() {
		return employFilePath;
	}

	public String getWriterId() {
		return writerId;
	}

	public int getJobNo() {
		return jobNo;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "EmployVO [employNo=" + employNo + ", employName=" + employName + ", recruitStartDate="
				+ recruitStartDate + ", recruitEndDate=" + recruitEndDate + ", recruitNumber=" + recruitNumber
				+ ", education=" + education + ", workplaceAddress=" + workplaceAddress + ", workplaceName="
				+ workplaceName + ", salary=" + salary + ", workingPeriod=" + workingPeriod + ", workingStartTime="
				+ workingStartTime + ", workingEndTime=" + workingEndTime + ", workingDay=" + workingDay
				+ ", employDetail=" + employDetail + ", writeTime=" + writeTime + ", updateTime=" + updateTime
				+ ", employFileName=" + employFileName + ", employFileRename=" + employFileRename + ", employFilePath="
				+ employFilePath + ", writerId=" + writerId + ", jobNo=" + jobNo + ", score=" + score + "]";
	}

	
	
}
