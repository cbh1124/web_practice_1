<%@page import="dao.MemberDao"%>
<%@page import="dto.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
<%	
	String type[] = {"m_password","m_name","m_sex","m_birth","m_phone","m_address" };
	String inset ="m_name";
	String name = request.getParameter("name");
	String id = (String)session.getAttribute("id");
	//boolean result = MemberDao.getMemberDao().namechange(name, id);
	int i = 0;
	///if()
	boolean result = MemberDao.getMemberDao().wildchange(type[i], name, id);
	
	if(result){
		out.print("1");
	}else{
		out.print("2");
	}
	
%>