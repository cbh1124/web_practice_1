package test;

import java.util.Scanner;

// 배열생성 
// 입력생성 

// 1. 계좌 생성 2. 계좌 목록 3. 예금 4. 출금 5. 종료 

public class BankAapplication {
	private static Account[] ac  = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int ch = 0;
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("은행 전산시스템");
			System.out.println("1. 계좌 생성 2. 계좌 목록 3. 예금 4. 출금 5. 종료");
			System.out.println("-----------------------------------------");
			
			ch = sc.nextInt();
			// 계좌 생성 
			if(ch == 1) {
				createA();
			}
			// 계좌 목록
			else if(ch == 2) {
				// 메소드 입력
			}
			// 예금
			else if(ch == 3) {
				// 메소드 입력
			}
			// 출금
			else if(ch == 4) {
				
			}
			// 종료 
			else if(ch == 5) {
				run = false;
				System.out.println("시스템을 종료하셨습니다.");
				
			}
			break;
		}
		
	}
	
	
	private static void createA() {
		System.out.println("-----------------------------------------");
		System.out.println("계좌 생성을 선택하셨습니다.");
		System.out.println("-----------------------------------------");
		
		Account account = new Account(ago,owner,balance);
		
		System.out.println("계좌입력 : "); String ago = sc.next();
		System.out.println("계좌주 : ");	String owner = sc.next();
		System.out.println("초기 계좌 금액 입력"); int balance = sc.nextInt();
		// 초기 계좌 금액을 밸런스에 넣고 저장 
		
		for(int i=0; i<ac.length;i++ ) {
			if(ac == null) {
				ac[i] = account;
				System.out.println("계좌 생성 완료");
				break;
			}
		}
			
	}
	
	private static void list() {
		System.out.println("-----------------------------------------");
		System.out.println("계좌 리스트 출력");
		System.out.println("-----------------------------------------");
		
		
		
}
	
	

}
