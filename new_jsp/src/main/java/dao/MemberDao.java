package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import domain.Reply;
import dto.Member;

public class MemberDao {
	// 1. DB 
	
	// 1. 빌드 ->  라이브러리 추가 
	
	// 2. 프로젝트 내 WEB-INF -> lib -> 라이브러리 추가
	
		// 1. 자주 사용하는 인터페이스 
		private Connection con;
		private ResultSet rs;
		private PreparedStatement ps;
		
		public MemberDao() {
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
		
		// 1. 회원가입 메소드 
		
		//1. 회원가입 메소드 
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
		
		//2. 로그인 메소드
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
		
		// 3. 아이디 체크 메소드 
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