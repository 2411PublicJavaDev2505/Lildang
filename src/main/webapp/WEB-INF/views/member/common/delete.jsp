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
			<link rel="stylesheet" href="../resources/css/member/common/delete.css">
        <title>mypage-delete employee</title>
    </head>
    <body>
    <div class="container">
        <jsp:include page="/WEB-INF/views/include/header.jsp" />
    	<main>
	        <h1>ë§ì´íì´ì§ - ì ë³´ìì </h1>
	        <div id="container">
	            <div id="left-main">
	                <img src="./img/profile.png" alt="profile"> <br>
	                <button class="imgbtn">ì¬ì§ë³ê²½</button>
	                <div id="information">
	                    ìì´ë: Ola<br>
	                    ì´ë¦: ì´ì©ì <br>
	                    ì±ë³: ì¬ì± <br>
	                    ëì´: 25 <br>
	                </div>
	                <button class="modifybtn">ìì íê¸°</button>
	                <button class="deletebtn">íí´íê¸°</button>
	            </div>
	            <div id="right-main">
	                <div class="delete">
	                    <h2>ì ë§ íí´íìê² ìµëê¹?</h2>
	                    <label>PW:</label>
	                    <input type="password"></input><br>
	                    <label>PW íì¸:</label>
	                    <input type="password"></input>
	                    <div class="rightdeletebtn">
	                        <button class="ybtn">ì</button>
	                        <button class="nbtn">ìëì¤</button>
	                    </div>
	                </div>
	                
	                <div class="rightbtn">
	                    <button class="returnbtn">ì´ê¸°í</button>
	                    <button class="modifybtn">ìì íê¸°</button>
	                </div>
	            </div>
	        </div>
    	</main>
    		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </div>
    </body>
</html>