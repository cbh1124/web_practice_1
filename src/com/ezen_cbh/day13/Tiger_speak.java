package com.ezen_cbh.day13;

public class Tiger_speak extends Thread {
	
	
	public Tiger_speak() {
		setName("�������̸� : ȣ����");
	}
	@Override
	public void run() {
		for(int i =0; i<5; i++){
			System.out.println(getName() + "�Ҹ� ���");
			try {
			Thread.sleep(1000);
			}catch(Exception e) {}
		}
		
	}
	
	
}
