package com.ezen_cbh.day3;

import java.util.Scanner;

public class Day03_2 {
			//문제 1 : 2개의 정수를 입력받아 더 큰수 출력 
			//문제 2 : 3개의 정수를 입력받아 가장 큰수 출력 
			//문제 3 : 4개의 정수를 입력받아 가장 큰수 출력 
			//문제 4 : 4개의 정수를 입력받아 오름차순으로 출력 
			//문제 5 : 4개의 정수를 입력받아 내림차순으로 출력 
	
	public static void main(String[] args) {
		
		// 문제 1
		Scanner sc = new Scanner(System.in);
		System.out.println("2개의 정수를 입력하시오. "); int 문제1_1 = sc.nextInt(); int 문제1_2 = sc.nextInt();
		if(문제1_1 > 문제1_2) System.out.println( 문제1_1 );
		else if(문제1_1 < 문제1_2) System.out.println( 문제1_2 );
		else System.out.println(" 두 수는 같다 ");
		
		// 문제 2 
		System.out.println("3개의 정수를 입력하시오. "); int 문제2_1 = sc.nextInt(); int 문제2_2 = sc.nextInt(); int 문제2_3 = sc.nextInt();
		if(문제2_1 > 문제2_2 && 문제2_1> 문제2_3) System.out.println("가장 큰 수는 : " + 문제2_1); 
		else if(문제2_2 > 문제2_1 && 문제2_2> 문제2_3 ) System.out.println("가장 큰 수는 : " + 문제2_2 );
		else if(문제2_3 > 문제2_1 && 문제2_3> 문제2_2 ) System.out.println("가장 큰 수는 : " + 문제2_3 );
		else										System.out.println("세정수는 같다");
		//문제 3 
		System.out.println("4개의 정수를 입력하시오. "); int 정수3_1 = sc.nextInt(); int 정수3_2 = sc.nextInt(); int 정수3_3 = sc.nextInt(); int 정수3_4 = sc.nextInt();
		if(정수3_1 > 정수3_2 && 정수3_1> 정수3_3 && 정수3_1 > 정수3_4) System.out.println("가장 큰 수는 : " + 정수3_1); 
		else if(정수3_2 > 정수3_1 && 정수3_2> 정수3_3 && 정수3_2 > 정수3_4) System.out.println("가장 큰 수는 : " + 정수3_2);
		else if(정수3_3 > 정수3_1 && 정수3_3> 정수3_1 && 정수3_3 > 정수3_4) System.out.println("가장 큰 수는 : " + 정수3_3);
		else if(정수3_4 > 정수3_1 && 정수3_4> 정수3_1 && 정수3_4 > 정수3_3) System.out.println("가장 큰 수는 : " + 정수3_4);
		else										System.out.println("네정수는 같다");
		
		// 문제 3 강사님 문제 풀이
		//문제 3 
		System.out.println("4개의 정수를 입력하시오. "); int 정수6 = sc.nextInt(); int 정수7 = sc.nextInt(); int 정수8 = sc.nextInt(); int 정수9 = sc.nextInt();
		int 최대값 = 정수6; // max변수에 첫번째 값 넣기 
				
		if( 최대값 < 정수7 ) 최대값 = 정수7;
		if( 최대값 < 정수8 ) 최대값 = 정수8;
		if( 최대값 < 정수9 ) 최대값 = 정수9;
		System.out.println("가장 큰 수는 : " + 최대값);
		
		//문제 4 강사님 문제풀이 
		System.out.println("4개의 정수를 입력하시오. "); int 정수10 = sc.nextInt(); int 정수11 = sc.nextInt(); int 정수12 = sc.nextInt(); int 정수13 = sc.nextInt();
		
		int temp; // 교환시 사용되는 임시변수
			// 1. 1번째 변수와 2번째, 3번째, 4번째 변수와 비교 = 3번 
		if( 정수10 > 정수11 ) { temp = 정수10 ; 정수10 = 정수11; 정수11 = temp; }
		if( 정수10 > 정수12 ) { temp = 정수10 ; 정수10 = 정수12; 정수12 = temp; }
		if( 정수10 > 정수13 ) { temp = 정수10 ; 정수10 = 정수13; 정수13 = temp; }
			// 2. 2번째 변수와 3번째, 4번째 변수와 비교 = 2번
		if( 정수11 > 정수12 ) { temp = 정수11 ; 정수11 = 정수12; 정수12 = temp; }
		if( 정수11 > 정수13 ) { temp = 정수11 ; 정수11 = 정수13; 정수13 = temp; }
			// 3. 3번째 변수와 4번째, 4번째 변수와 비교 = 1번
		if( 정수12 > 정수13 ) { temp = 정수12 ; 정수12 = 정수13; 정수13 = temp; }
			// 4. 4번째 변수는 비교를 3번 당했기 때문에 비교 x
		System.out.printf("오름차순 : %d %d %d %d \n", 정수10, 정수11, 정수12, 정수13);
		
		//문제 5 .강사님 문제 풀이
		//////////////////////////////////// 작으면 뒤로 가기 => 내림차순 /////////////////////////////////////////////////////
		if( 정수10 < 정수11 ) { temp = 정수10 ; 정수10 = 정수11; 정수11 = temp; }
		if( 정수10 < 정수12 ) { temp = 정수10 ; 정수10 = 정수12; 정수12 = temp; }
		if( 정수10 < 정수13 ) { temp = 정수10 ; 정수10 = 정수13; 정수13 = temp; }
			// 2. 2번째 변수와 3번째, 4번째 변수와 비교 = 2번
		if( 정수11 < 정수12 ) { temp = 정수11 ; 정수11 = 정수12; 정수12 = temp; }
		if( 정수11 < 정수13 ) { temp = 정수11 ; 정수11 = 정수13; 정수13 = temp; }
			// 3. 3번째 변수와 4번째, 4번째 변수와 비교 = 1번
		if( 정수12 < 정수13 ) { temp = 정수12 ; 정수12 = 정수13; 정수13 = temp; }
			// 4. 4번째 변수는 비교를 3번 당했기 때문에 비교 x
		System.out.printf("내림차순 : %d %d %d %d \n", 정수10, 정수11, 정수12, 정수13);
		
		//문제6 : 로그인페이지 
			// [ 입력 ] : 아이디와 비밀번호를 입력받기 
			// [ 조건 ] : 회원아이디가 admin 이고 비밀번호가 1234 일 경우에는 로그인 성공 아니면 로그인 실패 출력 
		
		System.out.println("==========로그인페이지==========");
		System.out.print(" 아이디 : "); String 아이디 = sc.next();
		System.out.print(" 비밀번호 : "); int 비밀번호 = sc.nextInt();
		
		if (아이디.equals("admin") ) {
			// String 비교시 equals 메소드 사용 // 아이디가 admin이면 
			if(비밀번호 == 1234) {
				System.out.println(">>>>> 로그인 성공 >>>>>");
				
			}else {
				System.out.println(" [로그인실패] 패스워드가 다릅니다. ");
			}
		}
		else {
			System.out.println(" [로그인실패] 존재하지 않는 아이디 입니다. ");
		}
	}
}
