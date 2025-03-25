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
	<link rel="stylesheet" href="../resources/css/member/common/register.css">
	<title>회원가입</title>
</head>
<body>
	<div id="container">
	<jsp:include page="/WEB-INF/views/include/header.jsp" />
	  <main>
	  	<div class="form-container">
		    <form action="/member/register" method="post">
		      <div class="top-header">
		        <img src="../resources/image/로고.png" alt="image">
		        <h2>일당해라</h2>
		      </div>
		      <h1>회원가입</h1>
		      <div class="checkbox">
		        <label>
		          <input type="radio" value="employer" name="role">사장님
		        </label>
		        <label>
		          <input type="radio" value="employee" name="role" checked>알바생
		        </label>
		      </div>
		      <label class="required">아이디</label>
		      <div class="form-group">
		        <input type="text" name="id" placeholder="아이디를 입력해주세요">
		      </div>
		      <label class="required">이름</label>
		      <div class="form-group">
		        <input type="text" name="name" placeholder="이름을 입력해주세요">
		      </div>
		      <label class="required">비밀번호</label> 
		      <div class="form-group">
		        <input type="password" class="pw" name="pw" placeholder="8~20자리 영문/숫자/특수문자 조합">
		      </div>
		      <label class="required">비밀번호 재입력</label> 
		      <div class="form-group">
		        <input type="password" class="pwRe" placeholder="비밀번호를 재입력 해주세요">
		      </div>
		      <label class="required">전화번호</label>
		      <div class="form-group">
		        <input type="text" name="phone" placeholder="전화번호를 입력해주세요">
		      </div>
		      <label class="required">이메일</label>
		      <div class="form-group">
		        <input type="text" name="email" placeholder="이메일을 입력해주세요">
		      </div>
		      <label class="required">생년월일</label>
		      <div class="form-group">
		        <input type="date" name="birth">
		      </div>
		      <div class="radio-group">
		      	<input type="radio" name="gender" value="M" checked>남
		      	<input type="radio" name="gender" value="F">여
		      </div>
		      <div>
		        <button type="submit" class="register-btn">회원가입</button>
		      </div>
		    </form>	  	
	  	</div>
	  </main>
	  <jsp:include page="/WEB-INF/views/include/footer.jsp" />
	</div>
	<script type="text/javascript">
		
	</script>
</body>
</html> 