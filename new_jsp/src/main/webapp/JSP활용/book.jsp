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
	<h3> å �˻� ������</h3>
	<table>
		<tr>
			<th>��ȣ</th> <th>����</th> 
		</tr>
		
		<%for (int i = 0; i<books.length; i++) {%>
			<tr>
					<td> <%=(i+1) %></td>
					<td> <%=books[i] %></td>
				</tr>
		<%} %>
	</table>	
	
		<h3> �˻��ϱ� ������ </h3>
		<form action="booksearchcontroller.jsp" method="post">
			���� : <input type="text" name ="books" placeholder = "Enter title">
			<input type="submit" value ="�ۼ�">
		</form>
			
		
		
	
</body>
</html>