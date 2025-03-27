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
			<link rel="stylesheet" href="../resources/css/common/modal.css">
        <title>Mypage - employee</title>
    </head>
    <body>
    <div id="container">
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
    	<main>
	        <h1>마이페이지</h1>
    		<div class="main-container">
	            <div id="left-main">
	                <c:if test="${member.profileFilePath eq null }">
		                <img src="../resources/image/profile.png" alt="profile"> <br>
	            	</c:if>
	            	<c:if test="${member.profileFilePath ne null }">
	            		<img src="..${member.profileFilePath }" alt="profile"> <br>
	            	</c:if>
	            	<form action="/member/pupdate" method="post" enctype="multipart/form-data">
	            		<input type="hidden" name="id" value="${member.id }">
	            		<input type="hidden" name="profileFileName" value="${member.profileFileName }">
	            		<input type="hidden" name="profileFileRename" value="${member.profileFileRename }">
	            		<input type="hidden" name="profileFilePath" value="${member.profileFilePath }">
	            		<div class="file">
		            		<input type="file" name="reloadFile" class="reloadfile">
	            		</div>
		            	<button class="imgbtn">사진변경</button>
	            	</form>
	                <div id="information">
	                    아이디: ${member.id }<br>
	                    이름: ${member.name } <br>
	                    성별: ${member.gender } <br>
	                    나이: ${member.age } <br>
	                    평점: ${member.score }/5
	                </div>
	                <button class="modifybtn" onclick="showUpdate();">수정하기</button>
	                <button class="deletebtn" onclick="showDelete();">탈퇴하기</button>
	            </div>
	            <div id="right-main">
	                <div class="mycv">
	                    <p class="cvtitle">내 이력서</p>
	                  	<c:if test="${member.cvYn eq 'N' }">
		                    <button class="cvbtn" onClick="showCvInsert();">이력서 작성</button>	                  	
		                    <div class="cvplace">이력서를 작성해주세요...ㅠㅠ</div>
	                  	</c:if>
	                  	<c:if test="${member.cvYn eq 'Y' }">
		                    <button class="cvbtn" onclick="cvUpdate();">이력서 수정</button>
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
	                    		<table style="width : 100%;">
			                    	<c:forEach var="em" items="${emList }">
			                    		<c:if test="${em.employerYn eq 'Y' && em.employeeYn eq 'N'}">
			                    			<tr>
			                    				<td>${em.employName }</td>
			                    				<td> <button onclick="chat('${member.id}','${em.employNo }');">채팅</button> </td>
			                    				<td> <button onclick="accept('${em.employeeId}','${em.employNo }');">수락</button> </td>
			                    				<td> <button onclick="reject('${em.employeeId}','${em.employNo }');">거절</button> </td>
			                    			</tr>
			                    		</c:if>
			                    	</c:forEach>
	                    		</table>
	                    	</c:if>
	                    </div>
	                </div>
	                <div class="mywork">
	                    <h4 class="worktitle">내가 일했던 곳</h4>
	                    <div class="workplace">
	                    	<c:forEach var="em" items="${emList }">
	                    		<table class="career-table">
	                    			<tr>
	                    				<td><a href="/employ/detail?employNo=${em.employNo }">${em.employName }</a></td>
	                    				<td>6개월</td>
	                    				<td>${em.jobStartTime } ~ ${em.jobEndTime }</td>
	                    			</tr>
	                    		</table>
		                        <c:if test="${em.jobEndYn eq 'Y' }">
		                        	알바완료
		                        	<button onclick="chat('${member.id}','${em.employNo }');">채팅</button>
		                        	<c:forEach var="re" items="${reList }">
		                        		<c:if test="${em.employNo eq re.employNo }">
		                        			<input type="hidden" value="${num = num+1 }">
			                        		<button class="reviewbtn" onclick="updateReview('${em.employeeId }','${em.employNo}');">후기 수정</button>
						                    <div class="modal" id="update${em.employeeId }${em.employNo}">
								     			<div class="modal-body">
								     				<h2>알바 후기 남기기 - 수정</h2>
								     				<form action="/review/employ/update" method="post">
								     					<input type="hidden" value="${em.employNo }" name="employNo">
								     					<input type="hidden" value="${sessionScope.id }" name="reviewWriter">
								     					<div class="review-point">
									     					평점: <input type="number" min="0" max="5" name="reviewScore" value="${re.reviewScore }">     					
								     					</div>
								     					<div class="review-content">
								     						<h5>좋았던 점과 아쉬웠던 점을 적어주세요.</h5>
								     						<textarea rows="20" cols="50" name="reviewDetail">${re.reviewDetail }</textarea>
								     					</div>
								     					<button>후기 수정</button>
								     					<button onclick="backUpdate('${em.employeeId }','${em.employNo}');" type="button">뒤로 가기</button>
								     				</form>
								     			</div>
								     		</div>
		                        		</c:if>
		                        	</c:forEach>
		                        	<c:if test="${num eq 0 }">
					                    <button class="reviewbtn" onclick="writeReview('${em.employeeId }','${em.employNo}');">후기 작성</button>
					                    <div class="modal" id="insert${em.employeeId }${em.employNo}">
							     			<div class="modal-body">
							     				<h2>알바 후기 남기기</h2>
							     				<form action="/review/employ" method="post">
							     					<input type="hidden" value="${em.employNo }" name="employNo">
							     					<input type="hidden" value="${sessionScope.id }" name="reviewWriter">
							     					<div class="review-point">
								     					평점: <input type="number" min="0" max="5" name="reviewScore">     					
							     					</div>
							     					<div class="review-content">
							     						<h5>좋았던 점과 아쉬웠던 점을 적어주세요.</h5>
							     						<textarea rows="20" cols="50" name="reviewDetail"></textarea>
							     					</div>
							     					<button>후기 작성</button>
							     					<button onclick="back('${em.employeeId }','${em.employNo}');" type="button">뒤로 가기</button>
							     				</form>
							     			</div>
							     		</div>
		                        	</c:if>
		                        	<input type="hidden" value="${num = 0 }">
		                        </c:if>
		                        <c:if test="${em.jobEndYn ne 'Y' }">
		                        	알바중
		                        	<button onclick="chat('${member.id}','${em.employNo }');">채팅</button>
		                        </c:if>
	                    	</c:forEach>
	                    </div>
	                </div>
	            </div>
    		</div>
    	</main>
    	<jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </div>
    <script type="text/javascript">
    	const showUpdate = () => {
    		location.href = "/member/update"
    	}
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
    	const cvUpdate = () => {
    		location.href = "/member/cvupdate";
    	}
    	const accept = (employeeId, employNo) => {
    		if(confirm("정말 수락하시겠습니까?")){
    			location.replace("/match/accept?employeeId="+employeeId+"&employNo="+employNo);
    		}
    	}
    	const reject = (employeeId, employNo) => {
    		if(confirm("정말 거절하시겠습니까?")){
    			location.replace("/match/delete?employeeId="+employeeId+"&employNo="+employNo);
    		}
    	}
    	const writeReview = (employeeId, employNo) => {
			document.querySelector("#insert"+employeeId+employNo).style.display = "flex";
		}
    	const back = (employeeId, employNo) => {
			document.querySelector("#insert"+employeeId+employNo).style.display = "none";
		}
    	const updateReview = (employeeId, employNo) => {
    		document.querySelector("#update"+employeeId+employNo).style.display = "flex";
    	}
    	const backUpdate = (employeeId, employNo) => {
			document.querySelector("#update"+employeeId+employNo).style.display = "none";
		}
    	const chat = (id, employNo) => {
    		location.href = "/chat/toboss?writerId="+id+"&employNo="+employNo;
    	}
    </script>
    </body>
</html>

h