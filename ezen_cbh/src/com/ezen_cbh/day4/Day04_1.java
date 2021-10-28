package com.ezen_cbh.day4;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	// 무한루프 = > while 이용한 무한 반복 
		// 키보드를 이용한 루프 제어
		// 무한루프 종료 방법 :  1. 조건을 false 2. break
		while(true) { 
			//System.out.println("무한루프"); 
			//int 선택 = sc.nextInt();
			//if( 선택 == 4 ) break;
			
				
		// 랜덤 [난수] 생성
			// 1. 랜덤 클래스  // 2. Math 클래스 
				// Random 객체 
					// .nextInt() : int형 표현함수 단위만큼 난수 생성
					// .nextInt(숫자) : 0~숫자전까지 난수
					// .nextInt( 10 ) + 초기값 : 초기값 ~ 숫자까지의 난수 
			Random rd = new Random();
			System.out.println( rd.nextInt(10) + 1 );
			//System.out.println( rd.nextInt() );
			//System.out.println( rd.nextDouble() );
			
		
		//

		}
	}
}
