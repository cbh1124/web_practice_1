package com.ezen_cbh.day12;

import java.util.Random;

public class Day12_2 {
	public static void main(String[] args) {
		
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		Boolean value3 = Boolean.parseBoolean("true");
		
		
		System.out.println("1 : " + value1);
		System.out.println("2 : " + value2);
		System.out.println("3 : " + value3);
		
		
		System.out.println(" ���밪 : " +  Math.abs(-5));
		System.out.println(" ���밪 : " +  Math.abs(-3.14));
		
		
		System.out.println("�ø� �� :" + Math.ceil(5.3));
		System.out.println("�ø� �� :" + Math.ceil(-5.3)); 
		
		System.out.println("���� �� :" + Math.floor(5.3));
		System.out.println("���� �� :" + Math.floor(-5.3)); 
		
		System.out.println("�ִ� :" + Math.max(5, 9));
		System.out.println("�ִ� :" + Math.max(5.3, 2.5));
		
		System.out.println("�ּڰ� :" + Math.min(5, 9));
		System.out.println("�ּڰ� :" + Math.min(5.3, 2.5));
		
		System.out.println("���� :" + Math.random());
		
		System.out.println("����� ������ �Ǽ��� : " + Math.rint(5.3));
		System.out.println("����� ������ �Ǽ��� : " + Math.rint(5.7));
		
		System.out.println("�ݿø� : " + Math.round(5.3));
		System.out.println("�ݿø� : " + Math.round(5.7));
			//* �Ҽ��� ��°�ڸ� �ݿø� [ �ڸ��� �ø��� �ݿø� �ڸ��� ����]
		double value = 12.3456; 
		double rvalue = (Math.round(value*100) ) / 100.0;
		System.out.println(rvalue);
		
		// p.536 : �ֻ��� [1~6] 
			//int num = Math.random(); // 0~1
			//int num = Math.random()*6; // 0*6 ~ 1*6
			int num = (int)(Math.random()*6) + 1; // 0*6+1 ~ 1*6+1 : 1~7
			System.out.println(num);
			
		// p.537 : Random Ŭ���� 
			Random random = new Random(); 
			int num2 = random.nextInt(6) + 1;
			System.out.println(num2);
	}
}
