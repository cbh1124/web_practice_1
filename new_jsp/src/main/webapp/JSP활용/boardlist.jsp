<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file = "header.jsp" %>
	
	<h3> �Խù� ���</h3>
	<%if(loginid == null){ %>
		<p>�α��� �� �Խù��� �ۼ��� �� �ֽ��ϴ�. </p>
	<%}else{ %>
		<a href="boardwrite.jsp"> <button> ���ۼ� </button> </a>
	<%} %>
	<table>
		<tr>
			<th>��ȣ</th> <th> ����</th> <th>�ۼ���</th>
		</tr>	
		
		 
			<%for (int i = 0 ; i<boards.size(); i++){ %>
				
				<tr>
					<td> <%=(i+1) %></td>
					<td> <a href="boardview.jsp?bnum=<%=i%>"> <%=boards.get(i).getTitle() %></a></td>
					<td> <%=boards.get(i).getContent() %></td>
				</tr>
	         <%} %>		
	</table>
	
	
</body>
</html>