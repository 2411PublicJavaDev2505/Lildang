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
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
		<div id="main">
            <div class="reportemp">
                <h1>공고 게시글</h1>
                <table class="emp">
                    <tr>
                        <td class="empinf">공고글 번호</td>
                        <td class="empdata">123</td>
                    </tr>
                    <tr>
                        <td class="empinf">작성자</td>
                        <td class="empdata">SAJANG01</td>
                    </tr>
                    <tr>
                        <td class="empinf">작성 날짜</td>
                        <td class="empdata">25-03-12</td>
                    </tr>
                    <tr>
                        <td class="empinf">제목</td>
                        <td class="empdata">급구알바구함(여자만 우대)</td>
                    </tr>
                </table>
                <div class="empbtn">
                    <button>신고무시</button>
                    <button>신고글 삭제</button>
                </div>
            </div>
            <div class="reportinfo">
                <h1>신고내용</h1>
                <table class="info">
                    <tr>
                        <td class="datainf">공고글 번호</td>
                        <td class="bossdata">123</td>
                    </tr>
                    <tr>
                        <td class="datainf">작성자</td>
                        <td class="bossdata">ALBA01</td>
                    </tr>
                    <tr>
                        <td class="datainf">신고날짜</td>
                        <td class="bossdata">25-03-13</td>
                    </tr>
                    <tr>
                        <td class="datainf">내용</td>
                        <td class="bossdata">여잔데 못생겼다고 우대를 안해주네요 ㅜㅜ</td>
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