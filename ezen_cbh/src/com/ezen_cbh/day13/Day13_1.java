package com.ezen_cbh.day13;

import java.awt.Toolkit; // Toolkit 클래스 가져오기 [ UI 관련 메소드 제공 ]

public class Day13_1 {
	// 1. cpu : 메모리 없음 [ 레지스터 : 소량의 명령어기억 ]
	// 2. 메모리 [주기억장치]
	
	public static void main(String[] args) {
		
		// 1. main : 메인 스레드 포함 
			// 1. 첫코드부터 순차적으로 실행 
			// 2.  return[생략가능] 만나면 실행 종료
		// 2. 멀티스레드 [ 병렬 작업 ]
			// * 운영체제가 스레드에게 자원
			// 1. 여러개 스레드 중 하나라도 남아있으면 프로세스 종료되지않음 
			// 2. 멀티스레드 구현 방법 
				// 1. Runnable : 스레드 인터페이스 
					// implements Runnable = new 구현 클래스명();
					// Thread thread = new Thread(runnable);
					// Thread.start();
				// 2. Thread : 스레드 클래스
					// 구현클래스명 extends Thread 
						// Thread thread = new 구현클래스명();
						// Thread.start();
				// 3. 익명 구현 객체 [일회성]
			// * 인터페이스 : 객체X , 추상메소드에 대한 구현 필수 
		// p.581
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep(); // 비프음 소리 메소드 
			
			// 무조건 예외처리 
			try {Thread.sleep(1000);}
			catch (InterruptedException e) {}
			
		}
		
		// p. 582 { 멀티 스레드 : 소리와 문자를 동시에 출력 } 
		// 1. 인터페이스에 클래스 연결 
		
		// 1. 인터페이스 생성 
		Runnable runnable = new BeepTask();
		// 2. 스레드 클래스에 인터페이스 연결 
		Thread thread = new Thread(runnable);
		// 3. 스레드 시작 
		thread.start();
		
		// 문자 
		for(int i = 0; i<5; i++) {
			
			System.out.println("띵");
			// 무조건 예외처리
			try {Thread.sleep(1000);} // 1초 일시정지 [Thread.sleep(밀리초[1000/1초]) ]
			catch(InterruptedException e) {}
		}
		
		// p.583 [멀티스레드 : 익명객체 runnable ] 
			// 익명 객체 :  인터페이스명 변수명 = new 클래스명( new 인터페이스명(){ 구현 } );
			// 익명 객체란 ?  일회성 
		Runnable runnable2 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				// 소리
				// 문자 
				for(int i = 0; i<5; i++) {
					
					System.out.println("띵");
					// 무조건 예외처리
					try {Thread.sleep(1000);} // 1초 일시정지 [Thread.sleep(밀리초[1000/1초]) ]
					catch(InterruptedException e) {}
				}
				
			}
		});
		
		
		// p.584 [멀티스레드 : 익명객체 runnable ] 
		Thread thread3 = new BeepThread();
		thread3.start(); // run  메소드 호출 
		
		System.out.println("스레드 명 : " + thread3.getName());
		// 문자
		for(int i = 0; i<5; i++) {
			
			System.out.println("띵");
			// 무조건 예외처리
			try {Thread.sleep(1000);} // 1초 일시정지 [Thread.sleep(밀리초[1000/1초]) ]
			catch(InterruptedException e) {}
		}
	}
}
