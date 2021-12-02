<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<!-- 부트스트랩 설정 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<!-- 본인 css 호출 -->
	<link rel="stylesheet" href="/new_jsp/website/view/css/main.css"/>
<title>Insert title here</title>
</head>
<body>
	<!-- 부트스트랩 js 설정 -->
	
	<script src="https://code.jquery.com/jquery-3.5.1.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
    
    <!-- 본인 js -->
    <script src ="/new_jsp/website/js/main.js"></script>
    <!-- 다음 우편주소 api js 호출 -->
    <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<h3> 헤더 부문</h3>
	<%
		String loginid = (String)session.getAttribute("id");
	%>
	
	<div> <a href="/new_jsp/website/view/main.jsp"> 로고 </a></div>
	<ul>
		<%
			if( loginid != null){
				if(loginid.equals("admin")){ // 로그인 되어 있으면서 관리자 이면 
		%>
			<li><a href="/new_jsp/website/view/admin/adminmain.jsp">관리자</a></li>
			
		<% 		
				}
		%>
			<li><a href="/new_jsp/website/view/member/memberinfo.jsp">회원정보</a></li>
			<li><a href="/new_jsp/website/controller/logoutcontroller.jsp">로그아웃</a></li>
		<%		
			} else { // 로그인이 안되어있는 경우
		%>
		
			<li><a href="/new_jsp/website/view/member/signup.jsp"> 회원가입 </a></li>
			<li><a href="/new_jsp/website/view/member/login.jsp"> 로그인 </a></li>
		
		<% 
			}
		%>
	</ul>
	
</body>
</html>