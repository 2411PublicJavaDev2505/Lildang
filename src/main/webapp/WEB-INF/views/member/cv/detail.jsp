<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="../resources/css/reset.css">
			<link rel="stylesheet" href="../resources/css/include/header.css">
			<link rel="stylesheet" href="../resources/css/include/footer.css">
			<link rel="stylesheet" href="../resources/css/member/cv/cv.css">
    <title>이력서 조회</title>
</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
	    <main>
	        <div class="cv-container">
	            <div class="sidebar">
				    <div class="profile-image">
				    	<div class="profile-img">
				    		<c:if test="${member.profileFilePath eq null }">
				    			<img alt="프로필 사진" src="../resources/image/profile.png">
				    		</c:if>
				    		<c:if test="${member.profileFilePath ne null }">
					    		<img alt="프로필 사진" src="..${member.profileFilePath }">
				    		</c:if>
			    		</div>
				    </div>
				    <div class="profile-name">
				    	<p> <b>${member.name }</b></p>
				    </div>
				    <div class="introduce">
				    	${member.memberComment }
				    </div>
					<div id="profile-contact">CONTACT</div>
					<div class="profile-contact">
						<p>
					     - 이름 : ${member.name } <br> <br>               
					     - 생년월일 : ${member.birth } <br><br> 
					     - 전화 :  ${member.phone } <br><br> 
					     - Mail : ${member.email } <br><br> 
						</p>
					</div>
				    <div class="profile-education">주요 학력사항</div>
				    <c:forEach var="edu" items="${member.eList }">
				        <div class="profile-education-school">
				            ${edu.schoolName }
				        </div>
			            입학 : ${edu.entranceDate }
			            졸업 : ${edu.graduateDate }
				    </c:forEach>
	            </div>
	            <div class="content-area">
	                <div class="title-container">
	                    <div class="job-title">희망직종</div>
	                    <div class="job-option">
	                    	<c:forEach var="job" items="${member.jList }">
	                    		<c:if test="${job.jobNo eq 1 }">
			                        <label>외식·음료</label>	                    			
	                    		</c:if>
	                    		<c:if test="${job.jobNo eq 2 }">
			                        <label>매장관리·판매</label>	                    			
	                    		</c:if>
	                    		<c:if test="${job.jobNo eq 3 }">
			                        <label>서비스</label>	                    			
	                    		</c:if>
	                    		<c:if test="${job.jobNo eq 4 }">
			                        <label>사무직</label>	                    			
	                    		</c:if>
	                    		<c:if test="${job.jobNo eq 5 }">
			                        <label>고객상담·리서치·영업</label>	                    			
	                    		</c:if>
	                    		<c:if test="${job.jobNo eq 6 }">
			                        <label>생산·건설·노무</label>	                    			
	                    		</c:if>
	                    		<c:if test="${job.jobNo eq 7 }">
			                        <label>IT·기술</label>	                    			
	                    		</c:if>
	                    		<c:if test="${job.jobNo eq 8 }">
			                        <label>디자인</label>	                    			
	                    		</c:if>
	                    	</c:forEach>
	                    </div>
	                </div>
	                <div class="job-career">
	                    <div class="insert-btn">
	                    	주요 경력사항
	                    </div>
	                    <table id="career">
	                        <tr>
	                            <td>회사명</td>
	                            <td>근무기간</td>
	                            <td>직책</td>
	                            <td>담당업무</td>
	                        </tr>
	                        <c:forEach var="career" items="${member.cList }">
	                        	<tr>
	                        		<td>${career.companyName }</td>
	                        		<td>${career.workingPeriod }</td>
	                        		<td>${career.position }</td>
	                        		<td>${career.work }</td>
	                        	</tr>
	                        </c:forEach>
	                    </table>
	                </div>
	                <div class="job-license">
	                    <div class="insert-btn">
	                    	주요 자격증
	                    </div>
	                    <table id="license">
	                        <tr>
	                            <td>발급기관</td>
	                            <td>자격증명</td>
	                            <td>취득일자</td>
	                        </tr>
	                        <c:forEach var="license" items="${member.lList }">
	                        	<tr>
	                        		<td>${license.institution }</td>
	                        		<td>${license.licenseName }</td>
	                        		<td>${license.getDate }</td>
	                        	</tr>
	                        </c:forEach>
	                    </table>
	                </div>
	                <div id="job-introduce">
	                    <div class="job-introduce">자기소개서</div>
	                    ${member.introduction }
	                </div>
	                <div class="btn">
	                    <button onClick="history.back();">돌아가기</button>
	                </div>
	            </div>
	        </div>
	    </main>
	    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>

</body>
</html>