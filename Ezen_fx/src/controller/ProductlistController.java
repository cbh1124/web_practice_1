package controller;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import dao.MemberDao;
import dao.ProductDao;
import domain.Product;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;

public class ProductlistController implements Initializable { // ȭ�� �ε�[����] �ʱⰪ �������̽�
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		btndelete.setVisible(false);
		btnupdate.setVisible(false);
		btnactivation.setVisible(false);
		producttableload();
				
	}
	public void producttableload() {
		// 1. DB���� ��ǰ��� �������� 
				ObservableList<Product> products = ProductDao.getProductDao().productlist();
				
				// 2. ��ǰ����� ���̺��信 �־��ֱ� 
				productlist.setItems(products);
				// 3. ���̺� �信 ���� �ϳ��� �����ͼ� ����Ʈ�� ��ü�� �ʵ�� ���� 
				TableColumn tc = productlist.getColumns().get(0);                   // fxml ��� ������� ���̺� �信 ���� ����ִ´�. 
					tc.setCellValueFactory(new PropertyValueFactory< >("p_name"));
				tc = productlist.getColumns().get(1);
					tc.setCellValueFactory(new PropertyValueFactory<>("p_category"));
				tc = productlist.getColumns().get(2);
					tc.setCellValueFactory(new PropertyValueFactory<>("p_price"));
				tc = productlist.getColumns().get(3);
					tc.setCellValueFactory(new PropertyValueFactory<>("activation"));
				tc = productlist.getColumns().get(4);
					tc.setCellValueFactory(new PropertyValueFactory<>("p_date"));
				
					// ���̺� �信�� Ŭ�������� ������ �������� 
						// 1. ���̺� �信 Ŭ�� �̺�Ʈ 
						productlist.setOnMouseClicked( e -> {
							// 2. Ŭ�� �̺�Ʈ�� ���콺 Ŭ���� ������ 
							if(e.getButton().equals(MouseButton.PRIMARY)) {
								// 3. ���̺� �信�� Ŭ���� ���� ������ [ ��ü ]
								product = productlist.getSelectionModel().getSelectedItem();
								// 4. ���õ� ��ü�� �̹������ �������� 
								Image image = new Image(product.getP_img() ); // 
								pimg.setImage(image); // �̹��� ��� ���� ��ü 
								// 5. �� �� 
								lblpname.setText(product.getP_name());   // �󺧿� ���̺� �信 �����Ծ��� �̸��� ������
								lblpcontents.setText(product.getP_contents()); // �󺧿� ���̺� �信 �����Ծ��� ������ ������ 
									// õ���� ��ǥ ���ڿ� ����� [String.format("%,d", ��) ] 
								lblpprice.setText(String.format("%,d", product.getP_price() )); // �󺧿� ���̺� �信 �����Ծ��� ������ ������ 
									// ȸ�� ��ȣ -> ȸ�� id
								String writer = MemberDao.getMemberDao().midcheck(product.getM_no()); // ���̺��� ȸ���� ��ȣ�� ����־ ȸ�� id�� ��ġ�Ѵٸ� ���̵� ��ȯ
								lblmid.setText( MemberDao.getMemberDao().midcheck(product.getM_no()) );
								
								if(MainpageController.getinstance().getloginid().equals(writer) ) {
									// �α��� ���̵� ����� 
									btndelete.setVisible(true);
									btnupdate.setVisible(true);
									btnactivation.setVisible(true);
								}else {
									btndelete.setVisible(false);
									btnupdate.setVisible(false);
									btnactivation.setVisible(false);
								}
								
								// ��ư �׽�Ʈ 
								btnactivation.setText(product.getActivation());
							}
						} );
	}
	public static Product product;
	
    @FXML
    private Button btndelete;

    @FXML
    private Button btnregister;
    
    @FXML
    private Button btnupdate;

    @FXML
    private Label lblmid;

    @FXML
    private Label lblpcontents;
    
    @FXML
    private Label lblpname;
    
    @FXML
    private Label lblpprice;
    
    @FXML
    private ImageView pimg;

    @FXML
    private TableView<Product> productlist;
    
    @FXML
    private Button btnactivation;
    
    @FXML
    void activation(ActionEvent event) {
    	btnactivation.setText(product.getActivation()); // 1. ���� ��ǰ�� ���°� ��ư �ؽ�Ʈ�� ǥ�� (��ü �ּҰ� ������)
    	System.out.println(product.getActivation());
    	int pa = product.getP_activation(); // 2. ���� ��ǰ�� ���¸� ������ (��ü �ּ������� ������ ����)
    	int ch = pa + 1;  // 3. ���� ��ǰ�� ���¸� ���� 
    	
    	if( ch > 3) ch = 1;
    	if(ch == 1) { // 4. ����� ���°� 1�̸� �Ǹ��� ������Ʈ ó�� 
    		ProductDao.getProductDao().activationupdate(1, product.getP_no()); // �ش� ��ǰ�� ���� �����ϱ� ���ؼ��� �ش� ��ǰ�� ��ȣ�� ã�Ƽ� ���°��� �ٲ���
    		producttableload(); // ���̺� ���ΰ�ħ 
    		btnactivation.setText("�Ǹ���"); // ��ư �ؽ�Ʈ ���� 
    	}
    	if(ch == 2) { 
    		ProductDao.getProductDao().activationupdate(2, product.getP_no());
    		producttableload();
    		btnactivation.setText("�ŷ���");
    	}
    	if(ch == 3) {
    		ProductDao.getProductDao().activationupdate(3, product.getP_no());
    		producttableload();
    		btnactivation.setText("�ŷ��Ϸ�");
    	}
    }

    @FXML
    void delete(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
    	alert.setHeaderText("��ǰ�� ���� �Ͻðڽ��ϱ�?");
    	Optional<ButtonType> optional = alert.showAndWait();
    	if(optional.get() == ButtonType.OK) {
    		ProductDao.getProductDao().delete(product.getP_no());
    		Alert alert2 = new Alert(AlertType.INFORMATION);
    		alert2.setHeaderText("�����Ǿ����ϴ�"); alert.showAndWait();
    		MainpageController.getinstance().loadpage("productlist");;
    	}
    }

    @FXML
    void register(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productregister");
    }

    @FXML
    void update(ActionEvent event) {
    	MainpageController.getinstance().loadpage("productupdate");
    }

}