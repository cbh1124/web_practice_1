package com.ezen_cbh.day5;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Day05_5_Board_class {
	public static void main(String[] args) {
		
		Day05_5[] 제목내용 = new Day05_5[100];
		int choice = 0; 
		Scanner sc = new Scanner(System.in);
		while(true) {
			// 메인 메뉴 사용하기
			System.out.println("\n\n================================커뮤니티====================================");
			System.out.printf(" %2s \t %10s \t %5s \t %5s %3s\n","순번" , "제목" , "작성자","작성일","조회수");

			for( int i = 0 ; i<제목내용.length; i++ ) {
				if( 제목내용[i] != null ) {
					System.out.printf(" %2d \t %10s \t %5s \t %5s %3s\n" ,
							i , 제목내용[i].title , 제목내용[i].writer, 제목내용[i].date, 제목내용[i].count);
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
				//String count = "1";
				for(int i = 0; i < 제목내용.length; i++) {
					if(제목내용[i] == null ) {
						Day05_5 제목내용2 = new Day05_5();
						제목내용2.title = 제목; 제목내용2.contents = 내용; 제목내용2.writer = 작성자;
						제목내용2.date = d; 제목내용2.count = 1; 
						제목내용[i] = 제목내용2;
						break;
					}
				}
			}	
			
			if (choice == 2) {
				System.out.println(" 상세페이지를 볼 게시물 번호 선택"); int ch_2 = sc.nextInt();
				// 조회수 증가
				//int count = Integer.parseInt(제목내용[ch_2][4]); // 조회수 int변환
				//제목내용[ch_2][4] = Integer.toString(++count); // 조회수 증가 후 string 변환
				
				System.out.printf("제목 : %s\n", 제목내용[ch_2].title);
				System.out.printf("작성자 : %s\t 작성일 : %s\t 조회수 : %s\n" , 제목내용[ch_2].writer,제목내용[ch_2].date,제목내용[ch_2].count );
				System.out.printf("내용 : %s\n", 제목내용[ch_2].contents); 
				
			}
				
			
			
			
			
		} // while e
	}
}
