package com.ezen_cbh.day11;

import java.util.Random;

/*
 *  ����  ��ȣ ��������  0000~9999 ������ ���� 10�� ���� 
 *  1. ��� ������ �迭�� ����
 *     ���ڸ� ��ȣ�� Ȧ��/ ¦�� �迭  
 *  2. ���� ���ڸ� ��ȣ�� Ȧ�� �迭 ����
 *  3. ���� ���ڸ� ��ȣ�� ¦�� �迭 ���� 
 *  
 */
public class Day11_6 {
	public static void main(String[] args) {
		int [] ���� = new int[10000];
		String [] ����2 = new String[10000];
		int [] Ȧ������ = new int[10000];
		String [] Ȧ������2 = new String[10000];
		int [] ¦������ = new int[10000];
		String [] ¦������2 = new String[10000];
		
		// ��� ������ ���� 10�� ������ �迭�� ����  
		Random random = new Random();
		for (int i = 0; i<10; i++) {
			����[i] = random.nextInt(10000);
			����2[i] = Integer.toString(����[i]);
			System.out.print(����2[i] );
			System.out.println();
		}
		
		// ���� ���ڸ� ��ȣ�� Ȧ������ �迭 ���� 
		for (int i = 0; i<����2.length; i++) {
			
			if(����2[i].charAt(3)== '1') {Ȧ������2[i] = ����2[i];}
			if(����2[i].charAt(3)== '3') {Ȧ������2[i] = ����2[i];}
			if(����2[i].charAt(3)== '5') {Ȧ������2[i] = ����2[i];}
			if(����2[i].charAt(3)== '7') {Ȧ������2[i] = ����2[i];}
			if(����2[i].charAt(3)== '9') {Ȧ������2[i] = ����2[i];}
			
			System.out.print("Ȧ�������� ����մϴ� " + Ȧ������2[i] );
			System.out.println();
			if(����2[i].charAt(3)== '0' ) {¦������2[i] = ����2[i];}
			if(����2[i].charAt(3)== '2' ) {¦������2[i] = ����2[i];}
			if(����2[i].charAt(3)== '4') {¦������2[i] = ����2[i];}
			if(����2[i].charAt(3)== '6') {¦������2[i] = ����2[i];}
			if(����2[i].charAt(3)== '8') {¦������2[i] = ����2[i];}
			System.out.print("¦�������� ����մϴ� " +¦������2[i]);
			System.out.println();
		}
		/*
		// ���� ���ڸ� ��ȣ�� ¦������ �迭 ���� 
		for (int i = 0; i<����2.length; i++) {
			
			if(����2[i].charAt(3)== '2') {
				 ¦������2[i] = ����2[i];
				 
			}
			if(����2[i].charAt(3)== '4') {
				 ¦������2[i] = ����2[i];
				 
			}
			if(����2[i].charAt(3)== '6') {
				 ¦������2[i] = ����2[i];
				 
			}
			if(����2[i].charAt(3)== '8') {
				 ¦������2[i] = ����2[i];	
			}
			if(����2[i].charAt(3)== '0') {
				 ¦������2[i] = ����2[i];	
			}
			System.out.print("¦�������� ����մϴ� " +¦������2[i]);
		}
		*/	
	}


}
