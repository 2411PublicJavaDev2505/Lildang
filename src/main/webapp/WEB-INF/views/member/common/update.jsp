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
			<link rel="stylesheet" href="../resources/css/member/common/update.css">
        <title>mypage-modify employee</title>
    </head>
    <body>
    	<div class="container">
    		<jsp:include page="/WEB-INF/views/include/header.jsp" />
    		<main>
		        <h1>마이페이지 - 정보수정</h1>
		        <div id="container">
		            <div id="left-main">
		                <c:if test="${member.profileFilePath eq null }">
		                <img src="../resources/image/profile.png" alt="profile"> <br>
		            	</c:if>
		            	<c:if test="${member.profileFilePath ne null }">
		            		<img src="..${member.profileFilePath }" alt="profile"> <br>
		            	</c:if>
		                <div id="information">
		                    아이디: ${member.id }<br>
		                    이름: ${member.name } <br>
		                    성별: ${member.gender } <br>
		                    나이: ${member.age } <br>
		                </div>
		                <button class="deletebtn" onclick="showDelete();">탈퇴하기</button>
		            </div>
		            <div id="right-main">
		            	<form action="/member/update" method="post">
			                <div class="modify">
			                	<input type="hidden" value="${sessionScope.id }" name="id" >
			                    <label>PW:</label>
			                    <input type="password" value="${member.pw }" name="pw"></input><br>
			                    <label>이메일:</label>
			                    <input type="text" value="${member.email }" name="email"></input><br>
			                    <label>주소:</label>
			                    <input type="text" value="${member.address }" name="address"></input><br>
			                    <label>전화번호:</label>
			                    <input type="text" value="${member.phone }" name="phone"></input><br> 
			                </div>
			                <div class="rightbtn">
			                    <button class="modifybtn" type="submit">수정하기</button>
			                </div>
		            	</form>
		            </div>
		        </div>
    		</main>
    		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
    	</div>
    	<script type="text/javascript">
    		const showDelete = () => {
    			location.href="/member/delete";
    		}
    	</script>
    </body>
</html>