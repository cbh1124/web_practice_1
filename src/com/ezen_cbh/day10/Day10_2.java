package com.ezen_cbh.day10;

public class Day10_2 {
	public static void main(String[] args) {
		
		
		//p.332 추상클래스 예제
		//Phone phone = new Phone("유재석");
			// 1. 추상 클래스만으로 객체 생성 불가
		
		SmartPhone smartphone = new SmartPhone("유재석");
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}
}
