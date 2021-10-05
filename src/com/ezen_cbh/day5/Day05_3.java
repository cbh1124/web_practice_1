package com.ezen_cbh.day5;

import java.util.Scanner;

public class Day05_3 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("------------------------------");
			System.out.println("선택> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				studentNum = sc.nextInt();
				System.out.println("학생수> " + studentNum);
				scores = new int[studentNum];
			}
			else if(selectNo == 2) {
				for(int i=0; i<studentNum ;i++) {
					scores[i] = sc.nextInt();
					System.out.printf("scores[%d] : \n",i);
				}
			}
			else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.printf("scores[%d] : %d\n", i, scores[i]);
				}
			}
			else if(selectNo == 4) {
				double avg = 0.0; int tmp = 0; int sum = 0;
				for(int i=0; i<scores.length; i++) {
					if(tmp<scores[i]) {
						tmp = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum / studentNum;
				System.out.printf("최고점수 : %d", tmp);
				System.out.println("평균점수 : "+ avg);
			}
			
			else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
	}
}
