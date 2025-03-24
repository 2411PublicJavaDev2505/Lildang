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
			<link rel="stylesheet" href="../resources/css/member/employee/detail.css">
        <title>Mypage - employee</title>
    </head>
    <body>
    <div id="container">
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
    	<main>
    		<div class="main-container">
		        <h1>마이페이지</h1>
	            <div id="left-main">
	                <img src="./img/profile.png" alt="profile"> <br>
	                <button class="imgbtn">사진변경</button>
	                <div id="information">
	                    아이디: ${member.id }<br>
	                    이름: ${member.name } <br>
	                    성별: ${member.gender } <br>
	                    나이: ${member.age } <br>
	                    평점: 4.5/5.0
	                </div>
	                <button class="modifybtn">수정하기</button>
	                <button class="deletebtn" onClick="showDelete();">탈퇴하기</button>
	            </div>
	            <div id="right-main">
	                <div class="mycv">
	                    <p class="cvtitle">내 이력서</p>
	                  	<c:if test="${member.cvYn eq 'N' }">
		                    <button class="cvbtn1" onClick="showCvInsert();">이력서 작성</button>	                  	
		                    <div class="cvplace">이력서를 작성해주세요...ㅠㅠ</div>
	                  	</c:if>
	                  	<c:if test="${member.cvYn eq 'Y' }">
		                    <button class="cvbtn">이력서 수정</button>
		                    <button class="cvbtn" onclick="cvDelete();">이력서 삭제</button>	                  	
		                    <div class="cvplace"><a href="/member/cvdetail">${member.memberComment }</a></div>
	                  	</c:if>
	                </div>
	                <div class="myscout">
	                    <p class="scouttitle">나에게 온 제의</p>
	                    <div class="scoutplace">
	                    	<c:if test="${size eq 0 }">
		                    	나에게 온 제의가 없어요...ㅠㅠ	                    	
	                    	</c:if>
	                    	<c:if test="${size ne 0 }">
	                    		<table>
			                    	<c:forEach var="em" items="${emList }">
			                    		<c:if test="${em.employerYn eq 'Y' }">
			                    			<tr>
			                    				<td>${em.employName }</td>
			                    				<td> <button>채팅</button> </td>
			                    				<td> <button>수락</button> </td>
			                    				<td> <button>거절</button> </td>
			                    			</tr>
			                    		</c:if>
			                    	</c:forEach>
	                    		</table>
	                    	</c:if>
	                    </div>
	                </div>
	                <div class="mywork">
	                    <p class="worktitle">내가 일했던 곳</p>
	                    <div class="workplace">
	                    	<c:forEach var="em" items="${emList }">
		                        ${em.employName }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                        6개월&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                        ${em.jobStartTime } ~ ${em.jobEndTime }&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                        <c:if test="${em.jobEndYn eq 'Y' }">
		                        	알바완료
				                    <button class="reviewbtn">후기 작성</button>
		                        </c:if>
		                        <c:if test="${em.jobEndYn ne 'Y' }">
		                        	알바중
		                        </c:if>
	                    	</c:forEach>
	                    </div>
	                </div>
	                <div class="mypick">
	                    <p class="picktitle">내가 찜한 공고글</p>
	                <div class="pickplace">내가 찜한 공고글이 없어요...ㅠㅠ</div>
	                </div>
	            </div>
    		</div>
    	</main>
    	<jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </div>
    <script type="text/javascript">
    	const showDelete = () => {
    		location.href = "/member/delete"
    	}
    	const showCvInsert = () => {
    		location.href = "/member/cvinsert"
    	}
    	const cvDelete = () => {
    		if(confirm("정말 삭제하시겠습니까?")){
    			location.replace("/member/cvdelete");
    		}
    	}
    </script>
    </body>
</html>

h