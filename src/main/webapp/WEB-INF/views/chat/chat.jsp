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
	        <div class="chat-content">
	        	<c:forEach var="chat" items="${cList }">
	        		<c:if test="${chat.writerId eq sessionScope.id}">
	        			<div class="my-msg">${chat.chatDetail }</div>
	        		</c:if>
	        		<c:if test="${chat.writerId ne sessionScope.id}">
	        			<div class="not-my-msg">${chat.chatDetail }</div>
	        		</c:if>
	        	</c:forEach>
	        </div>
	        <div class="message">
	        	<form action="/chat/send" method="post">
	        		<input type="hidden" value="${writerId }" name="writerId">
	        		<input type="hidden" value="${receiverId }" name="receiverId">
	        		<input type="text" placeholder="메세지를 입력해주세요" name="chatDetail" id="input">
		            <button type="submit" id="submitbtn">
		                <img src="../resources/image/send.256x233.png" alt="send">
		            </button>	        		
	        	</form>
	        </div>
	        <div class="btn">
	            <button onClick="history.back();">채팅방 나가기</button>
	        </div>
	    </main>
	    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
</html>