package com.ezen_cbh.day6;

public class Day06_3 {
	public static void main(String[] args) {
		
		// ��ü ����� [ ������ ���� ������ ������� ������� ]
		Calculator calculator = new Calculator();
		// ��ü�� ���� �޼ҵ� ȣ�� [ �μ��� ���� �ؼ� ���ϰ��� ������ ���� ] 
		calculator.powerOn();
		
		int result1 = calculator.plus(5 , 6);
		System.out.println("�Լ� ����� : " + result1 );
		
		byte x = 10; byte y = 4;
		double result2 = calculator.divide(x, y);
		System.out.println("�Լ� ����� : " + result2 );
		
		calculator.poweroff();
		
	//.p.223 
		
		Car4 car4 = new Car4();
			// 1. ��ü�� �ʵ忡 ���� �ʱ�ȭ�� �� �ִ� ���
				// 1. ��ü��.�ʵ�� = 10
				// 2. new Ŭ������ ( 10 )
				// 3. ��ü��.set�޼ҵ�( 10 )
		
		car4.setGas(5); // setGas �޼ҵ� ȣ�� [�μ��� 5�ֱ�]
		
		boolean gasState  = car4.isLeftGas(); // ���� Ȯ�� �޼ҵ�
		
		if(gasState) {
			System.out.println("��� ");
			car4.run();
		}
		
		if(car4.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �ֽ��ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}
	}
}