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
	
	<!-- ����� ��X : JAVA -->
	
	<% 			// ��ũ��Ʈ �� 
		request.setCharacterEncoding("UTF-8"); //������ �ѱ۷� ���ڴ�.
		String id = request.getParameter("id"); // form���κ��� id ���� ��û 
		String password = request.getParameter("password"); // form���κ��� password ���� ��û 
		String name = request.getParameter("name"); // form���κ��� name ���� ��û
		
		
		// ��üȭ
		
		Member member = new Member(id, password, name);
		// DB ó�� // ���� ó��
		FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/ez201207/git/web_practice_1/new_jsp/src/main/memberlist.txt" , true);
		
		String outString = member.getId()+"," + member.getPassword()+"," + member.getName()+"\n";
		
		fileOutputStream.write(outString.getBytes());
		
		
		// ������ �̿� [response.sendRedirect]
		response.sendRedirect("main.jsp");
	%>
</body>
</html>