<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../resources/css/reset.css">
	<link rel="stylesheet" href="../resources/css/header.css">
	<link rel="stylesheet" href="../resources/css/footer.css">
	<link rel="stylesheet" href="../resources/css/manager/memberlist.css">
    <title>회원전체조회</title>
</head>
<body>
	<div class="container">
	<jsp:include page="/WEB-INF/views/include/header.jsp" />
	<main>
	    <h1>전체회원조회</h1>
	    <tr>
	        <td colspan="4" align="center">
	            <form action="" method="">
	                <select name="" id="">
	                    <option value="">전체</option>
	                    <option value="">아이디</option>
	                    <option value="">이름</option>
	                    <option value="">전화번호</option>
	                </select>
	                <input type="text" placeholder="검색 할 회원 정보를 입력하세요.">
	                <input type="submit" value="검색">
	            </form>
	        </td>
	    </tr>
	    <table>
	        <tr>
	            <th>번호</th>
	            <th>아이디</th>
	            <th>이름</th>
	            <th>전화번호</th>
	            <th>이메일</th>
	            <th>주소</th>
	            <th>생년월일</th>
	        </tr>
	        <tr>
	            <td>1</td>
	            <td>user1</td>
	            <td>일용자</td>
	            <td>01012345678</td>
	            <td>user01@user.com</td>
	            <td>서울시 중구</td>
	            <td>1990-03-03</td>
	        </tr>
	        <tr>
	            <td>2</td>
	            <td>user2</td>
	            <td>이용자</td>
	            <td>01012345678</td>
	            <td>user01@user.com</td>
	            <td>서울시 중구</td>
	            <td>1990-03-03</td>
	        </tr>
	        <tr>
	            <td colspan="4" align="center">
	                <a href="#">이전</a>
	                <a href="#">1</a>
	                <a href="#">2</a>
	                <a href="#">3</a>
	                <a href="#">4</a>
	                <a href="#">5</a>
	                <a href="#">다음</a>
	            </td>
	        </tr>
	    </table>
	</main>
		<jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
>>>>>>> refs/remotes/origin/master
</html>