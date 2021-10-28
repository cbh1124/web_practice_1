package Day01;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppMain extends Application {
	// 1. Application : javafx 에게 상속 받기
	
	// 2. 오버라이딩 : start 메소드 
	@Override
	public void start(Stage primaryStage) throws Exception {
								// 3. Stage 이름 정하기 
		primaryStage.show(); // 윈도우 보여주기 
		// 4. 해당 stage 실행 
	}
	
	// requires 사용할 모듈명 
	// opens 패키지명 to 도듈명 
	
	public static void main(String[] args) {
		launch(args);
	}
}
