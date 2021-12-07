<%@page import="dto.Reply"%>
<%@page import="java.io.File"%>
<%@page import="java.util.ArrayList"%>
<%@page import="dao.BoardDao"%>
<%@page import="dao.MemberDao"%>
<%@page import="dto.Board"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		
	<%@include file = "../header.jsp" %> <!-- 헤더 페이지 -->
	
		<%
				int b_num = Integer.parseInt( request.getParameter("b_num")) ; // 전 페이지에서 클릭한 게시물번호	
				String boardviews =  loginid +":"+b_num;					// 1. 현재로그인 id + 게시물 번호 ; => 세션이름 사용예정
				if( session.getAttribute( boardviews) == null ){			// 2. 현재 로그인 id + 게시물의 세션명이 존재하지 않으면  	// 조회수 증가
					BoardDao.getboarddao().boardcount(b_num);				// 3. DB호출 [// 조회수 증가]
					// 조회수 증가 방지 [ 세션 생성 : 세션아이디 , 세션값 ]  	// 4. 
					String boardview = loginid +":"+b_num;
					session.setAttribute( boardview ,  true   );
					session.setMaxInactiveInterval(60*60*24);	// 세션 유효시간 : 초당 [ 하루 ]
				}
			// 해당 게시물번호의 게시물 가져오기
			Board board =BoardDao.getboarddao().getboard(b_num);
		%>
		<%!
			public static int b_num;
		%>
		<!-- 게시물 상세 페이지 -->
		<div class="container">
			<div class="row">
				<div class="m-2"> <a href="boardlist.jsp"><button class="form-control">목록보기</button></a> </div>
				<%if(loginid != null && loginid.equals(board.getB_writer())) {%>
					<div class="m-2"> <a href="boardupdate.jsp?b_num=<%=board.getB_num()%>"><button class="form-control">수정하기</button></a> </div>
					<div class="m-2"> <a href="../../controller/boarddeletecontroller.jsp?b_num=<%=board.getB_num()%>"><button class="form-control">삭제하기</button></a> </div>
				<%} %>	
			</div>
			<table class="table">
				<tr>
					<td style="width: 20%"> 작성자 <%=board.getB_writer() %> </td> 
					<td> 작성일 <%=board.getB_date() %> </td>
					<td> 조회수 <%=board.getB_view() %> </td>
				</tr>
				<tr>
					<td>제목</td> <td colspan="2"> <%=board.getB_title() %> </td>
				</tr>
				<tr>
					<td style="height:300px;">내용</td> <td colspan="2">  <%=board.getB_contents() %>  </td>
				</tr>
				<tr>
					<td> 첨부파일 다운로드 <br>
					<% if(board.getB_file() == null){ %>
						<td colspan = "2" height ="300px;"> </td>
					<% } else{ %>
					<a href="../../controller/filedowncontroller.jsp?file=<%=board.getB_file()%>"><%=board.getB_file() %></a> 
					<% } %>
					</td> 
					
					<td colspan="2"> 미리보기<br> <img src="../../upload/<%=board.getB_file()%>" width="100%"></td>
					
				</tr>
			</table>
		</div>
		<!-- 댓글 상세 페이지  -->
		<%
		ArrayList<Reply> replys = BoardDao.getboarddao().replylist();
									
		%>
		<div class="container">
			<div class="card mb-2">
				<div class="card-header bg-light">
				        <i class="fa fa-comment fa"></i> 댓글 상세 페이지
				</div>
				
				<div class="card-body">
					<ul class="list-group list-group-flush">
					    <li class="list-group-item">
				<%
					for(Reply reply : replys){
				%>			
						<br>
						<div class="form-inline mb-2">
							<label for="replyId">작성자 :  <%=reply.getM_num() %> </label> 
						</div>
						<div class="form-inline mb-2">
							<label for="replyId">작성시간 :  <%=reply.getR_date() %> </label> 
						</div>
						<textarea class="form-control" id="exampleFormControlTextarea1" rows="3" readonly>
							<%=reply.getR_contents()%>
						</textarea>
						<br>
				<%
					}
				%>
					    </li>
					</ul>
				</div>
			</div>
		</div>
		
		<!-- 댓글 달기 페이지  -->
		<div class = "container">
			<div class="card mb-2">
				<div class="card-header bg-light">
				       <i class="fa fa-comment fa"></i> 댓글
				</div>
				<div class="card-body">
					<ul class="list-group list-group-flush">
					    <li class="list-group-item">
						<form action="../../controller/replywritecontroller.jsp" method = "post" >
							<textarea name = "reply" class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
							<button type="button" class="btn btn-dark mt-3" onClick="javascript:addReply();">댓글달기</button>
						</form>
					    </li>
					    
					</ul>
				</div>
			</div>
		</div>
		
</body>
</html>

