<%@page import="dao.ProductDao"%>
<%@page import="dto.Login"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<!-- 부트스트랩 설정 -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css?=v3">
	<!-- 본인 css 호출 -->
	<link rel="stylesheet" href="/new_jsp/website/view/css/main.css?=v3"/>
<title>Insert title here</title>
</head>
<body>
	<!-- jquery[ajax 함수] -->
	<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
	
	<!-- 부트스트랩 js 설정 -->
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	
    <!-- 다음 우편주소 api js 호출 -->
    <script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
    
    <!-- chart api -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
    
    <!-- 본인 js -->
    <script src ="/new_jsp/website/js/main.js?ver=123"></script>
    
    <!--  헤더 start -->
   	
    <% // 재고가 0일경우 제품의 사태가 품절로 변경
    ProductDao.getProductDao().stockupdate(); %>
    	<%
	    	Login login = (Login)session.getAttribute("login");
			String loginid = null; 
			// 세션이 있을경우
			if( login != null ) {	loginid = login.getM_id();	}
		%>
    	<div class = "fixed-top bg-white">		<!--  상단 고정, 배경 흰색 -->
    		<div class = "container">    		
    			<header class = "py-3"> <!-- p : 안쪽 여백 // m : 바깥여백 : y : 위아래 , x : 왼쪽 오른쪽 -->
    				 <div class = "row">
    				 	<div class = "col-md-4 offset-4 text-center"> <!--  로고 [웹사이트명] 4칸 건너뛰고 가운데 정렬 4칸차지--> 
    				 		<a href="/new_jsp/website/view/main.jsp" class="header_logo"> 르노 삼성</a>
    				 	</div>
    				 	<div class = "col-md-4 d-flex justify-content-end"> <!--  상단 메뉴 -->
    				 		<ul class = "nav">
    				 				<%
										if( loginid != null){
											if(loginid.equals("admin")){ // 로그인 되어 있으면서 관리자 이면 
									%>
										<li><a href="/jsp/website/view/admin/dashboard.jsp" class="header_menu"> 관리자 </a> </li>
										
									<% 		
											}
									%>	
										<li> <span> <%=loginid %></span>님  </li>
										<li><a href="/new_jsp/website/view/member/memberinfo.jsp" class="header_menu">회원정보</a></li>
										<li><a href="/new_jsp/website/controller/logoutcontroller.jsp" class="header_menu">로그아웃</a></li>
									<%		
										} else { // 로그인이 안되어있는 경우
									%>
										
										<li><a href="/new_jsp/website/view/member/signup.jsp" class="header_menu"> 회원가입 </a></li>
										<li><a href="/new_jsp/website/view/member/login.jsp" class="header_menu"> 로그인 </a></li>
									
									<% 
										}
									%>
    				 		</ul>
    				 	</div>
    				 </div>
    			</header>
					<!-- 메인 메뉴 -->
					<nav class = "navbar navbar-expand-lg navbar-light bg-white">
						<button class = "navbar-toggler" type = "button" data-toggle ="collapse" data-target = "#main_menu">
							<span class  = "navbar-toggler-icon"></span>
						</button>
						<div class = "collapse navbar-collapse" id="main_menu"> <!-- collapse 쓰면 화면 크기에 따라서  -->
							<ul class = "navbar-nav col-md-12 justify-content-between"> <!-- between 쓰면 알아서 가로 정렬 -->
								<li class = "nav-item"> <a href="#" class = "nav-link">신차</a> </li>
								<li class = "nav-item"> <a href="#" class = "nav-link">베스트</a> </li>
								<li class = "nav-item"> <a href="#" class = "nav-link">브랜드별</a> </li>
								<li class = "nav-item"> <a href="#" class = "nav-link">국산차</a> </li>
								<li class = "nav-item"> <a href="#" class = "nav-link">수입차</a> </li>
								<li class = "nav-item"> <a href="#" class = "nav-link">이벤트</a> </li>
								<li class = "nav-item"> <a href="#" class = "nav-link">구매후기</a> </li>
								<li class = "nav-item"> <a href="/new_jsp/website/view/board/boardlist.jsp" class = "nav-link">고객센터</a> </li>
								<li class = "nav-item"> <a href="/new_jsp/website/view/product/productcart.jsp" class = "nav-link">장바구니</a> </li>
							</ul>
						</div>
					</nav>
    		</div>
    	</div>
    
    
    <!-- 헤더 end -->
	<br><br><br><br><br><br><br>
	
</body>
</html>