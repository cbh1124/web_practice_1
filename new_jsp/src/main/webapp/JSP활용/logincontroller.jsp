<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
	<%@ include file = "header.jsp" %>
	<%
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 존재 여부
		boolean logincheck = false;
		for(Member member : members){
			if(member.getId().equals(id) && member.getPassword().equals(password)){
				logincheck = true;
				// 세션 생성
					session.setAttribute("loginid", member.getId());
					// 세션 유지 시간
					// session.setMaxInactiveInterval(10); // 10초동안 별도로 요청 하지않으면 세션이 사라짐
				response.sendRedirect("main.jsp");
			}
		}
		
		// 로그인 실패
		if(!logincheck){response.sendRedirect("login.jsp?result=fail");} // URL요청 변수도 같이 이동함		
	%>
	
	
</body>
</html>