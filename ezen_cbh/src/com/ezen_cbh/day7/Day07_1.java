package com.ezen_cbh.day7;

public class Day07_1 {
	public static void main(String[] args) {
		// p.236
		
		// p.238
		double result = 10 * 10 * Calculator.pi;
			// 해당 클래스의 멤버 접근 방법 
				// 1. 객체 생성 [ 해당 클래스로부터 메모리 할당]
				// 2. static [ 정적변수 ] : 프로그램 시작시 메모리 할당 [ main 실행보다 우선시 ]
				
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		// p.245
		Person p1 = new Person("123456-1234567", "계백");
		
		//필드 호출
		System.out.println(p1.nation + " " + p1.ssn + " " + p1.name);
		
		//필드 수정 [final 필드는 수정 불가 => 상수 만들기]
		
		// p1.nation = "usa";
		// p1.ssn = "654321-7654321";
		p1.name = "을지문덕";
		// p.253 : import : 다른 패키지로부터 클래스 가져오기 
			// 1. import 패키지명.클래스명 [클래스 외부에 작성 ]
			// 2. 패키지명.클래스명 객체명 ; [ 클래스 내부에 작성 ]
	}
}
