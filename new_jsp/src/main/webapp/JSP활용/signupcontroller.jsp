<%@page import="new_jsp.Member"%>
<%@page import="java.io.FileOutputStream"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<!-- 사용자 뷰X : JAVA -->
	
	<% 			// 스크립트 문 
		request.setCharacterEncoding("UTF-8"); //변수를 한글로 쓰겠다.
		String id = request.getParameter("id"); // form으로부터 id 변수 요청 
		String password = request.getParameter("password"); // form으로부터 password 변수 요청 
		String name = request.getParameter("name"); // form으로부터 name 변수 요청
		
		
		// 객체화
		
		Member member = new Member(id, password, name);
		// DB 처리 // 파일 처리
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/ez201207/git/web_practice_1/new_jsp/src/main/memberlist.txt" , true);
		
		String outString = member.getId()+"," + member.getPassword()+"," + member.getName()+"\n";
		
		fileOutputStream.write(outString.getBytes());
		
		
		// 페이지 이용 [response.sendRedirect]
		response.sendRedirect("main.jsp");
	%>
</body>
</html>