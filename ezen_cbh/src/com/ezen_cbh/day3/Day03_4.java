package com.ezen_cbh.day3;

import java.util.Scanner;

public class Day03_4 {
	
	// 반복문 : for , while 
		//	1. for : 어디서부터 어디까지 어떻게 증가하면서 반복실행 
			// for ( 초기값; 조건문 ; 증감식; ) { 실행문 ; }
			// for ( 어디서부터 , 어디까지, 어떻게 증가) { 실행문 ;} 
	public static void main(String[] args) {
		// p.121 예1) // 1부터 10까지 1씩 증가하면서 반복출력 
		for(int i = 1; i<=10; i++ ) {
			// 1. 초기값 : 반복변수의 시작값 i는 1부터 
			// 2. 조건문 : 반복변수의 논리제어[true 실행 아니면 실행x] 
			// 3. 증감식 : 반복변수의 증감단위 
			System.out.print( i + " ");
				//i = 1 일때 i<=10 true 반복실행o
				// [증감식] i = 2일때 i<=10 true 반복실행o
				// [증감식] i = 3일때 i<=10 true 반복실행o 
				//
				///[증감식] i = 11일때 i<=11 false 반복실행x 
			
	}
		
		System.out.println("\n ---------------------");
		// 예2) 1~50까지 출력 
		for( int i = 1; i<=50; i ++ ) { System.out.print(i + " ");
		
		}
		
		
		System.out.println("\n ---------------------");
		// 예3) 1~50까지 3씩 증가 출력 [i는 1부터 50까지 3씩 증가하면서 반복실행]
		for( int i = 1; i<=50; i+=3 ) { System.out.print(i + " ");
		
		}
		
		//p.122 예4) // 1부터 100까지의 합을 출력 [i 는 1부터 100까지 1씩 증가하면서 합계반복실행]
		
		int 누적합계 = 0; // 공백 <--> 0
		for( int i = 1; i<=50; i+=3 ) { 누적합계 += i; }
			// 누적합계 +=i  // 누적합계 = 누적합계 + i
		System.out.println("1~100까지 누적합계 : " + 누적합계 );
		
		// 예5 : 1부터 100까지 7배수의 누적합계 [ i는 1부터 100까지 7씩 증가하면서 누적합계 ]
		int 누적합계2 = 0;
		for( int i = 0; i<=100; i+=7 ) {누적합계2 += i; }
		System.out.println("1~100까지 7배수의 누적합계 :" + 누적합계2);
		
		// 예5_2
		int 누적합계3 = 0;
		for(int i = 0; i <= 100; i++) {if(i%7==0) 누적합계3 +=i; }
		
		// 예6 : 2단 구구단 //2*1 2*2 2*3 2*4 2*5 2*6 2*7~~~~
			// 단수 : 2[상수] 		곱 : 1~9[변수]
		for(int i = 1 ; i<=9; i++) {
			System.out.printf("%d * %d = %d" , 2 , i , 2*i);
		}
		// p.124 예7) 구구단 2~15 구구단
		for(int i = 2 ; i<=15; i++) {
			for (int j = 1; j<=9; j++) {
				System.out.printf("%d * %d = %d ", i , j , i*j);
			}
		}
		
		
		// for문 중첩 [ for1( ){   for2( )  }
		// p.124 예7) 2~15 구구단 
		// 단수 : 2~15[변수]	곱 : 1~9[변수]
		// 하나의 단 마다 곱은 9번 실행  
		int 실행횟수 = 0;
		for( int 단 = 2 ; 단<=15 ; 단++ ) {
			System.out.println( "======="+단+"단 ====== ");
			// 단이 한번 실행마다 곱은 9번 실행 
			for( int 곱 = 1 ; 곱<=9 ; 곱++ ) {
				System.out.printf( "%d X %d = %d \n" , 단 , 곱 , 단*곱 );
				실행횟수++;
			}
		}
		System.out.println(" 총 실행횟수 : " + 실행횟수 );
		
	}
}
