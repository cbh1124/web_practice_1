<%@page import="new_jsp.Lotto"%>
<%@page import="new_jsp.Book"%>
<%@page import="new_jsp.Board"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="new_jsp.Member"%>
<%@page import="java.util.ArrayList"%>
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
		// ���� ȣ�� 
		String loginid = (String)session.getAttribute("loginid");
	%>
	<%
	ArrayList<Member> members = new ArrayList<>();  	// 1. ȸ���ʱ�ȭ
	// 2. �����Է½�Ʈ�� ����
	FileInputStream fileInputStream = new FileInputStream( "C:/Users/ez201207/git/web_practice_1/new_jsp/src/main/memberlist.txt");
	byte[] bytes = new byte[1000];	// 3. �о�� ����Ʈ�� ������ ����Ʈ�迭
	fileInputStream.read( bytes );	// 4. ���� �б� -> ����Ʈ�迭 ����
	String smember = new String(bytes);	// 5. ����Ʈ�迭 -> ���ڿ� ��ȯ 
	String[] ssmember = smember.split("\n"); // 6. ���ڿ� ���� [ \n ] : ȸ������
	for( int i = 0 ; i<ssmember.length-1 ; i++ ){ // 7. ������ \n ������ �ݺ���
		// ��üȭ
		Member member = new Member( ssmember[i].split(",")[0] ,
									ssmember[i].split(",")[1] ,
									ssmember[i].split(",")[2] );
		members.add(member); // ����Ʈ�� ��ü ����
	}
	
		// �Խù� ����
		ArrayList<Board> boards = new ArrayList<>();
		fileInputStream = new FileInputStream("C:/Users/ez201207/git/web_practice_1/new_jsp/src/main/boardlist.txt");
		bytes = new byte[1000];
		fileInputStream.read(bytes);
		String sboard = new String(bytes);
		String[] ssboard = sboard.split("\n");
		for(int i =0; i<ssboard.length-1; i++){
			Board board = new Board(ssboard[i].split(",")[0], 
									ssboard[i].split(",")[1],
									ssboard[i].split(",")[2]
					);
					boards.add(board);
		}
		
		String[] books = {   "�ȴ�! ���̹� ��α�&����Ʈ","������ ��Ʈ ���� Ȱ�� ������","Tucker�� Go ��� ���α׷���","ȥ�� �����ϴ� C ���"};
	    
		int[] number = new int[6];
		int[] random = new int[6];
		int[] num2 = new int[6];
		ArrayList <Lotto> lottoss = new ArrayList<>(); 
	%>

	<h3> <a href="main.jsp"> ������ ���� </a> </h3>
	<ul>
		<% if( loginid != null ){ out.print("<li>"+loginid+"�� �ȳ��ϼ���</li>"); } %>
		<% if( loginid != null ){ %>
			<li> <a href="logout.jsp">�α׾ƿ�</a> </li>
		<% } %>
		<li> <a href="login.jsp">�α���</a> </li>
		<li> <a href="signup.jsp">ȸ������</a> </li>
		<li> <a href="boardlist.jsp">�Խ���</a> </li>
		<li> <a href="book.jsp">�����˻�</a> </li>
		<li> <a href="lotto.jsp">�����ζ�</a> </li>
	</ul>
	
</body>
</html>