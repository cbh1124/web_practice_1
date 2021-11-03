package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.BoardDao;
import domain.Board;
import domain.Reply;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.Alert.AlertType;

public class BoardviewController implements Initializable{
	
	Board board = BoardlistController.board;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		replytableload();
		// ���� ��ȸ 
			// ��ȸ�� ����  �ش� �����ڿ��� ���� ���� �Ѵ�. 
		BoardDao.getboardDao().viewupdate( board.getB_no() );
		txttitle.setText(board.getB_title());
		txtcontents.setText(board.getB_contents());
		lblwriter.setText("�ۼ��� :" + board.getB_write());
		lblday.setText( "�ۼ��� :" + board.getB_date().split(" ")[0]);
		lblview.setText("��ȸ�� : "+board.getB_view());
		// 
		if(! MainpageController.getinstance().getloginid().equals(board.getB_write()) ) {
			// �Խù� �ۼ��ڿ� �α��ε� ���̵� �ٸ���� 
				// ��ư �����  
			btndelete.setVisible(false);
			btnupdate.setVisible(false);
			
		}
		

	}
	
	@FXML
	private TextArea txtreply;
	
	@FXML
    private Button btncancel;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnreplywrite;

    @FXML
    private Button btnupdate;

    @FXML
    private TableView<Reply> replylist;
    
    // ���̺� �� �ε� �޼ҵ� [ ���� ��ħ�� �ϱ� ���ؼ� �޼ҵ�ȭ�� �Ѱ��� ] 
    public void replytableload() {
    	ObservableList<Reply> replys = BoardDao.getboardDao().replylist(board.getB_no()); // BoardDao�� �ִ� replylist�޼ҵ忡 
    	
    	TableColumn tc = replylist.getColumns().get(0);
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_no"));
    	
    	tc = replylist.getColumns().get(1);
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_write"));
    	
    	tc = replylist.getColumns().get(2);
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_contents"));
    	
    	tc = replylist.getColumns().get(3);
    	tc.setCellValueFactory(new PropertyValueFactory<>("r_date"));
    	
    	

    	
    	replylist.setItems(replys);
    }
    
    @FXML
    private TextArea txtcontents;

    @FXML
    private TextField txttitle;

    @FXML
    void cancel(ActionEvent event) {
    	MainpageController.getinstance().loadpage("boardlist");
    }

    @FXML
    void delete(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);  // ���� �����Ұ����� ���� 
    	alert.setHeaderText("�ش� �Խù��� �����Ͻðڽ��ϱ�?");
    	alert.setTitle("�˸�");
    	Optional<ButtonType> optional = alert.showAndWait();
    	if(optional.get() == ButtonType.OK) {
    		// ���� ���� 
    		boolean result = BoardDao.getboardDao().viewdelete(board.getB_no() );
    		if(result) {
    			MainpageController.getinstance().loadpage("boardlist");
    		}
    	}
    }

    @FXML
    void replywrite(ActionEvent event) {
    	Reply reply = new Reply(txtreply.getText(), MainpageController.getinstance().getloginid(), board.getB_no());
    	boolean result = BoardDao.getboardDao().replywrite(reply);
    	System.out.println(reply.getR_b_no() + reply.getR_contents() + reply.getR_write());
    	if(result) { 
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("��۵��");
    		alert.showAndWait();
    		// ��� ����Ʈ �ε� 
    		replytableload();
    		// ��� �Է�â �ʱ�ȭ 
    		txtreply.setText(" ");
    	}
    	
    }
    
    boolean upcheck = true; // ������Ʈ ��ư ����ġ ���� 
    
    @FXML
    void update(ActionEvent event) {
    	Alert alert = new Alert(AlertType.INFORMATION);
    	if(upcheck) {
	    	
	    	alert.setHeaderText("���� ���� �� �ٽ� ��ư Ŭ���� ���� �Ϸ� �˴ϴ�.");
	    	alert.showAndWait();
	    	
	    	txttitle.setEditable(true); // properties�� editable�� �����ִٸ� �����Ͽ� ���� 
	    	txtcontents.setEditable(true); // properties�� seteditable�� �����ִٸ� �����Ͽ� ���� 
	    	upcheck = false;
    	}
    	else {
    		//DB ó�� 
    		BoardDao.getboardDao().update( board.getB_no(), txttitle.getText(), txtcontents.getText() );
    		alert.setHeaderText("�Խù��� ���� �Ǿ����ϴ�.");
	    	alert.showAndWait();
	    	
    		upcheck = true;
    		txttitle.setEditable(false);
    		txtcontents.setEditable(false);
    	}
    }
    
    @FXML
    private Label lblday;

    @FXML
    private Label lblview;

    @FXML
    private Label lblwriter;
}
