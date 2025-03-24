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
        	<div id="">
                <!-- lable의ㅡfor 값,select name값,option의 value값 전체 수정해야함.......
                일단 값을 넘겨주려면 form태그로 감싸야한다? -->
                <label for="reportdetail">검색어</label>
                    <select name="reportdetail" id="reportdetail">
                        <option value="전체">전체</option>
                        <option value="reportdetail">신고내용</option>
                        <option value="report_writer_id">신고자</option>
                    </select>
                <div>
                    <label for="reportdate">날짜</label>
                    <select name="reportdate" id="reportdate">
                        <option value="reportdate">접수일</option>
                        <option value="checkdata">처리일</option>
                        <input type="date" name="startdate" id="startdate">~<input type="date" name="lastdate" id="lastdate">
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
                <table>
                	<tr>
                		<th>번호</th>
                		<th>접수일</th>
                		<th>신고내용</th>
                		<th>신고자</th>
                		<th>처리일</th>
                		<th>처리여부</th>
                	</tr>
                		<c:forEach var="rList" items="${rList }">
		                	<tr>
		                		<td>${rList.reportNo }</td>
		                		<td>${rList.reportDate }</td>
		                		<td><a href="/manager/rmployee?reportDetail=${rList.reportDetail}">${rList.reportDetail }</td>
		                		<td>${rList.reportWriterId }</td>
		                		<td>${rList.checkDate }</td>
		                		<td>${rList.checkYN }</td>
		                	</tr>
                		</c:forEach>
               		</table>
            </div>  
    </main>
    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </div>
</body>
</html>