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
		      	  <div id="msgTag" style="color: red;"></div>
		      
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
		        <input type="text" id="id" name="id" placeholder="아이디를 입력해주세요" required>
		      </div>
		      <label class="required">이름</label>
		      <div class="form-group">
		        <input type="text" id="name" name="name" placeholder="이름을 입력해주세요" required>
		      </div>
		      <label class="required">비밀번호</label> 
		      <div class="form-group">
		        <input type="password" id="pw" name="pw" placeholder="8~20자리 영문/숫자 조합" required>
		      </div>
		      <label class="required" >비밀번호 재입력</label> 
		      <div class="form-group">
		        <input type="password" id="pw-re" placeholder="비밀번호를 재입력 해주세요" required>
		      </div>
		      <label class="required">전화번호</label>
		      <div class="form-group">
		        <input type="text" id="phone"  name="phone" placeholder="전화번호를 입력해주세요" required>
		      </div>
		      <label class="required">이메일</label>
		      <div class="form-group">
		        <input type="text" id="email" name="email" placeholder="이메일을 입력해주세요" required>
		      </div>
		      <label class="required">생년월일</label>
		      <div class="form-group">
		        <input type="date" name="birth" required>
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
	const registerBtn = document.querySelector(".register-btn");
	registerBtn.addEventListener("click", function () {
		const id = document.querySelector("#id");
		const name = document.querySelector("#name");
		const pw = document.querySelector("#pw");
		const pwRe = document.querySelector("#pw-re");
		const phone = document.querySelector("#phone");
		const email = document.querySelector("#email");
		const msgTag = document.querySelector("#msgTag"); // 오류 메시지 출력용
		const idExp = /^[a-z][a-z0-9]{4,11}$/;
		const nameExp = /^[가-힣]+$/;
		const pwExp = /[a-zA-Z0-9]{8,20}/;
		const pwReExp = /[a-zA-Z0-9]{8,20}$/;
		const phoneExp = /^010\d{8}$/;
		const emailExp = /^[a-zA-Z0-9._%+-]{4,12}@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
		
		if(!idExp.test(id.value.trim())){
			msgTag.innerText = "아이디는 소문자로 시작하고, 영어 소문자와 숫자로 4~12자리여야합니다."
			event.preventDefault();
		}		
		if(!nameExp.test(name.value.trim())){
			msgTag.innerText = "이름은 한글만 가능합니다."
			event.preventDefault();
		}
		if(!pwExp.test(pw.value.trim())){
			msgTag.innerText = "비밀번호는 영어소문자,대문자,숫자만 입력 가능해야 하고 8~20자리여야 합니다"
			event.preventDefault();
		}
		if(pw.value.trim() !== pwRe.value.trim()){
			msgTag.innerText = "같은 값을 입력해주세요."
			event.preventDefault();
		}
		if(!phoneExp.test(phone.value.trim())){
			msgTag.innerText = "010으로 시작하고 11자리여야 합니다."
			event.preventDefault();
		}
		if(!emailExp.test(email.value.trim())){
			msgTag.innerText = "이메일 형식이 올바르지 않습니다."
			event.preventDefault();
		}
	})
	</script>
</body>
</html> 