<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
	<style type="text/css">
		*{text-align: center;}
		header{height : 100px;  background-color: skyblue; padding : 10px ; margin: 10px; border-radius: 10px; }
		footer{boder-top : dotted 2px black; }
		ul{ padding : 10px; background-color: green;  }
	</style>
</head>
<body>
	<%@include file ="1.부트스트랩시작.jsp" %>
	<div class = "container">   <!-- 1300px 박스권  -->
		<header>
			<h2> 그리드 레이아웃</h2>
	
		</header>
		
		<div class = "row"> 
		
			<div class = "col-md-2"> <!--  본문의 사이드 바  -->
				<ul>		<!-- nav : inline -->
					<li>메뉴1</li>
					<li>메뉴2</li>
					<li>메뉴3</li>
					<li>메뉴4</li>
				</ul>
			</div>	
			<div class = "col-md-8"> <!-- 본문의 내용 -->
				<div class = "row">   <!-- inline 효과가 있음 -->
					<div class = "col-md-5 offset-2"> <!--  본문내 12그리드 5  [ 왼쪽 2칸 띄어쓰기 ]-->
						<p> CSS :  캐스케이딩 스타일 시트 [ HTML 꾸미기(레이아웃·스타일·효과) ] </p>
					</div>
					<div class = "col-md-5 "> <!--  본문내 12그리드 5  -->
						<p> CSS :  캐스케이딩 스타일 시트 [ HTML 꾸미기(레이아웃·스타일·효과) ] </p>
					</div>
				</div>
			</div>
			
			<div class = "col-md-2"> <!--  본문의 사이드 바  -->
				<ul>		<!-- nav : inline -->
					<li>메뉴1</li>
					<li>메뉴2</li>
					<li>메뉴3</li>
					<li>메뉴4</li>
				</ul>
			</div>	
			
			
		</div>
		<footer>
			여기는 푸터
		</footer>
	</div>
</body>
</html>