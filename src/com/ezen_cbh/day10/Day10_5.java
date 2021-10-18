package com.ezen_cbh.day10;

public class Day10_5 {
	
	public static void main(String[] args) {
		Anonymous annonymous = new Anonymous();
		
		annonymous.field.wake(); // 익명 자식 객체 내 메소드 호출 
		annonymous.method1(); // 객체내 메소드 호출 => 메소드내 익명객체 
		annonymous.method2(
				
				new Person() {
					void study() {
						System.out.println("공부합시다");
					}
					@Override
					void wake() {
						System.out.println("8시에 일어납니다");
						study();
					}
				}
		);
		
	}
}
