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
			<link rel="stylesheet" href="../resources/css/member/cv/cv.css">
    
    <title>이력서 작성</title>
</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/include/header.jsp" />
	    <main>
	    	<form action="">
	    	
	    	</form>
	        <div class="cv-container">
	            <div class="sidebar">
				    <div class="profile-image">
				    	<div class="profile-img"></div>
				    	<div class="img-input">
				         <input type="file">
				    	</div>
				    </div>
				    <div class="profile-name">
				    	<p> <b>최제우</b></p>
				    </div>
				    <div class="introduce">
				      <textarea rows="3" cols="30" placeholder="지원자를 소개 할 수 있는 짧은 글을 적어주세요."></textarea>
				    </div>
					<div id="profile-contact">CONTACT</div>
					<div class="profile-contact">
						<p>
					     - 이름 : 최제우 <br> <br>               
					     - 생년월일 : 1998-12-22 <br><br> 
					     - 전화 :  010-9809-2725 <br><br> 
					     - Mail : skskskxhxh@naver.com <br><br> 
						</p>
					</div>
				    <div class="profile-education">주요 학력사항</div>
			        <div class="profile-education-school">
			            <input type="text" placeholder="OO대학교 OO학과">
			        </div>
		            <input type="text" placeholder="OOOO년 O월 ~ OOOO년 O월" class="edu-input">
			        <div class="profile-education-school">
			            <input type="text" placeholder="OO고등학교">
			        </div>
		            <input type="text" placeholder="OOOO년 O월 ~ OOOO년 O월" class="edu-input">
	            </div>
	            <div class="content-area">
	                <div class="title-container">
	                    <div class="job-title">희망직종</div>
	                    <div class="job-option">
	                        <label><input type="checkbox">외식·음료</label>
	                        <label><input type="checkbox">매장관리·판매</label>
	                        <label><input type="checkbox">서비스</label>
	                        <label><input type="checkbox">사무직</label>
	                        <label><input type="checkbox">고객상담·리서치·영업</label>
	                        <label><input type="checkbox">생산·건설·노무</label>
	                        <label><input type="checkbox">IT·기술</label>
	                        <label><input type="checkbox">디자인</label>
	                    </div>
	                </div>
	                <div id="job-career">
	                	<div>
	                	
	                	</div>
	                    <div class="job-career">주요 경력사항</div>
	                    <div class="table-btn"> 
	                        <button>+</button>
	                    </div>
	                    <table>
	                        <tr>
	                            <td>회사명</td>
	                            <td>근무기간</td>
	                            <td>직책</td>
	                            <td>담당업무</td>
	                        </tr>
	                    </table>
	                </div>
	                <div id="job-license">
	                    <div class="job-license">주요 자격증</div>
	                    <div class="table-btn">
	                        <button>+</button>
	                    </div>
	                    <table>
	                        <tr>
	                            <td>발급기관</td>
	                            <td>자격증명</td>
	                            <td>취득일자</td>
	                        </tr>
	                    </table>
	                </div>
	                <div id="job-introduce">
	                    <div class="job-introduce">자기소개서</div>
	                    <textarea name="introduce" rows="10" cols="40"></textarea>
	                </div>
	                <div class="btn">
	                    <button>작성완료</button>
	                    <button>돌아가기</button>
	                </div>
	            </div>
	        </div>
	    </main>
	    <jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
</body>
</html>