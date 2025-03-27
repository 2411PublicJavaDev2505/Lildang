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
	<link rel="stylesheet" href="../resources/css/employ/detail.css">
	<link rel="stylesheet" href="../resources/css/common/breport.css">
	<title>일당해라-구인글 상세</title>
</head>
<body>
	<div id="container">
	<div class="report">
		<div class= "report-body">
			<div class="head">
				<h1>사장님 신고하기</h1>						
			</div>
			<div class="report-menu">
			<form action="/report/binsert" method="post">
				<input type="hidden" name="reportEmployNo" value="${result.employNo}">
				<input type="hidden" name="reportWriterId" value="${sessionScope.id }">
				<div class="report-content">
					<input type="text" placeholder="사유를 입력해주세요" name='reportReason'> 
				</div>
				<div class="report-area">
					<textarea rows="20" cols="30" placeholder="상세한 내용을 적어주세요." name="reportDetail"></textarea>
				</div>
				<div class="report-btn">
					<button>신고하기</button>
					<button type="button" onclick="reportBackToPage();">뒤로가기</button>												
				</div>
			</form>
			</div>
		</div>
	</div>
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		<main>
			<div class="main-container">
				<div class="first">
					<div class="first-top">
						<div class="first-top-left">
							<p>${result.workplaceName }</p>
							<h2>${result.employName }</h2>
							<div class="tag">
								<div class="tag-content">${result.jobNo }</div>			
								<div class="tag-content">장기 근무</div>			
								<div class="tag-content">${result.workplaceAddress }</div>										
							</div>
						</div>
						<div class="first-top-right">
							<c:if test="${result.employFilePath eq null }">
								<img alt="구인글 사진" src="../resources/image/로고.png">
							</c:if>
							<c:if test="${result.employFilePath ne null }">
								<img alt="구인글 사진" src="..${result.employFilePath }">				
							</c:if>
						</div>
					</div>
					<div class="first-bottom">
						<div class="first-bottom-content"> <p><b>시급:</b> ${result.salary }</p> </div>
						<div class="first-bottom-content"> <p><b>기간:</b> ${result.workingPeriod } </p></div>
						<div class="first-bottom-content"> <p><b>요일:</b> ${result.workingDay }</p></div>
						<div class="first-bottom-content"> <p><b>시간:</b> ${result.workingStartTime }${result.workingEndTime }</p></div>
					</div>
				</div>
				<div class="second">
					<div class="second-content">
						<h4>모집조건</h4>
						<p>
							<b>모집기간:</b> ${result.recruitStartDate }${result.recruitEndDate } <br>
							<b>모집인원:</b> ${result.recruitNumber } <br>
							<b>학력:</b> ${result.education }
						</p>
					</div>
					<div class="second-content">
						<h4>근무지 정보</h4>
						<p>
							<b>${result.workplaceAddress }</b><br>
							<b>근무지명:</b> ${result.workplaceName }
						</p>
					</div>
				</div>
				<div class="third">
					<img alt="지도" src="../resources/image/로고.png">
				</div>
				<div class="fourth">
					<h4>근무조건</h4>
					<div class="fourth-content">
						<div class="fourth-left">
							<p>
								<b>급여:</b> ${result.salary } <br>
								<b>근무기간:</b> ${result.workingPeriod } <br>
								<b>근무시간:</b> ${result.workingStartTime }${result.workingEndTime }
							</p>
						</div>
						<div class="fourth-right">
							<p>
								<b>모집직종:</b> ${result.jobNo } <br>
								<b>근무요일:</b> ${result.workingDay }
							</p>
						</div>
					</div>
				</div>
				<div class="fifth">
					<h4>업체 평점/후기</h4>
					<div class="fifth-content">
						<p><b>평균평점:</b> ${result.score }/5</p>
						<div class="review">
							<c:forEach var="r" items="${rList }">
								<div class="review-content">
									<p><b>${r.id }:</b>  ${r.reviewDetail }</p>
									<p> 평점 : ${r.reviewScore }</p>
								</div>
							</c:forEach>
						</div>
					</div>
				</div>
				<div class="sixth">
					<h4>상세모집내용</h4>
					<div class="sixth-content">
						<p>
							${result.employDetail }
						</p>
					</div>
				</div>
				<div class="seventh">
					<c:if test="${sessionScope.id ne null && result.writerId ne sessionScope.id }">
						<button class="left-btn" onclick="showReport();">신고하기</button>
					</c:if>
					<div class="btn">
						<c:if test="${sessionScope.id ne null }">
							<c:if test="${result.writerId eq sessionScope.id }">
								<button class="center-btn" onclick="deleteEmploy('${result.employNo}');">삭제하기</button>
								<button class="center-btn" onclick="updateEmploy('${result.employNo}');">수정하기</button>												
							</c:if>
							<c:if test="${result.writerId ne sessionScope.id }">
								<button class="center-btn" onclick="chat('${sessionScope.id}','${result.employNo }');">채팅하기</button>						
							</c:if>
							<c:if test="${sessionScope.role eq 'EMPLOYEE' }">
								<button class="center-btn" onclick="apply('${result.employNo}');">지원하기</button>												
							</c:if>
						</c:if>
					</div>
					<div>
						<button class="right-btn" onclick="location.href='/employ/list'">목록으로</button>
					</div>
				</div>
			</div>
		</main>
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
	<script>
		const showReport = () => {
			console.log("확인")
			document.querySelector(".report").style.display = "flex";
		}
		const reportBackToPage = () => {
			document.querySelector(".report").style.display = "none";
		}
		const deleteEmploy = (employNo) => {
			if(confirm("정말 삭제하시겠습니까?")){
				location.replace("/employ/delete?employNo="+employNo);
			}
		}
		const updateEmploy = (employNo) => {
			if(confirm("정말 수정하시겠습니까?")){
				location.replace("/employ/update?employNo="+employNo);
			}
		}
		const apply = (employNo) => {
			location.href = "/match/apply?employNo="+employNo;
		}
		const chat = (id, employNo) => {
			location.href = "/chat/toboss?writerId="+id+"&employNo="+employNo;	
		}
	</script>
</body>
</html>