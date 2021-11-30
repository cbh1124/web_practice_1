<%@page import="new_jsp.Member"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%@ include file = "header.jsp" %> <!-- 페이지 포함 -->
	<h3> 메인 페이지 구역    </h3>
	<h4> 회원 현황</h4>
	
	
	
	<table>
	
		<tr>
		
			<th>번호</th> <th>아이디</th> <th>이름</th>
		
		</tr>
		<% for(int i = 0; i<members.size(); i++){ %>
				<tr>
					<td><%=(i+1) %></td>
					<td><%= members.get(i).getId() %></td>  <!-- 파싱된 데이터가 저장된 객체의 리스트의 members의 i번째의 id를 가져옴 -->
					<td><%= members.get(i).getName() %></td> <!-- 파싱된 데이터가 저장된 객체의 리스트의 members의 i번째의 이름을 가져옴 -->
				
				</tr>
		<%	}%>
		
	
	</table>
	
	
	
</body>
</html>