package com.ezen_cbh.day6;

public class Korean {

	// 1.필드 
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 2. 생성자
	public Korean() {
		// TODO Auto-generated constructor stub
	}
	public Korean(String name , String ssn) {
			// 객체 선언시 생성자로부터 n,s값을 입력받기
		this.name = name; // 생성자로부터 들어온 n을 현재 필드에 저장을 시킴
		this.ssn = ssn;
	}
	// 3. 메소드
}
