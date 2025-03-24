<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	    	<form action="/member/cvinsert" method="post">
	    		<input type="hidden" name="id" value="${member.id }">
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
					      <textarea rows="3" cols="30" placeholder="지원자를 소개 할 수 있는 짧은 글을 적어주세요." name="memberComment"></textarea>
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
				        <div class="profile-education-school">
				            <input type="text" placeholder="OO대학교 OO학과"  name="schoolName">
				        </div>
			            입학 : <input type="date" class="edu-input" name="entranceDate">
			            졸업 : <input type="date" class="edu-input" name="graduateDate">
				        <div class="profile-education-school">
				            <input type="text" placeholder="OO고등학교" name="schoolName">
				        </div>
			            입학 : <input type="date" class="edu-input" name="entranceDate">
			            졸업 : <input type="date" class="edu-input" name="graduateDate">
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
		                    </table>
		                </div>
		                <div id="job-introduce">
		                    <div class="job-introduce">자기소개서</div>
		                    <textarea rows="20" cols="99" name="introduction"></textarea>
		                </div>
		                <div class="btn">
		                    <button type="submit">작성완료</button>
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
			col1.innerHTML = "<input type='text' name='comanyName'>";
			col2.innerHTML = "<input type='text' name='workingPeriod'>";
			col3.innerHTML = "<input type='text' name='position'>";
			col4.innerHTML = "<input type='text' name='work'>";
		}
		
		function addLicense() {
			const row = document.querySelector("#license").insertRow();
			
			const col1 = row.insertCell(0);
			const col2 = row.insertCell(1);
			const col3 = row.insertCell(2);
			col1.innerHTML = "<input type='text' name='institution'>";
			col2.innerHTML = "<input type='text' name='licenseName'>";
			col3.innerHTML = "<input type='date' name='getDate'>";
		}
		function backToMypage() {
			location.href = "/member/edetail";
		}
	</script>
</body>
</html>