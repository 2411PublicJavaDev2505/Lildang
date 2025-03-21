<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="../resources/css/reset.css">
			<link rel="stylesheet" href="../resources/css/header.css">
			<link rel="stylesheet" href="../resources/css/footer.css">
			<link rel="stylesheet" href="../resources/css/member/employee/detail.css">
        <title>Mypage - employee</title>
    </head>
    <body>
    <div class="container">
    <jsp:include page="/WEB-INF/views/include/header.jsp" />
    	<main>
	        <h1>마이페이지</h1>
	        <div id="container">
	            <div id="left-main">
	                <img src="./img/profile.png" alt="profile"> <br>
	                <button class="imgbtn">사진변경</button>
	                <div id="information">
	                    아이디: Ola<br>
	                    이름: 이용자 <br>
	                    성별: 여성 <br>
	                    나이: 25 <br>
	                    평점: 4.5/5.0
	                </div>
	                <button class="modifybtn">수정하기</button>
	                <button class="deletebtn" onClick="showDelete();">탈퇴하기</button>
	            </div>
	            <div id="right-main">
	                <div class="mycv">
	                    <p class="cvtitle">내 이력서</p>
	                    <button class="cvbtn1">이력서 작성</button>
	                    <button class="cvbtn">이력서 수정</button>
	                    <button class="cvbtn">이력서 삭제</button>
	                    <div class="cvplace">이력서를 작성해주세요...ㅠㅠ</div>
	                </div>
	                <div class="myscout">
	                    <p class="scouttitle">나에게 온 제의</p>
	                    <div class="scoutplace">나에게 온 제의가 없어요...ㅠㅠ</div>
	                </div>
	                <div class="mywork">
	                    <p class="worktitle">내가 일했던 곳</p>
	                    <button class="reviewbtn">후기 작성</button>
	                    <div class="workplace">
	                        일당해라 개발자팀&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                        6개월&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                        24. 11. 05 ~ 25. 05. 02&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                        일당함
	                        컴백현 개발자팀&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                        -&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                        24. 11. 05 ~ &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;- &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	                        일당중
	                    </div>
	                </div>
	                
	                <div class="mypick">
	                    <p class="picktitle">내가 찜한 공고글</p>
	                <div class="pickplace">내가 찜한 공고글이 없어요...ㅠㅠ</div>
	                </div>
	            </div>
	        </div>
    	</main>
    	<jsp:include page="/WEB-INF/views/include/footer.jsp" />
    </div>
    <script type="text/javascript">
    	const showDelete = () => {
    		location.href = "/member/delete"
    	}
    </script>
    </body>
</html>

h