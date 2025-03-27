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
                <div class="btn">
                    <div class="search-btn">
                        <button onClick="memberList();">회원조회</button>
                    </div>
                </div>
                <table class="table">
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
		                		<td id="link"><a href="/report/detail?reportNo=${rList.reportNo}">${rList.reportReason }</td>
		                		<td>${rList.reportWriterId }</td>
		                		<td>${rList.checkDate }</td>
		                		<td>${rList.checkYN }</td>
		                	</tr>
                		</c:forEach>
               		</table>
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
    <script type="text/javascript">
    const memberList = () => {
		location.href = "/manager/memberlist";
	}
    document.querySelectorAll('#link a').forEach(link => {
	    link.addEventListener('mouseenter', () => {
	        link.style.backgroundColor = "#b2f2bb";
	    });

	    link.addEventListener('mouseleave', () => {
	        link.style.backgroundColor = "transparent";
	        link.style.color = "black";
	    });
	});
	    document.querySelectorAll('.pagination a').forEach(link => {
		    link.addEventListener('mouseenter', () => {
		        link.style.backgroundColor = "#b2f2bb";
		    });
	
		    link.addEventListener('mouseleave', () => {
		        link.style.backgroundColor = "transparent";
		        link.style.color = "black";
		    });
		});
    </script>
</body>
</body>
</html>