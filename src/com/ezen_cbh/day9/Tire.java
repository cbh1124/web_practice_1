package com.ezen_cbh.day9;

public class Tire {
	
	// �ʵ� 
	public int maxRotation; // �ִ� ȸ���� [ Ÿ�̾� ���� ]
	public int accumulatedRotation; // ���� ȸ���� 
	public String location;
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	// �޼ҵ� 
	public boolean roll() { // Ÿ�̾� ȸ�� �޼ҵ�
		++ accumulatedRotation; // ���� ȸ���� ���� 
		if(accumulatedRotation < maxRotation ) {
			System.out.println(location + "Tire ���� : "  // �ִ� ȸ������ �� ũ��
					+ (maxRotation-accumulatedRotation) + "ȸ"); // ���� ���� ���
			return true; // true ������ ������ ǥ���ϴ� ��ȯ
		}else { // �ִ� ȸ������ �� ������ 
			System.out.println("*** " + location + " Tire ��ũ ***");
			return false; // false ������ ������ ǥ���ϴ� ��ȯ 
		}
	}
	
}