package com.ezen_cbh.day9;

public class KumhoTire extends Tire{

	public KumhoTire(int maxRotation, String location) {
		super(maxRotation, location);
		// TODO Auto-generated constructor stub
	}
	// �ʵ� 
	// ������
	
	// �޼ҵ� 
	@Override
	public boolean roll() {
		++ accumulatedRotation; // ���� ȸ���� ���� 
		if(accumulatedRotation < maxRotation ) {
			System.out.println(location + "KumhoTire ���� : "  // �ִ� ȸ������ �� ũ��
					+ (maxRotation-accumulatedRotation) + "ȸ"); // ���� ���� ���
			return true; // true ������ ������ ǥ���ϴ� ��ȯ
		}else { // �ִ� ȸ������ �� ������ 
			System.out.println("*** " + location + " KumhoTire ��ũ ***");
			return false; // false ������ ������ ǥ���ϴ� ��ȯ 
		}
	}
}
