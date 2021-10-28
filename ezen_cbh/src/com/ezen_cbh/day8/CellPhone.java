package com.ezen_cbh.day8;

public class CellPhone {
	// 필드 
	String model;
	String color;
	
	// 생성자
	
	// 메소드 [ 접근제한자(생략=>default) 반환타입 메소드( 인수1, 인수2, 인수3 등등){ 실행코드}]
	
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {// 외부로부터 들어오는 변수 [ 인수 ]
						
		System.out.println("자기 : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방 : " + message);
	}
	void hangUp() {System.out.println("전화를 끊습니다.");}



}
