package com.ezen_cbh.day4;

import java.util.Random;
import java.util.Scanner;

public class Day04_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	// ���ѷ��� = > while �̿��� ���� �ݺ� 
		// Ű���带 �̿��� ���� ����
		// ���ѷ��� ���� ��� :  1. ������ false 2. break
		while(true) { 
			//System.out.println("���ѷ���"); 
			//int ���� = sc.nextInt();
			//if( ���� == 4 ) break;
			
				
		// ���� [����] ����
			// 1. ���� Ŭ����  // 2. Math Ŭ���� 
				// Random ��ü 
					// .nextInt() : int�� ǥ���Լ� ������ŭ ���� ����
					// .nextInt(����) : 0~���������� ����
					// .nextInt( 10 ) + �ʱⰪ : �ʱⰪ ~ ���ڱ����� ���� 
			Random rd = new Random();
			System.out.println( rd.nextInt(10) + 1 );
			//System.out.println( rd.nextInt() );
			//System.out.println( rd.nextDouble() );
			
		
		//

		}
	}
}
