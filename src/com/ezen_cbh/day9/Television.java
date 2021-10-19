package com.ezen_cbh.day9;

public class Television implements RemoteControl {
	// extends : ���赵 ����
	// implements :  (�߻�޼ҵ� ����) �����ϴ�
	
	
	// 1. �ʵ� 
	private int volume;
	// 2. ������
	// 3. �޼ҵ� 
	
		// ����� �������̽��� �߻�޼ҵ� �����ϱ� 
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	// ctrl + �����̽��� : ������ �߻�޼ҵ� ���
	
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}
	// setVolume() �߻�޼ҵ��� ��ü �޼ҵ� 
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			// ���� ������ �ִ�������� Ŀ����
			this.volume = RemoteControl.MAX_VOLUME;
			// �ִ� �������� �����ϱ� [��������� �ִ�������� Ŀ������ ����]
		}else if (volume < RemoteControl.MIN_VOLUME) {
			// ���� ������ �ּҼ���[0]���� ������
			this.volume = RemoteControl.MIN_VOLUME;
			// �ּ� �������� �����ϱ� [��������� ������ �ɼ�����]	
		}else {
			this.volume = volume;
		}
		System.out.println("���� Tv ���� : " + this.volume);
		
	}
}