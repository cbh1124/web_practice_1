<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file = "header.jsp"%>
	
	<h3> �Խù� �� ������</h3>
	<%
		int bnum = Integer.parseInt(request.getParameter("bnum"))	   ;  
	
	%>
	<a href="boardlist.jsp"><button>��Ϻ���</button></a>
	
	<table>
		<tr>
			<td>��ȣ : </td>   <td><%=bnum %></td>
		</tr>
		
		<tr>
			<td>���� : </td>   <td><%=boards.get(bnum).getTitle() %></td>
		</tr>
		
		<tr>
			<td>���� : </td>   <td><%=boards.get(bnum).getContent() %></td>
		</tr>
	
	
	</table>	
</body>
</html>