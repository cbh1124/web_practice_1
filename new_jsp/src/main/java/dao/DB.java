package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DB {
	
	
// 1. ���� ����ϴ� �������̽� 
		 Connection con;
		 ResultSet rs;
		 PreparedStatement ps;
		
		public DB() {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		         con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jsp?serverTimezone=UTC", "root", "1234");
				System.out.println(" db ���� ����");
			}
			catch (Exception e) {
				System.out.println(" * DB ���� ���� : " + e);
				}
			}
			
		public static MemberDao memberDao = new MemberDao();
		public static MemberDao getMemberDao() {return memberDao;}
}
