<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<%	// 1. [��Ű�� �޸� ������ ���尴ü(�̸� ������� ��ü)]
			session.setAttribute("id", "qweqwe"); 		// ���� ����� [ ��Ĺ ]
			session.setAttribute("password", "123");
			
			// 2. ���� �����ֱ�[���� ȣ���� ������] 
			session.setMaxInactiveInterval(60); // 60��    �⺻�� : 30��(default) 60*30 
			
		%>
		<p> ���� �����</p>
		<p>	<a href="13.�����׽�Ʈ.jsp">Ȯ��</a> </p>
</body>
</html>