package com.ezen_cbh.day12;

import java.util.Random;
import java.util.Scanner;

/*
 *  차량  번호 랜덤으로  0000~9999 사이의 난수 10개 생성 
 *  1. 모든 차량을 배열에 저장
 *     끝자리 번호로 홀수/ 짝수 배열  
 *  2. 차량 끝자리 번호가 홀수 배열 생성
 *  3. 차량 끝자리 번호가 짝수 배열 생성 
 *  
 */
public class Day12_4 {
	public static void main(String[] args) {
		int [] 차량 = new int[10000];
		String [] 차량2 = new String[10000];
		String [] 홀수차량2 = new String[10000];
		String [] 짝수차량2 = new String[10000];
		String [] carnumbers = new String[10];
		String [] carnumbers_odd = new String[10];
		String [] carnumbers_even = new String[10];
		Random random = new Random();
		Scanner sc =new Scanner(System.in);
		while(true) {
			System.out.println("1.차량 출입 2.차량 홀수 3. 차량 짝수");
			int c = sc.nextInt();
			// 모든 차량중 난수 10개 생성한 배열을 저장
			if(c == 1) {
				int intnum = random.nextInt(10000);
				// 정수 - > 4자릿수 문자열 변환 
				String strnum = String.format("%04d", intnum);
						// String.format(형식 , 데이터) : 문자열 형식 메소드 
							// 형식 : %d -> 형식대상의 데이터가 정수 
								// %4d : 4자릿수
								// %04d : 비어있는 자릿수는 0으로 사용 
				// 차량번호 저장 [ 비어있는 배열에 저장 ] 
				for(int i = 0 ; i<carnumbers.length; i++) {
					if(carnumbers[i] == null) {
						carnumbers[i] = strnum; 
						// 홀 짝 구분
							// 1. 문자열 -> 정수 변환 2. 홀 짝 구분 
						if(Integer.parseInt(strnum) % 2 == 0) {
							// 정수형(차량번호) % 2 == 0이면 짝수 
							for( int j =0; i<carnumbers_even.length; i++) {
								if(carnumbers_even[j] == null) {
									carnumbers_even[j] = strnum; break;
								}
							}
							
						}else {
							for( int j =0; i<carnumbers_odd.length; i++) {
								if(carnumbers_odd[j] == null) {
									carnumbers_odd[j] = strnum; break;
								}
							}
						}
						 break;
					}
				}
				/////////////// 차량 출력 저장 /////////////////////////////////////
				System.out.println("********** 현재 주차중인 차량 **********");
				for(String num : carnumbers) { // 인덱스 번호가 필요없는 반복 
					// for(자료형 임시 변수 : 배열명) : 배열내 0번 인덱스부터 마지막 인덱스 까지 임시변수에 대입
					if(num != null)System.out.println(num);
				}
				
				System.out.println("********** 현재 주차중인 홀수차량 **********");
				for(String num : carnumbers_odd) { // 인덱스 번호가 필요없는 반복 
					// for(자료형 임시 변수 : 배열명) : 배열내 0번 인덱스부터 마지막 인덱스 까지 임시변수에 대입
					if(num != null)System.out.println(num);
				}
				
				System.out.println("********** 현재 주차중인 짝수차량 **********");
				for(String num : carnumbers_even) { // 인덱스 번호가 필요없는 반복 
					// for(자료형 임시 변수 : 배열명) : 배열내 0번 인덱스부터 마지막 인덱스 까지 임시변수에 대입
					if(num != null)System.out.println(num);
				}
				/*
				for (int i = 0; i<10; i++) {
					차량[i] = random.nextInt(10000);
					차량2[i] = Integer.toString(차량[i]);
					System.out.print(차량2[i] );
					System.out.println();
				}
				*/
			}
			
		}
		
		
		
		/*
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
		*/
		
		
		
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