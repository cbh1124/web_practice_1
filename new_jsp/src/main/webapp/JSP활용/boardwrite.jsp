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
	
	<h3> �Խù� ���� ������</h3>
	<form action="boardwritecontroller.jsp" method="post">
	
		���� : <input type="text" name ="title" placeholder = "Enter title">
		���� : <textarea name="content" cols="10" rows="3"></textarea>
		<input type="submit" value = "�ۼ�">
	
	</form>
	
</body>
</html>