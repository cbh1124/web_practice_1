<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
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
		</form>
		
		<form action="lottocontroller.jsp" method="post">
			랜덤로또 : <input type="submit" name ="lotto" value ="랜덤로또">
		</form>
	
</body>
</html>