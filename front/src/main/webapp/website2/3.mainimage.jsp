<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

 <style type="text/css">
 	*{ box-sizing: border-box; }  /* 박스권 사이즈 : border 사이즈만큼 자동 설정 */
 		/*
 			box-sizing : contents-box; 	내용기준으로 크기 정함
 			box-sizing : border-box;	테두리 기준으로 크기 정함
 			box-sizing : initial; 		기본값 	
 		
 		*/
 	#main_img{
 		height : 320px;
 		background-image: url("img/쿠킹 클래스.png") ;
 		background-repeat: no-repeat; background-position: top center;
 		text-align: center;
 		padding: 200px 0 0 760px;
 		
 	}
 	#main_img img{
 		display: block;
 		margin: 0 auto;
 		 
 	}
 
 </style>
</head>
<body>
	<section id  = "main_img">
		<a href = "www.naver.com"> <img alt ="" src = "img/신청하러가기.png"> </a>
	</section>
</body>
</html>