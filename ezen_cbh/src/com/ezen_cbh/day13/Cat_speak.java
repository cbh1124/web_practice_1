package com.ezen_cbh.day13;

public class Cat_speak extends Thread {
	
	
	public Cat_speak() {
		setName("스레드이름 : 고양이");
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
