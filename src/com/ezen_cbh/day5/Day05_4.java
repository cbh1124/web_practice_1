package com.ezen_cbh.day5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Day05_4 {
	// ����1: �Խ��� ���α׷�  
			// 0. 2���� �迭 ���  // �Խù���ȣ�� �ε��� ��ȣ
			// 1. �Խ��� [ ���� , ���� , �ۼ��� , �ۼ���[Date] , ��ȸ�� ]
			// 2. �ش� �Խù� ��ȣ �����ؼ� ���������� �̵��� �ش� �Խù� ��ȸ�� 1 ���� 
		
			// 2. ���� �޴� ����
			// 
			/*
			 * 			[ �Խ��� ]
			 * 	����	����			�ۼ���	�ۼ���	��ȸ�� 
			 * 	1   �ȳ�			������	10-05	3 
			 * 	2  	�ȳ�2			������	10-05	3 
			 * 	3	�ȳ�3			��ȣ��	10-04	2
			 * 	���� : 1.�۾��� 2.�ۻ�������	
			 */
		
			// [ �۾��� ������ ]
				// 1. ���� , ���� , �ۼ��� , �ۼ���[Date] �Է¹޾� �迭�� ���� 
			// [ �ۻ������� �������� ] 
				// 1. ���������� �� �Խù� ��ȣ ���� 
				// 2. ������ �Խù��� �������� ��� 
		
			// 2. �������� ���� 
			/*
			 *	>> ���� : �ȳ�  
			 *	>> �ۼ��� : ������ 	�ۼ��� : 10-5		��ȸ�� : 3
			 * 	>> ���� : �ȳ��ϼ��� �ڹ� �Դϴ� 
			 * 	
			 * 	>> ���� : 1. �ڷΰ���	
			 * 
			 */
	public static void main(String[] args) {
		// 2���� �迭 ����Ͽ� �迭����
		String[][] ���񳻿� = new String[1000][1000];
		Scanner sc = new Scanner(System.in);
		int choice = 0; 
		
		
		while(true) {
			// ���� �޴� ����ϱ�
			System.out.println("\n\n================================Ŀ�´�Ƽ====================================");
			System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","����" , "����" , "�ۼ���","�ۼ���","��ȸ��");

			for( int i = 0 ; i<���񳻿�.length; i++ ) {
				if( ���񳻿�[i][0] != null ) {
					System.out.printf(" %2d \t %10s \t %5s \t %5s %3s\n" ,
							i , ���񳻿�[i][0] , ���񳻿�[i][2], ���񳻿�[i][3], ���񳻿�[i][4]);
				}
			}
			System.out.println("==========================================================================");
			System.out.print(" 1.�۾��� 2.�ۻ󼼺���  >>���� : "); choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("������ �Է��ϼ��� :"); String ���� = sc.next();
				System.out.println("������ �Է��ϼ��� :"); String ���� = sc.next();
				System.out.println("�ۼ��ڸ� �Է��ϼ��� :"); String �ۼ��� = sc.next();

				
				
				Date d = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat( "MM-dd" );
				String date = dateFormat.format(d);
				String count = "1";
				for(int i = 0; i < ���񳻿�.length; i++) {
					if(���񳻿�[i][0] == null ) {
						���񳻿�[i][0] = ����; ���񳻿�[i][1] = ����; ���񳻿�[i][2] = �ۼ���;
						���񳻿�[i][3] = date; ���񳻿�[i][4] = count; break;
					}
				}
			}	
			
			if (choice == 2) {
				System.out.println(" ���������� �� �Խù� ��ȣ ����"); int ch_2 = sc.nextInt();
				// ��ȸ�� ����
				int count = Integer.parseInt(���񳻿�[ch_2][4]); // ��ȸ�� int��ȯ
				���񳻿�[ch_2][4] = Integer.toString(++count); // ��ȸ�� ���� �� string ��ȯ
				
				System.out.printf("���� : %s\n", ���񳻿�[ch_2][0]);
				System.out.printf("�ۼ��� : %s\t �ۼ��� : %s\t ��ȸ�� : %s\n" , ���񳻿�[ch_2][2],���񳻿�[ch_2][3],���񳻿�[ch_2][4] );
				System.out.printf("���� : %s\n", ���񳻿�[ch_2][1]); 
				
			}
				
			
			
			
			
		} // while e
	} // m e

}// c e
