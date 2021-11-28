<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- label for = "요소 id" -->
	<%@include file="header.jsp"%>
	<br> <br> <br> <br> <br> <br><br><br><br>
	<div class = "container">
		<div class="row">
			<div class="col-lg-4"></div>
			<form>
				<div>회원 정보를 입력해 주세요</div>
				<br>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputEmail4">아이디</label> <input type="email"
							class="form-control" id="inputEmail4" placeholder="Email">
					</div>
					<div class="form-group col-md-6">
						<label for="inputPassword4">패스워드</label> <input type="password"
							class="form-control" id="inputPassword4" placeholder="Password">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword4">패스워드 확인</label> <input type="password"
						class="form-control" id="inputPassword4" placeholder="Password">
				</div>
				<div class="form-group">
					<label for="inputEmail4">이메일</label> <input type="email"
						class="form-control" id="inputEmail4" placeholder="Email">
				</div>
				<div class="form-group">
					<label for="inputEmail4">이름</label> <input type="email"
						class="form-control" id="inputEmail4" placeholder="이름">
				</div>
				<div class="form-group">
					<label for="inputEmail4">전화번호</label> <input type="email"
						class="form-control" id="inputEmail4" placeholder="휴대폰 번호">
				</div>
				<hr class = "login_serparator"> <!-- hr태그를 사용하여 수평선 그리기 -->
				<!-- 임시 박스  -->
				<div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios"
							id="gridRadios1" value="option1" checked> <label
							class="form-check-label" for="gridRadios1"> 남자 </label>
						
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios"
							id="gridRadios2" value="option2"> <label
							class="form-check-label" for="gridRadios2"> 여자 </label>
					</div>
				</div>
				<br>
				<div class="form-group">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" id="gridCheck">
						<label class="form-check-label" for="gridCheck"> 확인완료 </label>
					</div>
				</div>
				<button type="submit" class="btn btn-info btn-lg btn-block">가입하기</button>
			</form>
			 
		</div>
		 
	</div>
	<br> <br> <br> <br>
	<%@include file="footer.jsp"%>
</body>
</html>