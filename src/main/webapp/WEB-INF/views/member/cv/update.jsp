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
    <title>이력서 작성</title>
</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
	    <main>
	    	<form action="/member/cvupdate" method="post" enctype="multipart/form-data">
	    		<input type="hidden" name="id" value="${member.id }">
		        <div class="cv-container">
		            <div class="sidebar">
					    <div class="profile-image">
					    	<div class="profile-img"></div>
					    	<div class="img-input">
					    	</div>
					    </div>
					    <div class="profile-name">
					    	<p> <b>${member.name }</b></p>
					    </div>
					    <div class="introduce">
					      <textarea rows="3" cols="30" placeholder="지원자를 소개 할 수 있는 짧은 글을 적어주세요." name="memberComment" id="memberComment">${member.memberComment }</textarea>
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
				            	<input type="text" name="schoolName" required="required" value="${edu.schoolName }">
				        	</div>
				            입학 : <input type="date" class="edu-input" name="entranceDate" required="required" value="${edu.entranceDate }">
				            졸업 : <input type="date" class="edu-input" name="graduateDate" required="required" value="${edu.graduateDate }">
				    	</c:forEach>
		            </div>
		            <div class="content-area">
		                <div class="title-container">
		                    <div class="job-title">희망직종</div>
		                    <div class="job-option">
		                        <label><input type="checkbox" name="jobNo" value="1">외식·음료</label>
		                        <label><input type="checkbox" name="jobNo" value="2">매장관리·판매</label>
		                        <label><input type="checkbox" name="jobNo" value="3">서비스</label>
		                        <label><input type="checkbox" name="jobNo" value="4">사무직</label>
		                        <label><input type="checkbox" name="jobNo" value="5">고객상담·리서치·영업</label>
		                        <label><input type="checkbox" name="jobNo" value="6">생산·건설·노무</label>
		                        <label><input type="checkbox" name="jobNo" value="7">IT·기술</label>
		                        <label><input type="checkbox" name="jobNo" value="8">디자인</label>
		                    </div>
		                </div>
		                <div class="job-career">
		                    <div class="insert-btn">
		                    	주요 경력사항
		                        <button onclick="addCareer();" type="button">+</button>
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
		                        		<td><input type='text' name='comanyName' required='required' value="${career.companyName }"></td>
		                        		<td><input type='text' name='workingPeriod' required='required' value="${career.workingPeriod }"></td>
		                        		<td><input type='text' name='position' required='required' value="${career.position }"></td>
		                        		<td><input type='text' name='work' required='required' value="${career.work }"></td>
		                        	</tr>
		                        </c:forEach>
		                    </table>
		                </div>
		                <div class="job-license">
		                    <div class="insert-btn">
		                    	주요 자격증
		                        <button onClick="addLicense();" type="button">+</button>
		                    </div>
		                    <table id="license">
		                        <tr>
		                            <td>발급기관</td>
		                            <td>자격증명</td>
		                            <td>취득일자</td>
		                        </tr>
		                        <c:forEach var="license" items="${member.lList }">
		                        	<tr class="license-td">
		                        		<td><input type='text' name='institution' required='required' value="${license.institution }"></td>
		                        		<td><input type='text' name='licenseName' required='required' value="${license.licenseName }"></td>
		                        		<td><input type='date' name='getDate' required='required' value="${license.getDate }"></td>
		                        	</tr>
		                        </c:forEach>
		                    </table>
		                </div>
		                <div id="job-introduce">
		                    <div class="job-introduce">자기소개서</div>
		                    <textarea rows="20" cols="99" name="introduction" id="introduction">${member.introduction }</textarea>
		                </div>
		                <div class="btn">
		                    <button type="submit" id="insertbtn">작성완료</button>
		                    <button onclick="backToMypage();" type="button">돌아가기</button>
		                </div>
		            </div>
		        </div>
	    	</form>
	    </main>
	    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
	<script type="text/javascript">
		function addCareer() {
			const row = document.querySelector("#career").insertRow();
			const col1 = row.insertCell(0);
			const col2 = row.insertCell(1);
			const col3 = row.insertCell(2);
			const col4 = row.insertCell(3);
			col1.innerHTML = "<input type='text' name='comanyName' required='required'>";
			col2.innerHTML = "<input type='text' name='workingPeriod' required='required'>";
			col3.innerHTML = "<input type='text' name='position' required='required'>";
			col4.innerHTML = "<input type='text' name='work' required='required'>";
		}
		function addLicense() {
			const row = document.querySelector("#license").insertRow();
			
			const col1 = row.insertCell(0);
			const col2 = row.insertCell(1);
			const col3 = row.insertCell(2);
			col1.innerHTML = "<input type='text' name='institution' required='required'>";
			col2.innerHTML = "<input type='text' name='licenseName' required='required'>";
			col3.innerHTML = "<input type='date' name='getDate' required='required'>";
		}
		function backToMypage() {
			location.href = "/member/edetail";
		}
		document.querySelector("#insertbtn").addEventListener("click",function() {
			if(document.querySelector("#memeberComment").value.trim() == ""){
				alert("자기소개글을 입력해주세요!");
				event.preventDefault();
			}
			if(document.querySelector("#introduction").value.trim() == ""){
				alert("자기소개서를 입력해주세요!");
				event.preventDefault();
			}
		})
	</script>
</body>
</html>