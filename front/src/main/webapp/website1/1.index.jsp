<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>

	<style type="text/css">
	
		*{ border : solid 1px red; }
		header{ /*��� �±� �ٹ̱�*/
			width : 1150px; /*���α���*/
			height : 100px; /*���� : ���̾ƿ���*/
			margin : 0 auto; /* �ڽ��� ��� ���� [ /*��Ʈ�� : text align*/
		}
		
		#main_img{
			width: 100%;    /* ���α��� : ����� */
			height : 250px; /* ���� */\
			
		}
		
		#contents{
			width : 1150px;
			margin : 0 auto;
		}
		
		#sub_menu{				/*�ڽ��� ���� ��ġ*/
			width : 240px;
			float : left;
			
		}
		
		#main_contents{
			width : 900px;
			float : right;		/*�ڽ��� ������ ��ġ*/
			
			
		}
		
		footer{
			width : 100%;
			height : 150px;
			clear : both;       /*floadt ���� */	
		}
		
	</style>

</head>
<body>
	<!-- 1. ���̾ƿ�(display : block => ��ĭ)  -->
	<header>   		<!-- ��� �µ� [ div ��� �ص� ���� ] -->
		<%@include file ="2.header.jsp"%>
	</header>
				<!-- ���� �µ� [ div ó�� ���� ����� ] -->
		<%@include file = "3.mainimage.jsp" %>
	
		<%@include file = "4.main.jsp" %>

		<%@include file = "5.footer.jsp" %>

</body>
</html>