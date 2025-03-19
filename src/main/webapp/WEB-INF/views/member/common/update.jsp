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
		                    아이디: Ola<br>
		                    이름: 이용자 <br>
		                    성별: 여성 <br>
		                    나이: 25 <br>
		                </div>
		                <button class="modifybtn">수정하기</button>
		                <button class="deletebtn">탈퇴하기</button>
		            </div>
		            <div id="right-main">
		                <div class="modify">
		                    <label>PW:</label>
		                    <input type="password"></input><br>
		                    <label>이메일:</label>
		                    <input type="text"></input><br>
		                    <label>주소:</label>
		                    <input type="text"></input><br>
		                    <label>전화번호:</label>
		                    <input type="text"></input><br> 
		                </div>
		                <div class="rightbtn">
		                    <button class="returnbtn">초기화</button>
		                    <button class="modifybtn">수정하기</button>
		                </div>
		            </div>
		        </div>
    		</main>
    		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
    	</div>
    </body>
</html>