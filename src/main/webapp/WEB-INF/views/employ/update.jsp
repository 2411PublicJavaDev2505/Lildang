<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="../resources/css/reset.css">
	<link rel="stylesheet" href="../resources/css/include/header.css">
	<link rel="stylesheet" href="../resources/css/include/footer.css">
	<link rel="stylesheet" href="../resources/css/employ/update.css">
<title>구인글-수정!</title>
</head>
<body>
	<div class="container">
	<jsp:include page="/WEB-INF/views/include/header.jsp" />
	<main>
	    <form action="/employ/update" method="POST" enctype="multipart/form-data">
	    	<input type="hidden" value="${employ.employNo }" name="employNo">
	        <div id="insertmain">
	            <div>
	                <label for="employName">공고제목</label>
	                <input type="text" name="employName" id="employName" value="${employ.employName }">
	            </div>
	                <div>
	                    <label for="jobNo">업직종</label>
	                    <select name="jobNo" id="jobNo" value="${employ.jobNo }">
	                        <option value="1">외식음료</option>
	                        <option value="2">매장관리,판매</option>
	                        <option value="3">서비스</option>
	                        <option value="4">사무직</option>
	                        <option value="5">고객상담,리서치,영업</option>
	                        <option value="6">생산,건설,노무</option>
	                        <option value="7">IT,기술</option>
	                        <option value="8">디자인</option>
	                        
	                    </select>
	                </div>
	                <div>
	                    <label for="recruitNumber">모집인원</label>
	                    <input type="number" name="recruitNumber" id="recruitNumber" value="${employ.recruitNumber }">명
	                </div>
	                <div>
	                    <label for="recruitDate">모집기간</label>
	                    <input type="date" name="recruitStartDate" id="recruitStartDate" value="${employ.recruitStartDate }">~<input type="date" name="recruitEndDate" id="recruitEndDate" value="${employ.recruitEndDate }">
	                </div>
	                <div>
	                    <label for="education">학력</label>
	                    <select name="education" id="education" value="${employ.education }">
	                        <option value="대학원">대학원</option>
	                        <option value="대학(4년)">대학(4년)</option>
	                        <option value="대학(2,3년)">대학(2,3년)</option>
	                        <option value="고등학교">고등학교</option>
	                        <option value="중학교">중학교</option>
	                        <option value="초등학교">초등학교</option>
	                    </select>
	                </div>
	                <div>
	                    <label for="workplaceName">근무지명</label>
	                    <input type="text" name="workplaceName" id="workplaceName" value="${employ.workplaceName }">
	                </div>
	                <div>
	                    <label for="workplaceAddress">근무지역</label>
	                    <input type="text" name="workplaceAddress" id="workplaceAddress" value="${employ.workplaceAddress }">
	                </div>
	                <div>
	                    <label for="salary">급여</label>
	                    <input type="text" name="salary" id="salary" value="${employ.salary }">
	                </div>
	                <div>
	                    <label for="workingPeriod">근무기간</label>
	                    <input type="date" name="workingPeriod" id="workingPeriod" value="${employ.workingPeriod }">
	                </div>
	                <div>
	                    <label for="workingTime">근무시간</label>
	                    <input type="time" name="workingStartTime" id="workingStartTime" value="${employ.workingStartTime }">~<input type="time" name="workingEndTime" id="workingEndTime" value="${employ.workingEndTime }">
	                </div>
	                <div>
	                    <label for="workingDay">요일</label>
	                    <select name="workingDay" id="workingDay" value="${employ.workingDay }">
	                        <option value="평일(월~금)">평일(월~금)</option>
	                        <option value="주말(토,일)">주말(토,일)</option>
	                        <option value="월">월</option>
	                        <option value="화">화</option>
	                        <option value="수">수</option>
	                        <option value="목">목</option>
	                        <option value="금">금</option>
	                        <option value="토">토</option>
	                        <option value="일">일</option>
	                        <option value="요일협의">요일협의</option>
	                    </select>
	                </div>
	                <div>
	                    업체사진<input type="file" name="uploadFile" id="employFileName" value="${employ.employFileName }">
	                </div>
	                <div>
	                    상세모집내용<br> 
	                    <textarea name="employDetail" id="employDetail" rows="5" cols="60">${employ.employDetail }</textarea>
	                </div>
	            </div>
	        <button type="submit" id="sbtn">수정하기</button><button type="submit">돌아가기</button>
	    </form>
	</main>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
	<script type="text/javascript">
		document.querySelector("#sbtn").addEventListener("click", function() {
			if(document.querySelector("#employDetail").value.trim() == ""){
				alert("상세내용을 입력해주세요!");
				event.preventDefault();
			}
		})
	</script>
</body>   
</html>