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
	
	1부터 100까지 합 : <%=sum %>
	
	<form action="제어문2결과.jsp" method="post">
		반복할 문자 : <input type="text" name="string"> <br>
		반복할 횟수 : <input type="text" name="count"> <br>
		전송 <input type="submit" value="전송">
	</form>
	
	
	
	
	
	
	
	
	
	
	

</body>
</html>