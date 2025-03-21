<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   	<link rel="stylesheet" href="../resources/css/reset.css">
	<link rel="stylesheet" href="../resources/css/include/header.css">
	<link rel="stylesheet" href="../resources/css/include/footer.css">
	<link rel="stylesheet" href="../resources/css/employ/search.css">
    <title>알바 - 검색</title>
</head>
<body>
    <div id="container">
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
        <main>
            <div class="container">
                <div class="location">
                    <div class="location-l">지역별</div>
                    <table>
                        <tr>
                            <td>
                            	<label for="seoul">서울</label>
                            	<input type="checkbox" id="seoul">
                            </td>
                            <td>경기</td>
                            <td>인천</td>
                            <td>강원</td>
                            <td>대전</td>
                            <td>대구</td>
                        </tr>
                        <tr>
                            <td>부산</td>
                            <td>울산</td>
                            <td>경남</td>
                            <td>경북</td>
                            <td>전남</td>
                            <td>전북</td>
                        </tr>
                        <tr>
                            <td>충남</td>
                            <td>충북</td>
                            <td>제주</td>
                        </tr>
                    </table>
                    <div class="money-t">급여별</div>
                    <div class="money-b">시급 일급 월급 연봉</div>
                     <div class="input">
                        <input type="text" placeholder="입력해주세요."> 원
                     </div>
                </div>
                <div class="term">
                    <div class="term-t">기간별</div>
                    <table>
                        <tr>
                            <td>일주일 미만</td> 
                        </tr>
                        <tr>
                            <td>1개월 미만</td> 
                        </tr>
                        <tr>
                            <td>1개월 ~ 3개월</td> 
                        </tr>
                        <tr>
                            <td>3개월 ~ 6개월</td> 
                        </tr>
                        <tr>
                            <td>6개월 ~ 1년</td>
                        </tr>
                        <tr>
                            <td>1년이상</td>
                        </tr>
                    </table>
                </div>   
                <div class="type">
                    <div class="type-t">직종별</div>
                    <table>
                        <tr>
                            <td>외식·음료</td>
                        </tr>
                        <tr>
                            <td>매장관리·판매</td>
                        </tr>
                        <tr>
                            <td>서비스</td>
                        </tr>
                        <tr>
                            <td>사무직</td>
                        </tr>
                        <tr>
                            <td>고객상담·리서치·영업</td>
                        </tr>
                        <tr>
                            <td>생산·건설·노무</td>
                        </tr>
                        <tr>
                            <td>IT·기술</td>
                        </tr>
                        <tr>
                            <td>교육·강사</td>
                        </tr>
                        <tr>
                            <td>운전·배달</td>
                        </tr>
                        <tr>
                            <td>사무·회계</td>
                        </tr>
                        <tr>
                            <td>미디어</td>
                        </tr>
                        <tr>
                            <td>유통</td>
                        </tr>
                        <tr>
                            <td>문화·여가</td>
                        </tr>
                        <tr>
                            <td>병원·간호·연구</td>
                        </tr>
                            <td>요식업</td> 
                        </tr>
                    </table>
                </div>    
                <div class="days">
                    <div class="day">근무 요일</div>
                    <table>
                        <tr>
                            <td>평일(월~금)</td>
                        </tr>
                        <tr>
                            <td>주말(토,일)</td>
                        </tr>
                        <tr>
                            <td>월</td>
                        </tr>
                        <tr>
                            <td>화</td>
                        </tr>
                        <tr>
                            <td>수</td>
                        </tr>
                        <tr>
                            <td>목</td>
                        </tr>
                        <tr>
                            <td>금</td>
                        </tr>
                        <tr>
                            <td>토</td>
                        </tr>
                        <tr>
                            <td>일</td>
                        </tr>
                        <tr>
                            <td>요일 협의</td>
                        </tr>
                    </table>
                </div>
            </div>
            <div class="btn">
                <button>초기화</button>
                <button>검색하기</button>
            </div>
        </main>
        <jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </div>
</body>
</html>