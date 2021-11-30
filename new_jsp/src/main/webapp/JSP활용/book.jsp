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
	<h3> 책 검색 페이지</h3>
	<table>
		<tr>
			<th>번호</th> <th>제목</th> 
		</tr>
		
		<%for (int i = 0; i<books.length; i++) {%>
			<tr>
					<td> <%=(i+1) %></td>
					<td> <%=books[i] %></td>
				</tr>
		<%} %>
	</table>	
	
		<h3> 검색하기 페이지 </h3>
		<form action="booksearchcontroller.jsp" method="post">
			제목 : <input type="text" name ="books" placeholder = "Enter title">
			<input type="submit" value ="작성">
		</form>
			
		
		
	
</body>
</html>