package com.ezen_cbh.day6;

public class Car5 {

	// 1. �ʵ� [ ������ ���� ] 
	String model;
	int speed;
	
	// 2. ������ [ ������ �ʱⰪ ]
	public Car5(String model) {
		// �ܺηκ��� ���� ������  [�μ�]�� ���� ������ ���� 
			// ���ο� ����
		
		// model = model; // [ ���κ��� == �μ� ] : �浹!!!
		this.model = model; // [ this.���κ��� = �μ�����
			// �μ��� ���κ����� �̸��� �����ϰ� ����
	}
   	// 3. �޼ҵ� [ ������ �ൿ ] 
	void setSpeed( int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i = 10; i<=50; i+=10) {
			this.setSpeed(i); // ���� Ŭ���������� �޼ҵ� �ٷ� ȣ�� ���� 
			System.out.println(this.model +
					"�� �޸��ϴ�.(�ü� : "+this.speed+"km/h");
		}
	}
}