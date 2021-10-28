package com.ezen_cbh.day13;

import java.awt.Toolkit; // Toolkit Ŭ���� �������� [ UI ���� �޼ҵ� ���� ]

public class Day13_1 {
	// 1. cpu : �޸� ���� [ �������� : �ҷ��� ��ɾ��� ]
	// 2. �޸� [�ֱ����ġ]
	
	public static void main(String[] args) {
		
		// 1. main : ���� ������ ���� 
			// 1. ù�ڵ���� ���������� ���� 
			// 2.  return[��������] ������ ���� ����
		// 2. ��Ƽ������ [ ���� �۾� ]
			// * �ü���� �����忡�� �ڿ�
			// 1. ������ ������ �� �ϳ��� ���������� ���μ��� ����������� 
			// 2. ��Ƽ������ ���� ��� 
				// 1. Runnable : ������ �������̽� 
					// implements Runnable = new ���� Ŭ������();
					// Thread thread = new Thread(runnable);
					// Thread.start();
				// 2. Thread : ������ Ŭ����
					// ����Ŭ������ extends Thread 
						// Thread thread = new ����Ŭ������();
						// Thread.start();
				// 3. �͸� ���� ��ü [��ȸ��]
			// * �������̽� : ��üX , �߻�޼ҵ忡 ���� ���� �ʼ� 
		// p.581
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i<5; i++) {
			toolkit.beep(); // ������ �Ҹ� �޼ҵ� 
			
			// ������ ����ó�� 
			try {Thread.sleep(1000);}
			catch (InterruptedException e) {}
			
		}
		
		// p. 582 { ��Ƽ ������ : �Ҹ��� ���ڸ� ���ÿ� ��� } 
		// 1. �������̽��� Ŭ���� ���� 
		
		// 1. �������̽� ���� 
		Runnable runnable = new BeepTask();
		// 2. ������ Ŭ������ �������̽� ���� 
		Thread thread = new Thread(runnable);
		// 3. ������ ���� 
		thread.start();
		
		// ���� 
		for(int i = 0; i<5; i++) {
			
			System.out.println("��");
			// ������ ����ó��
			try {Thread.sleep(1000);} // 1�� �Ͻ����� [Thread.sleep(�и���[1000/1��]) ]
			catch(InterruptedException e) {}
		}
		
		// p.583 [��Ƽ������ : �͸�ü runnable ] 
			// �͸� ��ü :  �������̽��� ������ = new Ŭ������( new �������̽���(){ ���� } );
			// �͸� ��ü�� ?  ��ȸ�� 
		Runnable runnable2 = new Thread( new Runnable() {
			
			@Override
			public void run() {
				// �Ҹ�
				// ���� 
				for(int i = 0; i<5; i++) {
					
					System.out.println("��");
					// ������ ����ó��
					try {Thread.sleep(1000);} // 1�� �Ͻ����� [Thread.sleep(�и���[1000/1��]) ]
					catch(InterruptedException e) {}
				}
				
			}
		});
		
		
		// p.584 [��Ƽ������ : �͸�ü runnable ] 
		Thread thread3 = new BeepThread();
		thread3.start(); // run  �޼ҵ� ȣ�� 
		
		System.out.println("������ �� : " + thread3.getName());
		// ����
		for(int i = 0; i<5; i++) {
			
			System.out.println("��");
			// ������ ����ó��
			try {Thread.sleep(1000);} // 1�� �Ͻ����� [Thread.sleep(�и���[1000/1��]) ]
			catch(InterruptedException e) {}
		}
	}
}
