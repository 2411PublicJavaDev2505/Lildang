<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="../resources/css/reset.css">
	<link rel="stylesheet" href="../resources/css/header.css">
	<link rel="stylesheet" href="../resources/css/footer.css">
	<link rel="stylesheet" href="../resources/css/employee/list.css">
	<title>알바생검색</title>
</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		<main>
			<div class="main-top">
				<p>
					대기중인 알바생     2345234명				
				</p>
				<div class="top-search">
					<form action="">
						<select>
							<option>서울</option>
							<option>서울</option>
							<option>서울</option>
							<option>서울</option>
							<option>서울</option>
							<option>서울</option>
						</select>
						<select>
							<option>업직종선택</option>
							<option>서울</option>
							<option>서울</option>
							<option>서울</option>
							<option>서울</option>
							<option>서울</option>
						</select>
						<button>알바생 검색</button>			
					</form>
				</div>
			</div>
			<div class="main-bottom">
				<div class="bottom-select">
					<select>
						<option>평점순</option>
						<option>평점순</option>
						<option>평점순</option>
					</select>				
				</div>
				<div class="bottom-content">
					<div class="bottom-profile">
						<img alt="프로필사진" src="">
						<p>
							이름 : 알리 <br>
							성별 : 남성 <br>
							나이 : 35세 <br>
							평점 : 3.5/5.0 <br>
						</p>
					</div>
					<div class="bottom-profile">
						<img alt="프로필사진" src="">
						<p>
							이름 : 알리 <br>
							성별 : 남성 <br>
							나이 : 35세 <br>
							평점 : 3.5/5.0 <br>
						</p>
					</div>
					<div class="bottom-profile">
						<img alt="프로필사진" src="">
						<p>
							이름 : 알리 <br>
							성별 : 남성 <br>
							나이 : 35세 <br>
							평점 : 3.5/5.0 <br>
						</p>
					</div>
				</div>
			</div>
		</main>
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
</html>