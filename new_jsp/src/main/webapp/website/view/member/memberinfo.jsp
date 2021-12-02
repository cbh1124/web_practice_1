<%@page import="java.util.ArrayList"%>
<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%	
		ArrayList<Member> members = new ArrayList<>();
		String loginid = (String)session.getAttribute("id");
		members = MemberDao.getMemberDao().memberinfo(loginid);
		for(int i= 0 ; i<members.size(); i++){
	%>
	<%
			out.print(members.get(i).getM_id() + "\n");
	
	
	
			out.print(members.get(i).getM_birth() + "\n");
	
	
			out.print(members.get(i).getM_name() + "\n");
	
			out.print(members.get(i).getM_phone() + "\n");
			out.print(members.get(i).getM_point() + "\n");
			out.print(members.get(i).getM_sex() + "\n");
			out.print(members.get(i).getM_sdate() + "\n");
			out.print(members.get(i).getM_address() + "\n");
	
		}
		%>	
		

</body>
</html>