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
	
	<h3> 게시물 쓰기 페이지</h3>
	<form action="boardwritecontroller.jsp" method="post">
	
		제목 : <input type="text" name ="title" placeholder = "Enter title">
		내용 : <textarea name="content" cols="10" rows="3"></textarea>
		<input type="submit" value = "작성">
	
	</form>
	
</body>
</html>