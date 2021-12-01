<%@page import="java.lang.reflect.Array"%>
<%@page import="java.util.Arrays"%>
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
		Cookie[] cookies = request.getCookies();
		System.out.print(Arrays.toString(cookies) );
		if(cookies != null){
			
			for(int i =0; i<cookies.length; i++){
				System.out.print(cookies[i].getName());
				if(cookies[i].getName().equals("mycookie")){
					%>
						내 쿠키이름 : <%=cookies[i].getName() %>
						내 쿠키값 : <%=cookies[i].getValue() %>
					<% 
				}
			}
		}
	%>
</body>
</html>