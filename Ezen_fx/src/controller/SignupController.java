package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class SignupController {
		
		// ���� Ŭ������ ��üȭ 
		

	 @FXML
	 private Label btnback;

	 @FXML
	 private BorderPane mainboarderpane;

	 @FXML
	 private AnchorPane signuppane;

	 @FXML
	 void back(MouseEvent event) {
		 	// 1. �޼ҵ� ȣ���ϴ� ��� : 1. static /2. ��ü 
		 	// !! ���ο� ��ü ����ÿ��� ���ο� �޸� 
		 // LoginController loginController = new LoginController
		 	
		 	// ������ �޸� ����ϱ� ���ؼ� this Ű���带 ����� ��üȣ�� 
		 LoginController.getinstance().loadpage("login");
		 
	    	
	 }


}
