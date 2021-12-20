<%@page import="java.util.Arrays"%>
<%@page import="dto.Member"%>
<%@page import="dao.MemberDao"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="dao.ProductDao"%>
<%@page import="dto.Product"%>
<%@page import="dto.Cart"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%@include file ="../header.jsp" %>
	<!-- 결제API [ 아임포트 ] 가져오기  -->
	<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
	
	<%
		String sname = "cart"+loginid;
		ArrayList<Cart> carts = (ArrayList<Cart>)session.getAttribute(sname);
		
		
		// 총 제품 금액 
		int totalprice = 0; 
		DecimalFormat decimalFormat = new DecimalFormat("###,####"); //천단위 쉼표
		
		// 회원 정보 불러오기 
		Member member = MemberDao.getMemberDao().getmember(loginid);
		
		// 회원주소 불러오기 
		String[] address = member.getM_address().split(",");

		
		
	%>
		<input type="hidden" id = "mname" value ="<%=member.getM_name()%>">
		<input type="hidden" id = "mphone" value ="<%=member.getM_phone()%>">
		<input type="hidden" id = "address1" value ="<%=address[0]%>">
		<input type="hidden" id = "address2" value ="<%=address[1]%>">
		<input type="hidden" id = "address3" value ="<%=address[2]%>">
		<input type="hidden" id = "address4" value ="<%=address[3]%>">
		
		
	
	<div class="container">
		<table class = "table">
			<tr> <th>이미지</th> <th>상품정보</th> <th>수량</th> <th>가격</th> </tr>
			<%
			for(Cart cart : carts){
				Product product = ProductDao.getProductDao().getproduct(cart.getP_num());
				totalprice += cart.getP_count()*product.getP_price();
			
			%>
				<tr>
					<td width="10%" class ="align-middle"> <img src="../../upload/<%=product.getP_img()%>" alt="" style = "max-width: 100%;"> </td>
					<td width="50%">
						<div>
							(<%=product.getP_manufacturer() %>) <%=product.getP_name() %>
						</div><hr>
						<div class = "px-1" style = "font-size : 12px;">
							옵션 : <%=cart.getP_size() %>
						</div>
					</td>
					<td class = "align-middle text-center pview">
						<%=cart.getP_count() %>
					</td>
					<td class = "align-middle text-center pview">
						<%=decimalFormat.format(cart.getP_count()* product.getP_price()) %>
					</td>
				
				</tr>
			<%} %>
		</table>
		<br><br>
		<div class = "row">
		
			<div class = "col-md-6">
				<h3> 배송 정보 </h3>
				<span>받는 사람 정보</span> <input id = "checkbox" type="checkbox">회원과 동일 
					<div class = "row">
						<div class = "col-md-3 m-2"><label>이름</label></div>
						<div class = "col-md-8"> <input id = "name" type="text" name = "name" class = "form-control" onchange ="signupcheck();"></div>
					</div>
					<div class = "row">
						<div class = "col-md-3 m-2"><label>연락처</label></div>
						<div class = "col-md-8"> 
							<input type="text" name = "phone" id ="phone" onchange ="signupcheck();" class = "form-control" placeholder = "000-0000-0000" >
						</div>
					</div>
					<div>
						<span id = "phoneresult"></span>
					</div>
					<div class = "row">
						<div class = "col-md-3 m-2"><label>요청사항</label></div>
						<div class = "col-md-8"> <input id = "prequest" type="text" name = "prequest" class = "form-control" onchange ="signupcheck();"></div>
					</div>
					
					<div class = "row">
						<div class = "col-md-3 m-2">
							<label>받는사람주소</label>
						</div>
						<span>받는 사람 주소</span> <input id = "checkbox2" type="checkbox">회원과 동일 
						<div class="col-md-8">
							<div class = "row">
								<div class = "col-md-6"><input type="text" name = "address1" id="sample4_postcode" placeholder="우편번호" class="form-control"> 			</div>
								<div class = "col-md-6"><input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기" class="form-control"><br>			</div>
							</div>
							<div class = "row">
								<div class = "col-md-6"><input type="text" name = "address2" id="sample4_roadAddress" placeholder="도로명주소" class="form-control">	</div>
								<div class = "col-md-6"><input type="text" name = "address3" id="sample4_jibunAddress" placeholder="지번주소" class="form-control">	</div>
							</div>
							<input type="text" id="sample4_detailAddress" name = "address4" placeholder="상세주소" class="form-control">
						</div>
					</div>
					
			</div>
			
			<div class = "col-md-6 border p-3">
				<input type = "hidden" id="totalprice" value="<%=totalprice%>">
				<h3> 결제 정보 </h3>
				<h6> 결제 내용 </h6>
				<div class = "row">
					<div class = "col-md-3 m-2"><label>마일리지</label></div>
					<div class = "col-md-6"> 
						<input type="text" id = "point" placeholder="사용할 포인트" class = "form-control"> 
						<br>사용가능 마일리지 : <%=member.getM_point() %>
					</div>
					<div class="col-md-2">
						<button class="btn btn-info" onclick = "pointcheck('<%=member.getM_point()%>')">사용</button>
					</div>
				</div>
				<hr>
				
				<h6> 결제 금액 </h6>
					<div class = "row">
						<div class="col-md-3">총 주문금액</div>
						<div class="col-md-9 text-right">
							<span id = "totalprice"><%=totalprice %></span>
							(총 주문상품 수 : <%=carts.size() %>)
						</div>
						
						<div class="col-md-3">배송비</div>
						<div class="col-md-9 text-right">
							<span id = "totaldeliverypay">3000</span>
						</div>
						
						<div class="col-md-3">사용한 포인트</div>
						<div class="col-md-9 text-right">
							 <span id ="usepoint">0</span>
						</div>
						
						<div class="col-md-3">최종 결제금액</div>
						<div class="col-md-9 text-right">
							 <span id ="totalpay"><%=totalprice+3000 %></span>
						</div>
						
						
						
					</div>
				<hr>
				<h6>결제방식</h6>
					<div class ="row d-flex justify-content-around">
						<button onclick="requestPayselect('samsung');" class = "btn btn-outline-danger col-md-2">삼성페이</button>
						<button onclick="requestPayselect('card');" class = "btn btn-outline-danger col-md-2">신용카드</button>
						<button onclick="requestPayselect('trans');" class = "btn btn-outline-danger col-md-2">계좌이체</button>
						<button onclick="requestPayselect('vbank');" class = "btn btn-outline-danger col-md-2">가상계좌</button>
						<button onclick="requestPayselect('phone');" class = "btn btn-outline-danger col-md-2">휴대폰</button>
					</div>
					<div id = "payselect"></div>
					<div class = "row d-flex justify-content-around my-5">
						<button class = "col-md-5 form-control p-3 bg-success text-white" onclick="requestPay();">결제하기</button>
						<button class = "col-md-5 form-control">취소하기</button>
					</div>
					
				</div>
			</div>
		</div>
		<br><br><br><br><br><br><br><br><br><br><br><br>
		
		
	
</body>
</html>