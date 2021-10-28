package com.ezen_cbh.day15;

import java.util.HashSet;
import java.util.Scanner;

public class Lotto_set {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 HashSet<Integer> set = new HashSet<>();
		 
		 while(true) {
			 System.out.println("1~45 숫자 선택(중복불가) :");
			 int num = sc.nextInt();
			 
			 if(num < 1 || num > 45) {
				 System.out.println("선택할수 없는 번호");
			 }
			 else {
				 // 중복확인
				 if(set.contains(num)) {
					 System.out.println("** 중복 번호 입니다");
				 }else {
					 set.add(num);
					 System.out.println("확인 : " + set);
				 }
			 }
			// 무한루프 끝나는 조건 : 6개 모두 입력 되었을때
			if(set.size() == 6) break;
		 }	 
			 
	}
}
