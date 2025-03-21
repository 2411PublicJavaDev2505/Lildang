<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="../resources/css/reset.css">
			<link rel="stylesheet" href="../resources/css/include/header.css">
			<link rel="stylesheet" href="../resources/css/include/footer.css">
			<link rel="stylesheet" href="../resources/css/member/boss/detail.css">
        <title>Mypage - boss</title>
    </head>
    <body>
     	<div class="container">
     	<jsp:include page="/WEB-INF/views/include/header.jsp" />
    	<main>
        <h1>마이페이지</h1>
        <div id="container">
            <div id="left-main">
                <img src="../resources/image/profile.jpg" alt="profile"> <br>
                <button class="imgbtn">사진변경</button>
                <div id="information">
                    아이디: ${member.id }   <br>
                    이름: ${member.name } <br>
                    성별: ${member.gender } <br>
                    나이: ${member.age } <br>
                    평점: 3.5/5.0
                </div>
                <button class="modifybtn" onClick="showUpdate();">수정하기</button>
                <button class="deletebtn" onClick="showDelete();">탈퇴하기</button>
            </div>
            <div id="right-main">
	                <div class="myhire">
	                    <p class="hiretitle">내 공고글</p>
	                    <button class="writebtn" onClick="showInsert();">공고글 작성</button>
	            		<c:forEach var="employ" items="${eList }">
		                    <div class="hirename1">
		                       <a href="#"> ${employ.employName } </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                        ${employ.education }            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                        ${employ.workplaceAddress }          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                        ${employ.workingEndTime }           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		                    </div>
		                    <div class="hireplace1">
		                        <p class="employeeinfo">이 공고에 지원한 알바생</p>
		                        <div class="employeedata">
		                            황수만 1.0/5.0
		                            <div class="btn">
		                                <button class="chatbtn">채팅하기</button>
		                                <button class="ybtn">수락</button>
		                                <button class="nbtn">거절</button>
		                            </div>
		                        </div>
		                        <div class="employeedata">
		                            박재준 5.0/5.0
		                            <div class="btn">
		                                <button class="chatbtn">채팅하기</button>
		                                <button class="ybtn">수락</button>
		                                <button class="nbtn">거절</button>
		                            </div>
		                        </div>
		                        <div class="employeedata">
		                            박재일 3.0/5.0
		                            <div class="btn">
		                                <button class="chatbtn">채팅하기</button>
		                                <button class="ybtn">수락</button>
		                                <button class="nbtn">거절</button>
		                            </div>
		                        </div>   
		                    </div>
	            		</c:forEach>
		               	</div>
                <div class="mypick">
                    <p class="picktitle">내가 찜한 알바생</p>
                <div class="pickplace">내가 찜한 알바생이 없어요...ㅠㅠ</div>
                </div>
                <div class="mypick">
                    <p class="picktitle">내가 제의한 알바생</p>
                <div class="pickplace">
                    최제우                                      &nbsp;&nbsp;&nbsp;&nbsp;
                    zeus12                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    KH정보교육원 종로지원 자바개발자 모집(급구!!!)  &nbsp;&nbsp;&nbsp;&nbsp;
                    확인중                                      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                </div>
                </div>
            </div>
        </div>
    	</main>
    			<jsp:include page="/WEB-INF/views/include/footer.jsp" />
    	
    	</div>
    	<script type="text/javascript">
    		const showUpdate = () => {
    			location.href = "/member/update"
    		}
    		const showInsert = () => {
    			location.href = "/employ/insert";
    		}
    		const showDelete = () => {
    			location.href="/member/delete"
    		}
    	</script>
    </body>
</html>