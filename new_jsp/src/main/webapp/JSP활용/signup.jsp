<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file = "header.jsp" %> <!-- ��������� ���� -->
	
	<!-- ȸ�� ������ ���� -->
	<form action ="signupcontroller.jsp" method = "post" > <!-- action = "�̵������� ���" method ="���۹�� : get,post" -->
		<input type = "text" name = "id" placeholder = "Enter ID"> <br>
		<input type="password" name="password" placeholder = "Enter Password" > <br>
		<input type="text" name = "name" placeholder="Enter Name"> <br>
	
		<input type="submit" value = "ȸ������"> <!-- submit Ŭ��������  form ����(action) -->
		<!--  value�� �� -->
	</form>
</body>
</html>