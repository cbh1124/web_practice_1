<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String userid = request.getParameter("userid");
	System.out.print(userid); // main.js의 아이디값을 전달 받음 userid : useridvalue 
							  // 키와 밸류값으로 가져옴 
							  // 먼저 통신 idcheck로 접근 후 data 전달 다시 값을 가져옴 
							  // 통신한 순간 result 인수값을 전달받아서 가져옴 
							  // jsp 통신 값은 idcheck.jsp의 전체 값을 가져옴 
							  
	boolean result = MemberDao.getMemberDao().idcheck(userid);
	if(result){
		out.print("1"); //   스크립트 ->   html
	}else{
		out.print("0");
	}
	// DB 아이디 체크
%>
