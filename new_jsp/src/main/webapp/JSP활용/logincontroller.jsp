<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@ include file = "header.jsp" %>
	<%
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// ���� ����
		boolean logincheck = false;
		for(Member member : members){
			if(member.getId().equals(id) && member.getPassword().equals(password)){
				logincheck = true;
				// ���� ����
					session.setAttribute("loginid", member.getId());
					// ���� ���� �ð�
					// session.setMaxInactiveInterval(10); // 10�ʵ��� ������ ��û ���������� ������ �����
				response.sendRedirect("main.jsp");
			}
		}
		
		// �α��� ����
		if(!logincheck){response.sendRedirect("login.jsp?result=fail");} // URL��û ������ ���� �̵���
		
		
	%>
	
	
</body>
</html>