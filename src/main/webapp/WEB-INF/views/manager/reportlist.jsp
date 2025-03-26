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
	<link rel="stylesheet" href="../resources/css/manager/reportlist.css">
<title>관리자-신고조회</title>
</head>
<body>
    <div id="container">
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
    <main>
        <h1>신고 게시글 관리</h1>
        	<div class="main-container">
                <!-- lable의ㅡfor 값,select name값,option의 value값 전체 수정해야함.......
                일단 값을 넘겨주려면 form태그로 감싸야한다? -->
                <div class="search-content">
	                <label for="reportdetail">검색어</label>
	                    <select name="reportdetail" id="reportdetail">
	                        <option value="전체">전체</option>
	                        <option value="reportdetail">신고내용</option>
	                        <option value="report_writer_id">신고자</option>
	                    </select>                
                </div>
                <div class="date-content">
                    <label for="reportdate">날짜</label>
                    <select name="reportdate" id="reportdate">
                        <option value="reportdate">접수일</option>
                        <option value="checkdata">처리일</option>
                        <input type="date" name="startdate" id="startdate">~<input type="date" name="lastdate" id="lastdate">
                    </select>
                </div>
                <div class="hadle-content">
                    <label for="">구분</label>
                    <label><input type="radio" name="check">전체</label>
                    <label><input type="radio" name="check" >처리</label>
                    <label><input type="radio" name="check">미처리</label>
                </div>
                <div class="btn">
                    <div class="search-btn">
                        <button type="submit">검색하기</button>
                    </div>
                    <div class="reset-btn">
                        <button type="reset">초기화</button>
                    </div>
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
		                		<td><a href="/report/detail?reportNo=${rList.reportNo}">${rList.reportReason }</td>
		                		<td>${rList.reportWriterId }</td>
		                		<td>${rList.checkDate }</td>
		                		<td>${rList.checkYN }</td>
		                	</tr>
                		</c:forEach>
               		</table>
            </div> 
            <div class="page">
	                <!-- 신고리스트페이지작업  -->
	                <ul class="pagination">
	                    <c:if test="${startNavi ne 1 }">
		                    <li><a href="/manager/reportlist?page=${startNavi -1 }" class="back">이전</a></li>
	                    </c:if>
	                    <c:forEach begin="${startNavi }" end="${endNavi }" var="p">
	                    	<a href="/manager/reportlist?page=${p }">${p }</a>
	                    </c:forEach>
	                    <c:if test="${endNavi ne maxPage}">
	                    <li><a href="/manager/reportlist?page=${endNavi +1 }" class="next">다음</a></li>
	                    </c:if>
	                </ul>
	            </div> 
    </main>
    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </div>
</body>
</body>
</html>