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
		int b_num = Integer.parseInt(request.getParameter("b_num"));
		System.out.print(m_num);System.out.print(r_contents); System.out.print(b_num); 
		Reply reply = new Reply(r_contents,  m_num, b_num);
		// DB 처리 
		boolean result =  BoardDao.getboarddao().replywrite(reply);
		// DB 결과 
		if(result){
			response.sendRedirect("../view/board/boardview.jsp?b_num="+ b_num);     
		}else{
			response.sendRedirect("../view/board/boardview.jsp?b_num="+ b_num);
		}
		
	%>
</body>
</html>