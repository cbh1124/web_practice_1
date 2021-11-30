<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		// session.invalidate(); // 모든 세션 초기화 
		session.setAttribute("loginid", null); // 해당 세션 초기화
		
		// 페이지 전환
		response.sendRedirect("main.jsp");
	%>
</body>
</html>