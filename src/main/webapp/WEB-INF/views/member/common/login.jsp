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
			<link rel="stylesheet" href="../resources/css/member/common/login.css">
    <title>로그인</title>
</head>
<body>
	<div class="container">
	<jsp:include page="/WEB-INF/views/include/header.jsp" />
	    <main>
	        <div class="main-container">
	            <form>
	                <img src="./resources/image/Image20250318102156.png" alt="" width="100"><h2>일당해라</h2>
	                <h2>로그인</h2>
	                <div id="">
	                    <form action="/member/login" method="post">
	                        <div class="inputTag">
	                            <input type="text"  placeholder="아이디를 입력해주세요"> <br>
	                            <input type="password" placeholder="비밀번호를 입력해주세요"><br>
	                        </div>
	                        <div class="loginBtn">
	                            <button>로그인</button> 
	                        </div>
	                        <div class="registerBtn">
	                        	<a href="/member/register">회원가입</a>
	                            <button>회원가입</button>
	                        </div>
	                    </form>
	                </div>
	            </form>
	        </div>
	    </main>
	    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
</html>