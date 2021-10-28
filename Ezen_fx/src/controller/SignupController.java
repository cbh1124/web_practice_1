package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class SignupController {
		
		// 현재 클래스를 객체화 
		

	 @FXML
	 private Label btnback;

	 @FXML
	 private BorderPane mainboarderpane;

	 @FXML
	 private AnchorPane signuppane;

	 @FXML
	 void back(MouseEvent event) {
		 	// 1. 메소드 호출하는 방법 : 1. static /2. 객체 
		 	// !! 새로운 객체 선언시에는 새로운 메모리 
		 // LoginController loginController = new LoginController
		 	
		 	// 동일한 메모리 사용하기 위해서 this 키워드를 사용한 객체호출 
		 LoginController.getinstance().loadpage("login");
		 
	    	
	 }


}
