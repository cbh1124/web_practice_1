package Day02;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day02_1 extends Application {
		// 1. javafx로부터 상속받아서 
	@Override // 2. start 메소드 오버라이딩
	public void start(Stage stage) throws Exception {
				// 3. stage이름 정하기
		
		
		// 6. 씬빌더 파일 가져오기 
			// 1. 
			Parent parent = FXMLLoader.load(getClass().getResource("/fxml/test2.fxml"));
			
			// 2. 씬에 넣기 
			Scene scene = new Scene(parent);
			
			// 3. 스테이지에 씬 넣기 
			stage.setScene(scene);
		stage.show(); // 4. stage 열기	
	}
	
	public static void main(String[] args) {
		launch(args); // 5. start 메소드 호출 
	}
}
