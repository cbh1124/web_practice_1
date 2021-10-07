package com.ezen_cbh.day7;

public class Day07_2 {
	public static void main(String[] args) {
		
		// p.256
			// 접근제한자
			// public : 모든 곳에서 호출가능 
			// private : 현재 클래스내에서만 호출 가능 
			// protected :  동일한 패키지내에서만 호출 가능 
				//상속이 있을경우 다른 패키지 호출가능[부모가 다른패키지에 있을경우 부모패키지에 접근 가능 ]
			// default[생략] : 동일한 패키지내에서만 호출 가능 
				// 상속X
		
		// p.265 
			// Getter, Setter 메소드 
				// 1. 데이터 보호 목적 : private [외부로부터 접근 불가]
				// 2. Getter, Setter : public을 통한 외부로부터 간접접근 이용한 필드 호출 
		
	}
}
