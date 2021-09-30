package com.ezen_cbh.day3;

import java.util.Scanner;

public class Day03_8 {
	
	public static void main(String[] args) {
		// 확인문제 7 : ATM 프로그램
		// 종료버튼 누르기전까지 무한 실행 프로그램 => while(true)
		boolean run = true;
		
		int balance = 0;
		int 예금액 = 0;
		int 출금액 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {

			System.out.println("------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 |");
			System.out.println("------------------------------");
			System.out.println("선택> "); int keycode = sc.nextInt();
			
			if(keycode == 1 ) {
				System.out.println("예금액>");
				balance += sc.nextInt();
				예금액 = balance;
				System.out.printf("현재 잔고는 : %d 원", balance);
			}
			else if(keycode == 2) {
				System.out.println("출금액>");
				balance -= sc.nextInt();
				System.out.printf("현재 잔고는 : %d 원", balance);
				출금액 = balance;
				
				if( 예금액 < 출금액 ) { System.out.println("[[ 알림 ]] 잔고가 부족합니다");}
				else { 예금액 -= 출금액; System.out.println("[[ 알림 ]] 출금 완료");}
			}
			else if(keycode == 3) {
				System.out.println("잔고>");
				System.out.printf("현재 잔고는 : %d 원", balance);
			}
			else if(keycode == 4) { // 만약에 4를 입력했을때 
				run = false; // 실행변수를 FALSE를 넣어서 무한루프[while] 종료 
				System.out.println("[[이용해주셔서 감사합니다]]");
			}
			else {
				System.out.println(" [[경고]] : 알 수 없는 번호입니다 ");
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
}
