package com.ezen_cbh.day4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Day04_5 {
	// �迭�� �̿��� �������� ���α׷� 
				// 1. �л����� �Է¹޾� �л�����ŭ �迭�� ���̸� �Ҵ� 
				// 2. �޴� [1.�л��� 2.�����Է� 3.�м�[���,���] 4.���� ]
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer [] �л�������� = null; //�迭������ ����ֱ� 
		
		while(true) {
			System.out.println("1.�л��� 2.�����Է� 3.�м�[���,���] 4.���� ");
			System.out.println("���� : "); int ch = sc.nextInt();
			if (ch == 1) {
				System.out.print("�л� �� �Է� [�迭����] : "); int size = sc.nextInt();
				// �迭�� �޸� �Ҵ�
				�л�������� = new Integer[size]; // �Է¹��� ����ŭ �޸� �Ҵ�
				System.out.println(size + "��ŭ �л���� ����");
				
			}
			if ( ch == 2 ) {
				// �л� ����ŭ ���� �Է� �ޱ� [�迭��.length : �迭�Ǳ���]
				for(int i = 0; i<�л��������.length; i++) {
					System.out.println( i + "��° �л��� ���� �Է� :  ");
					�л��������[i] = sc.nextInt();
				}
			}
			if (ch == 3) {
				// 1. �������� 
//				for(int i = 0; i<�л��������.length; i++ ) {
//					for( int j = i + 1; j<�л��������.length; j++) {
//						if(�л��������[i] < �л��������[j]) {
//							// ���� [ ��ü ] 
//							int temp = �л��������[j];
//							�л��������[j] = �л��������[i];
//							�л��������[i] = temp;
//						}
//					}	
//				}
				
				//2. Ŭ���� �̿��� ���� [ �迭 ���� Ŭ�� = Arrays]
				//Arrays.sort(�л�������� ); // �������� / �������� �ݴ�� �������� 
				Arrays.sort(�л��������, Collections.reverseOrder());
						// Collections.reverseOrder() : ���� ������ [�⺻ �ڷ����� �Ұ�/ ��ü�� ���� ]
				//2. ��� 
				int sum = 0 ;
				for(int i = 0; i<�л��������.length; i++ ) {
					System.out.println( (i+1) + "�� ���� : " + �л��������[i] );
					sum += �л��������[i];
				}
				System.out.println("��� �л����� ���� ��� :" + sum / �л��������.length );
			}
			if (ch == 4) break;
			
		}
		
		
		
	}
}