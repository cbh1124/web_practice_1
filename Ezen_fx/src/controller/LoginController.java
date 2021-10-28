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
										// �ʱ�ȭ ���õ� �޼ҵ� ���� 
	// ���� Ŭ������ ��üȭ [ Ŭ���� ��ü�� ��ü ]
		// 1. static ���� ���� 
	private static LoginController instance;
	
	public LoginController() {
		// 2. ���� Ŭ������ �޸� = this 
		instance = this; // [���� Ŭ������ ��� ����]
	}
		// 3. private instance ��ȯ 
	public static LoginController getinstance() {
		return instance;
	}
	
	// fxml ����� �ʱⰪ ���� �޼ҵ� 
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lblconfirm.setText(""); // ��� �޽����� ���� ���� 
			
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
    	
    	// txt �Էµ� ���̵�� �н����� ȸ���� �����ϸ� �α��μ��� 
    	if(txtid.getText().equals("admin") && txtpassword.getText().equals("1234")) {
    		// ���̵�� �н����尡 �����ϸ� �α��� ���� 
    		lblconfirm.setText("�α��μ���");
    	}else {
    		lblconfirm.setText("�α��� ���� : ������ ȸ�������� �����ϴ�.");
    	}
    	// �ƴϸ� ���� 
    	
    }

    @FXML
    void signup(MouseEvent event) {
    	System.out.println("dd");
    	loadpage("signup"); // �α��� ���������� ȸ������ �������� ���� �ϱ� ���� load�ϴ� �Լ� 
    }

    
	
	// fx:controller = "controller.LoginController" �߰��ؾߵ�  fx:controller = "controller.LoginController"
	// 2. ������
	
	// 3. �޼ҵ� 

	// boarderpane center ���� 
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource("/fxml/" + page + ".fxml"));
			mainboarderpane.setCenter(parent);
		}
		catch(Exception e) {
			
		}
		
	}
}
