<%@page import="dao.BoardDao"%>
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
		int r_num = Integer.parseInt(request.getParameter("r_num") );
		int b_num = Integer.parseInt(request.getParameter("b_num"));
		boolean result = BoardDao.getboarddao().replydelete(r_num);
		
		if(result){
			response.sendRedirect("../view/board/boardview.jsp?b_num="+ b_num);
		}else{
			response.sendRedirect("../view/board/boardview.jsp?b_num="+ b_num);
		}
	%>
</body>
</html>