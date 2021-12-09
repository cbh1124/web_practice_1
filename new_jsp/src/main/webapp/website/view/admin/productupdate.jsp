<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file="../header.jsp" %>
	
	<%
		int p_num = Integer.parseInt(request.getParameter("p_num") );
		System.out.print( "출력" + p_num );
		String p_name = request.getParameter("p_name");
		int p_price = Integer.parseInt(request.getParameter("p_price") );
		String p_category = request.getParameter("p_category");
		String p_manufacturer = request.getParameter("p_manufacturer");
		int p_active = Integer.parseInt(request.getParameter("p_active"));
		String p_size = request.getParameter("p_size");
		String p_stock = request.getParameter("p_stock");
		String p_img = request.getParameter("p_img");
		String p_contents = request.getParameter("p_contents");
	%>
	
	<div class="container">
		
		<form action="../../controller/productupdatecontroller.jsp" method="post" enctype="multipart/form-data">
		
			<input type="hidden" name ="p_num2" value = '<%=p_num%>' >
			
			제품명 : <input type="text" name="p_name" value = "<%=p_name%>"> <br>
			가격 : <input type="text" name="p_price " value = "<%=p_price%>">  <br>
			제조사 : <input type="text" name="p_manufacturer" value = "<%=p_manufacturer%>"> <br>
			카테고리 : <select name ="p_category" value = "<%=p_category%>">  
					<option value="top"> top </option>
					<option value="pants"> pants </option>
					<option value="outer"> outer </option>
				</select>
			제품상태 : <select name ="p_active" value = "<%=p_active%>">
					<option value="1"> 준비중 </option>
					<option value="2"> 판매중 </option>
					<option value="3"> 품절 </option>
				</select>
			제품사이즈 : <select name ="p_size" value = "<%=p_size%>">
					<option value="S"> S </option>
					<option value="M"> M </option>
					<option value="L"> L </option>
				</select>  <br>
			제품재고 : <input type="text" name="p_stock" value = "<%=p_stock%>">   <br>
			제품이미지 : <input type="file" name="p_img" > <%=p_img%> <br>
			
			제품내용 : <textarea rows="" cols="" name="p_contents" ><%=p_contents%></textarea>  <br>
			
			<input type="submit" value="제품등록">
		</form>
		
	
	</div>
	
	

</body>
</html>