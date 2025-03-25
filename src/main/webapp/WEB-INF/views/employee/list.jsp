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
					대기중인 알바생:     ${eList.size() }명				
				</p>
				<div class="top-search">
					<form action="/employee/search" >
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
						<select>
							<option>업직종선택</option>
							<option>외식·음료</option>
							<option>매징관리·판매</option>
							<option>서비스</option>
							<option>사무직</option>
							<option>고객상담·리서치·영업</option>
							<option>생산·건설·너무</option>
							<option>IT·기술</option>
							<option>디자인</option>
							<option>교육·강사</option>
							<option>운전·배달</option>
							<option>사무·회계</option>
							<option>미디어</option>
							<option>유통</option>
							<option>문화·여가</option>
							<option>병원·간호·연구</option>
							<option>요식업</option>
						</select>
						<button class="search-btn" >알바생 검색</button>			
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
					<c:forEach var="employee" items="${eList }">
						<div class="bottom-profile">
							<img alt="profileimg" src="../resources/image/profile.png">
							<p>
								이름 : <a class="profile-name" href="/employee/detail?id=${employee.id }">${employee.name }</a> <br>
								성별 : ${employee.gender } <br>
								나이 : ${employee.age }세 <br>
								평점 : ${employee.score }/5 <br>
							</p>
						</div>					
					</c:forEach>
				</div>
				<!-- 여기부터 페이지추가 -->
				<div class="page">
				  <!-- li,ul지우고 확인해볼것!테이블css가 페이지넘어갈때 변화됨!employlist도 확인! li
				  일단지워준다...다음버튼이 아래로가있음...colspan~코드추가!
				 	-->
	                <ul class="pagination" colspan="4" align="center">
	                    <c:if test="${startNavi ne 1 }">
		                    <a href="/employee/list?page=${startNavi -1 }" class="back">이전</a>
	                    </c:if>
	                    <c:forEach begin="${startNavi }" end="${endNavi }" var="p">
	                    	<a href="/employee/list?page=${p }">${p }</a>
	                    </c:forEach>
	                    <c:if test="${endNavi ne maxPage}">
	                    	<a href="/employee/list?page=${endNavi +1 }" class="next">다음</a>
	                    </c:if>
	                </ul>
	            </div>
			</div>
		</main>
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
</html>