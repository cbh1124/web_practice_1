<%@page import="java.util.Enumeration"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>웹사이트 입니다.</title>
</head>
<body>
	<%@include file ="header.jsp" %>
	<h3> </h3>
	<!--  캐러셀 스타트 -->
	 	<div id = "carouselcontent" class = "carousel slide" data-ride = "carousel" data-interval="2000">
	 		<ol class = "carousel-indicators">
	 			<li data-target = "#carouselcontent" data-slide-to = "0" class="active"></li>
	 			<li data-target = "#carouselcontent" data-slide-to = "1" ></li>
	 			<li data-target = "#carouselcontent" data-slide-to = "2"></li>
	 			<li data-target = "#carouselcontent" data-slide-to = "3" ></li>
	 			<li data-target = "#carouselcontent" data-slide-to = "4" ></li>
	 		</ol>
	 		
	 		<div class ="carousel-inner">
	 			<div class = "carousel-item active"><img src="/new_jsp/website/view/img/르노삼성0.jpg"> </div>
	 			<div class = "carousel-item"><img src="/new_jsp/website/view/img/르노삼성1.jpg"> </div>
	 			<div class = "carousel-item"><img src="/new_jsp/website/view/img/르노삼성2.jpg"> </div>
	 			<div class = "carousel-item"><img src="/new_jsp/website/view/img/르노삼성3.jpg"> </div>
	 			<div class = "carousel-item"><img src="/new_jsp/website/view/img/르노삼성4.jpg"> </div>
	 		</div>
	 		
	 		<!-- 케러셀 이미지 이동 버튼 -->
			<a class="carousel-control-prev" href="#carouselcontent" data-slide="prev" >
				<span class="carousel-control-prev-icon"></span>
			</a>
			<a class="carousel-control-next" href="#carouselcontent" data-slide="next" >
				<span class="carousel-control-next-icon"></span>
			</a>
	 	</div>

	<!-- 캐러셀 end -->
	<!-- 제품 목록 -->
	<h3> </h3>
	<%@include file ="footer.jsp" %>
</body>
</html>