<!DOCTYPE html>
<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <link rel="stylesheet" href="../resources/css/reset.css">
		<link rel="stylesheet" href="../resources/css/include/header.css">
		<link rel="stylesheet" href="../resources/css/include/footer.css">
		<link rel="stylesheet" href="../resources/css/manager/reportemployee.css">
	    <title>회원전체조회</title>
    </head>
    <body>
   		<jsp:include page="/WEB-INF/views/include/header.jsp" />
        <div id="main">
            <div class="search">
                <select class="searchbar">
                    <option value="none">전체</option>  
                </select>
                <input class="searchbox" type="text" placeholder="검색 할 회원 정보를 입력하세요.">
                <button class="searchbtn">검색</button>
            </div>
            <div class="searchlist">
                <table class="list">
                    <tr class="listhead">
                        <td>번호</td>
                        <td>아이디</td>
                        <td>이름</td>
                        <td>전화번호</td>
                        <td>이메일</td>
                        <td>주소</td>
                        <td>생년월일</td>
                    </tr>
                    <tr>
                        <td>1</td>
                        <td>user01</td>
                        <td>일용자</td>
                        <td>01012344567</td>
                        <td>user01@user.com </td>
                        <td>서울시 중구 </td>
                        <td>1990.03.03</td>
                    </tr>
                    <tr>
                        <td>2</td>
                        <td>user03</td>
                        <td>이용자</td>
                        <td>01012344567</td>
                        <td>user02@user.com </td>
                        <td>서울시 중구 </td>
                        <td>1990.02.03</td>
                    </tr>
                    <tr>
                        <td>3</td>
                        <td>user03</td>
                        <td>삼용자</td>
                        <td>010122344567</td>
                        <td>user03@user.com </td>
                        <td>서울시 중구 </td>
                        <td>1990.03.04</td>
                    </tr>
                    <tr>
                        <td>4</td>
                        <td>user04</td>
                        <td>사용자</td>
                        <td>01018744567</td>
                        <td>user04@user.com </td>
                        <td>서울시 강남구 </td>
                        <td>1990.12.03</td>
                    </tr>
                    <tr>
                        <td>5</td>
                        <td>user05</td>
                        <td>오용자</td>
                        <td>01012365567</td>
                        <td>user05@user.com </td>
                        <td>서울시 종로구 </td>
                        <td>1990.05.03</td>
                    </tr>
                    <tr>
                        <td>6</td>
                        <td>user06</td>
                        <td>육용자</td>
                        <td>01012344647</td>
                        <td>user01@user.com </td>
                        <td>서울시 중구 </td>
                        <td>1990.03.03</td>
                    </tr>
                    <tr>
                        <td>7</td>
                        <td>user07</td>
                        <td>칠용자</td>
                        <td>01019844567</td>
                        <td>user07@user.com </td>
                        <td>서울시 중구 </td>
                        <td>1996.12.03</td>
                    </tr>
                    <tr>
                        <td>8</td>
                        <td>user08</td>
                        <td>팔용자</td>
                        <td>01012344567</td>
                        <td>user08@user.com </td>
                        <td>서울시 중구 </td>
                        <td>1990.07.03</td>
                    </tr>
                    <tr>
                        <td>9</td>
                        <td>user09</td>
                        <td>구용자</td>
                        <td>01075644567</td>
                        <td>user09@user.com </td>
                        <td>서울시 용산구 </td>
                        <td>1943.08.03</td>
                    </tr>
                </table>
            </div>
            <div class="page">
                <ul class="pagination">
                    <li><a href="#" class="back">이전</a></li>
                    <li><a href="#" class="num">1</a></li>
                    <li><a href="#" class="num">2</a></li>
                    <li><a href="#" class="num">3</a></li>
                    <li><a href="#" class="num">4</a></li>
                    <li><a href="#" class="num">5</a></li>
                    <li><a href="#" class="next">다음</a></li>
                </ul>
            </div>
        </div>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </body>   
</html>