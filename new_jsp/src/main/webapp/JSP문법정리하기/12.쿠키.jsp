<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%	// 1.  ��Ű Ŭ������ �̿��� ��Ű ��ü �����(�̸�, ������ ) 
		String cookie2 = "mycookie";
		Cookie cookie = new Cookie(cookie2, "ȸ�����̵�"); //Cookie cookie = new Cookie(mycookie, "ȸ�����̵�")��Ű��, ������ 
		// 2. ��Ű �����ֱ�
		cookie.setMaxAge(60); // ��Ű ���� �ֱ� [1��]
		// 3. ��Ű ���� ����
		cookie.setValue("����");
		// 4. Ŭ���̾�Ʈ[������]���� ��Ű ����[�ش� ������ ��Ű ����] 
		response.addCookie(cookie);
	%>
	<p>��Ű�����</p> <br>
	<p>��Ű ���� <a href = "12.��Ű�׽�Ʈ.jsp"> Ȯ�� </a></p>
	
</body>
</html>