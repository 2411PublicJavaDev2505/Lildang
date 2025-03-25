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
		<link rel="stylesheet" href="../resources/css/manager/memberlist.css">
	    <title>회원전체조회</title>
    </head>
    <body>
   		<jsp:include page="/WEB-INF/views/include/header.jsp" />
        <div id="main">
        	<div class="head">
        		<h1>전체회원조회</h1>
        	</div>
        		<div class="btn">
	        		<button>회원조회</button>
					<button onClick="reportList();">신고조회</button>        		
        		</div>
            <div class="search">
                <select class="searchbar">
                    <option value="none">전체</option>  
                </select>
                <input class="searchbox" type="text" placeholder="검색 할 회원 정보를 입력하세요.">
                <button class="searchbtn">검색</button>
            </div>
            <div class="searchlist">
                <table class="list">
                    <tr class="listhead">
                        <!-- 03/25 번호가 없어서 일단테이블번호 주석처리함 
                        번호를 없애면 밀림...-->
                        <!--  <td>번호</td> -->
                        <td>번호</td>
                        <td>아이디</td>
                        <td>이름</td>
                        <td>전화번호</td>
                        <td>이메일</td>
                        <td>주소</td>
                        <td>생년월일</td>
                    </tr>
                    <c:forEach var="member" items="${mList }">
	                    <tr>
	                    <td></td>
	                        <td>${member.id }</td>
	                        <td>${member.name }</td>
	                        <td>${member.phone }</td>
	                        <td>${member.email } </td>
	                        <td>${member.address } </td>
	                        <td>${member.birth }</td>
	                    </tr>
                    </c:forEach>
                </table>
            </div>
            <div class="page">
                <!-- li,ul지우고 확인해볼것!테이블css가 페이지넘어갈때 변화됨! -->
                <ul class="pagination">
                    <c:if test="${startNavi ne 1 }">
	                    <li><a href="/manager/memberlist?page=${startNavi -1 }" class="back">이전</a></li>
                    </c:if>
                    <c:forEach begin="${startNavi }" end="${endNavi }" var="p">
                    	<a href="/manager/memberlist?page=${p }">${p }</a>
                    </c:forEach>
                    <c:if test="${endNavi ne maxPage}">
                    <li><a href="/manager/memberlist?page${endNavi +1 }" class="next">다음</a></li>
                    </c:if>
                </ul>
            </div>
        </div>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
        <script type="text/javascript">
        	const reportList = () => {
        		console.log("확인");
        		location.href = "/manager/reportlist";
        	}
        </script>
    </body>   
</html>