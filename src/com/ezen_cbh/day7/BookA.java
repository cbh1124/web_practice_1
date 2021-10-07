package com.ezen_cbh.day7;


public class BookA {
	// 필드 [ISBN, 도서명, 대여여부, 대여한 회원 아이디 등 ]
	private String b_ISBN;
	private String b_name;
	private boolean b_rental;
	private String u_id;
	// 생성자
			// 1. 도서등록 [ 모든 필드 ] 
			// 2. 빈생성자 [ 필드 X   ]
	public BookA(String b_ISBN, String b_name, boolean b_reantal, String u_id) {
		this.b_ISBN = b_ISBN;
		this.b_name = b_name;
		this.b_rental = b_reantal;
		this.u_id = u_id;
	}
	public BookA() {
		
	}
	
	// 메소드
	
	// 메소드 [CRUD : CREATE READ UPDATE DELETE]
		// 2. 도서등록 메소드 
	public boolean book_add() {
		// 1. 입력받기
		System.out.println("-----------로그인 페이지 -----------");
		System.out.println("도서코드 : "); String b_ISBN = Library.sc.next();
		System.out.println("도서명 : "); String b_name = Library.sc.next();
		// 도서코드 중복체크
		boolean check = book_check(b_ISBN);
		if(check) {
			System.out.println("동일한 도서코드가 존재합니다.");
			return false;
		}
		// 2. 객체 생성 	// 도서대여여부 초기값 => true  	// 대여한 회원 초기값 => null
		BookA book = new BookA(b_ISBN, b_name, true, null);
		// 3. 객체 배열저장 
		for(int i = 0; i<Library.books.length; i++) {
			if(Library.books[i] == null) { Library.books[i] = book; return true;}
		}
		return false;
	}
	// 6. ISBN 체크 메소드 
	public boolean book_check(String check_isbn) {
		for( int i = 0 ; i< Library.books.length ; i++ ) {
			if( Library.books[i] != null && 
					Library.books[i].getB_ISBN().equals(check_isbn) ) {
				return true;
			}
		}
		return false;
	}
		// 3. 도서목록 메소드
	public void book_list() {
		System.out.println("------------------도서 목록 페이지 ----------------");
		
		for(int i =0; i<Library.books.length; i++) {
			if(Library.books[i] == null)return;
			
			BookA book = Library.books[i];
			System.out.println(book.getB_ISBN()+"\t"+book.getB_name()
								+"\t"+book.getB_rental()+"\t"+book.u_id );
		}
		
		return;
	}
		// 4. 도서대여 메소드
	public boolean book_rental( String loginid ) {
		System.out.println("------------------도서 대여 페이지 ----------------");
		System.out.println(" 대여할 도서코드 : ");	String b_ISBN = Library.sc.next();
			// ISBN 존재여부 체크 
		boolean check = book_check(b_ISBN);
		if( check ) {
			
			for( int i = 0 ; i<Library.books.length ;i++ ) {
				if( Library.books[i] != null && 
						Library.books[i].getB_ISBN().equals(b_ISBN)) { // 동일한 도서가 존재하면
					// 대여여부 확인 
					if( Library.books[i].getB_rental() ) {
						System.out.println(" [[ 알림 ]] : 현재 도서 대여 합니다. 대여성공!!! ");
						// 1. 대여성공시 대여여부 true => false
						Library.books[i].setB_rental(false);
						// 2. 대여성공시 대여회원에 현재 로그인된 아이디 대입
						Library.books[i].setB_ISBN(loginid);
						return true;
					}
					else { System.out.println(" [[ 알림 ]] : 현재 대여중인 도서 입니다. 대여불가!!!"); return false; }
				}
			}	
		}else {
			System.out.println("[[알림]] : 해당 도서코드가 존재하지 않습니다");
			return false;
		}
		return false;
	}
	
		// 5. 도서반납 메소드
	public boolean book_return(String loginid) {
		System.out.println("------------------도서 대여 페이지 ----------------");
		System.out.println(" 반납할 도서코드 : ");	String b_ISBN = Library.sc.next();
		// 1. 대여중인 책들 찾기
		for(int i= 0; i<Library.books.length; i++) {
			// ! : 부정 ( true => false ) 
			if(Library.books[i] != null && !Library.books[i].getB_rental() ) {
				if (Library.books[i].getB_ISBN().equals(b_ISBN)) {
					// 3. 로그인된 회원 == 대여회원
					if(Library.books[i].getU_id().equals(loginid)) {
						System.out.println("도서 반납 성공!!");
						// 1. 반납 성공시 대여회원 => null
						Library.books[i].setU_id(null); 
						Library.books[i].setB_rental(true); 
						return true;
					}
				}
			}
		}
		System.out.println("회원님이 대여중인 도서가 아닙니다.");
		
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
 * 회원 도서 프로그램 
	//1. 객체지향 [회원 클래스, 도서 클래스] [회원 : UserA, 도서 : BookA ] 
		설계: 필드, 생성자, 메소드 
	//2. 객체는 배열에 저장 
	//3. 회원만 프로그램 이용 
		[로그인전] : 로그인, 회원가입, 도서목록, 대여, 반납 
		[로그인시] : 도서목록, 대여, 반납
	//4. 관리자만[ID: admin/ pw:1234] 도서 등록 가능 
		[관리자 로그인시] : 도서등록, 도서목록 

 * 
 */
 