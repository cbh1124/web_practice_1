package com.ezen_cbh.day9;

public class KumhoTire extends Tire{

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	// 필드 
	// 생성자
	
	// 메소드 
	@Override
	public boolean roll() {
		++ accumulatedRotation; // 누적 회전수 증가 
		if(accumulatedRotation < maxRotation ) {
			System.out.println(location + "KumhoTire 수명 : "  // 최대 회전수가 더 크면
					+ (maxRotation-accumulatedRotation) + "회"); // 남은 수명 출력
			return true; // true 수명이 남음을 표시하는 반환
		}else { // 최대 회전수가 더 작으면 
			System.out.println("*** " + location + " KumhoTire 펑크 ***");
			return false; // false 수명이 없음을 표시하는 반환 
		}
	}
}
