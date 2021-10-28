package com.ezen_cbh.day1;

import java.util.Scanner;

public class Day01_6 {
	public static void main(String[] args) {
		// 문제3 : 방문록 입력받아 출력하기
		
		/* [입력받기] : 작성자, 내용, 날짜
		 * [ 출력  ]
		 *  -------------방문록-----------------
		 *  | 순번 | 작성자 | 내용     | 날짜   | 
		 *  |  1  | 강호동 | 안녕하세요 | 09-28|
		 * ------------------------------------
		 *
		 */
		
		/*
		// 1. 입력객체 만들기 
				Scanner 입력객체 = new Scanner(System.in);
				// 2. 입력받은 값을 변수/객체저장 
				System.out.println("작성자 : "); String 작성자 = 입력객체.next();
				System.out.println("내용 : "); String 내용 = 입력객체.next();
				System.out.println("날짜 : "); String 날짜 = 입력객체.next();
				
				// 3. 출력 
				System.out.println("-------------방문록-----------------");
				System.out.println("| 1 |\t 작성자 |\t내용|\t 날짜 |");
				System.out.println("|"+"\t"+ 작성자 +" |"+"\t"+내용+"|"+날짜+" |");
	    */
				// 1. 입력객체 선언 
				Scanner scanner = new Scanner(System.in);
				System.out.print(" 작성자 : "); String writer = scanner.next();
				System.out.print(" 내용 : "); String contents = scanner.nextLine(); // 공백 포함 o
					// scanner.nextLine(); next 다음으로 nextLine 사용시 문제 발생
						// 해결방법 : next 와 nextLine 사이에 nextLine() 추가 
				
				System.out.print(" 날짜 : "); String date = scanner.next();
				// 2. 출력 
				System.out.println("-------------방문록-------------");
				System.out.println("| 순번 | 작성자 | 내용 \t | 날짜 |");
				System.out.println("|  1  | "+writer+" | " + contents + "\t | " + date + " |");
				System.out.println("------------------------------");
				
	}
}
