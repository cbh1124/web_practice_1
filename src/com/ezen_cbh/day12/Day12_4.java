package com.ezen_cbh.day12;

import java.util.Random;
import java.util.Scanner;

/*
 *  ����  ��ȣ ��������  0000~9999 ������ ���� 10�� ���� 
 *  1. ��� ������ �迭�� ����
 *     ���ڸ� ��ȣ�� Ȧ��/ ¦�� �迭  
 *  2. ���� ���ڸ� ��ȣ�� Ȧ�� �迭 ����
 *  3. ���� ���ڸ� ��ȣ�� ¦�� �迭 ���� 
 *  
 */
public class Day12_4 {
	public static void main(String[] args) {
		int [] ���� = new int[10000];
		String [] ����2 = new String[10000];
		String [] Ȧ������2 = new String[10000];
		String [] ¦������2 = new String[10000];
		String [] carnumbers = new String[10];
		String [] carnumbers_odd = new String[10];
		String [] carnumbers_even = new String[10];
		Random random = new Random();
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("1.���� ���� 2.���� Ȧ�� 3. ���� ¦��");
			int c = sc.nextInt();
			// ��� ������ ���� 10�� ������ �迭�� ����
			if(c == 1) {
				int intnum = random.nextInt(10000);
				// ���� - > 4�ڸ��� ���ڿ� ��ȯ 
				String strnum = String.format("%04d", intnum);
						// String.format(���� , ������) : ���ڿ� ���� �޼ҵ� 
							// ���� : %d -> ���Ĵ���� �����Ͱ� ���� 
								// %4d : 4�ڸ���
								// %04d : ����ִ� �ڸ����� 0���� ��� 
				// ������ȣ ���� [ ����ִ� �迭�� ���� ] 
				for(int i = 0 ; i<carnumbers.length; i++) {
					if(carnumbers[i] == null) {
						carnumbers[i] = strnum; 
						// Ȧ ¦ ����
							// 1. ���ڿ� -> ���� ��ȯ 2. Ȧ ¦ ���� 
						if(Integer.parseInt(strnum) % 2 == 0) {
							// ������(������ȣ) % 2 == 0�̸� ¦�� 
							for( int j =0; i<carnumbers_even.length; i++) {
								if(carnumbers_even[j] == null) {
									carnumbers_even[j] = strnum; break;
								}
							}
							
						}else {
							for( int j =0; i<carnumbers_odd.length; i++) {
								if(carnumbers_odd[j] == null) {
									carnumbers_odd[j] = strnum; break;
								}
							}
						}
						 break;
					}
				}
				/////////////// ���� ��� ���� /////////////////////////////////////
				System.out.println("********** ���� �������� ���� **********");
				for(String num : carnumbers) { // �ε��� ��ȣ�� �ʿ���� �ݺ� 
					// for(�ڷ��� �ӽ� ���� : �迭��) : �迭�� 0�� �ε������� ������ �ε��� ���� �ӽú����� ����
					if(num != null)System.out.println(num);
				}
				
				System.out.println("********** ���� �������� Ȧ������ **********");
				for(String num : carnumbers_odd) { // �ε��� ��ȣ�� �ʿ���� �ݺ� 
					// for(�ڷ��� �ӽ� ���� : �迭��) : �迭�� 0�� �ε������� ������ �ε��� ���� �ӽú����� ����
					if(num != null)System.out.println(num);
				}
				
				System.out.println("********** ���� �������� ¦������ **********");
				for(String num : carnumbers_even) { // �ε��� ��ȣ�� �ʿ���� �ݺ� 
					// for(�ڷ��� �ӽ� ���� : �迭��) : �迭�� 0�� �ε������� ������ �ε��� ���� �ӽú����� ����
					if(num != null)System.out.println(num);
				}
				/*
				for (int i = 0; i<10; i++) {
					����[i] = random.nextInt(10000);
					����2[i] = Integer.toString(����[i]);
					System.out.print(����2[i] );
					System.out.println();
				}
				*/
			}
			
		}
		
		
		
		/*
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
		*/
		
		
		
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