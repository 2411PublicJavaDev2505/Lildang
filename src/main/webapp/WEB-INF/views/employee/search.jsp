<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="../resources/css/reset.css">
	<link rel="stylesheet" href="../resources/css/include/header.css">
	<link rel="stylesheet" href="../resources/css/include/footer.css">
	<link rel="stylesheet" href="../resources/css/employee/list.css">
	<title>알바생검색</title>
</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		<main>
			<div class="main-top">
				<p>
					대기중인 알바생:     ${mList.size() }명				
				</p>
				<div class="top-search">
					<form  action="/employee/search">
						<select name="searchKeyword">
							<option value="서울">서울</option>
							<option value="경기">경기</option>
							<option value="인천">인천</option>
							<option value="강원">강원</option>
							<option value="대전">대전</option>
							<option value="대구">대구</option>
							<option value="부산">부산</option>
							<option value="울산">울산</option>
							<option value="경남">경남</option>
							<option value="경북">경북</option>
							<option value="전남">전남</option>
							<option value="전북">전북</option>
							<option value="충남">충남</option>
							<option value="충북">충북</option>
							<option value="제주">제주</option>
						</select>
						
						<button class="search-btn" type="submit">알바생 검색</button>			
					</form>
				</div>
			</div>
			<div class="main-bottom">
				<div class="bottom-select">
					<select>
						<option>평점순</option>
						<option>평점순</option>
						<option>평점순</option>
					</select>				
				</div>
				<div class="bottom-content">
					<c:forEach var="employee" items="${mList }">
						<div class="bottom-profile">
							<img alt="profileimg" src="../resources/image/profile.png">
							<p>
								이름 : <a class="profile-name" href="/employee/detail?id=${employee.id }">${employee.name }</a> <br>
								성별 : ${employee.gender } <br>
								나이 : ${employee.age }세 <br>
								평점 : 3.5/5.0 <br>
							</p>
						</div>					
					</c:forEach>
				</div>
			</div>
		</main>
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
</html>