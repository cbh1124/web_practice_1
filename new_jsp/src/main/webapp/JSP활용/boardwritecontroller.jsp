<%@page import="java.io.FileOutputStream"%>
<%@page import="new_jsp.Board"%>
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
		// 1. �Է¹��� ���� ��û
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		
		// 2. ��üȭ 
		Board board = new Board(title, content, (String)session.getAttribute("loginid") ); 	
		// 3. ���� ó��
		
		FileOutputStream fileOutputStream  = new FileOutputStream("C:/Users/ez201207/git/web_practice_1/new_jsp/src/main/boardlist.txt", true);
		String outString = board.getTitle() +"," + board.getContent() +","+ board.getWrite() + "\n";
		fileOutputStream.write(outString.getBytes());
		
		// ������
		response.sendRedirect("main.jsp");
	%>
</body>
</html>