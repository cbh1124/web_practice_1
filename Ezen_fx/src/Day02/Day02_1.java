package Day02;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day02_1 extends Application {
		// 1. javafx�κ��� ��ӹ޾Ƽ� 
	@Override // 2. start �޼ҵ� �������̵�
	public void start(Stage stage) throws Exception {
				// 3. stage�̸� ���ϱ�
		
		
		// 6. ������ ���� �������� 
			// 1. 
			Parent parent = FXMLLoader.load(getClass().getResource("/fxml/test2.fxml"));
			
			// 2. ���� �ֱ� 
			Scene scene = new Scene(parent);
			
			// 3. ���������� �� �ֱ� 
			stage.setScene(scene);
		stage.show(); // 4. stage ����	
	}
	
	public static void main(String[] args) {
		launch(args); // 5. start �޼ҵ� ȣ�� 
	}
}
