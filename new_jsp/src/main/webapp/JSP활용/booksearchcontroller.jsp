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
		
		<%	
			request.setCharacterEncoding("EUC-KR");
			String book = request.getParameter("books");
		%>	
		
		<table>
			<%for(int i = 0; i<books.length; i++){%>
			
				<%if(books[i].contains(book)){%>
					<tr>
						<td> <%=books[i]%></td>
					</tr>
				<%}%>
			<%}%>
			
			
		</table>
		
		
	
</body>
</html>