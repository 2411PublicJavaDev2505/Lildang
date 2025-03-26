<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="../resources/css/reset.css">
		<link rel="stylesheet" href="../resources/css/include/header.css">
		<link rel="stylesheet" href="../resources/css/include/footer.css">
		<link rel="stylesheet" href="../resources/css/employ/list.css">
		<title>구인글-검색결과</title>
	</head>
	<body>
		<div id="container">
			<jsp:include page="/WEB-INF/views/include/header.jsp" />
			<div id="main">
				<form action="/employ/list">
		            <div class="condition">
		                <select class="location" name="eSearchKeyword">
		                    <option value="none">지역</option>
		                    <option value="서울">서울</option>
		                    <option value="경기">경기</option>
		                    <option value="인천">인천</option>
		                    <option value="강원">강원</option>
		                    <option value="대전">대전</option>
		                    <option value="대구">대구</option>
		                    <option value="부산">부산</option>
		                    <option value="울산">울산</option>
		                    <option value="경남">경남</option>
		                    <option value="경북">경북</option>
		                    <option value="전남">전남</option>
		                    <option value="전북">전북</option>
		                    <option value="충남">충남</option>
		                    <option value="충북">충북</option>
		                    <option value="제주">제주</option>
		                </select>
		            </div>
		            <div class="conditionbtn">
		                <button class="cbtn2" type="submit">검색</button>
					</div>
	            </form>
		            <div class="jobinf">
	        	        <h1 class="infword">채용정보</h1>
	                	<select class="infoption" name="selectOption" onchange="sort('${eSearchKeyword }','${searchKeyword }');">
	            	        <option value="none" <c:if test="${selectOption eq 'none' }">selected="selected"</c:if>>선택</option>
	            	        <option value="recent" <c:if test="${selectOption eq 'recent' }">selected="selected"</c:if>>최근등록순</option>
	                	    <option value="score" <c:if test="${selectOption eq 'score' }">selected="selected"</c:if>>평점순</option>
			       	   	</select>
	            	</div>
	            <div class="inftable">
	                <table class="table1">
	                    <tr class="title">
	                        <td>공고제목</td>
	                        <td>근무지</td>
	                        <td>근무시간</td>
	                        <td>급여</td>
	                        <td class="d1">등록일</td>
	                    </tr>
	                    <c:forEach var="eList" items="${eList }">
		                    <tr>
		                        <td  class="emptitle"><a href="/employ/detail?employNo=${eList.employNo }">${eList.employName }</a></td>
		                        <td>${eList.workplaceAddress }</td>
		                        <td>${eList.workingStartTime } ${eList.workingEndTime }</td>
		                        <td>${eList.salary }</td>
		                        <td class="d1">${eList.writeTime }</td>
		                    </tr>
	                    </c:forEach>
	                </table>
	            </div>
		            <!-- 페이징처리하면서 밑에코드 작성!css 03/26 16:37분부터시작! -->
		            <div class="page">
		            	<c:if test="${eSearchKeyword ne '전체' }">
		            		<ul class="pagination">
			                    <c:if test="${startNavi ne 1 }">
				                    <li><a href="/employ/list?page=${startNavi -1 }&selectOption=${selectOption}&eSearchKeyword=${eSearchKeyword}" class="back">이전</a></li>
			                    </c:if>
			                    <c:forEach begin="${startNavi }" end="${endNavi }" var="p">
			                    	<a href="/employ/list?page=${p }&selectOption=${selectOption}&eSearchKeyword=${eSearchKeyword}">${p }</a>
			                    </c:forEach>
			                    <c:if test="${endNavi ne maxPage}">
			                    	<li><a href="/employ/list?page=${endNavi +1 }&selectOption=${selectOption}&eSearchKeyword=${eSearchKeyword}" class="next">다음</a></li>
			                    </c:if>
		                	</ul>
		            	</c:if>
		            	<!-- css작업시작!!03-08-17:09 지우기!! -->
		            	<c:if test="${eSearchKeyword eq '전체' }">
		            		<c:if test="${searchKeyword ne '' }">
		            			<ul class="pagination">
				                    <c:if test="${startNavi ne 1 }">
					                    <li><a href="/employ/list?page=${startNavi -1 }&selectOption=${selectOption}&searchKeyword=${searchKeyword}" class="back">이전</a></li>
				                    </c:if>
				                    <c:forEach begin="${startNavi }" end="${endNavi }" var="p">
				                    	<a href="/employ/list?page=${p }&selectOption=${selectOption}&searchKeyword=${searchKeyword}" class="num">${p }</a>
				                    </c:forEach>
				                    <c:if test="${endNavi ne maxPage}">
				                    <li><a href="/employ/list?page=${endNavi +1 }&selectOption=${selectOption}&searchKeyword=${searchKeyword}" class="next">다음</a></li>
				                    </c:if>
				                </ul>
		            		</c:if>
		            		<c:if test="${searchKeyword eq '' }">
		            			<ul class="pagination">
		                    <c:if test="${startNavi ne 1 }">
			                    <li><a href="/employ/list?page=${startNavi -1 }&selectOption=${selectOption}" class="back">이전</a></li>
				                    </c:if>
				                    <c:forEach begin="${startNavi }" end="${endNavi }" var="p">
				                    	<a href="/employ/list?page=${p }&selectOption=${selectOption}">${p }</a>
				                    </c:forEach>
				                    <c:if test="${endNavi ne maxPage}">
				                    <li><a href="/employ/list?page=${endNavi +1 }&selectOption=${selectOption}" class="next">다음</a></li>
				                    </c:if>
				                </ul>
		            		</c:if>
		            	</c:if>
	            	</div>
	        </div>
	        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
        </div>
        <script type="text/javascript">
        	function sort(eSearchKeyword,searchKeyword) {
        		location.href = "/employ/list?selectOption="+document.querySelector(".infoption").value+"&eSearchKeyword="+eSearchKeyword+"&searchKeyword="+searchKeyword;
        	}
        </script>
	</body>
</html>