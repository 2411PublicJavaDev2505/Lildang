<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		        <div id="main">
            <div class="reportemp">
                <h1>신고당한 알바생</h1>
                <table class="emp">
                    <tr>
                        <td class="empinf">아이디</td>
                        <td class="empdata">ALBA02</td>
                    </tr>
                    <tr>
                        <td class="empinf">이름</td>
                        <td class="empdata">이용자</td>
                    </tr>
                </table>
                <div class="empbtn">
                    <button>신고삭제</button>
                    <button>회원정지</button>
                </div>
            </div>
            <div class="reportboss">
                <h1>신고자</h1>
                <table class="boss">
                    <tr>
                        <td class="bossinf">아이디</td>
                        <td class="bossdata">SAJANG02</td>
                    </tr>
                    <tr>
                        <td class="bossinf">이름</td>
                        <td class="bossdata">사장님</td>
                    </tr>
                    <tr>
                        <td class="bossinf">신고내용</td>
                        <td class="bossdata">알바생이 저희가게 욕을 엄청하네요...</td>
                    </tr>
                </table>
                <div class="bossbtn">
                    <button>목록으로</button>
                </div>
            </div>
        </div>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</body>
</html>