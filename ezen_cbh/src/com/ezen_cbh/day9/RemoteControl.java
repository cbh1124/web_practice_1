package com.ezen_cbh.day9;

public interface RemoteControl {
	// class : Ŭ���� ����� ���Ǵ� Ű����
	// interface : �������̽� ����� ���Ǵ� Ű���� 
	
	// 1. ����ʵ� [ �ݵ�� �ʱⰪ ����]
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	// 2. �߻�޼ҵ� [ �޼ҵ� ���� / �����ڵ�� ���� X] : �߰�ȣ ����
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	// 3. ����Ʈ�޼ҵ� [ �޼ҵ� ����� �����ڵ� ���� o]
	default void setMute(boolean mute) {
		if(mute) {System.out.println("���� ó�� �մϴ�.");}
		else {System.out.println("���� �����մϴ�.");}
	}
	// 4. �����޼ҵ� [��ü ������� ���Ǵ� �޼ҵ� ]
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�. ");
	}
	
	
	
}