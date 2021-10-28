package 연습;

import java.util.Scanner;

public class BankApplication {
	// main 메소드 밖에 선언시 : main 메소드 외 모든 메소드에서 호출가능 
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("----------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4. 출금 | 5.종료");
			System.out.println("----------------------");
			System.out.println("선택> ");
			
			int ch = sc.nextInt();
			
			if(ch == 1) {
				// 메소드
			}
			if(ch == 2) {
				// 메소드 
			}
			if(ch == 3) {
				// 메소드 
			}
			if(ch == 4) {
				// 메소드 
			}
			if(ch == 5) {
				run = false; 
			}
			System.out.println("시스템 종료");
		}
		private static void createA() {
			System.out.println("----------------------");
			System.out.println("계좌 생성");
			System.out.println("----------------------");
			
			System.out.println("계좌번호 : "); String ano = sc.next();
			System.out.println("계좌주 : "); String owner = sc.next();
			System.out.println("초기 입금 금액"); int balance = sc.nextInt();

			Account account = new Account(ano,owner,balance);
			
			for(int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = account;
					System.out.println("결과 계좌가 생성되었습니다.");
					break;
				}
			}
		}
	
		
	}
}
