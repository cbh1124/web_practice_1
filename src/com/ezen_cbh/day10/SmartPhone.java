package com.ezen_cbh.day10;

public class SmartPhone extends Phone{
		// 추상클래스 : 상속 extends 
	public SmartPhone(String owner) {
		super(owner);
		//  super() : 슈퍼 클래스의 생성자 호출 
	}
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다");
	}
}
