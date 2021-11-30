<%@page import="new_jsp.Lotto"%>
<%@page import="java.util.Random"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@ include file="header.jsp"%>

		<%	
			request.setCharacterEncoding("UTF-8");
			String lotto = request.getParameter("lotto");
		%>
		<%	
			request.setCharacterEncoding("UTF-8");
			num2[0] = Integer.parseInt(request.getParameter("lotto1"));
			num2[1] = Integer.parseInt(request.getParameter("lotto2"));
			num2[2] = Integer.parseInt(request.getParameter("lotto3"));
			num2[3] = Integer.parseInt(request.getParameter("lotto4"));
			num2[4] = Integer.parseInt(request.getParameter("lotto5"));
			num2[5] = Integer.parseInt(request.getParameter("lotto6"));
			for(int i = 0; i<num2.length; i++){
				if(num2[i]<1 || num2[i]>45){
					response.sendRedirect("lotto.jsp?result=fail");
				}
				
				Boolean check = true;
				for(int j =0; j<6; j++){
					if(num2[i] == number[j]){
						response.sendRedirect("lotto.jsp?result=fail2");
					}
				}
				if( check ) number[i] = num2[i];
			}
		%>
		<h3> 내 번호 출력하기 </h3>
	<table>	
		
		<tr>
			<th>1번</th> <th>2번</th> <th>3번</th> <th>4번</th> <th>5번</th> <th>6번</th> 
		</tr>	
			<%for(int i = 0; i<6; i++){%>		
			
				<td><%=number[i]%></td>
			
			
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
			
	<h3> 추첨번호 출력하기 </h3>	
	<table>	
		<tr>
			<th>1번</th> <th>2번</th> <th>3번</th> <th>4번</th> <th>5번</th> <th>6번</th> 
		</tr>	
			<%for(int i = 0; i<6; i++){%>		
			
				<td><%=random[i]%></td>
			
			
			<%}%>
	</table>
	<%} %>
	
	<h3> 맞춘 번호 출력하기(번호가 맞아야 나옴) </h3>	
	<table>	
		<tr>
			<th>1번</th> <th>2번</th> <th>3번</th> <th>4번</th> <th>5번</th> <th>6번</th> 
		</tr>
			<% int count = 0; %>
			<%for(int i = 0; i<6; i++){%>		
				<%for(int j = 0; j<6; j++){%>
					<%if(number[i] == random[j]){ %>
					<%count++;%>
					<td><%=number[i]%></td>
					<%}%>
				<%}%>
			<%}%>
	</table>
	<%if(count == 6){ %>
	<p> 축하드립니다. 1등이시네요  </p>
	<%}%>
	
	<%if(count == 5){ %>
	<p> 축하드립니다. 2등이시네요  </p>
	<%}%>
	<%if(count == 4){ %>
	<p> 축하드립니다. 3등이시네요  </p>
	<%}%>
	<%if(count == 3){ %>
	<p> 축하드립니다. 4등이시네요  </p>
	<%}%>
	<%if(count < 3){ %>
	<p> 꽝이시네요  </p>
	<%}%>
</body>
</html>