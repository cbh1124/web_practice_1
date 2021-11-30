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
	<h3>로또 판별기</h3>
		<form action="lottocontroller.jsp" method="post">
			로또1 : <input type="text" name ="lotto1" placeholder = "lotto num"> <br>
			로또2 : <input type="text" name ="lotto2" placeholder = "lotto num"> <br>
			로또3 : <input type="text" name ="lotto3" placeholder = "lotto num"> <br>
			로또4 : <input type="text" name ="lotto4" placeholder = "lotto num"> <br>
			로또5 : <input type="text" name ="lotto5" placeholder = "lotto num"> <br>
			로또6 : <input type="text" name ="lotto6" placeholder = "lotto num"> <br>
			로또추첨 : <input type="submit" name ="lotto" value ="추첨하기">
		</form>
	<% String result = request.getParameter("result"); %>
		<% if( result != null && result.equals("fail") ){%>
				<h4> 1부터 45의 값을 다시 입력해주세요 </h4>
			
	<% } %>	
		<% if( result != null && result.equals("fail2") ){%>
				<h4> 입력값이 중복되었습니다 다시 입력해주세요 </h4>
			
	<% } %>	
	
</body>
</html>