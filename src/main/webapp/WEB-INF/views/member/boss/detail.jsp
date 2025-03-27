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
			<link rel="stylesheet" href="../resources/css/member/boss/detail.css">
			<link rel="stylesheet" href="../resources/css/common/modal.css">
        <title>Mypage - boss</title>
    </head>
    <body>
     	<div id="container">
	     	<jsp:include page="/WEB-INF/views/include/header.jsp" />
	    	<main>
	        <h1>마이페이지</h1>
	        <div class="main-content">
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
		            	<input type="file" name="reloadFile" class="reloadfile">
		            	<button class="imgbtn">사진변경</button>
	            	</form>
	                <div id="information">
	                    아이디: ${member.id }   <br>
	                    이름: ${member.name } <br>
	                    성별: ${member.gender } <br>
	                    나이: ${member.age } <br>
	                </div>
		                <button class="modifybtn" onClick="showUpdate();">수정하기</button>
		                <button class="deletebtn" onClick="showDelete();">탈퇴하기</button>	                
	            </div>
	            <div id="right-main">
		                <div class="myhire">
		                    <p class="hiretitle">내 공고글</p>
		                    <button class="writebtn" onClick="showInsert();">공고글 작성</button>
		            		<c:forEach var="employ" items="${eList }">
			                    <div class="hirename1">
			                    	<table>
			                    		<tr>
			                    			<th>공고글 제목</th>
			                    			<th>학력</th>
			                    			<th>주소</th>
			                    			<th>공고글 점수</th>
			                    		</tr>
			                    		<tr>
			                    			<td><a href="/employ/detail?employNo=${employ.employNo }"> ${employ.employName } </a></td>
			                    			<td>${employ.education } </td>
			                    			<td>${employ.workplaceAddress }</td>
			                    			<td>${employ.score }</td>
			                    		</tr>
			                    	</table>
			                    </div>
			                    <div class="hireplace1">
			                        <p class="employeeinfo">이 공고에 지원한 알바생</p>
			                        <c:forEach var="em" items="${emList }">
			                        	<c:if test="${employ.employNo eq em.employNo && em.employeeYn eq 'Y' }">
					                        <div class="employeedata">
					                            <a href="/employee/detail?id=${em.employeeId }">${em.employeeName }</a>
					                            <div class="btn">
					                                <button class="chatbtn" onclick="chat('${sessionScope.id}','${em.employeeId }');">채팅하기</button>
					                               	<c:if test="${em.jobStartYn ne 'Y' }">
						                                <button class="ybtn" onclick="startJob('${em.employeeId }','${em.employNo }');">수락</button>
						                                <button class="nbtn" onclick="reject('${em.employeeId }','${em.employNo }');">거절</button>
					                               	</c:if>
					                               	<c:if test="${em.jobStartYn eq 'Y' && em.jobEndYn ne 'Y'}">
					                               		알바중...
					                               		<button onclick="finishJob('${em.employeeId}','${em.employNo}');" class="chatbtn">알바 완료</button>
					                               	</c:if>
					                               	<c:if test="${em.jobEndYn eq 'Y' }">
					                               		알바완료
					                               		<c:forEach var="rm" items="${rmList }">
					                               			<c:if test="${rm.employeeId eq em.employeeId && rm.employNo eq em.employNo}">
					                               				<button onclick="openReviewUpdate('${em.employeeId }','${em.employNo}');" class="chatbtn">리뷰수정</button>
					                               				<input type="hidden" value="${num = num+1 }">
					                               				<div class="update-review" id="update${em.employeeId }${em.employNo}">
					                               					<div class="update-review-body">
					                               						<h2>알바생에게 후기 남기기 - 수정</h2>
					                               						<form action="/review/employee/update" method="post">
													     					<input type="hidden" value="${em.employeeId }" name="employeeId">
													     					<input type="hidden" value="${em.employNo }" name="employNo">
													     					<input type="hidden" value="${sessionScope.id }" name="reviewWriter">
													     					<div class="review-point">
														     					평점: <input type="number" min="0" max="5" name="reviewScore" value="${rm.reviewScore }">     					
													     					</div>
													     					<div class="review-content">
													     						 <h5>좋았던 점과 아쉬웠던 점을 적어주세요.</h5>
													     						<textarea rows="20" cols="50" name="reviewDetail">${rm.reviewDetail }</textarea>
													     					</div>
													     					<button class="chatbtn">후기 작성</button>
													     					<button onclick="backUpdate('${em.employeeId }','${em.employNo}');" type="button" class="chatbtn">뒤로 가기</button>
													     				</form>
					                               					</div>
					                               				</div>
					                               			</c:if>
					                               		</c:forEach>
					                               		<c:if test="${num eq 0 }">
						                               		<button onclick="writeReview('${em.employeeId }','${em.employNo}');" class="chatbtn">리뷰 작성</button>
					                               		</c:if>
					                               		<input type="hidden" value="${num = 0 }">					                               		
					                               		<div class="modal" id="insert${em.employeeId }${em.employNo}">
											     			<div class="modal-body">
											     				<h2>알바생에게 후기 남기기</h2>
											     				<form action="/review/employee" method="post">
											     					<input type="hidden" value="${em.employeeId }" name="employeeId">
											     					<input type="hidden" value="${em.employNo }" name="employNo">
											     					<input type="hidden" value="${sessionScope.id }" name="reviewWriter">
											     					<div class="review-point">
												     					평점: <input type="number" min="0" max="5" name="reviewScore">     					
											     					</div>
											     					<div class="review-content">
											     						좋았던 점과 아쉬웠던 점을 적어주세요.
											     						<textarea rows="20" cols="50" style="border-radius: 10px; margin-top: 20px;" name="reviewDetail"></textarea>
											     					</div>
											     					<button>후기 작성</button>
											     					<button onclick="back('${em.employeeId }','${em.employNo}');" type="button">뒤로 가기</button>
											     				</form>
											     			</div>
											     		</div>
					                               	</c:if>
					                            </div>
					                        </div>		                        
			                        	</c:if>
			                        </c:forEach>
			                    </div>
		            		</c:forEach>
			               	</div>
	                <div class="mypick">
	                    <p class="picktitle">내가 제의한 알바생</p>
		                <div class="pickplace">
		                	<table>
		                		<tr class="tabletitle">
		                			<th>알바생 이름</th>
		                			<th>알바생 ID</th>
		                			<th>공고글 제목</th>
		                			<th>제의 현황</th>
		                		</tr>
			                	<c:forEach var="match" items="${emList }">
			                		<c:if test="${match.employerYn eq 'Y' }">
				                		<tr>
				                			<td >${match.employeeName }</td>
				                			<td>${match.employeeId }</td>
				                			<td>${match.employName }</td>
				                			<td>
				                				<c:if test="${match.employeeYn eq 'Y' }">
				                					제의수락
				                				</c:if>
				                				<c:if test="${match.employeeYn eq 'N' }">
				                					확인중
				                				</c:if>
				                			</td>
				                		</tr>
			                		</c:if>
			                	</c:forEach>                	
		                	</table>
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
    		const showInsert = () => {
    			location.href = "/employ/insert";
    		}
    		const showDelete = () => {
    			location.href="/member/delete"
    		}
    		const startJob = (employeeId, employNo) => {
    			if(confirm("이 알바생을 고용하시겠습니까?")){
    				location.replace("/match/start?employeeId="+employeeId+"&employNo="+employNo);
    			}
    		}
    		const reject = (employeeId, employNo) => {
    			if(confirm("지원을 거절하시겠습니까?")){
    				location.replace("/match/delete?employeeId="+employeeId+"&employNo="+employNo);
    			}
    		}
    		const finishJob = (employeeId, employNo) => {
    			if(confirm("알바를 종료하시겠습니까?")){
    				location.replace("/match/finish?employeeId="+employeeId+"&employNo="+employNo);
    			}
    		}
    		const writeReview = (employeeId, employNo) => {
    			document.querySelector("#insert"+employeeId+employNo).style.display = "flex";
    		}
    		const back = (employeeId, employNo) => {
    			document.querySelector("#insert"+employeeId+employNo).style.display = "none";
    		}
    		const openReviewUpdate = (employeeId, employNo) => {
    			document.querySelector("#update"+employeeId+employNo).style.display = "flex";
    		}
    		const backUpdate = (employeeId, employNo) => {
    			document.querySelector("#update"+employeeId+employNo).style.display = "none";
    		}
    		const chat = (writerId,receiverId) => {
    			location.href = "/chat/chat?writerId="+writerId+"&receiverId="+receiverId;
    		}
    	</script>
    </body>
</html>