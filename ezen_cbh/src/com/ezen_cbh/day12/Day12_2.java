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
		
		
		System.out.println(" 절대값 : " +  Math.abs(-5));
		System.out.println(" 절대값 : " +  Math.abs(-3.14));
		
		
		System.out.println("올림 값 :" + Math.ceil(5.3));
		System.out.println("올림 값 :" + Math.ceil(-5.3)); 
		
		System.out.println("버림 값 :" + Math.floor(5.3));
		System.out.println("버림 값 :" + Math.floor(-5.3)); 
		
		System.out.println("최댓값 :" + Math.max(5, 9));
		System.out.println("최댓값 :" + Math.max(5.3, 2.5));
		
		System.out.println("최솟값 :" + Math.min(5, 9));
		System.out.println("최솟값 :" + Math.min(5.3, 2.5));
		
		System.out.println("난수 :" + Math.random());
		
		System.out.println("가까운 정수의 실수값 : " + Math.rint(5.3));
		System.out.println("가까운 정수의 실수값 : " + Math.rint(5.7));
		
		System.out.println("반올림 : " + Math.round(5.3));
		System.out.println("반올림 : " + Math.round(5.7));
			//* 소수점 셋째자리 반올림 [ 자릿수 올리고 반올림 자릿수 내림]
		double value = 12.3456; 
		double rvalue = (Math.round(value*100) ) / 100.0;
		System.out.println(rvalue);
		
		// p.536 : 주사위 [1~6] 
			//int num = Math.random(); // 0~1
			//int num = Math.random()*6; // 0*6 ~ 1*6
			int num = (int)(Math.random()*6) + 1; // 0*6+1 ~ 1*6+1 : 1~7
			System.out.println(num);
			
		// p.537 : Random 클래스 
			Random random = new Random(); 
			int num2 = random.nextInt(6) + 1;
			System.out.println(num2);
	}
}
