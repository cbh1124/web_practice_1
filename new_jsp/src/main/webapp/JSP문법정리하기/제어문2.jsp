<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<% 
		int sum =0;
		for( int i = 1 ; i<=100; i++){
			sum+=i;
		}
	%>
	
	1���� 100���� �� : <%=sum %>
	
	<form action="���2���.jsp" method="post">
		�ݺ��� ���� : <input type="text" name="string"> <br>
		�ݺ��� Ƚ�� : <input type="text" name="count"> <br>
		���� <input type="submit" value="����">
	</form>
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>