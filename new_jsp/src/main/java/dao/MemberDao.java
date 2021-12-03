package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Member;

public class MemberDao {
	// 1. DB 
	
	// 1. ���� ->  ���̺귯�� �߰� 
	
	// 2. ������Ʈ �� WEB-INF -> lib -> ���̺귯�� �߰�
	
		// 1. ���� ����ϴ� �������̽� 
		private Connection con;
		private ResultSet rs;
		private PreparedStatement ps;
		
		public MemberDao() {
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
		
		// 1. ȸ������ �޼ҵ� 
		
		//1. ȸ������ �޼ҵ� 
		public boolean membersignup( dto.Member member) {
			
			String sql = "insert into member(m_id,m_password,m_name,m_birth,m_sex,m_phone,m_address) values(?,?,?,?,?,?,?)";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, member.getM_id() );	ps.setString(2, member.getM_password() );
				ps.setString(3, member.getM_name() );	ps.setString(4, member.getM_birth() );
				ps.setString(5, member.getM_sex() );	ps.setString(6, member.getM_phone() );
				ps.setString(7, member.getM_address() );	ps.executeUpdate();
				return true;
			}
			catch (Exception e) {}
			return false;
		}
		
		//2. �α��� �޼ҵ�
		public boolean memberlogin( String id, String password) {
			
			String sql = "select * from member where m_id=? and m_password=?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString( 1 , id);
				ps.setString( 2 , password);
				rs = ps.executeQuery();
				
				if( rs.next() ) { 
					return true; 
				}
				else {
					return false; 
				}
				
			}
			catch (Exception e) {
				
			}
			return false;
		}
		
		// 3. ���̵� üũ �޼ҵ� 
		public boolean idcheck(String userid) {
			String sql = "select m_id from member where m_id =?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, userid);
				rs = ps.executeQuery();
				
				if(rs.next()) {
					return true;
				}else {
					return false;
				}
			}catch (Exception e){
				
			}
			
			return false;
		}
		
		// 4. ȸ�� ����
		public ArrayList<Member> memberinfo(String userid) {
			ArrayList<Member> members = new ArrayList<Member>();
			String sql = "select * from member where m_id = ?";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, userid);
				rs = ps.executeQuery();
				while(rs.next()) {
					Member member2 = new Member(
									rs.getString(1),
									rs.getString(2),
									rs.getString(3),
									rs.getString(4),
									rs.getString(5),
									rs.getString(6),
									rs.getString(7)	
								);
					members.add(member2);
				}	return members;
			}catch(Exception e){
				
			}return members;
			
		}
		
		// ȸ�� Ż�� �޼ҵ�  Ȯ�ο� 
		
		public boolean delete(String id , String password) {
			
			String sql1 = "select * from  member where m_id = ? and m_password = ?";
					
			String sql2 = "delete from member where m_id =? and m_password = ?";
			try {
				ps = con.prepareStatement(sql1);
				ps.setString(1, id);
				ps.setString(2, password);
				rs = ps.executeQuery();
				if( rs.next() ){ // ���̵�� ��й�ȣ�� ������ ��쿡�� ȸ�� ���� 
					PreparedStatement ps2 = con.prepareStatement(sql2);
					ps2.setString(1, id);
					ps2.setString(2, password);
					ps2.executeUpdate();
					return true;
				}
				
			}catch (Exception e){
				System.out.println(e);
			}
			
			return false;
		}
		
		// ȸ�� ���� ��� �޼ҵ�
		public Member getmember( String id ) {
			
			String sql = "select * from member where m_id =? ";
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, id);
				rs = ps.executeQuery();
				if( rs.next() ) {
					// ������ ���̵��� ���ڵ带 ��й�ȣ�� ������ ��üȭ
					Member member = new Member(
								rs.getInt(1) ,
								rs.getString(2) ,
								null ,
								rs.getString(4) ,
								rs.getString(5) ,
								rs.getString(6) ,
								rs.getString(7) ,
								rs.getString(8) ,
								rs.getInt(9) ,
								rs.getString(10) 
							);
					return member;
				}
			}catch (Exception e) {} return null;
			
		}
		
		public boolean namechange(String name , String id) {
			String sql = "update member set m_name = ? where m_id = ? ";
			
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setString(2, id);
				ps.executeUpdate();
				return true;
			}catch (Exception e) {
				
			}return false;
		}
		
		
		public boolean wildchange(String inset ,String inset2 , String id) {
			String sql = "update jsp.member set "+inset+" = ? where m_id = ? ";
			System.out.println(inset);
			System.out.println(inset2);
			System.out.println(id);
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, inset2);
				ps.setString(2, id);
				ps.executeUpdate();
				return true;
			}catch (Exception e) {
				
			}return false;
		}
}


/*try {
	preparedStatement = connection.prepareStatement(sql);
	preparedStatement.setInt(1, r_b_no);
	resultSet = preparedStatement.executeQuery();
	
	while(resultSet.next()) {
		Reply reply = new Reply(resultSet.getInt(1) ,
				resultSet.getString(2),
				resultSet.getString(3),
				resultSet.getString(4),
				resultSet.getInt(5) );
		replys.add(reply);
	}
	return replys;
	}
	catch (Exception e) {
	
	}return replys;
*/