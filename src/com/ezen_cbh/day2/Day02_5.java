package com.ezen_cbh.day2;

import java.util.Scanner;

public class Day02_5 {
	public static void main(String[] args) {
		// ���� 3 
		Scanner sc = new Scanner(System.in);
		System.out.println("�߰����  "); double �߰���� = sc.nextInt();
		System.out.println("�⸻���  "); double �⸻��� = sc.nextInt();
		System.out.println("������  "); double ������ = sc.nextInt();
		
		�߰���� *= 0.3; �⸻��� *= 0.3; ������ *= 0.4;
		
		System.out.printf("�ݿ������� ���� : %.2f \n" , (�߰����+�⸻���+������) );
		
		
	}
}
