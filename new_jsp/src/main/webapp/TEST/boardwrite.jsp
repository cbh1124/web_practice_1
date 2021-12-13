<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file ="header.jsp" %>
	<div class = "container">
	
		<form>
			<input type="text"  class="form-control mt-4 mb-2" placeholder="제목을 입력해주세요." >
			<div class="form-group">
				<textarea class="form-control" rows="10"  placeholder="내용을 입력해주세요"></textarea>
			</div>
			<button type="submit" class="btn btn-outline-primary"><a href="/new_jsp/TEST/boardlist.jsp">제출하기</a></button>
		</form>
	
	</div>
	<br><br><br><br><br>
	<%@include file ="footer.jsp" %>
</body>
</html>

