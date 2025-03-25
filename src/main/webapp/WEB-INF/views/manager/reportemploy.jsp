<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<link rel="stylesheet" href="../resources/css/reset.css">
	<link rel="stylesheet" href="../resources/css/include/header.css">
	<link rel="stylesheet" href="../resources/css/include/footer.css">
	<link rel="stylesheet" href="../resources/css/manager/reportemploy.css">
	<title>게시글 신고</title>
	</head>
	<body>
	<div id="container">
			<jsp:include page="/WEB-INF/views/include/header.jsp" />
			<div id="main">
	            <div class="reportemp">
	                <h1>공고 게시글</h1>
	                <table class="emp">
	                    <tr>
	                        <td class="empinf">공고글 번호</td>
	                        <td class="empdata">${employ.employNo }</td>
	                    </tr>
	                    <tr>
	                        <td class="empinf">작성자</td>
	                        <td class="empdata">${employ.writerId }</td>
	                    </tr>
	                    <tr>
	                        <td class="empinf">작성 날짜</td>
	                        <td class="empdata">${report.reportDate }</td>
	                    </tr>
	                    <tr>
	                        <td class="empinf">제목</td>
	                        <td class="empdata">${employ.employName }</td>
	                    </tr>
	                </table>
	                <div class="empbtn">
	                    <button onClick="showDeleteB(${employ.employNo});">공고글 삭제</button>
	                    <button onClick="showDelete(${report.reportNo});">신고글 삭제</button>
	                </div>
	            </div>
	            <div class="reportinfo">
	                <h1>신고내용</h1>
	                <table class="info">
	                    <tr>
	                        <td class="datainf">신고 번호</td>
	                        <td class="bossdata">${report.reportNo }</td>
	                    </tr>
	                    <tr>
	                        <td class="datainf">신고자</td>
	                        <td class="bossdata">${report.reportWriterId }</td>
	                    </tr>
	                    <tr>
	                        <td class="datainf">신고날짜</td>
	                        <td class="bossdata">${report.reportDate }</td>
	                    </tr>
	                    <tr>
	                        <td class="datainf">내용</td>
	                        <td class="bossdata">${report.reportDetail }</td>
	                    </tr>
	                </table>
	                <div class="bossbtn">
	                    <button onClick="backToPage();">목록으로</button>
	                </div>
	            </div>
	        </div>
	        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
	
	</div>
        <script type="text/javascript">
        const backToPage = () => {
			location.href = "/manager/reportlist"
		}
        function showDelete(reportNo) {
        	const result = confirm("신고글을 정말로 삭제하시겠습니까?");
			if(result){
				location.replace("/report/reportdel?reportNo="+reportNo);
			}
		}
        function showDeleteB(employNo) {
			const result = confirm("공고글을 정말로 삭제하시겠습니까?");
			if(result){
				location.replace("/report/reportdelb?employNo="+employNo);
			}
		}
        </script>
	</body>
</html>