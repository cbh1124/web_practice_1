<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
		form{
			width : 400px;
			margin : 0 auto;
		}
		h3{
			text-align: center;
			margin-top: 50px;
		}
		input{
			width : 150px;
			height: 25px;
		}
		button{
			padding: 25px;
		}
	</style>
</head>
<body>
	
	<!--  메뉴바 파일 포함  -->  <!--  CSS가 공유되는 점을 고려해야됨 why? 서로 영향을 줌 --> 
	<%@ include file = "12.메뉴바.jsp" %> <!--  12.메뉴바를 고정시켜서 로그인에서 적용  -->
	<h3> 로그인 </h3>
	
	<form>
		<table>
			<tr>
				<td> 아이디	</td>
				<td> <input type = "text"> </td>
				<td rowspan="2"> <button>로그인</button> </td>
			</tr>
			<tr>
				<td> 비밀번호 </td>		
				<td> <input type = "password"> </td>
			</tr>
		</table>
	</form>
</body>
</html>