<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>	
		<%@ include file ="header.jsp"%>
		
		<%	
			request.setCharacterEncoding("UTF-8");
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