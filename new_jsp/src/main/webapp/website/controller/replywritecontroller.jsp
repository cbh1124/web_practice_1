<%@page import="dto.Board"%>
<%@page import="dto.Reply"%>
<%@page import="dao.BoardDao"%>
<%@page import="dto.Login"%>
<%@page import="dao.MemberDao"%>
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
		String r_contents = request.getParameter("reply");
		
		Login login = (Login)session.getAttribute("login");
		int m_num = login.getM_num();
		int n_num = BoardDao.getboarddao().
		
		Reply reply = new Reply(r_contents,  m_num, b_num);
		// DB 처리 
		boolean result =  BoardDao.getboarddao().replywrite();
		// DB 결과 
		
	%>
</body>
</html>