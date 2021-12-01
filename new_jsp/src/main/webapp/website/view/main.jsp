<%@page import="java.util.Enumeration"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹사이트 입니다.</title>
</head>
<body>
	<%@include file ="header.jsp" %>
	<h3> 메인 부문</h3>
	
	<%
		MemberDao.getMemberDao();
	%>
	
	<%	
		// 1. 하나의 세션 호출 
		
		Enumeration enumeration = session.getAttributeNames();
		
		while(enumeration.hasMoreElements()){
					//  hasMoreElements : 다음 항목 존재여부 확인
			String name = (String)enumeration.nextElement();
					// nextElement : 다음 항목 가져오기
					// 쿠키의 이름 하나 가져오기 
			String value = (String)session.getAttribute(name);
					// 가져온 쿠키이름의 세션 데이터 호출
			out.println("<br> 세션 이름 : " + name + "<br> 세션 값은 : " + value);
		}
		session.setMaxInactiveInterval(5);
	%>
	
	
	<h3> 폰트 적용</h3>
	<%@include file ="footer.jsp" %>
</body>
</html>