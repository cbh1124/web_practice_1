<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file ="header.jsp"%>
	
	<h3>�α��� ������</h3>
	
	<form action="logincontroller.jsp" method = "post">
		���̵� : <input type="text" name = "id" placeholder="Enter ID"/>
		��й�ȣ : <input type="password" name = "password" placeholder="Enter Password"/>
		<input type="submit" value= "�α���" >
	
	</form>
		<% String result = request.getParameter("result"); %>
		<% if( result != null ){%>
				<h4> �α��� ���� </h4>
			<%out.print(result); %>
		<% } %>
	
</body>
</html>