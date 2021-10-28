package com.ezen_cbh.day9;

public class Day09_2 {
	
	public static void main(String[] args) {
		
		// 1. 자동차 객체 생성
		Car car = new Car();
		
		// 2. 자동차 5번 전진 
		for (int i= 0; i<=5; i++) {
			int probleLocation = car.run();
				// car 회전 메소드 호출 
		
			switch(probleLocation) {
				case 1:
					System.out.println("앞왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire(15, "앞왼쪽");
					break;
				case 2: 
					System.out.println("앞오른쪽 KumhoTire로 교체");
					car.frontLeftTire = new KumhoTire(13, "앞오른쪽");
					break;
				case 3:
					System.out.println("뒤왼쪽 HankookTire로 교체");
					car.frontLeftTire = new HankookTire(14, "뒤왼쪽");
					break;
				case 4:
					System.out.println("뒤오른쪽 KumhoTire로 교체");
					car.frontLeftTire = new KumhoTire(17, "뒤오른쪽");
					break;
			}	
			System.out.println("-------------------------------------------------------");
		}
	}
}


// Parent로 부터 상속받은 Child 객체 생성시 == 부모 클래스 생성자 먼저 실행 
// 1. Parent생성자 실행[Parent()] --- 2. Parent(String nation) ---> 3. Child() -> Child(String name)