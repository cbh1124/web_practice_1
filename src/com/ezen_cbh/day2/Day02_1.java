package com.ezen_cbh.day2;

import java.util.Scanner;

public class Day02_1 { // 현재 클래스가 속한 패키지명 
	// public :  접근 제한자 
				// class :  클래스 선언시 사용되는 키워드 [미리 만들어진 단어]
					// 클래스명[임의] : 첫글자를 대문자 (권장)
	// 자동완성 단축키 : ctrl + 스페이스바 
	// Ex:  syso // main
	public static void main(String[] args) {
		// main 메소드에는 main 스레드 존재 [ 스레드 : 코드를 읽어주는 역할]
			// main 메소드 괄호 밖에 있는 코드는 실행 불가 
	
		System.out.println("java");
		// 1. 입력 객체 선언 [ 키보드로부터 입력받은 값을 저장하는 객체 ]
		Scanner 입력객체 = new Scanner(System.in); // ?????? 깃허브 해놓으면 강사님이 체크
		// 2. next() 메소드를 이용한 객체내 입력값 빼오기
		String 문자열 = 입력객체.next();
		// 3. 출력 [ + :  연결연산자 (문자 + 변수 연결 )
		System.out.println("입력 값은 : " + 문자열 );
			// " " 문자처리 : 키워드 [미리 만들어진 단어] , 객체, 클래스명, 변수, 숫자 등 제외
		
	}
}
