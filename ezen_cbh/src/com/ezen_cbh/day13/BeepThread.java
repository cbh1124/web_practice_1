package com.ezen_cbh.day13;

import java.awt.Toolkit;

public class BeepThread extends Thread {
	// extends : 상속
	
	public BeepThread() {
		setName("스레드A");
	}
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep(); // 비프음 소리 메소드 
			
			// 무조건 예외처리 
			try {Thread.sleep(1000);} // 1초 일시정지 {Thread.sleep} 
			catch (InterruptedException e) {}
			
		}
	}
}
