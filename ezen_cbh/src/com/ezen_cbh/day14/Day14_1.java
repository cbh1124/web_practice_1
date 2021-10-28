package com.ezen_cbh.day14;

public class Day14_1 {
	public static void main(String[] args) {
		
		// 제네릭 : 타입 변환 
		
		// Member<String> member = new Member(); // Member클래스에 매개 값으로 전달 String으로 전달 됨 
		// 멀티 제네릭 
		Member<String, Integer> member = new Member(); // Member클래스에 매개 값으로 전달 String으로 전달 됨 
		
		// p.660
		// 제네릭 메소드 : 메소드명 앞에 제네릭을 적용
		Box<Integer> box1 = Util.<Integer>boxing(100);
		System.out.println(box1.getT() );
		
		Box<String> box2 = Util.boxing("홍길동");
		System.out.println(box2.getT());
	}
}
