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
	
	<!-- ĳ���� start -->
	<div class = "carouselcontent" data-ride="carousel" data-interval ="2000">
	
		<!-- ���� �����̵� ��ġ �˷��ִ� �޼ҵ� -->
		<ol class = "carousel-indicators">
			<li data-target="#carouselcontent" data-slide-to="0" class="active"></li>
			<li data-target="#carouselcontent" data-slide-to="1" ></li>
			<li data-target="#carouselcontent" data-slide-to="2" ></li>
			<li data-target="#carouselcontent" data-slide-to="3" ></li>
		</ol>
		
		<!--  ĳ���� �̹��� �ֱ�  -->
		<div class= "carousel-inner">
			<div class = "carousel-item active"><img src = "img/2021_11_26_1.jpg"> </div>
			<div class = "carousel-item"><img src = "img/2021_11_26_2.jpg"> </div>
			<div class = "carousel-item"><img src = "img/2021_11_26_3.jpg"> </div>
			<div class = "carousel-item"><img src = "img/2021_11_26_4.gif"> </div>
		</div>
		
		<!-- ĳ���� �̹��� �̵� ��ư -->
		<a class="carousel-control-prev" href="#carouselcontent" data-slide="prev">
			<span class="carousel-control-prev-icon"></span>
		</a>
		<a class="carousel-control-next" href="#carouselcontent" data-slide="next">
			<span class="carousel-control-next-icon"></span>
		</a>
	</div>
	<!-- ĳ���� end -->
	<hr>
	<br> <br>
	<div class="container text-center">
		<h3>New Arrival</h3>
		<p> �Ż�ǰ </p>
	</div>
	<!-- ������ : ��ǰ start -->
	<div class = "container"> <!-- �ڽ���-->
		<div class = "row">  <!-- ���� 12 �׸��� -->
		
			<div class = "col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900   col-sm-6 = 500~700 my: ���Ʒ� ���� -->
				<div class = "card"> <!-- ī�� -->
					<img class= "card-img-top" src = "img/2021_11_26_4.gif">  <!-- ī�� ��� �̹��� -->
					<div class = "card-body"> <!-- ī�� ���� -->
						<p class = "card-text"> �ƹ� �е�</p>
						<hr>
						<p class = "item p-1">
							�����̾� ���������縦 �����ϰ� ä������
							�Ǹ��� ���¼��� Ʈ������ �е��Դϴ�.<br><br>
						���� :  <span class = "price my-2">60,000��</span> <br>
						���ΰ� :  50,000�� (���αݾ� : 3,000�� )   <br>
						<span class="badge badge-pill badge-warning my-2">�ֹ�����</span>
						<span class="badge badge-pill badge-danger my-2">ǰ���ӹ�</span>
						</p>
					</div>
				</div>
			</div>
			
			<div class = "col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900   col-sm-6 = 500~700 my: ���Ʒ� ���� -->
				<div class = "card"> <!-- ī�� -->
					<img class= "card-img-top" src = "img/2021_11_26_4.gif">  <!-- ī�� ��� �̹��� -->
					<div class = "card-body"> <!-- ī�� ���� -->
						<p class = "card-text"> �ƹ� �е�</p>
						<hr>
						<p class = "item p-1">
							�����̾� ���������縦 �����ϰ� ä������
							�Ǹ��� ���¼��� Ʈ������ �е��Դϴ�.<br><br>
						���� :  <span class = "price my-2">60,000��</span> <br>
						���ΰ� :  50,000�� (���αݾ� : 3,000�� )   <br>
						<span class="badge badge-pill badge-warning my-2">�ֹ�����</span>
						<span class="badge badge-pill badge-danger my-2">ǰ���ӹ�</span>
						</p>
					</div>
				</div>
			</div>
			
			<div class = "col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900   col-sm-6 = 500~700 my: ���Ʒ� ���� -->
				<div class = "card"> <!-- ī�� -->
					<img class= "card-img-top" src = "img/2021_11_26_4.gif">  <!-- ī�� ��� �̹��� -->
					<div class = "card-body"> <!-- ī�� ���� -->
						<p class = "card-text"> �ƹ� �е�</p>
						<hr>
						<p class = "item p-1">
							�����̾� ���������縦 �����ϰ� ä������
							�Ǹ��� ���¼��� Ʈ������ �е��Դϴ�.<br><br>
						���� :  <span class = "price my-2">60,000��</span> <br>
						���ΰ� :  50,000�� (���αݾ� : 3,000�� )   <br>
						<span class="badge badge-pill badge-warning my-2">�ֹ�����</span>
						<span class="badge badge-pill badge-danger my-2">ǰ���ӹ�</span>
						</p>
					</div>
				</div>
			</div>
			
			<div class = "col-md-4 col-sm-6 my-5"> <!-- col-md-4 : 700~900   col-sm-6 = 500~700 my: ���Ʒ� ���� -->
				<div class = "card"> <!-- ī�� -->
					<img class= "card-img-top" src = "img/2021_11_26_4.gif">  <!-- ī�� ��� �̹��� -->
					<div class = "card-body"> <!-- ī�� ���� -->
						<p class = "card-text"> �ƹ� �е�</p>
						<hr>
						<p class = "item p-1">
							�����̾� ���������縦 �����ϰ� ä������
							�Ǹ��� ���¼��� Ʈ������ �е��Դϴ�.<br><br>
						���� :  <span class = "price my-2">60,000��</span> <br>
						���ΰ� :  50,000�� (���αݾ� : 3,000�� )   <br>
						<span class="badge badge-pill badge-warning my-2">�ֹ�����</span>
						<span class="badge badge-pill badge-danger my-2">ǰ���ӹ�</span>
						</p>
					</div>
				</div>
			</div>
			
		</div>
	</div>
	<!-- ������ : ��ǰ end -->
	<%@include file="footer.jsp" %>
	
</body>
</html>