package com.ezen_cbh.day1;

import java.util.Scanner;

public class Day01_6 {
	public static void main(String[] args) {
		// ����3 : �湮�� �Է¹޾� ����ϱ�
		
		/* [�Է¹ޱ�] : �ۼ���, ����, ��¥
		 * [ ���  ]
		 *  -------------�湮��-----------------
		 *  | ���� | �ۼ��� | ����     | ��¥   | 
		 *  |  1  | ��ȣ�� | �ȳ��ϼ��� | 09-28|
		 * ------------------------------------
		 *
		 */
		
		/*
		// 1. �Է°�ü ����� 
				Scanner �Է°�ü = new Scanner(System.in);
				// 2. �Է¹��� ���� ����/��ü���� 
				System.out.println("�ۼ��� : "); String �ۼ��� = �Է°�ü.next();
				System.out.println("���� : "); String ���� = �Է°�ü.next();
				System.out.println("��¥ : "); String ��¥ = �Է°�ü.next();
				
				// 3. ��� 
				System.out.println("-------------�湮��-----------------");
				System.out.println("| 1 |\t �ۼ��� |\t����|\t ��¥ |");
				System.out.println("|"+"\t"+ �ۼ��� +" |"+"\t"+����+"|"+��¥+" |");
	    */
				// 1. �Է°�ü ���� 
				Scanner scanner = new Scanner(System.in);
				System.out.print(" �ۼ��� : "); String writer = scanner.next();
				System.out.print(" ���� : "); String contents = scanner.nextLine(); // ���� ���� o
					// scanner.nextLine(); next �������� nextLine ���� ���� �߻�
						// �ذ��� : next �� nextLine ���̿� nextLine() �߰� 
				
				System.out.print(" ��¥ : "); String date = scanner.next();
				// 2. ��� 
				System.out.println("-------------�湮��-------------");
				System.out.println("| ���� | �ۼ��� | ���� \t | ��¥ |");
				System.out.println("|  1  | "+writer+" | " + contents + "\t | " + date + " |");
				System.out.println("------------------------------");
				
	}
}
