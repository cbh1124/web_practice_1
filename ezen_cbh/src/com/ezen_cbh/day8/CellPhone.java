package com.ezen_cbh.day8;

public class CellPhone {
	// �ʵ� 
	String model;
	String color;
	
	// ������
	
	// �޼ҵ� [ ����������(����=>default) ��ȯŸ�� �޼ҵ�( �μ�1, �μ�2, �μ�3 ���){ �����ڵ�}]
	
	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	}
	
	
	void powerOn() {
		System.out.println("������ �մϴ�");
	}
	void powerOff() {
		System.out.println("������ ���ϴ�.");
	}
	void bell() {
		System.out.println("���� �︳�ϴ�.");
	}
	void sendVoice(String message) {// �ܺηκ��� ������ ���� [ �μ� ]
						
		System.out.println("�ڱ� : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("���� : " + message);
	}
	void hangUp() {System.out.println("��ȭ�� �����ϴ�.");}



}
