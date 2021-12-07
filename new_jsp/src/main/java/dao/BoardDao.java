package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Board;
import dto.Reply;

public class BoardDao {
	
	private Connection con;
	private ResultSet rs;
	private PreparedStatement ps;
	
	// 2. ������ 
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/jsp?serverTimezone=UTC" , "root","1234");
		
		}
		catch (Exception e) {System.out.println("[���� ����]");}
	}
	public static BoardDao boarddao = new BoardDao() ; 	// 3. Dao ��ü ����
	public static BoardDao getboarddao() { return boarddao; } // 4. Dao ��ü ��ȯ
	
	// �Խù� �ۼ�
	public boolean boardwrite( Board board ) {
		
		String sql = "insert into board( b_title , b_contents , m_num , b_file) values(?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);	
			ps.setString(1, board.getB_title() ); 	ps.setString(2, board.getB_contents());
			ps.setInt(3, board.getM_num());			ps.setString(4, board.getB_file());
			ps.executeUpdate();		return true;
		}catch (Exception e) { System.out.println(e);}	return false;	
	}
	// ��� �Խù� ���
	public ArrayList<Board> boardlist(){
		ArrayList<Board> boards = new ArrayList<Board>(); 
		String sql ="select * from board order by b_num DESC";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next() ) {
				
				Board board = new Board( rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3),
						 rs.getInt(4), 
						 rs.getString(5),
						 rs.getString(6),
						 rs.getInt(7),
						 rs.getInt(8));
				boards.add(board);
			}
			return boards;
		}catch (Exception e) {} return null;
	}
	
	// �Խù���ȣ�� �ش� �Խù� �������� 
	public Board getboard( int b_num) {
		String sql = "select * from board where b_num=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_num);
			rs = ps.executeQuery();
			if( rs.next() ) {
				Board board = new Board( rs.getInt(1), 
						rs.getString(2), 
						rs.getString(3),
						 rs.getInt(4), 
						 rs.getString(5),
						 rs.getString(6),
						 rs.getInt(7),
						 rs.getInt(8));
				return board;
			}
		}catch (Exception e) {} return null;
		
	}
	
	public boolean boardcount(int b_num) {
		String sql = "update board set b_view = b_view + 1 where b_num = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_num); ps.executeUpdate();
			return true;
		} catch (Exception e) {
			
		}return false;
	}
	
	
	public boolean boarddelete(int b_num) {
		String sql = "delete from board where b_num = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_num); ps.executeUpdate();
			return true;
		} catch (Exception e) {
			
		}return false;
	}
	
	public boolean boardupdate(Board board) {
		String sql = "update board set b_title = ?, b_contents = ?, b_file=? where b_num";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getB_title()); 
			ps.setString(2, board.getB_contents()); 
			ps.setString(3, board.getB_file()); 
			ps.setInt(4, board.getB_num()); 
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			
		}return false;
	}
	
	// ��� ��� ���
		public ArrayList<Reply> replylist(){
			ArrayList<Reply> replys = new ArrayList<Reply>(); 
			String sql ="select * from reply order by r_num DESC";
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while( rs.next() ) {
					Reply reply = new Reply(rs.getInt(1),
							rs.getString(2), 
							rs.getString(3), 
							rs.getInt(4), 
							rs.getInt(5));
					
					
					replys.add(reply);
				}
				return replys;
			}catch (Exception e) {} return null;
		}
		
		// ��� �ۼ��ϱ�
		// �Խù� �ۼ�
		public boolean replywrite( Reply reply ) {
			
			String sql = "insert into jsp.reply( r_contents , r_date , m_num , b_num ) values(?,?,?,?)";
			try {
				ps = con.prepareStatement(sql);	
				ps.setString(1, reply.getR_contents());
				ps.setString(2, reply.getR_date());		ps.setInt(3, reply.getM_num());
				ps.setInt(4, reply.getB_num());
				ps.executeUpdate();		
				return true;
			}catch (Exception e) { System.out.println(e);}	return false;	
		} 
	
}
