<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	 <!-- 부트스트랩의 css 가져오기   -->
   <!--  직접 작성한 css 가져오기  -->
   <link href="CSS/boot.css" rel = "stylesheet">
   	<!-- 상대경로 [현재파일 위치 기준] -->
   	<!-- 아이콘 사용 : 폰트 어썸 링크 -->
   	<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
   	
   	
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
	<%@include file="header.jsp"%>
	<%@include file="carousel.jsp"%>
	<%@include file="item.jsp"%>
	<%@include file="footer.jsp"%>
</body>
</html>