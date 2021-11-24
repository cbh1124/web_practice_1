<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		*{ border : solid 1px red; }
		header{ /*헤더 태그 꾸미기*/
			width : 1150px; /*가로길이*/
			height : 100px; /*높이 : 레이아웃용*/
			margin : 0 auto; /* 박스권 가운데 정렬 [ /*컨트롤 : text align*/
		}
		
		#main_img{
			width: 100%;    /* 가로길이 : 백분율 */
			height : 250px; /* 높이 */\
			
		}
		
		#contents{
			width : 1150px;
			margin : 0 auto;
		}
		
		#sub_menu{				/*박스권 왼쪽 배치*/
			width : 240px;
			float : left;
			
		}
		
		#main_contents{
			width : 900px;
			float : right;		/*박스권 오른쪽 배치*/
			
			
		}
		
		footer{
			width : 100%;
			height : 150px;
			clear : both;       /*floadt 제거 */	
		}
		
	</style>

</head>
<body>
	<!-- 1. 레이아웃(display : block => 한칸)  -->
	<header>   		<!-- 헤더 태드 [ div 사용 해도 무관 ] -->
		<%@include file ="2.header.jsp"%>
	</header>
				<!-- 섹션 태드 [ div 처럼 구역 나우기 ] -->
		<%@include file = "3.mainimage.jsp" %>
	
		<%@include file = "4.main.jsp" %>

		<%@include file = "5.footer.jsp" %>

</body>
</html>