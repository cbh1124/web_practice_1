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
	Product product = ProductlistController.product;  // 1. ���̺��信�� Ŭ���� ��ü ����Ʈ ��Ʈ�ѷ��� product��ü ���� �����;� ��ϵ� ��ü�� ���� �����ü����� 
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) { // �ʱ�ȭ 
		txtpname.setText(product.getP_name());			  // 2. Ŭ���� ��ü ��ǰ�� 
		txtpcontents.setText(product.getP_contents());    // 3. Ŭ���� ��ü ��ǰ���� 
		txtprice.setText(product.getP_price() +"");       // 4. Ŭ���� ��ü ��ǰ����
			Image image = new Image(product.getP_img());  // 5. Ŭ���� ��ü ��ǰ�� 
		pimg.setImage(image);
		lblimgpath.setText(product.getP_img());
		pimage = product.getP_img(); // ������ ������� ���� �̹��� �״�� 
		// ��ǰ�� ����� ī�װ����� ���� ��ư Ŭ�� ���� [ setSelect(true) ]
		if(product.getP_category().equals("�Ƿ�")) { opt_1.setSelected(true); } // ������ư�� üũ ���� Ȱ��ȭ 
		if(product.getP_category().equals("�Ź�")) { opt_2.setSelected(true); } 
		if(product.getP_category().equals("����")) { opt_3.setSelected(true); }
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
	    
	    private Stage stage; // ���� ���� �������� 
	    private String pimage; // ���õ� ������ ��� 

	    @FXML
	    void imgadd(ActionEvent event) {
	    	// 1. ���� ���� Ŭ���� 
			 FileChooser fileChooser = new FileChooser(); // ���� ���ý� ��� ���� 
			 
			 // 2. ���� �������� ����  getExtensionFilters : ������ ���� ���� 
			 fileChooser.getExtensionFilters().add(
					 new ExtensionFilter("�׸����� : Image File", "*png", "*jpg", "*gif"));
			
			 // 3. �������� ���� ���ϼ��� Ŭ���� �ֱ� 
			 
			 File file = fileChooser.showOpenDialog(stage);
			 	// ������ ������ ����Ŭ������ ���� 
			 lblimgpath.setText("���� ��� : " + file.getPath() );
			 
			 pimage = file.toURI().toString();
			 System.out.println("URL ��� :" + file.getPath());
			 System.out.println("URI ��� : " + pimage);
			 
			 Image image = new Image(pimage);
			 pimg.setImage(image);
	    }

	    @FXML
	    void update(ActionEvent event) {
	    	
	    	String p_name = txtpname.getText();
	    	String p_contents = txtpcontents.getText();
	    	int p_price = Integer.parseInt(txtprice.getText());
	    	
	    	String category = "";
	    	if(opt_1.isSelected() ) {category = "�Ƿ�";}  
		 	if(opt_2.isSelected() ) {category = "�Ź�";}
		 	if(opt_3.isSelected() ) {category = "����";}
		 	if(opt_4.isSelected() ) {category = "ACC";}
	    	
		 	
		 	// ��üȭ 
		 	Product product2 = new Product(
		 			product.getP_no(), p_name, pimage, p_contents, category, p_price,p_price,"0",0);
		 	
		 	
		 	// DB �ֱ� 
		 	boolean result = ProductDao.getProductDao().update(product2);
		 	if(result) {
		 		Alert alert = new Alert(AlertType.INFORMATION);
		 		alert.setHeaderText("��ǰ ���� �Ϸ�"); alert.showAndWait();
		 		MainpageController.getinstance().loadpage("productlist");
		 	}
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
}