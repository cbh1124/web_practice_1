<%@page import="dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int b_num = Integer.parseInt(request.getParameter("b_num"));
	

	// db 처리 
	boolean result = BoardDao.getboarddao().boarddelete(b_num);
	
	if(result){
		out.print("<script>alert('삭제 되었습니다')</script>");
		out.println("<script>location.href='../view/board/boardlist.jsp';</script>");
	}else{
		response.sendRedirect("../view/board/boardview.jsp?b_num" + b_num );
	}
%>