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
<%@ include file = "header.jsp" %> <!-- ������ ���� -->
	<h3> ���� ������ ����    </h3>
	<h4> ȸ�� ��Ȳ</h4>
	
	
	
	<table>
	
		<tr>
		
			<th>��ȣ</th> <th>���̵�</th> <th>�̸�</th>
		
		</tr>
		<% for(int i = 0; i<members.size(); i++){ %>
				<tr>
					<td><%=(i+1) %></td>
					<td><%= members.get(i).getId() %></td>  <!-- �Ľ̵� �����Ͱ� ����� ��ü�� ����Ʈ�� members�� i��°�� id�� ������ -->
					<td><%= members.get(i).getName() %></td> <!-- �Ľ̵� �����Ͱ� ����� ��ü�� ����Ʈ�� members�� i��°�� �̸��� ������ -->
				
				</tr>
		<%	}%>
		
	
	</table>
	
	
	
</body>
</html>