package com.ezen_cbh.day9;

public class HankookTire extends Tire {
	// �ʵ�
	// ������
	public HankookTire(int maxRotation, String location) {
		super(maxRotation, location);
		
	} 
	
	// �޼ҵ�
	// �������̵� : �޼ҵ� ������ [ �޼ҵ� ���빰 �ٲٱ� ]
	@Override
	public boolean roll() { // Ÿ�̾� ȸ�� �޼ҵ�
		++ accumulatedRotation; // ���� ȸ���� ���� 
		if(accumulatedRotation < maxRotation ) {
			System.out.println(location + "HankookTire ���� : "  // �ִ� ȸ������ �� ũ��
					+ (maxRotation-accumulatedRotation) + "ȸ"); // ���� ���� ���
			return true; // true ������ ������ ǥ���ϴ� ��ȯ
		}else { // �ִ� ȸ������ �� ������ 
			System.out.println("*** " + location + " HankookTire ��ũ ***");
			return false; // false ������ ������ ǥ���ϴ� ��ȯ 
		}
	}
}
