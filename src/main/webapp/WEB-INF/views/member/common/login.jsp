<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
        	<link rel="stylesheet" href="../resources/css/reset.css">
			<link rel="stylesheet" href="../resources/css/header.css">
			<link rel="stylesheet" href="../resources/css/footer.css">
			<link rel="stylesheet" href="../resources/css/member/common/login.css">
	<title>일당해라 알바생 로그인</title>
	</head>
<body>
	<div class="container">
	 <jsp:include page="/WEB-INF/views/include/header.jsp" />
		<main>
		    <form>
		        <img src="./resources/image/Image20250318102156.png" alt="" width="100"><h2>일당해라</h2>
		        <h2>로그인</h2>
		        <div id="">
		            <form action="" method="">
		                <input type="text" name="" id="" size="10 "placeholder="아이디입력"> <br>
		                <input type="password" name="" id="" placeholder="비밀번호 입력"><br>
		                <input type="submit" value="사장님으로 로그인"> <input type="submit" value="알바생으로 로그인"> <br>
		                <input type="submit" value="회원가입"> 
		            </form>
		        </div>
		    </form>
		</main>
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
</html>