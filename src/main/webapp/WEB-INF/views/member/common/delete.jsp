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
			<link rel="stylesheet" href="../resources/css/member/common/delete.css">
        <title>mypage-delete employee</title>
    </head>
    <body>
    <div id=container>
    <div class="container">
        <jsp:include page="/WEB-INF/views/include/header.jsp" />
    	<main>
	        <h1>마이페이지 - 회원탈퇴</h1>
	        <div id="container">
	            <div id="left-main">
	                <c:if test="${member.profileFilePath eq null }">
		                <img src="../resources/image/profile.png" alt="profile"> <br>
	            	</c:if>
	            	<c:if test="${member.profileFilePath ne null }">
	            		<img src="..${member.profileFilePath }" alt="profile"> <br>
	            	</c:if>
	                <div id="information">
	                   	아이디:${member.id }<br>
	                    이름:${member.name }<br>
	                    성별:${member.gender }<br>
	                    나이:${member.age } <br>
	                </div>
	                <button class="modifybtn" onClick="showUpdate();">수정하기</button>
	            </div>
	            <div id="right-main">
	                <div class="delete">
	                    <h2>정말 탈퇴하시겠습니까?</h2>
	                    <label>PW:</label>
	                    <input type="password"></input><br>
	                    <label>PW 확인:</label>
	                    <input type="password"></input>
	                    <div class="rightdeletebtn">
	                        <button class="ybtn" onClick="deleteConfirm();">예</button>
	                        <button class="nbtn" onClick="returnToMypage();">아니오</button>
	                    </div>	                	
	                </div>
	                <div class="rightbtn">
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
    		const showUpdate = () => {
    			location.href = "/member/update"
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
    	</div>
    </body>
</html>