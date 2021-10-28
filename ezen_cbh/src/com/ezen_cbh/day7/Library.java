package com.ezen_cbh.day7;

import java.util.Scanner;



public class Library {// c s
	public static Scanner sc = new Scanner(System.in);
	public static BookA[] books = new BookA[100];
	public static UserA[] userArray = new UserA[100];
	
	public static void main(String[] args) {// m s
		
		main_menu(); // 메소드 호출 
			
		
		
	} // m e
	
	
	// 1. 메인메뉴
	public static void main_menu() { // M s
		while(true) {
			System.out.println("-----------------");
			System.out.println("회원제 도서관 프로그램"); 
			System.out.println("1. 로그인 2. 회원가입 3. 아이디 찾기 4. 비밀번호찾기");
			System.out.println("-----------------");int ch = sc.nextInt();
			if(ch == 1) {
				// 로그인 메소드 호출
				String loginid = UserA.login();
				// 1. 로그인 실패
				if(loginid == null) {
					System.out.println("동일한 회원정보가 없습니다.");
				}
				// 2. 관리자 메뉴
				else if(loginid.equals("admin")) {
					admin_menu();
				}
				// 3. 일반회원 메뉴
				else {
					user_menu(loginid);
				}
			} 
			if(ch == 2) {
				// 회원가입 메소드 호출
				UserA.signup();
			}
			if( ch == 3 ) {
				// 아이디찾기 메소드 호출 
				String loginid = UserA.findid();
				// login 메소드의 반환값에 따른 제어 
			// 1. 로그인 값을 찾은경우 아이디 출력 
				if(loginid == null) {
					System.out.println("아이디를 찾을수없습니다.");
				}
				else{System.out.println("아이디 : " + loginid);}
			}
			if(ch == 4) {
				// 비밀번호 찾기 메소드 호출 
				String loginpw = UserA.findpw();
				// login 메소드의 반환값에 따른 제어 
			// 1. 로그인 값을 찾은경우 아이디 출력 
				if(loginpw == null) {
					System.out.println("비밀번호를 찾을수없습니다.");
				}
				else{System.out.println("비밀번호 : " + loginpw);}
			}
		}
		
	}// M e
	
	// 2. 로그인시 메뉴
	public static void user_menu(String loginid) { // LM s
		BookA book = new BookA(); // Book 임시객체 : 메소드 호출용
		while(true) {
			System.out.println(" ---------- Menu ----------");
			System.out.println(" 1.도서목록 | 2.대여 | 3.반납 | 4.로그아웃 ");
			System.out.print("선택 : ");	int ch = sc.nextInt();
			if( ch == 1 ) { book.book_list(); }
			if( ch == 2 ) { book.book_rental(loginid); } 
			if( ch == 3 ) { book.book_return(loginid); }
			if( ch == 4 ) { System.out.println(" [[ 알림 ]] : 로그아웃 되었습니다 "); return; }
		}
		
	}// LM e	
	
	// 3. 관리자 메뉴	
	public static void admin_menu() {
		BookA book = new BookA(); // Book 임시객체 : 메소드 호출용 
		while(true) {
			System.out.println(" ---------- Admin Menu ----------");
			System.out.println(" 1.도서등록 | 2.도서목록 | 3.로그아웃 ");
			System.out.print("선택 : ");	int ch = sc.nextInt();
			if( ch == 1 ) { book.book_add(); }
			if( ch == 2 ) { book.book_list(); } 
			if( ch == 3 ) { System.out.println(" [[ 알림 ]] : 로그아웃 되었습니다 "); return; }
		}
	}
	
	
} // c e
