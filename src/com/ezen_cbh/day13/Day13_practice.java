package com.ezen_cbh.day13;

public class Day13_practice {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		
		
		Cat_speak cat_speak = new Cat_speak();
		System.out.println("작업 스레드 이름 : " + cat_speak.getName());
		cat_speak.start();
		
		Dog_speak dog_speak = new Dog_speak();
		System.out.println("작업 스레드 이름 : " + dog_speak.getName());
		dog_speak.start();
		
		Tiger_speak tiger_speak = new Tiger_speak();
		System.out.println("작업 스레드 이름 : " + tiger_speak.getName());
		tiger_speak.start();
	}
}
