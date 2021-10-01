package com.ezen_cbh.day4;

import java.util.Random;
import java.util.Scanner;

public class Day04_2 {
		// 가위바위보 
				// 1. 사용자로부터 가위[0]바위[1]보[2] 중 하나를 입력 받기
				// 2. 컴퓨터는 랜덤으로 가위바위보 [0~2] 중 하나 선택 
				// 3. 승리한 플레이어 호출 
					// + : 만약에 종료를 입력하면 게임 종료 
					// + : 게임종료시 게임수 와 최종 승리 [ 가장 많이 이긴 플레이어 호출 ]
	public static void main(String[] args) {
		// 1. 필요 변수 개수 // 2. 키보드 입력 // 3. 난수 생성 // 4. 제어
		int 플레이어 ;
		int 컴퓨터 ;
		int countP = 0; // 플레이어 승리수
		int countC = 0; // 컴퓨터 플레이수
		int countS = 0; // 플레이어 컴퓨터 비긴 횟수
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------[[가위 바위 보 게임 ]]---------- ");
			System.out.println(">>>>>> 0.가위 1.바위 2.보 3.게임종료 중 숫자를 입력해주세요  ");
			플레이어 = sc.nextInt();
			
			// 2. 컴퓨터로부터 난수 생성 
			System.out.println(">>>>> 컴퓨터 선택 중>>>>>");
			Random rd = new Random();
			컴퓨터 = rd.nextInt(3); // 0~2 사이 난수
			
			// 3. 승리자 판단 
			if (플레이어 == 0)
			{
				if (컴퓨터 == 1)
				{
					System.out.println("컴퓨터가 승리하였습니다.");
					System.out.printf("컴퓨터는 %d\n", 컴퓨터);
					countC++;;
				}
				else if (컴퓨터 == 2 )
				{
					System.out.println("사용자가 승리하였습니다.");
					System.out.printf("컴퓨터는 %d\n", 컴퓨터);
					countP++;
				}
				else { 
					System.out.println("비겼습니다.");
					System.out.printf("컴퓨터는 %d\n", 컴퓨터);
					countS++;
				}
				
			}
			
			if (플레이어 == 1)
			{
				if (컴퓨터 == 2)
				{
					System.out.println("컴퓨터가 승리하였습니다.");
					System.out.printf("컴퓨터는 %d\n", 컴퓨터);
					countC++;;
				}
				else if (컴퓨터 == 0 )
				{
					System.out.println("사용자가 승리하였습니다.");
					System.out.printf("컴퓨터는 %d\n", 컴퓨터);
					countP++;
				}
				else { 
					System.out.println("비겼습니다.");
					System.out.printf("컴퓨터는 %d\n", 컴퓨터);
					countS++;
				}
				
			}
			
			if (플레이어 == 2)
			{
				if (컴퓨터 == 0)
				{
					System.out.println("컴퓨터가 승리하였습니다.");
					System.out.printf("컴퓨터는 %d\n", 컴퓨터);
					countC++;;
				}
				else if (컴퓨터 == 1 )
				{
					System.out.println("사용자가 승리하였습니다.");
					System.out.printf("컴퓨터는 %d\n", 컴퓨터);
					countP++;
				}
				else { 
					System.out.println("비겼습니다.");
					System.out.printf("컴퓨터는 %d\n", 컴퓨터);
					countS++;
				}
				
			}
			
			if (플레이어 == 3) {
				System.out.println("종료합니다.");
				
				if(countP>countC) {
					System.out.printf("총 게임수 %d 가장많이 이긴 플레이어 : 사용자\n ", countP+countC+countS);
					System.out.printf("사용자의 이긴횟수 : %d", countP);
				}
				else if (countP<countC) {
					System.out.printf("총 게임수 %d 가장많이 이긴 플레이어 : 컴퓨터\n ", countP+countC+countS); 
					System.out.printf("컴퓨터의 이긴횟수 : %d", countC);
				}
				else {
					System.out.printf("총 게임수 %d 가장많이 이긴 플레이어 : 비겼습니다\n", countP+countC+countS);
				}
				break;
			}
			/*
			int keycode = sc.nextInt();
			if (keycode == 0)
			{
				System.out.println("가위를 입력하셨습니다.");
				Random rd = new Random();
				컴퓨터 = rd.nextInt(3);
				if(가위)
			}
			*/
		}
		
	}
}
