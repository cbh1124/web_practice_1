<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file = "1.��Ʈ��Ʈ������.jsp" %>
	
	<h1> 1. ��Ʈ��Ʈ�� ������ </h1>
	<form >
		<label > �̸� </label>
		<input type="text"  placeholder="�̸�">
		<label >�̸���</label>
		<input type="email"  placeholder="�̸���">
		<button type ="submit">Ȯ��</button>
	</form>
	
	<h3> 2. ��Ʈ��Ʈ�� ������ </h3>
	<form >
		<div class = "form-group">
			<label > �̸� </label>
			<input class = "form-control" type="text"  placeholder="�̸�">
		</div>
		<div class = "form-group">
			<label > �̸� </label>
			<input class = "form-control" type="text"  placeholder="�̸���">
		</div>
		<div class = "form-group">
			<button type ="submit">Ȯ��</button>
		</div>
		
	</form>
	
	
	<h3> 3. �� �ζ��� </h3>
	<form class = "form-check-inline">
		
		<div class = "form-group">
			<label > �̸� </label>
			<input class = "form-control" type="text"  placeholder="�̸�">
		</div>
		<div class = "form-group">
			<label > �̸� </label>
			<input class = "form-control" type="text"  placeholder="�̸���">
		</div>
		<div class = "form-group">
			<button type ="submit">Ȯ��</button>
		</div>
		
	</form>
</body>
</html>