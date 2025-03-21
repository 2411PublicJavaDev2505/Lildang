<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<header>
    <div class="logo">
    	<a href="/">
	        <img src="../resources/image/로고.png" alt="로고이미지">
	        <h3>일당해라</h3>    	
    	</a>
    </div>
    <div class="searchBar">
    	<form action="">
	        <input type="text" placeholder="검색어를 입력하세요.">
	        <button>검색</button>
    	</form>
    </div>
    <div class="nav">
        <a href="/employ/search">알바 찾기</a>
        <a href="/employee/list">알바생 찾기</a>
        <c:if test="${sessionScope.id eq null }">
	        <a href="/member/login">로그인</a>        
        </c:if>
        <c:if test="${sessionScope.id ne null }">
        	<c:if test="${sessionScope.role eq 'MANAGER' }">
        		<a href="/manager/memberlist">관리자 페이지</a>
        	</c:if>
        	<c:if test="${sessionScope.role eq 'EMPLOYER' }">
        		<a href="member/bdetail">마이페이지</a>
        	</c:if>
        	<c:if test="${sessionScope.role eq 'EMPLOYEE' }">
        		<a href="member/edetail">마이페이지</a>
        	</c:if>
       		<a href="/member/logout">로그아웃</a>
        </c:if>
    </div>
</header>