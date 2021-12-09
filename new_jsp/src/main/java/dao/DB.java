package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
	
	
// 1. 자주 사용하는 인터페이스 
		 Connection con;
		 ResultSet rs;
		 PreparedStatement ps;
		
		public DB() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		         con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jsp?serverTimezone=UTC", "root", "1234");
				System.out.println(" db 연동 성공");
			}
			catch (Exception e) {
				System.out.println(" * DB 연동 실패 : " + e);
				}
			}
			
		public static MemberDao memberDao = new MemberDao();
		public static MemberDao getMemberDao() {return memberDao;}
}
