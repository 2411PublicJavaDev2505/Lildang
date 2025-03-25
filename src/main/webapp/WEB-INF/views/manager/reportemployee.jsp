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
	<link rel="stylesheet" href="../resources/css/manager/reportemployee.css">
	<title>알바생 신고</title>
	</head>
	<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		        <div id="main">
            <div class="reportemp">
                <h1>신고당한 알바생</h1>
                <table class="emp">
                    <tr>
                        <!-- 3/24일 11:40수정시작!했는데다시 돌려놓음! -->
                        <td class="empinf">아이디</td>
                        <td class="empdata">${report.reportEmployeeId }</td>
                    </tr>
                    <tr>
                        <td class="empinf">이름</td>
                        <td class="empdata">알바생</td>
                    </tr>
                </table>
                <div class="empbtn">
                    <button onClick="showDelete(${report.reportNo});">신고삭제</button>
                    <button onClick="showDeleteE('${report.reportEmployeeId}');">회원삭제</button>
                </div>
            </div>
            <div class="reportboss">
                <h1>신고자</h1>
                <table class="boss">
               		 <tr>
                        <td class="bossinf">신고번호</td>
                        <td class="bossdata">${report.reportNo }</td>
                    </tr>
                    <tr>
                        <td class="bossinf">아이디</td>
                        <td class="bossdata">${report.reportWriterId }</td>
                    </tr>
                    <tr>
                        <td class="bossinf">이름</td>
                        <td class="bossdata">사장님</td>
                    </tr>
                    <tr>
                        <td class="bossinf">신고내용</td>
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
			const result = confirm("정말로 삭제하시겠습니까?");
			if(result) {
				location.replace("/report/reportdel?reportNo="+reportNo);
			}
		}
		function showDeleteE(id) {
			const result = confirm("회원을 삭제하시겠습니까?");
			console.log("삭제 요청된 회원 ID:", id); // 값 확인용
			if(result) {
				location.replace("/report/reportdele?id="+id);
			}
		}
	</script>
	</body>
</html>