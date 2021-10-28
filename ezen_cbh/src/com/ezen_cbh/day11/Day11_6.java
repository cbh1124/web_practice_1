package com.ezen_cbh.day11;

import java.util.Random;

/*
 *  차량  번호 랜덤으로  0000~9999 사이의 난수 10개 생성 
 *  1. 모든 차량을 배열에 저장
 *     끝자리 번호로 홀수/ 짝수 배열  
 *  2. 차량 끝자리 번호가 홀수 배열 생성
 *  3. 차량 끝자리 번호가 짝수 배열 생성 
 *  
 */
public class Day11_6 {
	public static void main(String[] args) {
		int [] 차량 = new int[10000];
		String [] 차량2 = new String[10000];
		int [] 홀수차량 = new int[10000];
		String [] 홀수차량2 = new String[10000];
		int [] 짝수차량 = new int[10000];
		String [] 짝수차량2 = new String[10000];
		
		// 모든 차량중 난수 10개 생성한 배열을 저장  
		Random random = new Random();
		for (int i = 0; i<10; i++) {
			차량[i] = random.nextInt(10000);
			차량2[i] = Integer.toString(차량[i]);
			System.out.print(차량2[i] );
			System.out.println();
		}
		
		// 차량 끝자리 번호가 홀수차량 배열 생성 
		for (int i = 0; i<차량2.length; i++) {
			
			if(차량2[i].charAt(3)== '1') {홀수차량2[i] = 차량2[i];}
			if(차량2[i].charAt(3)== '3') {홀수차량2[i] = 차량2[i];}
			if(차량2[i].charAt(3)== '5') {홀수차량2[i] = 차량2[i];}
			if(차량2[i].charAt(3)== '7') {홀수차량2[i] = 차량2[i];}
			if(차량2[i].charAt(3)== '9') {홀수차량2[i] = 차량2[i];}
			
			System.out.print("홀수차량을 출력합니다 " + 홀수차량2[i] );
			System.out.println();
			if(차량2[i].charAt(3)== '0' ) {짝수차량2[i] = 차량2[i];}
			if(차량2[i].charAt(3)== '2' ) {짝수차량2[i] = 차량2[i];}
			if(차량2[i].charAt(3)== '4') {짝수차량2[i] = 차량2[i];}
			if(차량2[i].charAt(3)== '6') {짝수차량2[i] = 차량2[i];}
			if(차량2[i].charAt(3)== '8') {짝수차량2[i] = 차량2[i];}
			System.out.print("짝수차량을 출력합니다 " +짝수차량2[i]);
			System.out.println();
		}
		/*
		// 차량 끝자리 번호가 짝수차량 배열 생성 
		for (int i = 0; i<차량2.length; i++) {
			
			if(차량2[i].charAt(3)== '2') {
				 짝수차량2[i] = 차량2[i];
				 
			}
			if(차량2[i].charAt(3)== '4') {
				 짝수차량2[i] = 차량2[i];
				 
			}
			if(차량2[i].charAt(3)== '6') {
				 짝수차량2[i] = 차량2[i];
				 
			}
			if(차량2[i].charAt(3)== '8') {
				 짝수차량2[i] = 차량2[i];	
			}
			if(차량2[i].charAt(3)== '0') {
				 짝수차량2[i] = 차량2[i];	
			}
			System.out.print("짝수차량을 출력합니다 " +짝수차량2[i]);
		}
		*/	
	}


}
