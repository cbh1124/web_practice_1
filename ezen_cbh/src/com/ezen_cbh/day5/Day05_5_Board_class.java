package com.ezen_cbh.day5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_5_Board_class {
	public static void main(String[] args) {
		
		Day05_5[] ���񳻿� = new Day05_5[100];
		int choice = 0; 
		Scanner sc = new Scanner(System.in);
		while(true) {
			// ���� �޴� ����ϱ�
			System.out.println("\n\n================================Ŀ�´�Ƽ====================================");
			System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","����" , "����" , "�ۼ���","�ۼ���","��ȸ��");

			for( int i = 0 ; i<���񳻿�.length; i++ ) {
				if( ���񳻿�[i] != null ) {
					System.out.printf(" %2d \t %10s \t %5s \t %5s %3s\n" ,
							i , ���񳻿�[i].title , ���񳻿�[i].writer, ���񳻿�[i].date, ���񳻿�[i].count);
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
				//String count = "1";
				for(int i = 0; i < ���񳻿�.length; i++) {
					if(���񳻿�[i] == null ) {
						Day05_5 ���񳻿�2 = new Day05_5();
						���񳻿�2.title = ����; ���񳻿�2.contents = ����; ���񳻿�2.writer = �ۼ���;
						���񳻿�2.date = d; ���񳻿�2.count = 1; 
						���񳻿�[i] = ���񳻿�2;
						break;
					}
				}
			}	
			
			if (choice == 2) {
				System.out.println(" ���������� �� �Խù� ��ȣ ����"); int ch_2 = sc.nextInt();
				// ��ȸ�� ����
				//int count = Integer.parseInt(���񳻿�[ch_2][4]); // ��ȸ�� int��ȯ
				//���񳻿�[ch_2][4] = Integer.toString(++count); // ��ȸ�� ���� �� string ��ȯ
				
				System.out.printf("���� : %s\n", ���񳻿�[ch_2].title);
				System.out.printf("�ۼ��� : %s\t �ۼ��� : %s\t ��ȸ�� : %s\n" , ���񳻿�[ch_2].writer,���񳻿�[ch_2].date,���񳻿�[ch_2].count );
				System.out.printf("���� : %s\n", ���񳻿�[ch_2].contents); 
				
			}
				
			
			
			
			
		} // while e
	}
}
