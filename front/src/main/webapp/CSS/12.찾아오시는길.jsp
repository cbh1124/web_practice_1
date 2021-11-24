<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

<style type="text/css">
	.back{
		background-image : url("db.jpg");
		width: 400px;
		height: 450px;
		margin: auto;
		
	}
	
	.row1 img{
		width : 300px;
		
		
	}
	.row1 {
		text-align: center;
		width : 50px;
		
	}
	.box{
		
		padding:10px;
		background-color: yellow;
		margin : 50px;
	}
	.cent{
		margin: auto 0;
	}
	li{
		margin: 20px;
	}
</style>

</head>
<body>
	<%@ include file = "12.메뉴바.jsp" %> <!--  12.메뉴바를 고정시켜서 로그인에서 적용  -->
		
		<table class = "back">
			<tr>
				<td class = "row1">
					<span style = " font-size:1.5em;  color: yellow; "> 
						스페셜 드레스 샵
					</span>
				</td>
			</tr>
			
			<tr>
				<td class = "row1">
					<span style = " font-size:1em;  color: yellow; "> 
						Special Dress Shop
					</span>
				</td>
				
			</tr>
			
			<tr>
				<td class = "row1">
				
					<span style = " font-size:0.5em;  color: white; "> 
						생일 결혼기념일 만난 긴념일 등 특별한 날에 스페셜 드레<br>
						스를 입고 포토존에서 멋진 추억의 사진을 남겨보세요<br>
					</span>
					<br>
				</td>
				
			</tr>
			
			<tr>
				<td class = "row1">
					<img src="img1.jpg">
					
				</td>
			</tr>
			<tr>
				<td >
					<span style = " font-size:0.5em;  color: yellow;">
					<ul>
						<li> 
							
							기간 : 매주 토/일요일<br> 13:00~마감시간 전까지
							
						</li>
						<li>
							
							장소 : 기념품 판매점 옆 스페셜 드레스 <br> ※키즈, 커플 드레스도 입고 되었어요!
							
						</li>
					</ul> 
					
					</span>
				</td>
			</tr>
			
			<tr>
				<td class = "row1">
					<div class = "box">
						이용요금 및 이용방법
					</div>
				</td>
			</tr>
			
		</table>
			
	
</body>
</html>