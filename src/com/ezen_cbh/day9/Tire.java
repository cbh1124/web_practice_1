package com.ezen_cbh.day9;

public class Tire {
	
	// 필드 
	public int maxRotation; // 최대 회전수 [ 타이어 수명 ]
	public int accumulatedRotation; // 누적 회전수 
	public String location;
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	// 메소드 
	public boolean roll() { // 타이어 회전 메소드
		++ accumulatedRotation; // 누적 회전수 증가 
		if(accumulatedRotation < maxRotation ) {
			System.out.println(location + "Tire 수명 : "  // 최대 회전수가 더 크면
					+ (maxRotation-accumulatedRotation) + "회"); // 남은 수명 출력
			return true; // true 수명이 남음을 표시하는 반환
		}else { // 최대 회전수가 더 작으면 
			System.out.println("*** " + location + " Tire 펑크 ***");
			return false; // false 수명이 없음을 표시하는 반환 
		}
	}
	
}