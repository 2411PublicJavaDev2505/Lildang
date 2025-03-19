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
	<link rel="stylesheet" href="../resources/css/chat/chat.css">
    <title>채팅</title>
</head>
<body>
	<div class="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
	    <main>
	        <div class="title">
	            <h1>내채팅</h1>
	            <h2><i class="fa-light fa-paper-plane"></i></h2>
	        </div>
	        <div class="chat-content">채팅내용</div>
	        <div class="message">
	            <input type="text" placeholder="메세지를 입력해주세요">
	            <button type="submit">
	                <img src="../resources/image/send.256x233.png" alt="send">
	            </button>
	        </div>
	        <div class="btn">
	            <button>신고하기</button>
	            <button>채팅방 나가기</button>
	        </div>
	    </main>
	    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
</html>