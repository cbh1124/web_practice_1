package com.ezen_cbh.day5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Day05_4 {
	// 문제1: 게시판 프로그램  
			// 0. 2차원 배열 사용  // 게시물번호는 인덱스 번호
			// 1. 게시판 [ 제목 , 내용 , 작성자 , 작성일[Date] , 조회수 ]
			// 2. 해당 게시물 번호 선택해서 상세페이지로 이동시 해당 게시물 조회수 1 증가 
		
			// 2. 메인 메뉴 예시
			// 
			/*
			 * 			[ 게시판 ]
			 * 	순번	제목			작성자	작성일	조회수 
			 * 	1   안녕			김현수	10-05	3 
			 * 	2  	안녕2			김현수	10-05	3 
			 * 	3	안녕3			강호동	10-04	2
			 * 	선택 : 1.글쓰기 2.글상세페이지	
			 */
		
			// [ 글쓰기 했을때 ]
				// 1. 제목 , 내용 , 작성자 , 작성일[Date] 입력받아 배열에 저장 
			// [ 글상세페이지 눌렀을때 ] 
				// 1. 상세페이지를 볼 게시물 번호 선택 
				// 2. 선택한 게시물의 상페이지 출력 
		
			// 2. 상세페이지 예시 
			/*
			 *	>> 제목 : 안녕  
			 *	>> 작성자 : 김현수 	작성일 : 10-5		조회수 : 3
			 * 	>> 내용 : 안녕하세요 자바 입니다 
			 * 	
			 * 	>> 선택 : 1. 뒤로가기	
			 * 
			 */
	public static void main(String[] args) {
		// 2차원 배열 사용하여 배열선언
		String[][] 제목내용 = new String[1000][1000];
		Scanner sc = new Scanner(System.in);
		int choice = 0; 
		
		
		while(true) {
			// 메인 메뉴 사용하기
			System.out.println("\n\n================================커뮤니티====================================");
			System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","순번" , "제목" , "작성자","작성일","조회수");

			for( int i = 0 ; i<제목내용.length; i++ ) {
				if( 제목내용[i][0] != null ) {
					System.out.printf(" %2d \t %10s \t %5s \t %5s %3s\n" ,
							i , 제목내용[i][0] , 제목내용[i][2], 제목내용[i][3], 제목내용[i][4]);
				}
			}
			System.out.println("==========================================================================");
			System.out.print(" 1.글쓰기 2.글상세보기  >>선택 : "); choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("제목을 입력하세요 :"); String 제목 = sc.next();
				System.out.println("내용을 입력하세요 :"); String 내용 = sc.next();
				System.out.println("작성자를 입력하세요 :"); String 작성자 = sc.next();

				
				
				Date d = new Date();
				SimpleDateFormat dateFormat = new SimpleDateFormat( "MM-dd" );
				String date = dateFormat.format(d);
				String count = "1";
				for(int i = 0; i < 제목내용.length; i++) {
					if(제목내용[i][0] == null ) {
						제목내용[i][0] = 제목; 제목내용[i][1] = 내용; 제목내용[i][2] = 작성자;
						제목내용[i][3] = date; 제목내용[i][4] = count; break;
					}
				}
			}	
			
			if (choice == 2) {
				System.out.println(" 상세페이지를 볼 게시물 번호 선택"); int ch_2 = sc.nextInt();
				// 조회수 증가
				int count = Integer.parseInt(제목내용[ch_2][4]); // 조회수 int변환
				제목내용[ch_2][4] = Integer.toString(++count); // 조회수 증가 후 string 변환
				
				System.out.printf("제목 : %s\n", 제목내용[ch_2][0]);
				System.out.printf("작성자 : %s\t 작성일 : %s\t 조회수 : %s\n" , 제목내용[ch_2][2],제목내용[ch_2][3],제목내용[ch_2][4] );
				System.out.printf("내용 : %s\n", 제목내용[ch_2][1]); 
				
			}
				
			
			
			
			
		} // while e
	} // m e

}// c e
