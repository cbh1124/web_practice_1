package com.ezen_cbh.day1;

import java.util.Scanner;

public class Day01_3 {
	// main �޼ҵ�(�Լ�) 
	public static void main(String[] args) {
		
		
		// ��� Ŭ���� : System 
		System.out.println("�Է� : "); // ��� �޼ҵ� ȣ�� 
		// �Է� Ŭ���� : Scanner ��ü : Ű����κ��� �Է¹��� ���� �޸�[������ġ] ��ü ����
			// 1. Ű����κ��� �Է¹��� ���� �޸�[������ġ] ��ü ���� 
			// 2. �ٸ� ������ �Է°� �ű�� 
			// 3. ���ο� �Է°� �ޱ� 
		
		Scanner scanner = new Scanner(System.in);
			//��ü : Ŭ���� ������� ������ �޸� ���� 
				// ��ü ���� : Ŭ������ ��ü��[����] = new ������() 
					// new : �޸� �Ҵ� ������ 
					// System.out : ��� 
		 			// System.out : �Է� 
			// ��ü���� �������� [ 
				// .next() : ��ü�� ����� ���ڿ� ȣ�� [���� x]
				// .nextInt() : ��ü�� ����� ���� ȣ�� 
		 		// .nextLine() : ��ü�� ����� ���ڿ� ȣ�� [���� o]
		String string1 = scanner.next();
			//��ü�� ����� �Է°��� ������ ���� 
		System.out.println("�Էµ� ���ڿ��� : " + string1);
		
		System.out.println("�Է�2 : ");
		
		String string2 = scanner.next();
		System.out.println("�Էµ� �ι�° ���ڿ��� :" + string2);
		
	}
}
