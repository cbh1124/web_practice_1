package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.MemberDao;
import domain.Member;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Myinfoupdate implements Initializable {
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String loginid = MainpageController.getinstance().getloginid();
		
		Member member =  MemberDao.getMemberDao().getmember(loginid);
		
		// 2. DB에서 찾은 회원정보 레이블에 넣기
		lblid.setText(member.getM_id());
		txtname.setText(member.getM_name());
		txtemail.setText(member.getM_email());
		lblpoint.setText( member.getM_point()+"");
	}
	
	@FXML
    private Button btndelete;

    @FXML
    private Button btnupdate;

    @FXML
    private Label lblid;

    @FXML
    private Label lblpoint;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtname;

    @FXML
    void Cancel(ActionEvent event) {
    	 MainpageController.getinstance().loadpage("myinfo");
    }



	

	 @FXML
	 void update(ActionEvent event) {
		 
		 boolean result = MemberDao.getMemberDao().update(lblid.getText(), txtname.getText(), txtemail.getText() );
		 if(result) {
			 Alert alert = new Alert(AlertType.INFORMATION); alert.setHeaderText("회원정보 수정 완료"); alert.showAndWait();
			 MainpageController.getinstance().loadpage("myinfo");
		 
		 }
		 else {
			 Alert alert = new Alert(AlertType.INFORMATION); alert.setHeaderText("회원정보 수정 오류[관리자에게 문의]"); alert.showAndWait();
		 }
	 }
}

