<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		*{
			border: 1px solid red; box-sizing: border-box; padding: 10px;
		}
		
		row{
			margin-bottom: 4px; margin-top : 4px;
		}
		
	</style>
	
</head>
<body>
	<%@include file = "1.��Ʈ��Ʈ������.jsp" %>
	<h1>�ڽ��� : container </h1>
	<h1>�׸���</h1>
		<ul>
			<li>768px ���� : .col-xs- </li>
			<li>768px �̻� : .col-sm- </li>
			<li>992px �̻� : .col-md- </li>
			<li>1200px �̻� : .col-lg- </li>
		</ul>
	<div class = "container"> <!-- �̸� ������� container -->
		<div class="row">
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
			<div class ="col-md-1">.col-md-1</div>
		</div>	
		<div class = "row">
			<div class = "col-md-8">.col-md-8</div>
			<div class = "col-md-4">.col-md-4</div>
		</div>
		
		<div class = "row">
			<div class = "col-md-4">.col-md-4</div>
			<div class = "col-md-4">.col-md-4</div>
			<div class = "col-md-4">.col-md-4</div>
		</div>
		
		<div class = "row">
			<div class = "col-md-6">.col-md-6</div>
			<div class = "col-md-6">.col-md-6</div>
		</div>
		
		
	</div>
	<br><br><br>
	
	<h3> ���� �׸��� </h3>
	<!--  ���� �׸��� -->
	<div class ="container">
		<div class = "row">     
			<div class = "col-md-8">.col-md-8
				<div class = "row">
					<div class = "col-md-4" style="background : #eeeeee;">
						���� 12 �׸��� �� 4��
					</div>
					
					<div class = "col-md-8" style="background : #eeeeee;">
						���� 12 �׸��� �� 8��
					</div>
					
				</div>
			</div>
			<div class = "col-md-4">.col-md-4
				<div class = "row"> 
				
					<div class = "col-md-6" style="background : #eeeeee;">
							���� 12 �׸��� �� 6��
					</div>
					
					<div class = "col-md-6" style="background : #eeeeee;">
						���� 12 �׸��� �� 6��
					</div>
					
				</div>
			</div>
		</div>
	</div> 
	
	<h3>offset ��ġ ��� [col-md-offset-2 : 2ĭ ���� ]   </h3>
	<div class ="container">
		<div class = "row"> 
			<div class = "col-md-5" > .col-md-5</div>
			<div class = "col-md-5 offset-2" >.col-md-5 , col-md-offset-2 </div> 
		</div>
	
		<div class = "row"> 
			<div class = "col-md-4" > col-md-4</div>
			<div class = "col-md-7 offset-1" >.col-md-7, col-md-offset-1 </div>
		</div>
	</div>
	
	<h3>�׸��� �����ϰų� �Ѿ�����</h3>
	
	<div class = "container"> 
		<div class = "row">
			<div class = "col-md-5" > .col-md-5 </div>
			<div class = "col-md-8" > .col-md-8 </div> <!-- �Ʒ��� ������ �̰� ���Ҹ��� �𸣰ڴ�!!!!!!!!!!!!!!!!!!!!!!!!!!! 12�׸�����¿��� 13�׸��带 �䱸�ϸ� ������??/  ���ؿϷ� ��¥ ��������-->
		</div>
		<div class = "row">
			<div class = "col-md-4" > .col-md-4 </div>
			<div class = "col-md-7" > .col-md-7 </div>
		</div>
	</div>
	
	
</body>
</html>