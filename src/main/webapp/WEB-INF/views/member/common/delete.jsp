<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        	<link rel="stylesheet" href="../resources/css/reset.css">
			<link rel="stylesheet" href="../resources/css/include/header.css">
			<link rel="stylesheet" href="../resources/css/include/footer.css">
			<link rel="stylesheet" href="../resources/css/member/common/delete.css">
        <title>mypage-delete employee</title>
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
	                   	id:Ola<br>
	                    이름:이용자<br>
	                    성별:여성<br>
	                    나이: 25 <br>
	                </div>
	                <button class="modifybtn">수정하기</button>
	                <button class="deletebtn" onclick="showDelete();">탈퇴하기</button>
	            </div>
	            <div id="right-main">
	                <div class="delete">
	                    <h2>정말 탈퇴하시겠습니까?</h2>
	                    <label>PW:</label>
	                    <input type="password"></input><br>
	                    <label>PW 확인:</label>
	                    <input type="password"></input>
	                    <div class="rightdeletebtn">
	                        <button class="ybtn" onClick="deleteConfirm();">예(탈퇴)</button>
	                        <button class="nbtn" onClick="returnToMypage();">아니오</button>
	                    </div>	                	
	                </div>
	                
	                <div class="rightbtn">
	                    <button class="returnbtn">초기화</button>
	                    <button class="modifybtn">수정하기</button>
	                </div>
	            </div>
	        </div>
    	</main>
    		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
    	<script type="text/javascript">
    		const showDelete = () => {
    			location.href = "/member/delete"
    		}
    		
    		function deleteConfirm() {
    			const result = confirm("정말로 탈퇴하시겠습니까?");
    			if(result) {
    				location.replace("/member/del");
    			}
    			
    		}
    		
    		function returnToMypage() {
    			location.href ="/";
    		}

    	</script>
    	</div>
    </body>
</html>