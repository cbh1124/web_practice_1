<%@page import="dao.PorderDao"%>
<%@page import="dao.ProductDao"%>
<%@page import="dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dto.Login"%>
<%@page import="dto.Porder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%

Login login = (Login)session.getAttribute("login");
String order_name = request.getParameter("order_name");
String order_phone =request.getParameter("order_phone");
String order_address =request.getParameter("order_address");
int order_pay = Integer.parseInt(request.getParameter("order_pay"));
String order_payment =request.getParameter("order_payment");
int delivery_pay =Integer.parseInt(request.getParameter("delivery_pay"));
String order_contents = request.getParameter("order_request");

// 객체화 
Porder porder = new Porder(login.getM_num(),order_name,order_phone,order_address,order_pay,order_payment,delivery_pay,order_contents);

// 카트 세션 
String sname = "cart" + login.getM_id();
ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);

// DB 저장 

boolean result = PorderDao.getPorderDao().orderwrite(porder, carts);
if(result){
	out.print("1"); session.setAttribute(sname, null); //장바구니 초기화
	}
else {
	out.print("0");
}
%>
    
    
    
    