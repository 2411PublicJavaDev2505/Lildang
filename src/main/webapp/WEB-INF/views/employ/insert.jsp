<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<link rel="stylesheet" href="../resources/css/reset.css">
	<link rel="stylesheet" href="../resources/css/include/header.css">
	<link rel="stylesheet" href="../resources/css/include/footer.css">
	<link rel="stylesheet" href="../resources/css/employ/insert.css">
<title>구인글-작성!</title>
</head>
<body>
		<div class="container">
			<jsp:include page="/WEB-INF/views/include/header.jsp" />
		<div class="main-content">
		<main>
	    <form action="/employ/insert" method="post">
	    	<input type="hidden" value="${sessionScope.id }" name="writerId">
	        <div>
	            <div class="title">
                <label for="title">공고제목</label>
	                <input type="text" id="title" name="employName">
	            </div>
	                <div class="job">
	                    <label for="job">업직종</label>
	                    <select name="jobNo" id="job">
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
	                <div class="recruitNumber">
	                    <label for="recruitNumber">모집인원</label>
	                    <input type="number" name="recruitNumber" id="recruitNumber" min="0">명
	                </div>
	                <div class="recruitDate">
	                    <label for="recruitDate">모집기간</label>
	                    <input type="date" name="recruitStartDate" id="recruitStartDate">~<input type="date" name="recruitEndDate" id="recruitEndDate">
	                </div>
	                <div class="educationNo">
	                    <label for="educationNo">학력</label>
	                    <select name="educationNo" id="educationNo">
	                        <option value="대학원">대학원</option>
	                        <option value="대학(4년)">대학(4년)</option>
	                        <option value="대학(2,3년)">대학(2,3년)</option>
	                        <option value="고등학교">고등학교</option>
	                        <option value="중학교">중학교</option>
	                        <option value="초등학교">초등학교</option>
	                    </select>
	                </div>
	                <div class="workplaceName">
	                    <label for="workplaceName">근무지명</label>
	                    <input type="text" name="workplaceName" id="workplaceName">
	                </div>
	                <div class="workplaceAddress">
	                    <label for="workplaceAddress">근무주소</label>
	                    <input type="text" name="workplaceAddress" id="workplaceAddress">
	                </div>
	                <div class="salary">
	                    <label for="salary">급여</label>
	                    <input type="text" name="salary" id="salary">
	                </div>
	                <div class="workingPeriod">
	                    <label for="workingPeriod">근무기간</label>
	                    <input type="date" name="workingPeriod" id="workingPeriod">
	                </div>
	                <div class="workTime">
	                    <label for="workTime">근무시간</label>
	                    <input type="time" name="workingStartTime" id="workingStartTime">~<input type="time" name="workingEndTime" id="workingEndTime">
	                </div>
	                <div class="workingDay">
	                    <label for="workingDay">요일</label>
	                    <select name="workingDay" id="workingDay">
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
	                <div class="photo">
	                    업체사진<input type="text" name="employFileName">
	                </div>
	                <div class="detail">
	                    상세모집내용<br> 
	                    <textarea name="employDetail" id="employDetail" rows="5" cols="60"></textarea>
	                </div>
	            </div>
                <div class="btn">
                    <button type="submit">작성하기</button><button type="submit">돌아가기</button>
                </div>
	    </form>
		</main>		
		</div>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
</body>
</html>