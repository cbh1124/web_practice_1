package com.ezen_cbh.day3;

import java.util.Scanner;

public class Day03_5 { // c  s
	
	
	public static void main(String[] args) { // m  s
		
		Scanner sc= new Scanner(System.in);
		// 반복으로 별 모양 찍기
		// 문제1) 입력받은 정수만큼 별 출력 [ i = 1부터 입력받은정수까지 1씩 증가]
		System.out.print("별 개수 : "); int s1 = sc.nextInt();
		for( int i = 1; i<=s1 ; i++ ) { System.out.println("* ");  }
	 System.out.println("\n---------------------------------------");
	  	
	 	// 문제2) 입력받은 정수만큼 별 출력 // 5개마다(5배수) 줄바꿈 
	 	System.out.println("별 개수 : "); int s2 = sc.nextInt();
	 	for(int i = 1 ; i<=s2 ; i++) {
	 		System.out.print("* ");
	 		if(i%s2==0) System.out.println();
	 	}
	 	// 문제3) 입력받은 줄 만큼 출력 
	 	System.out.println("별 개수 : "); int s3 = sc.nextInt();
	 	for(int i = 1; i<=s3 ; i++) {
	 		System.out.println(" ");
	 		for(int j = 1; j<=i; j++) {
	 			System.out.print("*");
	 		}
	 	}
	 	// 문제3 강사님 풀이 ) 
	 	
	 	// 문제4)  입력받은 줄 만큼 출력 
	 	System.out.println("문제4 줄 수 : "); int line4=sc.nextInt();
	 	
	 	for(int i = 1; i<=line4; i++) {
	 		
	 		// 별찍기
	 		for(int s4 = 1; s4 <=line4-i+1; s4++) { System.out.print("*");}
	 		// 줄바꿈
	 		System.out.println();
	 	}
	 	
	 	
	 // 문제5)
	 	System.out.print("문제5) 줄 수 : "); int line5 = sc.nextInt();
	 	for( int i = 1 ; i<=line5 ; i++ ) {
	 		// 공백찍기 
	 		for( int b = 1 ; b<=line5-i ; b++ ) { System.out.print(" "); }
	 		// 별찍기 
	 		for( int s = 1 ; s<=i ; s++ ) { System.out.print("*");}
	 		// 줄바꿈
	 		System.out.println();
	 	}
	 	
	  // 문제6)
		System.out.println("별 개수 : "); int line6 = sc.nextInt();
		
		for( int i = 1 ; i<=line6 ; i++ ) {
			// 공백찍기
	 		for( int b = 1 ; b<=i-1 ; b++ ) { System.out.print(" "); }
	 		// 별찍기 
	 		for( int s = 1 ; s<=line6-i+1 ; s++ ) { System.out.print("*");}
	 		// 줄바꿈
	 		System.out.println();
		}
	 // 문제 7) 
		System.out.println("별 개수 : "); int line7 = sc.nextInt();
		
		for( int i = 1 ; i<=line7 ; i++ ) {
			// 공백 찍기
			for( int b = 1 ; b<=line7-i ; b++ ) { System.out.print(" "); }
	 		// 별 찍기
			for( int s = 1; s<=(i*2)-1; s++) { System.out.print("*"); }
			// 줄바꿈
	 		System.out.println();
	 		
	 	}
		
	// 문제 8)
		System.out.println("별 개수 : "); int line8 = sc.nextInt();
		
		for( int i = 1 ; i<=line8 ; i++ ) {
			// 공백 찍기
			for( int b = 1 ; b<=line8-i ; b++ ) { System.out.print(" "); }
	 		// 별 찍기
			for( int s = 1; s<=(i*2)-1; s++) { System.out.printf("%d", i); }
			// 줄바꿈
	 		System.out.println();
		}
		
	// 문제 9)
		System.out.println("별 개수 : "); int line9 = sc.nextInt();
		
		for( int i = 1 ; i<=line9 ; i++ ) {
			// 공백 찍기
			for( int b = 1 ; b<=i-1 ; b++ ) { System.out.print(" "); }
			// 별 찍기
			for( int s = 1; s<=line9*2-(i*2-1); s++) { System.out.print("*"); }
			// 줄바꿈
	 		System.out.println();
		}
	// 문제 10)
		System.out.println("별 개수 : "); int line10 = sc.nextInt();
		
	// 문제 11)
		System.out.println("별 개수 : "); int line11 = sc.nextInt();
	} // m  e
}  // c  e
