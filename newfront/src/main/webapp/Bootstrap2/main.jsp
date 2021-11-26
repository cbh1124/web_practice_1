<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">

		footer{
			clear: both; 
			background-color: #05354e;
			color: white;
		}
		
		#footer_menu{
			padding: 20px 0 0 100px;
			font-weight: bold;
		}
		
		#footer_menu li{ 
			display: inline; 		/* li 들을 한줄 표시 */
			margin-right: 30px; 
			font-size: 5px
		}
		
		footer .items{
			float: left;
			margin: 40px 0 0 100px;
		}
		
		footer h3{ color: #098d74; }
		footer .items ul{ margin-top: 15px; }
		footer .items li{ margin-top: 5px; }
		footer .phone { font-size: 15px; font-weight: bold;}
		
		*{
			/*border: solid 1px red;*/
		}
		section{
			
		}
		.box{ width: 1100px; margin: 0 auto; }
		
</style>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.14.0/css/all.css">
</head>
<body>
	
		<header>
			<%@include file = "부트스트랩만들기1.jsp" %>
			<%@include file = "헤더만들기.jsp" %>
		</header>
	
		<div class="container-fluid">
			<%@include file = "캐러셀만들기.jsp" %>
		</div>
		
		<section>
			
			<%@include file = "메인아이템.jsp" %>
			
		</section>
	
		<footer>
			<%@include file = "푸터만들기.jsp" %>
		</footer>
	
</body>
</html>