package 연습;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_practice {
	
	/*
	별도 문제 : 달력 범위 출력 
	[조건] : 시작날짜와 끝날짜를 입력받아 달력 출력하기 
		// 1. 시작 날짜부터 끝날짜까지의 모든 달력 출력 
		// 2. 2021 08 ~ 2022 10
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" 입력 연도 : "); int year = sc.nextInt();
		System.out.println(" 입력 월 : "); int month = sc.nextInt();
		
		calendar(year, month);
	}
	
	
	// 메소드 선언 
	public static void calendar(int year, int month) {
		
		// 캘린다 모듈을 불러와서 클래스 객체 선언 시스템의 현재 날짜와 시간정보를 얻기 위해 getinstance() 메서드 사용 
		Calendar cal = Calendar.getInstance();
		
		// set()으로 사용자가 불러올 날짜 가져오기  // 가져올 연도,월,일 
		cal.set(year, month-1 , 1); // 해당 
		
		// 해당 월의 1일 요일찾기 
		int day_search = cal.get(cal.DAY_OF_WEEK); // 해당 월의 1일 요일을 get으로 가져옵니다. 
		// 해당 월의 마지막 일을 찾습니다 . // 왜그럴까? 해당 월 1일부터 마지막 요일을 계산을 해줘야됨 
		int day_last = cal.getActualMaximum(cal.DAY_OF_MONTH); // 해당 월의 마지막일을 구하는 함수 
		
		// 달력을 출력 
		System.out.println("**************" + year +"년"+month+"월*************" );
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// 마지막 날까지 달력 출력 
		for(int i =1; i<day_last; i++) {
			System.out.print(i + "\t");
			if( day_search % 7 == 0 ) System.out.println();
			day_search++; // 요일 증가 
		}
		for( int i = 1 ; i<day_search ; i++) {
			System.out.print(" \t");
			
		}
		
	}
}
