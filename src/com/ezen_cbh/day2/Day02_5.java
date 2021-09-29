package com.ezen_cbh.day2;

import java.util.Scanner;

public class Day02_5 {
	// 문자 : char 
	// 문자열 : 자료형 없음 => String 클래스 
	public static void main(String[] args) {
		 char  문자1 ='a';
		 // char  문자2 = 'abc'; // char 2바이트라서 하나의 문자만 저장 
		 // 1. String 이용한 문자열 저장 
		 
		 String 문자열1 = "abc"; System.out.println(문자열1);
		 // 2. 배열을 이용한 문자열 저장 
		 char [] 문자열2 = {'a', 'b', 'c'}; 
		 System.out.println( 문자열2 );
		
		 // String : 문자열 관리 해주는 클래스
		 	// 객체는  비교 연산자를 사용할수 없다. 
		 	// .equals(비교문자) : 문자 비교 
		 
		 String 이름 = "유재석"; // 영문 : 1바이트 //한글 : 2바이트
		 String 이름2 = new String("강호동"); // new는 가변 정해져있지않은 자료형의 크기를 선언
		 
		 System.out.println( 이름 == 이름2 );
		 System.out.println( 이름.equals(이름2) );
		 
	}
}
