package com.ezen_cbh.day10;

public class Day10_6 {
	public static void main(String[] args) {
		// p.417 : 9�� Ȯ�ι��� 
			// 1. 4[���� ��� Ŭ���� ���ο��� �ٱ� Ŭ������ ���� ������ ��밡�� ]
				// ���� static [ static ��������� ���ٰ��� ] 
			// 2.
				// ���� Ŭ���� : �޼ҵ� �ȿ��� ����� Ŭ���� 
				// �ν��Ͻ� Ŭ����, ���� Ŭ������ �ٱ�Ŭ������ ��� ��밡�� 
				// 3 [ ���� Ŭ������ static ��� �Ұ� ] 
					 // �޼ҵ� �ȿ� �ֱ� ������ �Ұ� 
			// 3. �͸� ��ü : ��ȸ�� 
				// 3[ �͸� ��ü�� �����ڸ� ������ �� ����: ��ȸ�� = �ϳ��� ��ü ���������� ] [������ : � ��ü�� ���鶧 �ʱⰪ�� �����Ѵ�]
		
			// 4. 
				// static ������ ���� ������ �ν��Ͻ�
				// Tire : �ν��Ͻ� Ŭ����  		Car.Tire tire = myCar.new Tire;
				// Engine : ���� Ŭ���� 		Car.Engine engine = new Car.Engine();
			// 5. 
		Anonymous2 anonymous2 = new Anonymous2();
		anonymous2.field.run();
		anonymous2.method1();
		anonymous2.method2(new Vehicle() {
				
				@Override
				public void run() {
					System.out.println("Ʈ���� �޸��ϴ�.");
				}
		}
	  );
		
		
		// 6. ��øŬ���� �ȿ�
		
		
		
		
	}
}
