<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="../resources/css/reset.css">
			<link rel="stylesheet" href="../resources/css/header.css">
			<link rel="stylesheet" href="../resources/css/footer.css">
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
		                <img src="./img/profile.png" alt="profile"> <br>
		                <button class="imgbtn">사진변경</button>
		                <div id="information">
		                    아이디: ${member.id }<br>
		                    이름: ${member.name } <br>
		                    성별: ${member.gender } <br>
		                    나이: ${member.age } <br>
		                </div>
		                <button class="modifybtn">수정하기</button>
		                <button class="deletebtn">탈퇴하기</button>
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
			                    <button class="returnbtn">초기화</button>
			                    <button class="modifybtn" type="submit">수정하기</button>
			                </div>
		            	</form>
		            </div>
		        </div>
    		</main>
    		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
    	</div>
    </body>
</html>