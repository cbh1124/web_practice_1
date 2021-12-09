<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="java.util.Set"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<% 	
	
	System.out.print( "출력" +request.getParameter("p_num2"));
	
	int p_num = Integer.parseInt(request.getParameter("p_num2") );
	String p_name = request.getParameter("p_name");
	int p_price = Integer.parseInt(request.getParameter("p_price") );
	String p_category = request.getParameter("p_category");
	String p_manufacturer = request.getParameter("p_manufacturer");
	int p_active = Integer.parseInt(request.getParameter("p_active"));
	String p_size = request.getParameter("p_size");
	String p_stock = request.getParameter("p_stock");
	String p_img = request.getParameter("p_img");
	String p_contents = request.getParameter("p_contents");
	
	String folderpath = "C:/Users/ez201207/git/web_practice_1/new_jsp/src/main/webapp/website/upload";
	MultipartRequest multipartRequest = new MultipartRequest( request ,  folderpath , 1024*1024*10 ,"UTF-8" , new DefaultFileRenamePolicy() );
	request.setCharacterEncoding("utf-8");	// 요청시[request] 한글 인코딩
	
	
	String file = multipartRequest.getFilesystemName("file");
	if( file == null ){	// 새로운 첨부가 없을경우 기존 첨부를 DB 저장
		file = multipartRequest.getFilesystemName("oldfile");
	}
	
	Product product = new Product( 
			multipartRequest.getParameter("p_name") , 
			Integer.parseInt(multipartRequest.getParameter("p_price")) ,
			multipartRequest.getParameter("p_category") ,
			multipartRequest.getParameter("p_manufacturer") ,
			Integer.parseInt(multipartRequest.getParameter("p_active")),
			multipartRequest.getParameter("p_size"),
			Integer.parseInt(multipartRequest.getParameter("p_stock")),
			multipartRequest.getFilesystemName("p_img"),
			multipartRequest.getParameter("p_contents") );
	
	boolean result = ProductDao.getProductDao().productupdate(p_num, product);
	
	if( result ){
		out.print("<script>alert('제품 수정 되었습니다.');</script>");
		out.println("<script>location.href='../view/admin/dashboard.jsp';</script>");
	}else{
		out.print("<script>alert('제품 수정 실패 되었습니다.[관리자에게 문의]');</script>");
		out.println("<script>location.href='../view/admin/productwrite.jsp';</script>");
	}
	
	
%>
       