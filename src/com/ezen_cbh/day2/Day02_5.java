package com.ezen_cbh.day2;

import java.util.Scanner;

public class Day02_5 {
	public static void main(String[] args) {
		// 문제 3 
		Scanner sc = new Scanner(System.in);
		System.out.println("중간고사  "); double 중간고사 = sc.nextInt();
		System.out.println("기말고사  "); double 기말고사 = sc.nextInt();
		System.out.println("수행평가  "); double 수행평가 = sc.nextInt();
		
		중간고사 *= 0.3; 기말고사 *= 0.3; 수행평가 *= 0.4;
		
		System.out.printf("반영비율별 점수 : %.2f \n" , (중간고사+기말고사+수행평가) );
		
		
	}
}
