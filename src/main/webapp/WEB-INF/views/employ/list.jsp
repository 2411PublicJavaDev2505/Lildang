<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="../resources/css/reset.css">
		<link rel="stylesheet" href="../resources/css/header.css">
		<link rel="stylesheet" href="../resources/css/footer.css">
		<link rel="stylesheet" href="../resources/css/employ/list.css">
		<title>구인글-검색결과</title>
	</head>
	<body>
		<div id="container">
			<jsp:include page="/WEB-INF/views/include/header.jsp" />
			<div id="main">
	            <div class="condition">
	                <select class="location">
	                    <option value="none">지역</option>
	                    <option>서울 중구</option>
	                    <option>서울 종로구</option>
	                    <option>서울 동대문구</option>
	                    <option>서울 서대문구</option>
	                    <option>서울 용산구</option>
	                    <option>서울 강남구</option>
	                    <option>서울 강동구</option>
	                    <option>서울 강서구</option>
	                    <option>서울 강북구</option>
	                </select>
	                <select class="job">
	                    <option value="none">업직종</option>
	                    <option>외식.음료</option>
	                    <option>매장관리.판매</option>
	                    <option>서비스</option>
	                    <option>사무직</option>
	                    <option>고객상담.리서치.영업</option>
	                    <option>생산.건설.노무</option>
	                    <option>IT.기술</option>
	                    <option>디자인</option> 
	                </select>
	                <select class="day">
	                    <option value="none">근무조건</option>
	                    <option></option>
	                    <option></option>
	                    <option></option>
	                    <option></option>
	                    <option></option>
	                    <option></option>
	                    <option></option>
	                    <option></option> 
	                </select>
	                <select class="detail">
	                    <option value="none">상세조건</option>
	                    <option></option>
	                    <option></option>
	                    <option></option>
	                    <option></option>
	                </select>
	            </div>
	            <div class="conditionbtn">
	                
	                <button class="cbtn2">검색</button>
	            </div>
	            <div class="jobinf">
	                <h1 class="infword">채용정보</h1>
	                <select class="infoption">
	                    <option value="none">최근등록순</option>
	                    <option></option>
	                </select>
	            </div>
	            <div class="inftable">
	                <table class="table1">
	                    <tr class="title">
	                        <td>공고제목</td>
	                        <td>근무지</td>
	                        <td>근무시간</td>
	                        <td>급여</td>
	                        <td class="d1">등록일</td>
	                    </tr>
	                    <tr>
	                        <td><div class="circle">.</div>계수나무 식당에서 아줌마 구합니다(월,수,금)</td>
	                        <td>서울 중구</td>
	                        <td>12:00~14:00</td>
	                        <td>시급 13,000원</td>
	                        <td class="d1">03/13(목)</td>
	                    </tr>
	                    <tr>
	                        <td><div class="circle1">.</div>장기하 장기학원에서 장기 선생님 구해요.</td>
	                        <td>서울 동대문구</td>
	                        <td>09:00~18:00</td>
	                        <td>시급 50,000원</td>
	                        <td class="d1">03/12(수)</td>
	                    </tr>
	                    <tr>
	                        <td><div class="circle">.</div>메가커피 파트타임 알바생 구합니다(월,수,금)</td>
	                        <td>서울 중구</td>
	                        <td>12:00~14:00</td>
	                        <td>시급 13,000원</td>
	                        <td class="d1">03/13(목)</td>
	                    </tr>
	                    <tr>
	                        <td><div class="circle1">.</div>세븐일레븐 청계천로 점에서 새벽알바 구합니다.(월,수,금)</td>
	                        <td>서울 종로구</td>
	                        <td>02:00~04:00</td>
	                        <td>시급 13,000원</td>
	                        <td class="d1">03/14(금)</td>
	                    </tr>
	                    <tr>
	                        <td><div class="circle1">.</div>내일 알바 대신 해주실분 구해요!</td>
	                        <td>서울 용산구</td>
	                        <td>12:00~22:00</td>
	                        <td>시급 11,000원</td>
	                        <td class="d1">03/15(토)</td>
	                    </tr>
	                </table>
	            </div>
	        </div>
	        <jsp:include page="/WEB-INF/views/include/header.jsp" />
        </div>
	</body>
</html>