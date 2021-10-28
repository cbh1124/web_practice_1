package com.ezen_cbh.day15;

import java.util.Scanner;
import java.util.Stack;

public class Day15_문제4 {

		// 문제 4 :스택구조를 이용한 문자열 역순 출력 
			// [조건1] 스택구조
			// [조건2] 입력받은 문자열을 순서대로 스택에 저장 
			// [ 조건3 ] 문자열 반대로 출력 
			// [출력 예시]
				// 입력 : ABC
				// 출력 : CBA 
	
	//  String ----->  S, t, r, i, n, g (이거를 스택으로 저장) -->pop 하면 나옴 
	
	public static void main(String[] args) {
		Stack<Character> 문자열 = new Stack<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		
			
		System.out.println("문자열을 입력하세요"); String value = sc.next();
			
		for(int i = 0; i<value.length(); i++) {
			문자열.push(value.charAt(i));
		}
		System.out.println(문자열);
		
			
		for(int i =0; i<value.length(); i++) {
			System.out.println(문자열.pop());
		}
		
		
		
	}
}
