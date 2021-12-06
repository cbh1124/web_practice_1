<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%	// 1.  쿠키 클래스를 이용한 쿠키 객체 만들기(이름, 데이터 ) 
		String cookie2 = "mycookie";
		Cookie cookie = new Cookie(cookie2, "회원아이디"); //Cookie cookie = new Cookie(mycookie, "회원아이디")쿠키명, 데이터 
		// 2. 쿠키 생명주기
		cookie.setMaxAge(60); // 쿠키 생명 주기 [1분]
		// 3. 쿠키 내용 변경
		cookie.setValue("애플");
		// 4. 클라이언트[브라우저]에게 쿠키 전달[해당 브라우저 쿠키 저장] 
		response.addCookie(cookie);
	%>
	<p>쿠키만들기</p> <br>
	<p>쿠키 내용 <a href = "12.쿠키테스트.jsp"> 확인 </a></p>
	
</body>
</html>