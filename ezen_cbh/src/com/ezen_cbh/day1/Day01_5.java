package com.ezen_cbh.day1;

import java.util.Scanner;

public class Day01_5 {
	public static void main(String[] args) {
		// ���� 2 : 
		
		/* :
		 [�Էº���]
		 ���̵�, ��й�ȣ, ����, �̸���, �Է¹޾� ����ϱ� 
		 
		 [��� ��]
		 >>>>>>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>>>>>>>>>>>>>>>>
		 ���̵�	��й�ȣ	����	 �̸���
		 qwe	1234	���缮 itdanja@kakao.com	
		 */
		
		/*
		// �� Ǯ�� 
		Scanner �Է°�ü = new Scanner(System.in);
		System.out.print("���̵� �Է�  "); String ���̵� = �Է°�ü.next();
		System.out.print("��й�ȣ�� �Է� "); String ��й�ȣ = �Է°�ü.next();
		System.out.print("������ �Է� "); String ���� = �Է°�ü.next();
		System.out.print("�̸����� �Է� "); String �̸��� = �Է°�ü.next();
		
		System.out.println();
		
		System.out.println(">>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println(���̵� +"\t" + ��й�ȣ + "\t"+ ���� + "\t" + �̸���);
		*/
		
		// ����� Ǯ�� 
		
		// 1. �Է°�ü ����� 
		Scanner �Է°�ü = new Scanner(System.in);
		// 2. �Է¹��� ���� ����/��ü���� 
		System.out.println("ȸ������ ���̵� : "); String ���̵� = �Է°�ü.next();
		System.out.println("ȸ������ ��й�ȣ : "); String ��й�ȣ = �Է°�ü.next();
		System.out.println("ȸ������ ���� : "); String ���� = �Է°�ü.next();
		System.out.println("ȸ������ �̸��� : "); String �̸��� = �Է°�ü.next();
		
		// 3. ��� 
		System.out.println(">>>>>> ȸ������ �Ϸ� �Ʒ� ������ Ȯ�����ּ��� >>>>>>");
		System.out.println("���̵�\t��й�ȣ\t����\t�̸���");
		System.out.println(���̵� +"\t" + ��й�ȣ + "\t"+ ���� + "\t" + �̸���);
	}
}
