package ����;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_practice {
	
	/*
	���� ���� : �޷� ���� ��� 
	[����] : ���۳�¥�� ����¥�� �Է¹޾� �޷� ����ϱ� 
		// 1. ���� ��¥���� ����¥������ ��� �޷� ��� 
		// 2. 2021 08 ~ 2022 10
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" �Է� ���� : "); int year = sc.nextInt();
		System.out.println(" �Է� �� : "); int month = sc.nextInt();
		
		calendar(year, month);
	}
	
	
	// �޼ҵ� ���� 
	public static void calendar(int year, int month) {
		
		// Ķ���� ����� �ҷ��ͼ� Ŭ���� ��ü ���� �ý����� ���� ��¥�� �ð������� ��� ���� getinstance() �޼��� ��� 
		Calendar cal = Calendar.getInstance();
		
		// set()���� ����ڰ� �ҷ��� ��¥ ��������  // ������ ����,��,�� 
		cal.set(year, month-1 , 1); // �ش� 
		
		// �ش� ���� 1�� ����ã�� 
		int day_search = cal.get(cal.DAY_OF_WEEK); // �ش� ���� 1�� ������ get���� �����ɴϴ�. 
		// �ش� ���� ������ ���� ã���ϴ� . // �ֱ׷���? �ش� �� 1�Ϻ��� ������ ������ ����� ����ߵ� 
		int day_last = cal.getActualMaximum(cal.DAY_OF_MONTH); // �ش� ���� ���������� ���ϴ� �Լ� 
		
		// �޷��� ��� 
		System.out.println("**************" + year +"��"+month+"��*************" );
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		
		// ������ ������ �޷� ��� 
		for(int i =1; i<day_last; i++) {
			System.out.print(i + "\t");
			if( day_search % 7 == 0 ) System.out.println();
			day_search++; // ���� ���� 
		}
		for( int i = 1 ; i<day_search ; i++) {
			System.out.print(" \t");
			
		}
		
	}
}
