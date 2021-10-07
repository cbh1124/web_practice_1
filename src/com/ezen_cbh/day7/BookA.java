package com.ezen_cbh.day7;


public class BookA {
	// �ʵ� [ISBN, ������, �뿩����, �뿩�� ȸ�� ���̵� �� ]
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String u_id;
	// ������
			// 1. ������� [ ��� �ʵ� ] 
			// 2. ������� [ �ʵ� X   ]
	public BookA(String b_ISBN, String b_name, boolean b_reantal, String u_id) {
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_reantal;
		this.u_id = u_id;
	}
	public BookA() {
		
	}
	
	// �޼ҵ�
	
	// �޼ҵ� [CRUD : CREATE READ UPDATE DELETE]
		// 2. ������� �޼ҵ� 
	public boolean book_add() {
		// 1. �Է¹ޱ�
		System.out.println("-----------�α��� ������ -----------");
		System.out.println("�����ڵ� : "); String b_ISBN = Library.sc.next();
		System.out.println("������ : "); String b_name = Library.sc.next();
		// �����ڵ� �ߺ�üũ
		boolean check = book_check(b_ISBN);
		if(check) {
			System.out.println("������ �����ڵ尡 �����մϴ�.");
			return false;
		}
		// 2. ��ü ���� 	// �����뿩���� �ʱⰪ => true  	// �뿩�� ȸ�� �ʱⰪ => null
		BookA book = new BookA(b_ISBN, b_name, true, null);
		// 3. ��ü �迭���� 
		for(int i = 0; i<Library.books.length; i++) {
			if(Library.books[i] == null) { Library.books[i] = book; return true;}
		}
		return false;
	}
	// 6. ISBN üũ �޼ҵ� 
	public boolean book_check(String check_isbn) {
		for( int i = 0 ; i< Library.books.length ; i++ ) {
			if( Library.books[i] != null && 
					Library.books[i].getB_ISBN().equals(check_isbn) ) {
				return true;
			}
		}
		return false;
	}
		// 3. ������� �޼ҵ�
	public void book_list() {
		System.out.println("------------------���� ��� ������ ----------------");
		
		for(int i =0; i<Library.books.length; i++) {
			if(Library.books[i] == null)return;
			
			BookA book = Library.books[i];
			System.out.println(book.getB_ISBN()+"\t"+book.getB_name()
								+"\t"+book.getB_rental()+"\t"+book.u_id );
		}
		
		return;
	}
		// 4. �����뿩 �޼ҵ�
	public boolean book_rental( String loginid ) {
		System.out.println("------------------���� �뿩 ������ ----------------");
		System.out.println(" �뿩�� �����ڵ� : ");	String b_ISBN = Library.sc.next();
			// ISBN ���翩�� üũ 
		boolean check = book_check(b_ISBN);
		if( check ) {
			
			for( int i = 0 ; i<Library.books.length ;i++ ) {
				if( Library.books[i] != null && 
						Library.books[i].getB_ISBN().equals(b_ISBN)) { // ������ ������ �����ϸ�
					// �뿩���� Ȯ�� 
					if( Library.books[i].getB_rental() ) {
						System.out.println(" [[ �˸� ]] : ���� ���� �뿩 �մϴ�. �뿩����!!! ");
						// 1. �뿩������ �뿩���� true => false
						Library.books[i].setB_rental(false);
						// 2. �뿩������ �뿩ȸ���� ���� �α��ε� ���̵� ����
						Library.books[i].setB_ISBN(loginid);
						return true;
					}
					else { System.out.println(" [[ �˸� ]] : ���� �뿩���� ���� �Դϴ�. �뿩�Ұ�!!!"); return false; }
				}
			}	
		}else {
			System.out.println("[[�˸�]] : �ش� �����ڵ尡 �������� �ʽ��ϴ�");
			return false;
		}
		return false;
	}
	
		// 5. �����ݳ� �޼ҵ�
	public boolean book_return(String loginid) {
		System.out.println("------------------���� �뿩 ������ ----------------");
		System.out.println(" �ݳ��� �����ڵ� : ");	String b_ISBN = Library.sc.next();
		// 1. �뿩���� å�� ã��
		for(int i= 0; i<Library.books.length; i++) {
			// ! : ���� ( true => false ) 
			if(Library.books[i] != null && !Library.books[i].getB_rental() ) {
				if (Library.books[i].getB_ISBN().equals(b_ISBN)) {
					// 3. �α��ε� ȸ�� == �뿩ȸ��
					if(Library.books[i].getU_id().equals(loginid)) {
						System.out.println("���� �ݳ� ����!!");
						// 1. �ݳ� ������ �뿩ȸ�� => null
						Library.books[i].setU_id(null); 
						Library.books[i].setB_rental(true); 
						return true;
					}
				}
			}
		}
		System.out.println("ȸ������ �뿩���� ������ �ƴմϴ�.");
		
		return true;
	}
	

	

	
	public String getB_ISBN() {
		return b_ISBN;
	}
	public void setB_ISBN(String b_ISBN) {
		this.b_ISBN = b_ISBN;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public boolean getB_rental() {
		return b_rental;
	}
	public void setB_rental(boolean b_reantal) {
		this.b_rental = b_reantal;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	
	

	
	
}

/*
 * ȸ�� ���� ���α׷� 
	//1. ��ü���� [ȸ�� Ŭ����, ���� Ŭ����] [ȸ�� : UserA, ���� : BookA ] 
		����: �ʵ�, ������, �޼ҵ� 
	//2. ��ü�� �迭�� ���� 
	//3. ȸ���� ���α׷� �̿� 
		[�α�����] : �α���, ȸ������, �������, �뿩, �ݳ� 
		[�α��ν�] : �������, �뿩, �ݳ�
	//4. �����ڸ�[ID: admin/ pw:1234] ���� ��� ���� 
		[������ �α��ν�] : �������, ������� 

 * 
 */
 