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
	<h3>�ζ� �Ǻ���</h3>
		<form action="lottocontroller.jsp" method="post">
			�ζ�1 : <input type="text" name ="lotto1" placeholder = "lotto num"> <br>
			�ζ�2 : <input type="text" name ="lotto2" placeholder = "lotto num"> <br>
			�ζ�3 : <input type="text" name ="lotto3" placeholder = "lotto num"> <br>
			�ζ�4 : <input type="text" name ="lotto4" placeholder = "lotto num"> <br>
			�ζ�5 : <input type="text" name ="lotto5" placeholder = "lotto num"> <br>
			�ζ�6 : <input type="text" name ="lotto6" placeholder = "lotto num"> <br>
		</form>
		
		<form action="lottocontroller.jsp" method="post">
			�����ζ� : <input type="submit" name ="lotto" value ="�����ζ�">
		</form>
	
</body>
</html>