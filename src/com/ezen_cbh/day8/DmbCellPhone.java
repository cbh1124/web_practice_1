package com.ezen_cbh.day8;

public class DmbCellPhone extends CellPhone{
					//extends: �����ϴ� // ��� 1��
	// �ڵ��� �⺻��� => CellPhone ��Ȥ 
	// 1. �ʵ�
	int channel;
	
	// 2. ������
	public DmbCellPhone(String model, String color, int channel) {
			// this : ���� Ŭ������ ���
		//this.model = model; // �θ�Ŭ������ ������
		//this.color = color; // �θ�Ŭ������ ������
		//this.channel = channel; // ����Ŭ���� ��� ���
		//  �θ� Ŭ������ ������ ������ => super()  Ű���带 �̿��� �θ�Ŭ���� ������ ȣ��
		super(model, color); // super() : �θ� Ŭ������ ������ ȣ��
		this.channel = channel;
	}
	
	// 3. �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä��" + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		// this.channel : �Ķ��� => ���� Ŭ������ ���
		// channel : ������ => �޼ҵ忡 �ܺηκ��� ���� ����
		System.out.println("ä�� : " + channel + "������ �ٲߴϴ�");
	}
	
	void turnOffDmb() {System.out.println("DMB ��� ������ ����ϴ�.");}


	// �������̵� [�θ�Ŭ������ �޼ҵ� ������ ] : �ڵ��ϼ� 
	 //������ => �ڵ庯�� // @ :  ������̼� 
	@Override
	void powerOn() {
		// super.powerOn();
		System.out.println("���� �޼ҵ� ������ : DMB�� �մϴ�");
	}
	
}	