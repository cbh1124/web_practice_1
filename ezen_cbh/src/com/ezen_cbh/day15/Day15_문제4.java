package com.ezen_cbh.day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_����4 {

		// ���� 4 :���ñ����� �̿��� ���ڿ� ���� ��� 
			// [����1] ���ñ���
			// [����2] �Է¹��� ���ڿ��� ������� ���ÿ� ���� 
			// [ ����3 ] ���ڿ� �ݴ�� ��� 
			// [��� ����]
				// �Է� : ABC
				// ��� : CBA 
	
	//  String ----->  S, t, r, i, n, g (�̰Ÿ� �������� ����) -->pop �ϸ� ���� 
	
	public static void main(String[] args) {
		Stack<Character> ���ڿ� = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		
			
		System.out.println("���ڿ��� �Է��ϼ���"); String value = sc.next();
			
		for(int i = 0; i<value.length(); i++) {
			���ڿ�.push(value.charAt(i));
		}
		System.out.println(���ڿ�);
		
			
		for(int i =0; i<value.length(); i++) {
			System.out.println(���ڿ�.pop());
		}
		
		
		
	}
}
