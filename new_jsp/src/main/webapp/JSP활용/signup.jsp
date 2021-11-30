<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file = "header.jsp" %> <!-- 헤더페이지 포함 -->
	
	<!-- 회원 페이지 구역 -->
	<form action ="signupcontroller.jsp" method = "post" > <!-- action = "이동페이지 경로" method ="전송방식 : get,post" -->
		<input type = "text" name = "id" placeholder = "Enter ID"> <br>
		<input type="password" name="password" placeholder = "Enter Password" > <br>
		<input type="text" name = "name" placeholder="Enter Name"> <br>
	
		<input type="submit" value = "회원가입"> <!-- submit 클릭했을때  form 전송(action) -->
		<!--  value는 값 -->
	</form>
</body>
</html>