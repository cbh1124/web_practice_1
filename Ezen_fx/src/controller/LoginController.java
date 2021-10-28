package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class LoginController implements Initializable {
										// 초기화 관련된 메소드 제공 
	// 현재 클래스를 객체화 [ 클래스 자체의 객체 ]
		// 1. static 변수 선언 
	private static LoginController instance;
	
	public LoginController() {
		// 2. 현재 클래스의 메모리 = this 
		instance = this; // [현재 클래스의 멤버 포함]
	}
		// 3. private instance 반환 
	public static LoginController getinstance() {
		return instance;
	}
	
	// fxml 실행시 초기값 설정 메소드 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText(""); // 경고 메시지는 공백 설정 
			
	}
	
	@FXML
    private Label btnfind;

    @FXML
    private Label btnfindpassword;

    @FXML
    private Button btnlogin;

    @FXML
    private Label btnsignup;

    @FXML
    private Label lblconfirm;

    @FXML
    private AnchorPane loginpane;

    @FXML
    private BorderPane mainboarderpane;

    @FXML
    private TextField txtid;

    @FXML
    private PasswordField txtpassword;

    @FXML
    void findid(MouseEvent event) {
    	
    }

    @FXML
    void findpassword(MouseEvent event) {

    }

    @FXML
    void login(ActionEvent event) {
    	
    	// txt 입력된 아이디와 패스워드 회원과 동일하면 로그인성공 
    	if(txtid.getText().equals("admin") && txtpassword.getText().equals("1234")) {
    		// 아이디와 패스워드가 동일하면 로그인 성공 
    		lblconfirm.setText("로그인성공");
    	}else {
    		lblconfirm.setText("로그인 실패 : 동일한 회원정보가 없습니다.");
    	}
    	// 아니면 실패 
    	
    }

    @FXML
    void signup(MouseEvent event) {
    	System.out.println("dd");
    	loadpage("signup"); // 로그인 페이지에서 회원가입 페이지로 변경 하기 위해 load하는 함수 
    }

    
	
	// fx:controller = "controller.LoginController" 추가해야됨  fx:controller = "controller.LoginController"
	// 2. 생성자
	
	// 3. 메소드 

	// boarderpane center 변경 
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/fxml/" + page + ".fxml"));
			mainboarderpane.setCenter(parent);
		}
		catch(Exception e) {
			
		}
		
	}
}
