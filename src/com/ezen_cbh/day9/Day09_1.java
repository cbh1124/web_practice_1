package com.ezen_cbh.day9;

public class Day09_1 {
	
		// 클래스 : 객체의 설계다 .
			// 멤버 : 필드 (속성, 메모리), 메소드 (행동, 인수, 반환), 생성자 
		// 객체 : 클래스 기반으로 메모리 할당 
			// 서로 다른 객체 생성 [메모리 주소 다름] 생성 
		// 상속 : 슈퍼 클래스의 멤버 사용 
			// 목적 :  빠른 설계 [ 기존 클래스로부터 멤버를 물려받아서 서브 클래스가 이어서 설계] 
			// 필수x
			// java 100% 객체지향 이유 : 최상위 object 클래스
		// 접근 제한자
			// public : 전범위	private
			// protected : 현패키지[다른 패키지에 부모가 존재하면 접근가능 
			// default[생략] : 현 패키지

		public int 변수2 = 10; 
		private int 변수3 = 10;
		protected int 변수4 = 10;
		int 변수 = 10; // default
		
}
