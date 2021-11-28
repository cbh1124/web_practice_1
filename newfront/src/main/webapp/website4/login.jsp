<!-- <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp"%>
	<br> <br> <br> <br> <br> <br><br><br><br>
	
	<div class = "container">
		<div class = "row">
			<div class = "col-lg-3"></div>
			<div class = "col-lg-6">
				<div class="form-group">
					<label for="exampleDropdownFormEmail2">아이디</label> <input
						type="email" class="form-control" id="exampleDropdownFormEmail2"
						placeholder="아이디">
				</div>
				
				<div class="form-group">
					<label for="exampleDropdownFormPassword2">비밀번호</label> <input
						type="password" class="form-control"
						id="비밀번호" placeholder="Password">
				</div>
				
				<div class="form-check">
					<div class = "row">
						<div class = "col-md-6">
							<input type="checkbox" class="form-check-input" id="dropdownCheck2">
							<label class="form-check-label" for="dropdownCheck2">
								자동 로그인 
							</label>
						</div>
						<a href = "#" class = "col-md-6">
							아이디/비밀번호 찾기 
							<i class = "member__sprite member__sprite--right-arrow">
							</i>
						</a>
					</div>
				</div>
				
				<button type="submit" class="btn btn-info btn-lg btn-block">로그인</button>
				
				<hr class = "login_serparator"> <!-- hr태그를 사용하여 수평선 그리기 -->
				
				<a href = "signin.jsp" class = "btn btn-lg btn-block btn-outline-secondary ">회원가입</a>
				<footer class = "member-footer">	
	        		<div>©Ezen Ansan Shop Corp. All rights reserved. </div>
				</footer>
			</div>  
			<div class = "col-lg-3"></div>  
		</div>
	</div>
	<div></div>
</body>
</html>