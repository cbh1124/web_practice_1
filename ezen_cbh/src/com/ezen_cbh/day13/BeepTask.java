package com.ezen_cbh.day13;

import java.awt.Toolkit;

public class BeepTask implements Runnable {
	
		// 인터페이스 : 추상메소드가 존재 
	public void run() { // 멀티 스레드 시작 메소드
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep(); // 비프음 소리 메소드 
			
			// 무조건 예외처리 
			try {Thread.sleep(1000);} // 1초 일시정지 {Thread.sleep} 
			catch (InterruptedException e) {}
			
		}
	}

	
	
	
}
