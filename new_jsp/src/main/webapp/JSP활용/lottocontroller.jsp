<%@page import="new_jsp.Lotto"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>

		<%	
			request.setCharacterEncoding("EUC-KR");
			String lotto = request.getParameter("lotto");
	
		%>
		

		
	<table>	
		<tr>
			<th>1번</th> <th>2번</th> <th>3번</th> <th>4번</th> <th>5번</th> <th>6번</th> 
		</tr>	
			<%for(int i = 0; i<6; i++){%>		
			
				<td><%=random[i]%></td>
			
			
			<%}%>
	</table>

	<%if(lotto != null){ %>
		<%for(int i = 0; i<6; i++){%>
			<% Random rand = new Random();
				int num = rand.nextInt(45)+1;
				
				Boolean check = true;
				// 중복값 찾기
				for(int j =0; j<6; j++){
					if(num == random[j]){
						i--;
						check = false;
						break;
					}
				}
				if(check) random[i] = num;
			
			}%>
			
		
	<table>	
		<tr>
			<th>1번</th> <th>2번</th> <th>3번</th> <th>4번</th> <th>5번</th> <th>6번</th> 
		</tr>	
			<%for(int i = 0; i<6; i++){%>		
			
				<td><%=random[i]%></td>
			
			
			<%}%>
	</table>
	<%} %>
</body>
</html>