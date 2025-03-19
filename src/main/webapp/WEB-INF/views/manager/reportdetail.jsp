<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
    <link rel="stylesheet" href="../resources/css/reset.css">
	<link rel="stylesheet" href="../resources/css/header.css">
	<link rel="stylesheet" href="../resources/css/footer.css">
	<link rel="stylesheet" href="../resources/css/manager/reportdetail.css">
<title>관리자-신고조회</title>
</head>
<body>
    <div id="container">
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
    <main>
        <h1>신고 게시글 관리</h1>
    <div>
		<table>
            <tr>
                <td class="name1">검색어</td>
                    <td class="name2">
	                    <select name="" id="">
	                        <option value="">전체</option>
	                        <option value="">신고내용</option>
	                        <option value="">신고자</option>
	                    </select>
                    </td>
                </tr>
                <tr>
                    <td class="name1">날짜</td>
                        <td class="name2">
                        <select name="" id="">
                            <option value="">접수일</option>
                            <option value="">처리일</option>
                            <input type="date">~ <input type="date">
                        </select>
                    </td>
                </tr>
                    <td class="name1">구분</td>
                    <td class="name2">
                        <label><input type="radio" name="check">전체</label>
                        <label><input type="radio" name="check" >처리</label>
                        <label><input type="radio" name="check">미처리</label>
                    </td>
		</table>
                <div>
                    <button type="submit">검색하기</button>
                    <button type="reset">초기화</button>
                </div>
            </div>
    	</main>
    	<jsp:include page="/WEB-INF/views/include/footer.jsp" />
    	</div>
	</body>
</html>