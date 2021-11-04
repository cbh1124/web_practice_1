package controller;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

import dao.ProductDao;
import domain.Product;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.stage.FileChooser.ExtensionFilter;

public class ProductupdateController implements Initializable{
	Product product = ProductlistController.product;  // 1. 테이블뷰에서 클릭된 객체 
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		txtpname.setText(product.getP_name());			  // 2. 클릭된 객체 제품명 
		txtpcontents.setText(product.getP_contents());    // 3. 클릭된 객체 제품내용 
		txtprice.setText(product.getP_price() +"");       // 4. 클릭된 객체 제품가격
			Image image = new Image(product.getP_img());  // 5. 클릭된 객체 제품명 
		pimg.setImage(image);
		lblimgpath.setText(product.getP_img());
		pimage = product.getP_img(); // 수정이 없을경우 기존 이미지 그대로 
		// 제품에 저장된 카테고리별 라디오 버튼 클릭 세팅 [ setSelect(true) ]
		if(product.getP_category().equals("의류")) { opt_1.setSelected(true); }
		if(product.getP_category().equals("신발")) { opt_2.setSelected(true); }
		if(product.getP_category().equals("가방")) { opt_3.setSelected(true); }
		if(product.getP_category().equals("ACC")) { opt_4.setSelected(true); }
		
	}
	
	
		@FXML
	    private Button btncancel;

	    @FXML
	    private Button btnimgadd;

	    @FXML
	    private Button btnupdate;

	    @FXML
	    private ToggleGroup category;

	    @FXML
	    private Label lblimgpath;

	    @FXML
	    private RadioButton opt_1;

	    @FXML
	    private RadioButton opt_2;

	    @FXML
	    private RadioButton opt_3;

	    @FXML
	    private RadioButton opt_4;

	    @FXML
	    private ImageView pimg;

	    @FXML
	    private TextArea txtpcontents;

	    @FXML
	    private TextField txtpname;

	    @FXML
	    private TextField txtprice;

	    @FXML
	    void cancel(ActionEvent event) {
	    	MainpageController.getinstance().loadpage("productlist");
	    }
	    
	    private Stage stage; // 파일 선택 스테이지 
	    private String pimage; // 선택된 파일의 경로 

	    @FXML
	    void imgadd(ActionEvent event) {
	    	// 1. 파일 선택 클래스 
			 FileChooser fileChooser = new FileChooser(); // 파일 선택시 경로 저장 
			 
			 // 2. 파일 스테이지 선택  getExtensionFilters : 선택할 파일 필터 
			 fileChooser.getExtensionFilters().add(
					 new ExtensionFilter("그림파일 : Image File", "*png", "*jpg", "*gif"));
			
			 // 3. 스테이지 실행 파일선택 클래스 넣기 
			 
			 File file = fileChooser.showOpenDialog(stage);
			 	// 선택한 파일을 파일클래스에 저장 
			 lblimgpath.setText("파일 경로 : " + file.getPath() );
			 
			 pimage = file.toURI().toString();
			 System.out.println("URL 경로 :" + file.getPath());
			 System.out.println("URI 경로 : " + pimage);
			 
			 Image image = new Image(pimage);
			 pimg.setImage(image);
	    }

	    @FXML
	    void update(ActionEvent event) {
	    	
	    	String p_name = txtpname.getText();
	    	String p_contents = txtpcontents.getText();
	    	int p_price = Integer.parseInt(txtprice.getText());
	    	
	    	String category = "";
	    	if(opt_1.isSelected() ) {category = "의류";}  
		 	if(opt_2.isSelected() ) {category = "신발";}
		 	if(opt_3.isSelected() ) {category = "가방";}
		 	if(opt_4.isSelected() ) {category = "ACC";}
	    	
		 	
		 	// 객체화 
		 	Product product2 = new Product(
		 			product.getP_no(), p_name, pimage, p_contents, category, p_price,p_price,"0",0);
		 	
		 	
		 	// DB 넣기 
		 	boolean result = ProductDao.getProductDao().update(product2);
		 	if(result) {
		 		Alert alert = new Alert(AlertType.INFORMATION);
		 		alert.setHeaderText("제품 수정 완료"); alert.showAndWait();
		 		MainpageController.getinstance().loadpage("productlist");
		 	}
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}
