package com.ezen_cbh.day1;

import java.util.Scanner;

public class Day01_4 { //c s
	
	public static void main(String[] args) {
		/*
		// 1. 입력객체 선언 [키보드로부터 입력값을 저장하는 객체 ]
		Scanner 입력객체 = new Scanner(System.in);
			// 객체 선언 :  클래스명 객체명[임의] =  new 생성자();
		
		// 2. 입력받은 값 꺼내와서 변수에 저장 
			// 변수는 값을 저장할수 있는 메모리 [기억장치]
		System.out.print("첫번째 입력 :");
		String 첫번째입력 = 입력객체.next(); 
			// String : 문자열 클래스 : 문자열을 저장하는 객체 선언
		
		System.out.print("두번째 입력 : ");
		int 두번째입력 = 입력객체.nextInt();
			// int : 정수형[숫자] 자료형 : 정수를 저장하는 변수 선언
		
		//3. 변수 출력 
		System.out.println("첫번째 입력값은 : " + 첫번째입력);
		System.out.println("두번째 입력값은 : " + 두번째입력);
		
		*/
		
		// 문제 1 
		/*
		 * 학생 한명의 이름과 1~3교시의 출력 여부를 입력받아 입력받은 값을 아래와 같이 출력
		 */
		
		System.out.print("학생의 이름을 입력하시오.  ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		System.out.print("1교시 출결 : ");
		Scanner sc2 = new Scanner(System.in);
		String attend1 = sc2.next();
		
		System.out.print("2교시 출결 : ");
		Scanner sc3 = new Scanner(System.in);
		String attend2 = sc3.next();
		
		System.out.print("3교시 출결 : ");
		Scanner sc4 = new Scanner(System.in);
		String attend3 = sc4.next();
		
		System.out.println();
		System.out.println("\t[[ 출석부 ]]\t");
		System.out.println("---------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println(name +"\t" + attend1 + "\t"+ attend2 + "\t" + attend3);
		System.out.println("---------------------------------");
		
		// 문제 1 강사님 풀이
		Scanner 입력객체 = new Scanner(System.in);
		System.out.print("학생의 이름을 입력하시오.  "); String 이름 = 입력객체.next();
		System.out.print("1교시 출결 : "); String 교시_1 = 입력객체.next();
		System.out.print("2교시 출결 : "); String 교시_2 = 입력객체.next();
		System.out.print("3교시 출결 : "); String 교시_3 = 입력객체.next();
		
		System.out.println();
		System.out.println("\t[[ 출석부 ]]\t");
		System.out.println("---------------------------------");
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		System.out.println(이름 +"\t" + 교시_1 + "\t"+ 교시_2 + "\t" + 교시_3);
							// "제어문자" + 변수 + "제어문자" + 객체명 : 변수나 객체값은 문자처리 생략
		System.out.println("---------------------------------");
	}
	
}// c e
