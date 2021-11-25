<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%@include file = "1.부트스트랩시작.jsp" %>
	
	
	<div class="container"> <!-- 박스권 -->
		<nav class = "navbar navbar-expand-lg navbar-light fixed-bottom" style = "background-color: yellow" > <!-- navbar : 메뉴 박스권 -->
								<!-- fixed -top : 위 메뉴 고정  fixed-bottom : 아래 메뉴 고정-->
			<!--  메뉴 없어질경우 버튼  버튼 기준 밑에 있는거 다 옮기는거임 -->
			
		 	<a href="#" class="navbar-brand" >로고</a>
		 	
		 	<button class = "navbar-toggler" type ="button" data-toggle="collapse" data-target = "#navbarcontents"
		 	aria-controls="navbarcontents" aria-expanded="false" aria-label = "Toggle navi">
				<span class = "navbar-toggler-icon"></span>
			</button>
			
		 						<!-- navbar-brand : 로고[진하게] -->
			<div class ="collapse navbar-collapse" id = "navbarcontents">   		<!-- navbar : 메뉴 -->
				<ul class ="navbar-nav">	<!-- 메뉴 -->
					<li class="nav-item active"><a href="#" class="nav-link">메뉴1</a> </li>
					<li class="nav-item"><a href="#" class="nav-link">메뉴2</a> </li>
					<li class="nav-item"><a href="#" class="nav-link">메뉴3</a> </li>
					
					<li class="nav-item dropdown">			<!-- 드랍다운 -->
						<a class = "nav-link dropdown-toggle" href="#" data-toggle ="dropdown" aria-haspopup="true" aria-expanded="false">    <!--  토글 -->>
							드랍다운
						</a>
						<div class="dropdown-menu">
							<a class = "dropdown-item" href="#">드랍다운 메뉴 1</a>
							<a class = "dropdown-item" href="#">드랍다운 메뉴 2</a>
							<a class = "dropdown-item" href="#">드랍다운 메뉴 3</a>
						</div>
					</li>
				</ul>
				
				<form class="form-inline">
					<input type="text" class="form-control" placeholder="검색어">
					<button class = "btn btn-info" type = "submit">검색</button>
				</form>		
			</div>	
		</nav>
	</div>
		
	
</body>
</html>