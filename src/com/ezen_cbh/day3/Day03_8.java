package com.ezen_cbh.day3;

import java.util.Scanner;

public class Day03_8 {
	
	public static void main(String[] args) {
		// Ȯ�ι��� 7 : ATM ���α׷�
		// �����ư ������������ ���� ���� ���α׷� => while(true)
		boolean run = true;
		
		int balance = 0;
		int ���ݾ� = 0;
		int ��ݾ� = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {

			System.out.println("------------------------------");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ���� |");
			System.out.println("------------------------------");
			System.out.println("����> "); int keycode = sc.nextInt();
			
			if(keycode == 1 ) {
				System.out.println("���ݾ�>");
				balance += sc.nextInt();
				���ݾ� = balance;
				System.out.printf("���� �ܰ�� : %d ��", balance);
			}
			else if(keycode == 2) {
				System.out.println("��ݾ�>");
				balance -= sc.nextInt();
				System.out.printf("���� �ܰ�� : %d ��", balance);
				��ݾ� = balance;
				
				if( ���ݾ� < ��ݾ� ) { System.out.println("[[ �˸� ]] �ܰ� �����մϴ�");}
				else { ���ݾ� -= ��ݾ�; System.out.println("[[ �˸� ]] ��� �Ϸ�");}
			}
			else if(keycode == 3) {
				System.out.println("�ܰ�>");
				System.out.printf("���� �ܰ�� : %d ��", balance);
			}
			else if(keycode == 4) { // ���࿡ 4�� �Է������� 
				run = false; // ���ຯ���� FALSE�� �־ ���ѷ���[while] ���� 
				System.out.println("[[�̿����ּż� �����մϴ�]]");
			}
			else {
				System.out.println(" [[���]] : �� �� ���� ��ȣ�Դϴ� ");
			}
		}
		
		System.out.println("���α׷� ����");
		
	}
}
