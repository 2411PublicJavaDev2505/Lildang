<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel="stylesheet" href="../resources/css/reset.css">
	<link rel="stylesheet" href="../resources/css/include/header.css">
	<link rel="stylesheet" href="../resources/css/include/footer.css">
	<link rel="stylesheet" href="../resources/css/manager/reportdetail.css">
<title>관리자-신고조회</title>
</head>
<body>
    <div id="container">
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
    <main>
        <h1>신고 게시글 관리</h1>
            <div class="main-container">
                <label for="">검색어</label>
                    <select name="" id="">
                        <option value="">전체</option>
                        <option value="">신고내용</option>
                        <option value="">신고자</option>
                    </select>
                <div>
                    <label for="">날짜</label>
                    <select name="" id="">
                        <option value="">접수일</option>
                        <option value="">처리일</option>
                        <input type="date">~ <input type="date">
                    </select>
                </div>
                <div>
                    <label for="">구분</label>
                    <label><input type="radio" name="check">전체</label>
                    <label><input type="radio" name="check" >처리</label>
                    <label><input type="radio" name="check">미처리</label>
                </div>
                <div>
                    <button type="submit">검색하기</button>
                    <button type="reset">초기화</button>
                </div>
            </div>
    </main>
    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </div>
</body>
</html>