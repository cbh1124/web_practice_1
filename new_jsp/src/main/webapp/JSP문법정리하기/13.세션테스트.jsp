<%@page import="java.util.Iterator"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%	
		// 1. �ϳ��� ���� ȣ�� 
		out.print(session.getAttribute("id"));
		// 2. �������� ���� ȣ�� [getAttributeNames -> ��ȯŸ��[Enumeration] ]
				// * Enumeration : ����Ʈ Ȥ�� �迭�� �׸���� ��ȸ		
		//Iterator<Object> enumeration = session.getAttributeNames();
		
		Enumeration enumeration = session.getAttributeNames();
		
		while(enumeration.hasMoreElements()){
					//  hasMoreElements : ���� �׸� ���翩�� Ȯ��
			String name = (String)enumeration.nextElement();
					// nextElement : ���� �׸� ��������
					// ��Ű�� �̸� �ϳ� �������� 
			String value = (String)session.getAttribute(name);
					// ������ ��Ű�̸��� ���� ������ ȣ��
			out.println("<br> ���� �̸� : " + name + "<br> ���� ���� : " + value);
		}
	%>
</body>
</html>