package com.ezen_cbh.day6;

import java.util.Scanner;

public class BankApplication {
			// 접근제한자 
				// public : 프로젝트내 모든곳에서 호출 가능 
				// private : 현재파일내에서만 호출 가능 
				// default[생략] : 동일한 패키지내에서만 호출 가능 
				// protected : 동일한 패키지내에서만 호출 가능
	
	// 100개 계좌객체를 저장할 수 있는 배열 선언 
		// main 메소드 밖에 선언시 : main메소드 외 모든 메소드에서 호출 가능 
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
		// private : 현재 클래스 내에서만 호출 가능 
			// static : 정적변수 : 프로그램 전반에 걸쳐 수명 유지 
				// main 메소드와 같이 프로그램 시작시 메모리 할당
				// 모든 메소드에 사용되는 필드에 선언 
				// <----> 지역변수 : 선언된 { } 안에서만 사용 --> {} 밖으로 나가면 초기화
	
	public static void main(String[] args) {
		// main메소드에는 main스레드 포함
		
		boolean run = true;
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
			System.out.println("프로그램 종료");
		}
	}	
		// 계좌생성하기 [인수X 반환X]
		// static 사용이유 : main에서 호출하기 위해 [ 미 사용시 : main 해당 메소드 사용불가 ]
		private static void createAccount() {
			// 1. 입력받기
			System.out.println("------------");
			System.out.println("계좌 생성");
			System.out.println("------------");
			
			System.out.println(">> 계좌번호 : "); String ano = sc.next();
			System.out.println(">> 계좌주 : "); String owner = sc.next();
			System.out.println(">> 초기입금액 : "); int balance = sc.nextInt();
			//2. 객체 생성 [ 입력받은 변수값을 객체 생성자에 넣어서 객체 만들기]
			Account account = new Account(ano, owner, balance);
			
			//3. 배열 저장 [ 배열내 빈공간[null]을 찾아서 빈공간 인덱스에 객체 저장 ]
			for(int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = account; 
					System.out.println("결과: 계좌가 생성되었습니다.");
					break;
				}
			}
		}
		
		// 계좌목록보기 [인수X 반환X]
		private static void accountList() {
			System.out.println("------------");
			System.out.println("계좌 목록");
			System.out.println("------------");
			// 1. 배열내 모든 인덱스를 호출 [ 공백 제외 ]
			for(int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null) break;
				
				System.out.println(accountArray[i].getAno() + "\t"
						+ accountArray[i].getOwner() + "\t"
						+ accountArray[i].getBalance() );
			}
		}
			
		// 예금하기 [인수X 반환X]
		private static void deposit() {
			// 작성위치 
			System.out.println("------------");
			System.out.println("예금");
			System.out.println("------------");
			// 1. 입력받기
			System.out.println(">> 계좌번호 : "); String ano = sc.next();
			System.out.println(">> 예금액 : "); int balance = sc.nextInt();
			// 2. 입력받은 계좌번호 존재하는지 체크하는 메소드 호출 
			Account account = findAccount(ano);
				// findAccount 반횐 : 찾은 객체 혹은 null
			// 3.
			if(account == null) { // 반환이 null 일경우
				System.out.println("결과 : 계좌가 존재하지 않습니다.");
				return; // 현재 메소드 강제 종료
			}
			
			account.setBalance(account.getBalance() + balance );
								// 기존예금액 + 입력받은 입금액 
				// set 메소드 : 필드에 값 대입 메소드
			 	// get 메소드 : 필드의 값 호출 메소드
			System.out.println("결과 : 예금이 성공되었습니다.");
		}
		
		// 출금하기 [인수X 반환X]
		private static void withdraw() {
			// 1. 입력받기
			// 2. 입력받은 계좌번호 존재하는지 체크하는 메소드 호출 
			System.out.println("------------");
			System.out.println("출금");
			System.out.println("------------");
			
			System.out.println(">> 계좌번호 : "); String ano = sc.next();
			System.out.println(">> 출금액 : "); int balance = sc.nextInt();
			
			Account account = findAccount(ano);
			
			if(account == null) { // 반환이 null 일경우
				System.out.println("결과 : 계좌가 존재하지 않습니다.");
				return; // 현재 메소드 강제 종료
			}
			if(account.getBalance()<balance) {
				//출금액이 기존예금액 보다 크면 출금 불가 
				System.out.println("예금액보다 많은 금액을 출금할 수 없습니다."); 
			}
			// 4. 
			account.setBalance(account.getBalance() - balance );
								// 기존예금액 + 입력받은 입금액 
				// set 메소드 : 필드에 값 대입 메소드
			 	// get 메소드 : 필드의 값 호출 메소드
			System.out.println("결과 : 출금이 성공되었습니다.");
			
		}
		
		// Account 배열에서 ano와 동일한 Account 객체 찾기 [ 인수o (String ano) 반환 o (Account 객체)]
		private static Account findAccount(String ano) {
			Account account = null; //임시객체
			for(int i =0; i<accountArray.length; i++) { // i번째 인덱스가 공백이 아니면서
				
				if(accountArray[i] != null) { 
					if(accountArray[i].getAno().equals(ano)) { 
						// i번째 인덱스의 객체내 계좌번호
						account = accountArray[i];
						break;
					}
				}
			}
			return account;
		}
	
}
