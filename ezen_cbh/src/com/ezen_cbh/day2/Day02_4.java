package com.ezen_cbh.day2;

import java.util.Scanner;

public class Day02_4 {
	// 문제1 : 급여 명세서 
	/*
	 * [조건] 입력받기 : 기본급 , 수당 
	 * [출력] 실수령액 = 기본급 + 수당 - 세금[ 기본급10% ]
	 * 
	 */
	
	// 문제2 : 지폐 개수 세기 
	/*
	 * [조건] : 십만원 단위의 금액을 입력 받아
	 * [출력] : 입력받은 금액의 지폐수 세기 
	 * [출력 예 ] : 356789  
	 * 		십만원 : 3장 
	 *		만원 : 5장 
	 * 		천원 : 6장 
	 * 		백원 : 7개
	 */
	
	//문제3 : 하나의 정수를 입력받아 7의 배수인지 출력[ true , false ]
	
	//문제4 : 하나의 정수를 입력받아 홀수 인지 확인 [ true , false ]
	
	//문제5 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 확인 [ true , false ]

	//문제6 : 두개의 정수를 입력받아 더 큰지 출력  [ true , false ]
	
	//문제7 : 반지름을 입력받아 원 넓이 출력하기 
		// 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]
	
	//문제8 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기
		// 예) 54.5   84.3 이면    64.285714%
	
	//문제9 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기]
		//사다리꼴 계산식 = > (윗변 * 밑변) * 높이 / 2
	
	//문제10: 키를 정수를 입력받아 표준체중 출력하기
		//표준체중 계산식 = > (키 - 100) * 0.9
	
	//문제11: 키와 몸무게를 입력받아 BMI 출력하기
		//BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))
	
	//문제12: inch 를 입력받아 cm 로 변환하기
	
	//문제13:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하기
		//소수 둘째 자리 까지 점수 출력하기
		//중간고사 반영비율 => 30 %
		//기말고사 반영비율 => 30 %
		//수행평가 반영비율 => 40 %
	
	//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
	 	//int x = 10;
		//int y = x-- + 5 + --x;
		//printf(" x의 값 : %d , y의값 :  %d ", x, y)
	public static void main(String[] args) {
		// 문제 1
		Scanner sc = new Scanner(System.in);
		
		System.out.println("급여 기본급 입력 : "); int 기본급 = sc.nextInt();
		System.out.println("급여 수당 입력 : ");   int 수당 = sc.nextInt();
		
		int 세금 = (int)(기본급 * 0.1);
		System.out.println("실수령액 : " + (기본급 + 수당-(기본급*0.1)) );
		
		// 문제 2 
		
		System.out.println("십만원 단위의 금액을 입력하시오  "); int 금액 = sc.nextInt();
		
		// 1. 십만원 권
		System.out.println("십만원 : " + (금액/100000) + "장");
		금액 -= (금액/100000) * 100000;
		// 2. 만원 권
		System.out.println("만원 :" + (금액/10000) + "장 ");
		금액 -= (금액/10000) * 10000;
		// 3. 천원 권 
		System.out.println("천 :" + (금액/1000) + "장 ");
		금액 -= (금액/1000) * 1000;
		// 4. 백원
		System.out.println("천 :" + (금액/100) + "개 ");
		
		// 문제 3 
		System.out.println("정수를 입력하시오  "); int 정수 = sc.nextInt();
		System.out.println("7의 배수인가요 : " + (정수%7 == 0));
		
		// 문제 4
		System.out.println("정수를 입력하시오  "); int 문제4 = sc.nextInt();
		System.out.println("홀수인가요 : " + (문제4%2 == 1));
		
		// 문제 5
		System.out.println("정수를 입력하시오  "); int 문제5 = sc.nextInt();
		System.out.println("7의 배수 이면서 홀수 인지 : " + (문제5%7 == 0 && 문제5%2==0));
		
		// 문제 6 
		System.out.println("첫번째 정수를 입력하시오  "); int 문제6_1 = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오  "); int 문제6_2 = sc.nextInt();
		System.out.println("6_1이 더 큽니다 " + (6_1 > 6_2)); 
		System.out.println("6_2가 더 큽니다 " + (6_1 < 6_2)); 
		
		// 문제 7
		System.out.println("반지름을 입력하시오  "); double 문제7_1 = sc.nextInt();
		System.out.println("원의 넓이 공식" + (문제7_1*문제7_1*3.14));
		
		// 문제 8 
		System.out.println("첫번째 실수를 입력하시오  "); double 문제8_1 = sc.nextInt();
		System.out.println("두번째 실수를 입력하시오  "); double 문제8_2 = sc.nextInt();
		double 비율 = (문제8_1/문제8_2) * 100 ;
		System.out.println("앞 실수의 값이 뒤의 값의 몇% 인가?" + 비율 +"%");
		// 소수점 단위를 형식 변경
		System.out.printf("실수1의 실수2의 백분율 : %f%%", 비율);
									// 형식문자 : %f [실수]
										// %.숫자f [ 숫자 : 소수점 자리수 ] 
										// %.2f[ 소수점 2자리수 ]
		
		// 문제 9 
		System.out.print("윗변 입력하시오  "); double 윗변 = sc.nextInt();
		System.out.print("밑변 입력하시오  "); double 밑변 = sc.nextInt();
		System.out.print("높이 입력하시오  "); double 높이 = sc.nextInt();
		
		System.out.printf("사다리꼴 넓이 : %.3f \n" , (윗변 * 밑변)*높이/2 ); 
		
		// 문제 10
		System.out.println("키를 입력하시오  "); double 키 = sc.nextInt();
		System.out.println("표준체중을 구하시오 " + ( (키 - 100) * 0.9)  + "kg");
		
		// 문제 11
		System.out.println("키를 입력하시오  "); double 문제11_1 = sc.nextInt();
		System.out.println("몸무게를 입력하시오  "); double 문제11_2 = sc.nextInt();
		
		System.out.printf("BMI : %.1f \n " , 문제11_2 / ((문제11_1 / 100) * (문제11_1/100)) );
		
		// 문제 12 
		System.out.println("인치를 입력하시오  "); double 문제12_1 = sc.nextInt();
		System.out.println("인치를 cm로 변환합니다. " + (문제12_1 * 2.54) );
		
		// 문제 13
		System.out.println("중간고사  "); double 중간고사 = sc.nextInt();
		System.out.println("기말고사  "); double 기말고사 = sc.nextInt();
		System.out.println("수행평가  "); double 수행평가 = sc.nextInt();
		
		중간고사 *= 0.3; 기말고사 *= 0.3; 수행평가 *= 0.4;
		
		System.out.printf("반영비율별 점수 : %.2f \n" , (중간고사+기말고사+수행평가) );
		
		//문제14 :  연산 순서 나열 하고 x와 y값 예측하기
	 	//int x = 10;
		//int y = x-- + 5 + --x;
		//printf(" x의 값 : %d , y의값 :  %d ", x, y)
		//10 23 
		
		//
	}
}
