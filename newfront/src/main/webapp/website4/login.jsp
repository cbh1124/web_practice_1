<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%@include file="header.jsp"%>
	<br> <br> <br> <br> <br> <br><br><br><br>
	
	<div class = "container">
		<div class = "row">
			<div class = "col-lg-3"></div>
			<div class = "col-lg-6">
				<div class="form-group">
					<label for="exampleDropdownFormEmail2">���̵�</label> <input
						type="email" class="form-control" id="exampleDropdownFormEmail2"
						placeholder="���̵�">
				</div>
				
				<div class="form-group">
					<label for="exampleDropdownFormPassword2">��й�ȣ</label> <input
						type="password" class="form-control"
						id="��й�ȣ" placeholder="Password">
				</div>
				
				<div class="form-check">
					<input type="checkbox" class="form-check-input" id="dropdownCheck2">
					<label class="form-check-label" for="dropdownCheck2">
						Remember me </label>
				</div>
				
				<button type="submit" class="btn btn-info btn-lg btn-block">�α���</button>
				
			</div>
			<div class = "col-lg-3"></div>  
		</div>
	</div>
	<div></div>
</body>
</html>