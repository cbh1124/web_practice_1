package com.ezen_cbh.day7;

import java.util.Scanner;



public class Library {// c s
	public static Scanner sc = new Scanner(System.in);
	public static BookA[] books = new BookA[100];
	public static UserA[] userArray = new UserA[100];
	
	public static void main(String[] args) {// m s
		
		main_menu(); // �޼ҵ� ȣ�� 
			
		
		
	} // m e
	
	
	// 1. ���θ޴�
	public static void main_menu() { // M s
		while(true) {
			System.out.println("-----------------");
			System.out.println("ȸ���� ������ ���α׷�"); 
			System.out.println("1. �α��� 2. ȸ������ 3. ���̵� ã�� 4. ��й�ȣã��");
			System.out.println("-----------------");int ch = sc.nextInt();
			if(ch == 1) {
				// �α��� �޼ҵ� ȣ��
				String loginid = UserA.login();
				// 1. �α��� ����
				if(loginid == null) {
					System.out.println("������ ȸ�������� �����ϴ�.");
				}
				// 2. ������ �޴�
				else if(loginid.equals("admin")) {
					admin_menu();
				}
				// 3. �Ϲ�ȸ�� �޴�
				else {
					user_menu(loginid);
				}
			} 
			if(ch == 2) {
				// ȸ������ �޼ҵ� ȣ��
				UserA.signup();
			}
			if( ch == 3 ) {
				// ���̵�ã�� �޼ҵ� ȣ�� 
				String loginid = UserA.findid();
				// login �޼ҵ��� ��ȯ���� ���� ���� 
			// 1. �α��� ���� ã����� ���̵� ��� 
				if(loginid == null) {
					System.out.println("���̵� ã���������ϴ�.");
				}
				else{System.out.println("���̵� : " + loginid);}
			}
			if(ch == 4) {
				// ��й�ȣ ã�� �޼ҵ� ȣ�� 
				String loginpw = UserA.findpw();
				// login �޼ҵ��� ��ȯ���� ���� ���� 
			// 1. �α��� ���� ã����� ���̵� ��� 
				if(loginpw == null) {
					System.out.println("��й�ȣ�� ã���������ϴ�.");
				}
				else{System.out.println("��й�ȣ : " + loginpw);}
			}
		}
		
	}// M e
	
	// 2. �α��ν� �޴�
	public static void user_menu(String loginid) { // LM s
		BookA book = new BookA(); // Book �ӽð�ü : �޼ҵ� ȣ���
		while(true) {
			System.out.println(" ---------- Menu ----------");
			System.out.println(" 1.������� | 2.�뿩 | 3.�ݳ� | 4.�α׾ƿ� ");
			System.out.print("���� : ");	int ch = sc.nextInt();
			if( ch == 1 ) { book.book_list(); }
			if( ch == 2 ) { book.book_rental(loginid); } 
			if( ch == 3 ) { book.book_return(loginid); }
			if( ch == 4 ) { System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� "); return; }
		}
		
	}// LM e	
	
	// 3. ������ �޴�	
	public static void admin_menu() {
		BookA book = new BookA(); // Book �ӽð�ü : �޼ҵ� ȣ��� 
		while(true) {
			System.out.println(" ---------- Admin Menu ----------");
			System.out.println(" 1.������� | 2.������� | 3.�α׾ƿ� ");
			System.out.print("���� : ");	int ch = sc.nextInt();
			if( ch == 1 ) { book.book_add(); }
			if( ch == 2 ) { book.book_list(); } 
			if( ch == 3 ) { System.out.println(" [[ �˸� ]] : �α׾ƿ� �Ǿ����ϴ� "); return; }
		}
	}
	
	
} // c e
