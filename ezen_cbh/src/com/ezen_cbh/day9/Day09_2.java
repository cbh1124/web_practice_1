package com.ezen_cbh.day9;

public class Day09_2 {
	
	public static void main(String[] args) {
		
		// 1. �ڵ��� ��ü ����
		Car car = new Car();
		
		// 2. �ڵ��� 5�� ���� 
		for (int i= 0; i<=5; i++) {
			int probleLocation = car.run();
				// car ȸ�� �޼ҵ� ȣ�� 
		
			switch(probleLocation) {
				case 1:
					System.out.println("�տ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire(15, "�տ���");
					break;
				case 2: 
					System.out.println("�տ����� KumhoTire�� ��ü");
					car.frontLeftTire = new KumhoTire(13, "�տ�����");
					break;
				case 3:
					System.out.println("�ڿ��� HankookTire�� ��ü");
					car.frontLeftTire = new HankookTire(14, "�ڿ���");
					break;
				case 4:
					System.out.println("�ڿ����� KumhoTire�� ��ü");
					car.frontLeftTire = new KumhoTire(17, "�ڿ�����");
					break;
			}	
			System.out.println("-------------------------------------------------------");
		}
	}
}


// Parent�� ���� ��ӹ��� Child ��ü ������ == �θ� Ŭ���� ������ ���� ���� 
// 1. Parent������ ����[Parent()] --- 2. Parent(String nation) ---> 3. Child() -> Child(String name)