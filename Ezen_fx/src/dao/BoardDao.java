package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import domain.Board;
import domain.Reply;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BoardDao {

	// 1. �ʵ� 
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;
	
	//��ü 
	private static BoardDao boardDao = new BoardDao();
	
	public BoardDao() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3307/javafx?serverTimezone=UTC" , 
					"root" , "1234");
			System.out.println(" db ���� ����");
		}
		catch (Exception e) {
			System.out.println(" * DB ���� ���� : " + e);
		}
	}
	// ��ü ��ȯ �޼ҵ� 
	public static BoardDao getboardDao() {return boardDao;}
	
	
	// 3. �޼ҵ� [ CRUD ] 
		// 1. �Խù� ��� �޼ҵ� 
	public boolean write(Board board) {
		String sql = "insert into board(b_title, b_contents, b_write ) values(?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, board.getB_title());
			preparedStatement.setString(2, board.getB_contents());
			preparedStatement.setString(3, board.getB_write());
			preparedStatement.executeUpdate();
			return true;
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	
		// 2. �Խù� ��ȸ �޼ҵ� 
	public ObservableList<Board> boardlist( ){
		
		ObservableList<Board> boards = FXCollections.observableArrayList();
		
		// 0 . ����Ʈ ���� 
		ArrayList<Board> arrayList = new ArrayList<Board>();
		
		// 1. ���� ���� ��� �������� 
		
		String sql = "select * from board order by b_no desc";
		try {
			preparedStatement = connection.prepareStatement(sql);
			resultSet = preparedStatement.executeQuery();
			// 2. 
			while(resultSet.next()){
				// ���� ����� ���ڵ尡 ������ ���� �ݺ� 
				Board board = new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
				// ��ü�� ����Ʈ�� ��� 
				boards.add(board);
				
			}
			return boards;
		
		
		}catch (Exception e) {} return boards;
		
	
		
	}

	
		// 3. �Խù� ���� �޼ҵ�  
	public boolean viewdelete( int b_no ) {
		String sql = "delete from board where b_no = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, b_no); 
			preparedStatement.executeUpdate(); // sql ����
			return true;
		} catch (Exception e) {
			
		}return false;
		
	}
	
		// 4. �Խù� ���� �޼ҵ� 
	public boolean update(int b_no, String b_title, String b_contents) {
		
		String sql = "update board set b_title =?, b_contents =? where b_no = ?"; // ������Ʈ 
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(3, b_no);
			preparedStatement.setString(1, b_title);
			preparedStatement.setString(2, b_contents);
			preparedStatement.executeUpdate(); // sql ����
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}return false;
	}
	
		// 5. �Խù� ������ȸ �޼ҵ�  
	
		// 6. �Խù� ���� �޼ҵ�   // �ش� �μ����� ������Ʈ �ҰŴϱ� ���ο� �ִ� ���� �����ͼ� db���� �߰� �ؼ� ī��Ʈ ���� 
	public boolean viewupdate( int b_no ) {
		String sql = "update board set b_view = b_view+1 where b_no = ?";
		
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, b_no);
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {
			
		}return false;
		
	}
	
		// 7. ��� ��� �޼ҵ� 
	public boolean replywrite(Reply reply) {
		
		String sql = "insert into reply(r_contents, r_write, r_b_no) values(?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, reply.getR_contents());
			preparedStatement.setString(2, reply.getR_write());
			preparedStatement.setInt(3, reply.getR_b_no());
			preparedStatement.executeUpdate();
			return true;
		} catch (Exception e) {
			
		}return false;
	}
		// 8. ��� ��� �޼ҵ� 
	public ObservableList<Reply> replylist(int r_b_no){
		ObservableList<Reply> replys = FXCollections.observableArrayList();
		
		String sql = "select * from reply where r_b_no = ? order by r_no desc";
		
		try {
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
	}
	
	// 9. �α��ε� ȸ���� �Խù� ��� 
	public ObservableList<Board> myboardlist(String id){
		
		ObservableList<Board> boards = FXCollections.observableArrayList();
		
		// 0 . ����Ʈ ���� 
		ArrayList<Board> arrayList = new ArrayList<Board>();
		
		// 1. ���� ���� ��� �������� 
		
		String sql = "select * from board where b_write = ? order by b_no desc";
		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			resultSet = preparedStatement.executeQuery();
			// 2. 
			while(resultSet.next()){
				// ���� ����� ���ڵ尡 ������ ���� �ݺ� 
				Board board = new Board(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
				// ��ü�� ����Ʈ�� ��� 
				boards.add(board);
				
			}
			return boards;
		
		
		}catch (Exception e) {} return boards;
	}
	
	// 10. ��ü �Խù� �� ��ȯ
		public int boardcount() {
			String sql = "select count(*) from board";
			try {
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				if( resultSet.next() ) {
					return resultSet.getInt(1);
				}
			}catch (Exception e) {}
			return 0;
		}
	
	
	
	
	
	
	
	
	
	
	
	
}