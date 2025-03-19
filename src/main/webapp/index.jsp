<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="../resources/css/reset.css">
		<link rel="stylesheet" href="../resources/css/include/header.css">
		<link rel="stylesheet" href="../resources/css/include/footer.css">
		<link rel="stylesheet" href="../resources/css/index.css">
		<title>일당해라</title>
	</head>
	<body>
		<div id="container">
			<jsp:include page="/WEB-INF/views/include/header.jsp" />
			<main>
				<div class="main-left">
					<img alt="메인이미지" src="../resources/image/main.jpg">
				</div>
				<div class="main-right">
					<p>
						최고의 구인구직 사이트! <br>
						단기부터 정규직까지! <br>
					</p>			
					<p>					
						세상의 모든 구인구직은 일당해라!
					</p>
				</div>
			</main>
			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
		</div>
	</body>
</html>