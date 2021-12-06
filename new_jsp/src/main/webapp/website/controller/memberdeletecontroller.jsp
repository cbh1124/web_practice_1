<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = (String)session.getAttribute("id");
	String password = request.getParameter("password");
	// 현재 세션에 있는 로그인 정보와 패스워드가 동일하면
	boolean result = MemberDao.getMemberDao().delete(id, password);
	
	if(result){
		out.print("1");
	}else{
		out.print("2");
		}
	/*
		if(result){ // 탈퇴 성공시
			// 세션 초기화
			
			// js
			session.setAttribute("id", null);
			out.print("<script> alert ('회원탈퇴 되었습니다'); </script>");
			out.println("<script> location.href='../view/main.jsp'; </script>");
			
		}else{ // 탈퇴 실패시
			out.print("<script> alert ('회원정보가 다릅니다.'); </script>");
			out.println("<script> location.href='../view/member/memberinfo.jsp'; </script>");
		}
	*/
%>
