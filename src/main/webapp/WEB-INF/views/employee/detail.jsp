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
			<link rel="stylesheet" href="../resources/css/common/modal.css">
    <title>알바생 - 상세</title>
</head>
<body>
	<div id="container">
		<div class="modal">
			<div class="modal-body">
				<h1 class="mtitle1">내 공고글 선택</h1>
				<div class="employ-box">
					<form action="/match/offer" method="get">
						<input type="hidden" name="employeeId" value="${member.id }">
						<table>
							<c:forEach var="employ" items="${eList }">
								<tr>
									<td class="emp-name">${employ.employName }</td>
									<td class="cbtn"> <input type="radio" name="employNo" value="${employ.employNo }"> 선택 </td>
								</tr>
							</c:forEach>
						</table>
						<button class="bottom-btn">제의하기</button>					
						<button  class="back-btn" type="button" onclick="backToPage();">뒤로가기</button>					
					</form>
				</div>			
			</div>
		</div>
		<div class="report">
			<div class="report-body">
				<div class="head">
					<h1>알바생 신고하기</h1>				
				</div>
				<div class="report-menu">
					<form action="/report/einsert" method="post">
						<input type="hidden" name="reportEmployeeId" value="${member.id }">
						<input type="hidden" name="reportWriterId" value="${sessionScope.id }">
						<div class="report-content">
							<input type="text" placeholder="사유를 입력해주세요" name="reportReason">						
						</div>
						<div class="report-area">
							<textarea rows="20" cols="30" placeholder="상세한 내용을 적어주세요." name="reportDetail"></textarea>						
						</div>
						<div class="report-btn">
							<button>신고하기</button>
							<button type="button" onclick="reportBackToPage();">뒤로가기</button>											
						</div>
					</form>
				</div>
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
	    <main>
	        <div class="cv-container">
	            <div class="sidebar">
				    <div class="profile-image">
				    	<div class="profile-img"></div>
				    	<div class="img-input">
				         <input type="text" name="profileFileName">
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
				    <div class="reportBtn">
				    	<button onClick="showReport();">신고하기</button>				    
				    </div>
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
	                <div class="review-list">
	                	<h3>이 알바생의 경력</h3>
	                	<table id="review">
	                		<tr>
	                			<th>공고글 제목</th>
	                			<th>후기내용</th>
	                			<th>평점</th>
	                		</tr>
	                		<c:forEach var="re" items="${reList }">
	                			<tr>
	                				<td>${re.employName }</td>
	                				<td>${re.reviewDetail }</td>
	                				<td>${re.reviewScore }</td>
	                			</tr>
	                		</c:forEach>
	                	</table>
	                </div>
	                <div class="btn">
	                    <button onclick="openModal();">알바 제의하기</button>
	                    <c:if test=""></c:if>
	                    <button>채팅하기</button>
	                    <button type="button">돌아가기</button>
	                </div>
	            </div>
	        </div>
	    </main>
	    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
	<script type="text/javascript">
		const showReport = () => {
			document.querySelector(".report").style.display = "flex";
		}
		const reportBackToPage = () => {
			document.querySelector(".report").style.display = "none";
		}
		const openModal = () => {
			document.querySelector(".modal").style.display = "flex";
		}
		const backToPage = () => {
			document.querySelector(".modal").style.display = "none";
		}
	</script>
</body>
</html>