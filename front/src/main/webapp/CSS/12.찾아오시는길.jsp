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
	<%@ include file = "12.�޴���.jsp" %> <!--  12.�޴��ٸ� �������Ѽ� �α��ο��� ����  -->
		
		<table class = "back">
			<tr>
				<td class = "row1">
					<span style = " font-size:1.5em;  color: yellow; "> 
						����� �巹�� ��
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
						���� ��ȥ����� ���� ����� �� Ư���� ���� ����� �巹<br>
						���� �԰� ���������� ���� �߾��� ������ ���ܺ�����<br>
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
							
							�Ⱓ : ���� ��/�Ͽ���<br> 13:00~�����ð� ������
							
						</li>
						<li>
							
							��� : ���ǰ �Ǹ��� �� ����� �巹�� <br> ��Ű��, Ŀ�� �巹���� �԰� �Ǿ����!
							
						</li>
					</ul> 
					
					</span>
				</td>
			</tr>
			
			<tr>
				<td class = "row1">
					<div class = "box">
						�̿��� �� �̿���
					</div>
				</td>
			</tr>
			
		</table>
			
	
</body>
</html>