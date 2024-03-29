package com.ezen_cbh.day10;

public class Day10_3 {
	public static void main(String[] args) {
		// p.394 : 중첩클래스 
		
		A a = new A(); // A클래스가 메모리할당될때 중첩된 클래스들은 메모리할당X 
			//a.method(); // D객체가 생성되었습니다.
		// 2. 인스턴스 멤버 클래스 객체 생성 
		A.B b = a.new B(); // 인스턴스 클래스 // B객체가 생성되었습니다.
		//A.B b2 = new A.B(); // 정적 클래스 static이 아니기때문에 작동안함
			b.field1 = 3;
			b.method1();
			
		// 3. 정적 멤버 클래스 객체 생성 
			
		A.C c = new A.C(); // C객체가 생성되었습니다.
		c.field1 = 3;
		c.method1();
		
		A.C.field2 = 3; // static : 객체 생성없이 접근 가능
		A.C.method2();
		
		
		// 4. 로컬 클래스 객체 생성
		a.method();
	}
}
