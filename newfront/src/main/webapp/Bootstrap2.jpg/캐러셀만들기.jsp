<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style type="text/css">
	.carousel-item{
		width: 1100px !important;  
		height :400px;
	}
	.img{
		width: 1100px;
		height: 400px;
	}
	
</style>
</head>
<body>
	<%@include file = "��Ʈ��Ʈ�������1.jsp" %>
	<div class="container">
		<div id="carouselExampleFade" class="carousel slide carousel-fade" data-ride="carousel" data-interval="1000">
			
			<ol class = "carousel-indicators"> <!-- carousel-indicators : ���� �����̵� ��ġ -->
					<li data-target="#carouselcontents" data-slide-to="0" class ="active"></li>
					<li data-target="#carouselcontents" data-slide-to="1"></li>
					<li data-target="#carouselcontents" data-slide-to="2"></li>
			</ol>
				
			<div class = "carousel-inner">
				<div class="carousel-item active">
					<img class="d-block w-100" src="112233.jpg" alt="ù�����̵�">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="11223344.jpg" alt="��°�����̵�">
				</div>
				<div class="carousel-item">
					<img class="d-block w-100" src="1122334455.jpg" alt="��°�����̵�">
				</div>
			</div>
			
			<a class="carousel-control-prev" href="#carouselExampleFade" role="button" data-slide="prev">
				<span class= "carousel-control-prev-icon" aria-hidden="true"></span>
				<span class = "sr-only">Previous</span>
			</a>
			<a class="carousel-control-next" href="#carouselExampleFade" role="button" data-slide="next">
				<span class= "carousel-control-next-icon" aria-hidden="true"></span>
				<span class = "sr-only">Next</span>
			</a>
			
		</div>
	</div>
</body>
</html>