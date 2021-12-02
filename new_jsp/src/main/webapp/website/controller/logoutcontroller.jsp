<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		
		String loginid = (String)session.getAttribute("id");
	
		if(loginid != null){
			session.setAttribute("id", null);
			response.sendRedirect("../view/member/login.jsp");
		}
		
		
		
	%>
</body>
</html>