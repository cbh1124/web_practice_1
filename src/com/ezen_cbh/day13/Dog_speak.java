package com.ezen_cbh.day13;

public class Dog_speak extends Thread {
	
	
	public Dog_speak() {
		setName("스레드이름 : 개");
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
