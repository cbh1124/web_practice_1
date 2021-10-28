package com.ezen_cbh.day4;

import java.util.Random;
import java.util.Scanner;

public class Day04_7 {
	public static void main(String[] args) {
		// 조건1 : 1~45 사이의 수를 6개 입력받아 배열에 저장 	
			// 단 : 중복불가 // 1~45 사이만 가능 
		// 조건 2 : 추첨번호는 난수생성 1~45 사이의 숫자 6개 생성하여 배열에 저장 
		// 조건 3 : 두 배열내 동일한 숫자가 몇개 있는지 체크하여 등수 출력 
		// 출력  : 몇개가 동일한지 출력하고 등수 출력 
		// 6개 모두 동일하면 1등 // 5개 동일하면 2등 // 4개 동일하면 3등 // 3개 동일하면 4등 // 그외 꽝 
		
			
		int[] 입력번호 = new int[6];
		int[] 추첨번호 = new int[6];
		int temp; 
		
		Scanner sc = new Scanner(System.in);
		
		// 조건1 : 1~45 사이의 수를 6개 입력받아 배열에 저장 	
		System.out.println("1~45 사이의 수를 6개 입력하시오 ");
		for (int i=0; i<6; i++) {
			int num = sc.nextInt();
			
			if(num < 1 || num > 45) {
				System.out.println("0~45사이만 입력 가능합니다 : 다시 입력 ");
				i--; // 정상적인 입력이 아니기 때문에 i 차감 
				continue;
			}
			// 중복체크 
			for(int j = 0; j < 6; j++) {
				if(num == 입력번호[j] ) { // 중복찾기 성공
					System.out.println("[[알림]] : 선택한 수는 이미 존재 합니다 : 다시 입력하세요 ");
					i--; // 정상적인 입력이 아니기 때문에 i 차감 
					break;
				}
			}
			// 1~45 사이의 수 이면서 중복수가 아니면 i번째 배열에 저장  
			입력번호[i] = num;
			
			// 2.출력 
			System.out.println("사용자가 선택한 수");
		for(i = 0; i < 6; i++) {
			System.out.println(입력번호 + " ");
		}
		System.out.println(입력번호 + " ");
			/*
			for(int j=0; j<6; j++) {
				if (입력번호[i]==입력번호[j]) {
					System.out.println("1~45 사이의 수가 중복되었습니다.");
					break;
				}
			}
			*/
		}
		
		// 조건 2 : 추첨번호는 난수생성 1~45 사이의 숫자 6개 생성하여 배열에 저장
		Random random = new Random();
		
		for (int i=0; i<6; i++) {
			int rand = random.nextInt(46); // 0~45 사이의 난수 생성 
		}
		
		// 조건 3 : 두 배열내 동일한 숫자가 몇개 있는지 체크
		for (int i = 0; i<6; i++) {
			for (int j = 0; j <7; j++) {
				if ( 입력번호[i] == 추첨번호[j] ) {
					System.out.printf("일치하는 숫자를 출력합니다 : %d \n", 입력번호[i] );
				
				}
			}
		}
		
		
		
		
			
		
	}
}
