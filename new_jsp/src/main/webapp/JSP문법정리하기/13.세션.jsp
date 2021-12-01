<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
		<%	// 1. [쿠키와 달리 세션은 내장객체(미리 만들어진 객체)]
			session.setAttribute("id", "qweqwe"); 		// 세션 저장소 [ 톰캣 ]
			session.setAttribute("password", "123");
			
			// 2. 세션 생명주기[세션 호출이 없을때] 
			session.setMaxInactiveInterval(60); // 60초    기본값 : 30분(default) 60*30 
			
		%>
		<p> 세션 만들기</p>
		<p>	<a href="13.세션테스트.jsp">확인</a> </p>
</body>
</html>