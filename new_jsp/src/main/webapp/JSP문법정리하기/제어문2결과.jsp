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
		request.setCharacterEncoding("utf-8");
		String string = request.getParameter("string");
		int count = Integer.parseInt(request.getParameter("count"));
	
		for( int i = 0 ; i<count; i++){
		
			out.print(i+"번째 : " + string+"<br>");
			
		}
	%>
	
	

</body>
</html>