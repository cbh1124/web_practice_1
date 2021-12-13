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
		<div class = "row">
			<div class = "col-md-1"></div>
			<div>작성자: </div>
			최병호
			<div class = "col-md-1"></div>
			<div>작성일: </div>
			2021-12-10
			<div class = "col-md-1"></div>
			<div>조회수: </div>
			
		</div>
		
		<form>
			<input type="text"  class="form-control mt-4 mb-2" placeholder="제목이다.." readonly  >
			<div class="form-group">
				<textarea class="form-control" rows="10"  placeholder="내용이다." readonly></textarea>
			</div>
		</form>
	</div>
	<%@include file ="footer.jsp" %>
</body>
</html>