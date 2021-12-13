<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file ="header.jsp" %>
		<div class = "container">
		<div class="row">
			<div class = "col">
			 	<h3>공지사항</h3>
			 	<ul>
			 		<li>엄격한 분위기에서 글을 써주세요</li>
			 		<li>엄격한 분위기에서 글을 써주세요</li>
			 		<li>엄격한 분위기에서 글을 써주세요</li>
			 	</ul>
			</div>
			<div class = "col">
			 
			</div>
			
			
		</div>
		<br>
		<br>
		<br>
		<br>
		
		<button type="button" class="btn btn-outline-primary"><a href="/new_jsp/TEST/boardwrite.jsp">글쓰기</a></button>
			<table class = "table table-striped">
				<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작성자</th>
					<th>날짜</th>
					<th>조회수</th>
				</tr>
				</thead>
				<tbody>
				<tr> 
					<th>1</th>
					<th>안녕하세요</th>
					<th>최병호</th>
					<th>2021-12-10</th>
					<th>5</th>
					<th><button>삭제</button><button>수정</button></th>
				</tr>
				<tr> 
					<th>1</th>
					<th>안녕하세요</th>
					<th>최병호</th>
					<th>2021-12-10</th>
					<th>5</th>
					<th><button>삭제</button><button>수정</button></th>
				</tr>
				<tr> 
					<th>1</th>
					<th>안녕하세요</th>
					<th>최병호</th>
					<th>2021-12-10</th>
					<th>5</th>
					<th><button>삭제</button><button>수정</button></th>
				</tr>
				<tr> 
					<th>1</th>
					<th>안녕하세요</th>
					<th>최병호</th>
					<th>2021-12-10</th>
					<th>5</th>
					<th><button>삭제</button><button>수정</button></th>
				</tr>
				<tr> 
					<th>1</th>
					<th>안녕하세요</th>
					<th>최병호</th>
					<th>2021-12-10</th>
					<th>5</th>
					<th><button>삭제</button><button>수정</button></th>
				</tr>
				</tbody>
			</table>
			
		</div>
		<br><br><br><br><br>
	<%@include file ="footer.jsp" %>
</body>
</html>