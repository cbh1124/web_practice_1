package com.ezen_cbh.day4;

import java.util.Random;
import java.util.Scanner;

public class Day04_7 {
	public static void main(String[] args) {
		// ����1 : 1~45 ������ ���� 6�� �Է¹޾� �迭�� ���� 	
			// �� : �ߺ��Ұ� // 1~45 ���̸� ���� 
		// ���� 2 : ��÷��ȣ�� �������� 1~45 ������ ���� 6�� �����Ͽ� �迭�� ���� 
		// ���� 3 : �� �迭�� ������ ���ڰ� � �ִ��� üũ�Ͽ� ��� ��� 
		// ���  : ��� �������� ����ϰ� ��� ��� 
		// 6�� ��� �����ϸ� 1�� // 5�� �����ϸ� 2�� // 4�� �����ϸ� 3�� // 3�� �����ϸ� 4�� // �׿� �� 
		
			
		int[] �Է¹�ȣ = new int[6];
		int[] ��÷��ȣ = new int[6];
		int temp; 
		
		Scanner sc = new Scanner(System.in);
		
		// ����1 : 1~45 ������ ���� 6�� �Է¹޾� �迭�� ���� 	
		System.out.println("1~45 ������ ���� 6�� �Է��Ͻÿ� ");
		for (int i=0; i<6; i++) {
			int num = sc.nextInt();
			
			if(num < 1 || num > 45) {
				System.out.println("0~45���̸� �Է� �����մϴ� : �ٽ� �Է� ");
				i--; // �������� �Է��� �ƴϱ� ������ i ���� 
				continue;
			}
			// �ߺ�üũ 
			for(int j = 0; j < 6; j++) {
				if(num == �Է¹�ȣ[j] ) { // �ߺ�ã�� ����
					System.out.println("[[�˸�]] : ������ ���� �̹� ���� �մϴ� : �ٽ� �Է��ϼ��� ");
					i--; // �������� �Է��� �ƴϱ� ������ i ���� 
					break;
				}
			}
			// 1~45 ������ �� �̸鼭 �ߺ����� �ƴϸ� i��° �迭�� ����  
			�Է¹�ȣ[i] = num;
			
			// 2.��� 
			System.out.println("����ڰ� ������ ��");
		for(i = 0; i < 6; i++) {
			System.out.println(�Է¹�ȣ + " ");
		}
		System.out.println(�Է¹�ȣ + " ");
			/*
			for(int j=0; j<6; j++) {
				if (�Է¹�ȣ[i]==�Է¹�ȣ[j]) {
					System.out.println("1~45 ������ ���� �ߺ��Ǿ����ϴ�.");
					break;
				}
			}
			*/
		}
		
		// ���� 2 : ��÷��ȣ�� �������� 1~45 ������ ���� 6�� �����Ͽ� �迭�� ����
		Random random = new Random();
		
		for (int i=0; i<6; i++) {
			int rand = random.nextInt(46); // 0~45 ������ ���� ���� 
		}
		
		// ���� 3 : �� �迭�� ������ ���ڰ� � �ִ��� üũ
		for (int i = 0; i<6; i++) {
			for (int j = 0; j <7; j++) {
				if ( �Է¹�ȣ[i] == ��÷��ȣ[j] ) {
					System.out.printf("��ġ�ϴ� ���ڸ� ����մϴ� : %d \n", �Է¹�ȣ[i] );
				
				}
			}
		}
		
		
		
		
			
		
	}
}
