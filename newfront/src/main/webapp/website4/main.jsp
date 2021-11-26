<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.jsp" %>
	
	<!-- 캐러셀 start -->
	<div class = "carouselcontent" data-ride="carousel" data-interval ="2000">
	
		<!-- 현재 슬라이드 위치 알려주는 메소드 -->
		<ol class = "carousel-indicators">
			<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontent" data-slide-to="1" ></li>
			<li data-target="#carouselcontent" data-slide-to="2" ></li>
			<li data-target="#carouselcontent" data-slide-to="3" ></li>
		</ol>
		
		<!--  캐러셀 이미지 넣기  -->
		<div class= "carousel-inner">
			<div class = "carousel-item active"><img src = "img/2021_11_26_1.jpg"> </div>
			<div class = "carousel-item"><img src = "img/2021_11_26_2.jpg"> </div>
			<div class = "carousel-item"><img src = "img/2021_11_26_3.jpg"> </div>
			<div class = "carousel-item"><img src = "img/2021_11_26_4.gif"> </div>
		</div>
		
		<!-- 캐러셀 이미지 이동 버튼 -->
		<a class="carousel-control-prev" href="#carouselcontent" data-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</a>
		<a class="carousel-control-next" href="#carouselcontent" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>
	</div>
	<!-- 캐러셀 end -->
	<hr>
	<br> <br>
	<div class="container text-center">
		<h3>New Arrival</h3>
		<p> 신상품 </p>
	</div>
	<!-- 아이템 : 제품 start -->
	<div class = "container"> <!-- 박스권-->
		<div class = "row">  <!-- 가로 12 그리드 -->
		
			<div class = "col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900   col-sm-6 = 500~700 my: 위아래 마진 -->
				<div class = "card"> <!-- 카드 -->
					<img class= "card-img-top" src = "img/2021_11_26_4.gif">  <!-- 카드 상단 이미지 -->
					<div class = "card-body"> <!-- 카드 내용 -->
						<p class = "card-text"> 아무 패딩</p>
						<hr>
						<p class = "item p-1">
							프리미엄 웰론충전재를 빵빵하게 채워넣은
							훌륭한 보온성의 트랜디한 패딩입니다.<br><br>
						정상가 :  <span class = "price my-2">60,000원</span> <br>
						할인가 :  50,000원 (할인금액 : 3,000원 )   <br>
						<span class="badge badge-pill badge-warning my-2">주문폭주</span>
						<span class="badge badge-pill badge-danger my-2">품절임박</span>
						</p>
					</div>
				</div>
			</div>
			
			<div class = "col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900   col-sm-6 = 500~700 my: 위아래 마진 -->
				<div class = "card"> <!-- 카드 -->
					<img class= "card-img-top" src = "img/2021_11_26_4.gif">  <!-- 카드 상단 이미지 -->
					<div class = "card-body"> <!-- 카드 내용 -->
						<p class = "card-text"> 아무 패딩</p>
						<hr>
						<p class = "item p-1">
							프리미엄 웰론충전재를 빵빵하게 채워넣은
							훌륭한 보온성의 트랜디한 패딩입니다.<br><br>
						정상가 :  <span class = "price my-2">60,000원</span> <br>
						할인가 :  50,000원 (할인금액 : 3,000원 )   <br>
						<span class="badge badge-pill badge-warning my-2">주문폭주</span>
						<span class="badge badge-pill badge-danger my-2">품절임박</span>
						</p>
					</div>
				</div>
			</div>
			
			<div class = "col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900   col-sm-6 = 500~700 my: 위아래 마진 -->
				<div class = "card"> <!-- 카드 -->
					<img class= "card-img-top" src = "img/2021_11_26_4.gif">  <!-- 카드 상단 이미지 -->
					<div class = "card-body"> <!-- 카드 내용 -->
						<p class = "card-text"> 아무 패딩</p>
						<hr>
						<p class = "item p-1">
							프리미엄 웰론충전재를 빵빵하게 채워넣은
							훌륭한 보온성의 트랜디한 패딩입니다.<br><br>
						정상가 :  <span class = "price my-2">60,000원</span> <br>
						할인가 :  50,000원 (할인금액 : 3,000원 )   <br>
						<span class="badge badge-pill badge-warning my-2">주문폭주</span>
						<span class="badge badge-pill badge-danger my-2">품절임박</span>
						</p>
					</div>
				</div>
			</div>
			
			<div class = "col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900   col-sm-6 = 500~700 my: 위아래 마진 -->
				<div class = "card"> <!-- 카드 -->
					<img class= "card-img-top" src = "img/2021_11_26_4.gif">  <!-- 카드 상단 이미지 -->
					<div class = "card-body"> <!-- 카드 내용 -->
						<p class = "card-text"> 아무 패딩</p>
						<hr>
						<p class = "item p-1">
							프리미엄 웰론충전재를 빵빵하게 채워넣은
							훌륭한 보온성의 트랜디한 패딩입니다.<br><br>
						정상가 :  <span class = "price my-2">60,000원</span> <br>
						할인가 :  50,000원 (할인금액 : 3,000원 )   <br>
						<span class="badge badge-pill badge-warning my-2">주문폭주</span>
						<span class="badge badge-pill badge-danger my-2">품절임박</span>
						</p>
					</div>
				</div>
			</div>
			
		</div>
	</div>
	<!-- 아이템 : 제품 end -->
	<%@include file="footer.jsp" %>
	
</body>
</html>