package com.ezen_cbh.day3;

import java.util.Scanner;

public class Day03_5 { // c  s
	
	
	public static void main(String[] args) { // m  s
		
		Scanner sc= new Scanner(System.in);
		// �ݺ����� �� ��� ���
		// ����1) �Է¹��� ������ŭ �� ��� [ i = 1���� �Է¹����������� 1�� ����]
		System.out.print("�� ���� : "); int s1 = sc.nextInt();
		for( int i = 1; i<=s1 ; i++ ) { System.out.println("* ");  }
	 System.out.println("\n---------------------------------------");
	  	
	 	// ����2) �Է¹��� ������ŭ �� ��� // 5������(5���) �ٹٲ� 
	 	System.out.println("�� ���� : "); int s2 = sc.nextInt();
	 	for(int i = 1 ; i<=s2 ; i++) {
	 		System.out.print("* ");
	 		if(i%s2==0) System.out.println();
	 	}
	 	// ����3) �Է¹��� �� ��ŭ ��� 
	 	System.out.println("�� ���� : "); int s3 = sc.nextInt();
	 	for(int i = 1; i<=s3 ; i++) {
	 		System.out.println(" ");
	 		for(int j = 1; j<=i; j++) {
	 			System.out.print("*");
	 		}
	 	}
	 	// ����3 ����� Ǯ�� ) 
	 	
	 	// ����4)  �Է¹��� �� ��ŭ ��� 
	 	System.out.println("����4 �� �� : "); int line4=sc.nextInt();
	 	
	 	for(int i = 1; i<=line4; i++) {
	 		
	 		// �����
	 		for(int s4 = 1; s4 <=line4-i+1; s4++) { System.out.print("*");}
	 		// �ٹٲ�
	 		System.out.println();
	 	}
	 	
	 	
	 // ����5)
	 	System.out.print("����5) �� �� : "); int line5 = sc.nextInt();
	 	for( int i = 1 ; i<=line5 ; i++ ) {
	 		// ������� 
	 		for( int b = 1 ; b<=line5-i ; b++ ) { System.out.print(" "); }
	 		// ����� 
	 		for( int s = 1 ; s<=i ; s++ ) { System.out.print("*");}
	 		// �ٹٲ�
	 		System.out.println();
	 	}
	 	
	  // ����6)
		System.out.println("�� ���� : "); int line6 = sc.nextInt();
		
		for( int i = 1 ; i<=line6 ; i++ ) {
			// �������
	 		for( int b = 1 ; b<=i-1 ; b++ ) { System.out.print(" "); }
	 		// ����� 
	 		for( int s = 1 ; s<=line6-i+1 ; s++ ) { System.out.print("*");}
	 		// �ٹٲ�
	 		System.out.println();
		}
	 // ���� 7) 
		System.out.println("�� ���� : "); int line7 = sc.nextInt();
		
		for( int i = 1 ; i<=line7 ; i++ ) {
			// ���� ���
			for( int b = 1 ; b<=line7-i ; b++ ) { System.out.print(" "); }
	 		// �� ���
			for( int s = 1; s<=(i*2)-1; s++) { System.out.print("*"); }
			// �ٹٲ�
	 		System.out.println();
	 		
	 	}
		
	// ���� 8)
		System.out.println("�� ���� : "); int line8 = sc.nextInt();
		
		for( int i = 1 ; i<=line8 ; i++ ) {
			// ���� ���
			for( int b = 1 ; b<=line8-i ; b++ ) { System.out.print(" "); }
	 		// �� ���
			for( int s = 1; s<=(i*2)-1; s++) { System.out.printf("%d", i); }
			// �ٹٲ�
	 		System.out.println();
		}
		
	// ���� 9)
		System.out.println("�� ���� : "); int line9 = sc.nextInt();
		
		for( int i = 1 ; i<=line9 ; i++ ) {
			// ���� ���
			for( int b = 1 ; b<=i-1 ; b++ ) { System.out.print(" "); }
			// �� ���
			for( int s = 1; s<=line9*2-(i*2-1); s++) { System.out.print("*"); }
			// �ٹٲ�
	 		System.out.println();
		}
	// ���� 10)
		System.out.println("�� ���� : "); int line10 = sc.nextInt();
		
	// ���� 11)
		System.out.println("�� ���� : "); int line11 = sc.nextInt();
	} // m  e
}  // c  e
