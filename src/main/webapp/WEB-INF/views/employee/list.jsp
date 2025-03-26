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
					대기중인 알바생:     ${total }명				
				</p>
				<div class="top-search">
					<form action="/employee/list" >
						<input type="hidden" name="selectOption" value="${selectOption }">
						<select name="searchKeyword">
							<option value="서울" <c:if test="${searchKeyword eq '서울' }">selected="selected"</c:if>>서울</option>
							<option value="경기" <c:if test="${searchKeyword eq '경기' }">selected="selected"</c:if>>경기</option>
							<option value="인천" <c:if test="${searchKeyword eq '인천' }">selected="selected"</c:if>>인천</option>
							<option value="강원" <c:if test="${searchKeyword eq '강원' }">selected="selected"</c:if>>강원</option>
							<option value="대전" <c:if test="${searchKeyword eq '대전' }">selected="selected"</c:if>>대전</option>
							<option value="대구" <c:if test="${searchKeyword eq '대구' }">selected="selected"</c:if>>대구</option>
							<option value="부산" <c:if test="${searchKeyword eq '부산' }">selected="selected"</c:if>>부산</option>
							<option value="울산" <c:if test="${searchKeyword eq '울산' }">selected="selected"</c:if>>울산</option>
							<option value="경남" <c:if test="${searchKeyword eq '경남' }">selected="selected"</c:if>>경남</option>
							<option value="경북" <c:if test="${searchKeyword eq '경북' }">selected="selected"</c:if>>경북</option>
							<option value="전남" <c:if test="${searchKeyword eq '전남' }">selected="selected"</c:if>>전남</option>
							<option value="전북" <c:if test="${searchKeyword eq '전북' }">selected="selected"</c:if>>전북</option>
							<option value="충남" <c:if test="${searchKeyword eq '충남' }">selected="selected"</c:if>>충남</option>
							<option value="충북" <c:if test="${searchKeyword eq '충북' }">selected="selected"</c:if>>충북</option>
							<option value="제주" <c:if test="${searchKeyword eq '제주' }">selected="selected"</c:if>>제주</option>
						</select>
						<button class="search-btn" >알바생 검색</button>			
					</form>
				</div>
			</div>
			<div class="main-bottom">
				<div class="bottom-select">
					<select name="selectOption" id="selectOp" onchange="selectOp('${searchKeyword }');">
						<option value="none" <c:if test="${selectOption eq 'none' }">selected="selected"</c:if>>전체</option>
						<option value="score" <c:if test="${selectOption eq 'score' }">selected="selected"</c:if>>평점순</option>
						<option value="male" <c:if test="${selectOption eq 'male' }">selected="selected"</c:if>>남성</option>
						<option value="female" <c:if test="${selectOption eq 'female' }">selected="selected"</c:if>>여성</option>
					</select>				
				</div>
				<div class="bottom-content">
					<c:forEach var="employee" items="${eList }">
						<div class="bottom-profile">
							<c:if test="${employee.profileFilePath eq null }">
								<img alt="profileimg" src="../resources/image/profile.png">
							</c:if>
							<c:if test="${employee.profileFilePath ne null }">
								<img alt="profileimg" src="..${employee.profileFilePath }">
							</c:if>
							<p>
								이름 : <a class="profile-name" href="/employee/detail?id=${employee.id }">${employee.name }</a> <br>
								성별 : ${employee.gender } <br>
								나이 : ${employee.age }세 <br>
								평점 : ${employee.score }/5 <br>
							</p>
						</div>					
					</c:forEach>
				</div>
				<!-- 여기부터 페이지추가 div class이름 바꿔줌!원래는page임!!-->
				<div class="pagination">
	                <ul class="pagination" colspan="4" align="center">
	                    <c:if test="${startNavi ne 1 }">
		                    <a href="/employee/list?page=${startNavi -1 }&selectOption=${selectOption}&searchKeyword=${searchKeyword}" class="back">이전</a>
	                    </c:if>
	                    <c:forEach begin="${startNavi }" end="${endNavi }" var="p">
	                    	<a href="/employee/list?page=${p }&selectOption=${selectOption}&searchKeyword=${searchKeyword}">${p }</a>
	                    </c:forEach>
	                    <c:if test="${endNavi ne maxPage}">
	                    	<a href="/employee/list?page=${endNavi +1 }&selectOption=${selectOption}&searchKeyword=${searchKeyword}" class="next">다음</a>
	                    </c:if>
	                </ul>
	            </div>
			</div>
		</main>
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
	<script type="text/javascript">
		const selectOp = (searchKeyword) => {
			const value = document.querySelector("#selectOp").value;
			location.href = "/employee/list?selectOption="+value+"&searchKeyword="+searchKeyword;
		}
	</script>
</body>
</html>