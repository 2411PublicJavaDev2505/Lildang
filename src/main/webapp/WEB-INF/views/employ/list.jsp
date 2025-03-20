<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="../resources/css/reset.css">
	<link rel="stylesheet" href="../resources/css/include/header.css">
	<link rel="stylesheet" href="../resources/css/include/footer.css">
	<link rel="stylesheet" href="../resources/css/employ/list.css">
	<title>구인글-검색결과</title>
</head>
	<body>
		<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		<main>
			<select>
				<option value="">지역별</option> 
				<option value="">서울</option> 
				<option value="">경기</option> 
				<option value="">인천</option> 
				<option value="">강원</option> 
				<option value="">대전</option> 
				<option value="">세종</option> 
				<option value="">충남</option> 
				<option value="">충북</option> 
				<option value="">부산</option> 
				<option value="">울산</option> 
				<option value="">경남</option> 
				<option value="">경북</option> 
				<option value="">대구</option> 
				<option value="">광주</option> 
				<option value="">전남</option> 
				<option value="">전북</option> 
				<option value="">제주</option> 
				<option value="">전국</option> 
			</select>
			<select>
				 <option value="">업직종</option>
                 <option value="">외식음료</option>
                 <option value="">매장관리,판매</option>
                 <option value="">서비스</option>
                 <option value="">사무직</option>
                 <option value="">고객상담,리서치,영업</option>
                 <option value="">생산,건설,노무</option>
                 <option value="">IT,기술</option>
                 <option value="">교육.강사</option>
                 <option value="">운전,배달</option>
                 <option value="">사무회계</option>
                 <option value="">미디어</option>
                 <option value="">유통</option>
                 <option value="">문화,여가</option>
                 <option value="">병원,간호,연구</option>
                 <option value="">기타</option>
			</select>
			<select>
				<option value="">근무조건</option>
				<option value="">안심알바</option>
				<option value="">급여별</option>
				<option value="" >우대조건별</option>
				<option value="">복리후생별</option>
				<option value="">정규직</option>
				<option value="">재택알바</option>
				<option value="">친구와함께</option>
			</select>
			<select>
				<option value="">상세조건</option>
				<option>상세조건?</option>
				<option>상세조건?</option>
			</select>
			<div class="btn">
				<button class="left-btn">초기화</button>
				<button class=right-btn">검색</button>
			</div>
			<div>
				<h2>채용정보</h2>
			</div>
				<div class="insert">
					<select>
						<option>최근등록순</option>
						<option>나중등록순</option>
						<option>조회수많은순</option>
					</select>        
				</div>
			<div>
			<table class="empinf">
				<tr>
					<th class="line1">공고제목</th>
					<th>근무지</th>
					<th>근무시간</th>
					<th>급여</th>
					<th class="line2">등록일</th>
				</tr>
				<tr>
					<td class="line1">⭐계수나무식당에서 아줌마 구합니다(월,수,금)</td>
					<td>서울중구</td>
					<td>12:00~14:00</td>
					<td>시급13,000원</td>
					<td class="line2">03/13(목)</td>
				</tr>
				<tr>
					<td class="line1">⭐장기하장기학원에서 장기 선생님을구합니다</td>
					<td>서울중구</td>
					<td>09:00~16:00</td>
					<td>월급2,000,000원</td>
					<td class="line2">03/13(목)</td>
				</tr>
				<tr>
					<td class="line1">⭐메가커피 중구점에서 파트타임 알바생 구합니다</td>
					<td>서울중구</td>
					<td>07:00~14:00</td>
					<td>시급10,000원</td>
					<td class="line2">03/12(수)</td>
				</tr>
				<tr>
					<td class="line1">⭐내일 알바 대신해 주싧분 구해요!!!</td>
					<td>서울중구</td>
					<td>17:00~22:00</td>
					<td>일급1,000,000원</td>
					<td class="line2">03/11(목)</td>
				</tr>
				<tr>             
					<td class="line1">⭐세븐일레븐 청계천로 점에서 새벽 알바구합니다</td>
					<td>서울중구</td>
					<td>03:00~05:30</td>
					<td>시급15,000원</td>
					<td class="line2">03/10(목)</td>
				</tr>
			</table>
			</div>
		</main>	
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</body>
</html>