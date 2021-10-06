package com.ezen_cbh.day6;

public class Car4 {
	
	// 1. 필드
	int gas;
	
	// 2. 생성자
	
	// 3. 메소드
	void setGas( int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false; // 반환타입이  boolean이기 때문에 false
		}
		System.out.println("gas가 없습니다");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량 :" + gas + ") ");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas잔량 : " + gas + ") ");
				return; // 메소드 실행종료
			}
		}
	}
	// 메소드 오버로딩 :  메소드 명은 동일할경우 인수 구분[타입,개수.순서]
		// void run(){} // 불가 
		void run(int x) {} // 가능
	
	// 내부클래스 호출
	
	void start() {
		run();
	}
}
