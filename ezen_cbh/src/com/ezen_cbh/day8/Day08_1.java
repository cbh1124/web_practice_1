package com.ezen_cbh.day8;

public class Day08_1 {
		// ���� Ŭ���� = >  main�޼ҵ�[������] 
		
	
		// ��� : 
			// extends : �����ϴ�[ ���赵 ���� ]
				// public class �ڽ�Ŭ������ extends �θ�Ŭ������{}
	
			// super : �θ�Ŭ������ ��� ����
				// 1. super() : �θ�Ŭ������ ������ ȣ��
				// 2. super.�ʵ��/�޼ҵ�� : �θ� Ŭ������ �ʵ�, �޼ҵ� ȣ��
	
			// 3. @Override : �θ�Ŭ������ �޼ҵ� ������ 
	
			// 4. final
				//final class CellPhone() : �θ�Ŭ������ ��� �Ұ�
				//final void powerOn(): �������̵� �Ұ� 
	
	public static void main(String[] args) {
		
		//���� Ŭ������ �̿��� ��ü ���� 
		DmbCellPhone dmbCellPhone = new DmbCellPhone("�ڹ���", "����", 10);
		System.out.println("�� : " + dmbCellPhone.model ); // private ������ �ƴҰ�� ��� ���� ���� 
		System.out.println("���� :" + dmbCellPhone.color ); // �θ���
		
		System.out.println("ä�� : " + dmbCellPhone.channel); // ���θ��
		
		// �θ� �޼ҵ�
		dmbCellPhone.powerOn(); // �θ� �޼ҵ� ����
		dmbCellPhone.powerOff(); // �θ� �޼ҵ� ����
		dmbCellPhone.sendVoice("�ȳ��ϼ���"); // �θ� �޼ҵ� 
		dmbCellPhone.receiveVoice("�ȳ��ϼ��� ���� ȫ�浿 �Դϴ�");
		dmbCellPhone.sendVoice("�ݰ����ϴ�");
		dmbCellPhone.hangUp();
		
		// ���� �޼ҵ�
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
	}
	
}
