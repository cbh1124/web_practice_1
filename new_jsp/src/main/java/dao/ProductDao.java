package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductDao extends DB {
	
	
	public ProductDao() {
		super();
	}
	
	
	public static ProductDao productDao = new ProductDao();
	public static ProductDao getProductDao() { return productDao ;}
	
	// 1. ��ǰ ��� �޼ҵ� 
	public boolean productwrite(Product product) {
		String sql = "insert into product(p_name,p_price,p_category,p_manufacturer,p_active,p_size,p_stock,p_img,p_contents ) values(?,?,?,?,?,?,?,?,?)";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, product.getP_name()); ps.setInt(2, product.getP_price());  ps.setString(3, product.getP_category()); 
			ps.setString(4, product.getP_manufacturer()); ps.setInt(5, product.getP_active());  ps.setString(6, product.getP_size()); 
			ps.setInt(7, product.getP_stock()); ps.setString(8, product.getP_img());  ps.setString(9, product.getP_contents()); 
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			
		}return false;
	}
	// 2. ��ǰ ��� ��� �޼ҵ� 
	public ArrayList<Product> getProductlist(String key, String keyword){
		ArrayList<Product> products = new ArrayList<Product>();
		
		String sql = null;
		if(key != null && keyword != null) {
			sql = "select * from product where "+ key +" ='"+keyword+"'";
		}else {
			sql = "select * from product";
		}
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				Product product = new Product(
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getString(7),
						rs.getInt(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(11)
						);
				
				products.add(product);
				
			}
			return products;
		}catch(Exception e){
			
		}return null;
	}
	// 3. ��ǰ ���� [ �˻� / ī�װ� ] ��¸޼ҵ� ]
	// 4. ��ǰ ���� �޼ҵ� 
	public boolean productupdate(int p_num, Product product) {
		String sql = "update product set p_name =?,p_price=?,p_category=?,p_manufacturer=?, p_active=?,p_size=?,p_stock=?,p_img=?,p_contents=? where p_num = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, product.getP_name());
			ps.setInt(2, product.getP_price());
			ps.setString(3, product.getP_category());
			ps.setString(4, product.getP_manufacturer());
			ps.setInt(5, product.getP_active());
			ps.setString(6, product.getP_size());
			ps.setInt(7, product.getP_stock());
			ps.setString(8, product.getP_img());
			ps.setString(9, product.getP_contents());
			ps.setInt(10, p_num);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}return false;
		
	}
	// 4. ��ǰ ���¼��� �޼ҵ� 
	public boolean activeupdate( int p_num ) {
		try {
			String sql ="select p_active from product where p_num = "+p_num;// 1. �ش� ��ǰ��ȣ�� ��ǰ���� �˻�
			ps = con.prepareStatement(sql); rs = ps.executeQuery();
			if( rs.next() ) {
				int p_active = rs.getInt(1)+1;				// 2. �˻��� ��ǰ���� + 1 [ ���� ���� ]
				if( p_active == 4 ) { p_active = 1; }		// * ���࿡ ��ǰ���°� 4�̸� 1�� ����
				sql = "update product set p_active = "+p_active +" where p_num ="+p_num;
				ps = con.prepareStatement(sql); ps.executeUpdate(); return true;
		}
		}catch (Exception e) {} return false;
		
	}
	
	// 5. ��ǰ ���� �޼ҵ� 
	public boolean productdelete(int p_num) {
		
		String sql = "delete from product where p_num = "+p_num;
		try {
			ps = con.prepareStatement(sql);
			ps.executeUpdate(); return true;
			
		} catch (Exception e) {
			
		}return false;
		
		
		
	}
	// 6. ��ǰ ��� ī��Ʈ �޼ҵ� 
	
	public Product getproduct(int p_num) {
		String sql = "select * from product where p_num = " + p_num;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			if(rs.next() ) {
				Product product = new Product(
						rs.getInt(1),
						rs.getString(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getString(5),
						rs.getInt(6),
						rs.getString(7),
						rs.getInt(8),
						rs.getString(9),
						rs.getString(10),
						rs.getString(11)
						);
				
				return product;
					
				}
			
		} catch (Exception e) {
			// TODO: handle exception
		}return null;
	}
	
	
	
	
	// ��� �� ���� ��ȯ �޼ҵ� 
	public int replycount(int b_num) {
		String sql = "select count(*) from reply where b_num = ?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, b_num);
			rs = ps.executeQuery();	
			if( rs.next() ) { return rs.getInt(1); }
		}catch (Exception e) {} return 0;
	}
	
	// ��ǰ ���ϱ� �� ��ȯ 
	// 7. ��ǰ ���ƿ� �޼ҵ� 
	public int plikeupdate(int p_num, int m_num) {
		// 1. ���ƿ� ��ư -> ���ƿ�[��ǰ��ȣ, ȸ����ȣ]
		// 2. ��ǰ��ȣ�� ȸ����ȣ�� ��ġ�� ���ƿ� ������ ���ƿ� ���� 
			// 							 ������ ���ƿ� ���� 
		String sql = null;
		sql = "select * from plike where p_num="+p_num+" and m_num="+m_num;
		try {
			ps = con.prepareStatement(sql); rs = ps.executeQuery();
			if(rs.next()) {
				sql = "delete from plike where p_num="+p_num+" and m_num="+m_num; 
				ps = con.prepareStatement(sql); 
				ps.executeUpdate();
				return 1;
			}else {
				sql = "insert into plike(p_num, m_num) values("+p_num+","+ m_num+")";
				ps = con.prepareStatement(sql); 
				ps.executeUpdate();
				return 2;
			}
		} catch (Exception e) {
			
		}return 0;
		
	}
	
	// 8.��ǰ ���ƿ� Ȯ�� �޼ҵ� 
	public boolean plikecheck(int p_num, int m_num) {
		
		String sql = "select * from plike where p_num="+p_num+" and m_num="+m_num;
		
		try {
			ps = con.prepareStatement(sql); rs = ps.executeQuery();
			if(rs.next()) {
				return true;
			}
		} catch (Exception e) {
			
		}return false;
		
	}
	
	
}
