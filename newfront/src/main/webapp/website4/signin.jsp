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
		<div class="row">
			<div class="col-lg-4"></div>
			<form>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="inputEmail4">���̵�</label> <input type="email"
							class="form-control" id="inputEmail4" placeholder="Email">
					</div>
					<div class="form-group col-md-6">
						<label for="inputPassword4">�н�����</label> <input type="password"
							class="form-control" id="inputPassword4" placeholder="Password">
					</div>
				</div>
				<div class="form-group">
					<label for="inputPassword4">�н����� Ȯ��</label> <input type="password"
						class="form-control" id="inputPassword4" placeholder="Password">
				</div>
				<div class="form-group">
					<label for="inputEmail4">�̸���</label> <input type="email"
						class="form-control" id="inputEmail4" placeholder="Email">
				</div>
				
				<!-- �ӽ� �ڽ�  -->
				<div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios"
							id="gridRadios1" value="option1" checked> <label
							class="form-check-label" for="gridRadios1"> ���� </label>
					</div>
					<div class="form-check">
						<input class="form-check-input" type="radio" name="gridRadios"
							id="gridRadios2" value="option2"> <label
							class="form-check-label" for="gridRadios2"> ���� </label>
					</div>
				</div>
				<br>
		<div class="form-group">
					<div class="form-check">
						<input class="form-check-input" type="checkbox" id="gridCheck">
						<label class="form-check-label" for="gridCheck"> Ȯ�οϷ� </label>
					</div>
				</div>
				<button type="submit" class="btn btn-primary">�����ϱ�</button>
			</form>
			 
		</div>
	</div>
	
	<%@include file="footer.jsp"%>
</body>
</html>