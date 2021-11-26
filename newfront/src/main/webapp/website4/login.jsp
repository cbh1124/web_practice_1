<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
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
					<input type="checkbox" class="form-check-input" id="dropdownCheck2">
					<label class="form-check-label" for="dropdownCheck2">
						Remember me </label>
				</div>
				
				<button type="submit" class="btn btn-info btn-lg btn-block">로그인</button>
				
			</div>
			<div class = "col-lg-3"></div>  
		</div>
	</div>
	<div></div>
</body>
</html>