<%@page import="dao.MemberDao"%>
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
		
		request.setCharacterEncoding("UTF-8");
		String id  =  request.getParameter("id");
		String password = request.getParameter("password");
		
		boolean result = MemberDao.getMemberDao().memberlogin(id, password);
		
		
		if(result){
			response.sendRedirect("../view/main.jsp");
			System.out.println("로그인성공");
			session.setAttribute("id", id);
			session.setMaxInactiveInterval(5);
		}else{
			response.sendRedirect("../view/member/login.jsp");
			System.out.println("로그인실패");
		}
	%>
	
</body>
</html>