package com.ezen_cbh.day13;

public class Dog_speak extends Thread {
	
	
	public Dog_speak() {
		setName("�������̸� : ��");
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
