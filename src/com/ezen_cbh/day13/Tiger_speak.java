package com.ezen_cbh.day13;

public class Tiger_speak extends Thread {
	
	
	public Tiger_speak() {
		setName("스레드이름 : 호랑이");
	}
	@Override
	public void run() {
		for(int i =0; i<5; i++){
			System.out.println(getName() + "소리 출력");
			try {
			Thread.sleep(1000);
			}catch(Exception e) {}
		}
		
	}
	
	
}
