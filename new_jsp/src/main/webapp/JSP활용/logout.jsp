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
		// session.invalidate(); // ��� ���� �ʱ�ȭ 
		session.setAttribute("loginid", null); // �ش� ���� �ʱ�ȭ
		
		// ������ ��ȯ
		response.sendRedirect("main.jsp");
	%>
</body>
</html>