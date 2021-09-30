package Day03_1;

public class Day03_1 { // c s
	
	
	// 컴퓨터[0 , 1] :  기계어 
	// 1. 컴퓨터 입력 / 출력 
	// 2. 메모리[변수] 저장 ,  계산[연산]
	
	// p.108 제어문 : if(논리제어) , switch(데이터제어) 
		// 목적 : 경우의 수에 따른 코드 처리 
	
	
		// if : true , false 만 제어 가능 
			// 형태1 : if(논리) true 실행문 .
			// 형태2 : if(논리) true 실행문 
			// 		 else false 실행문 	
			// 형태3 : if(논리) {실행문; 실행문; }
			// 		  else { 실행문; 실행문; }
			// 형태4 : if( 논리 ) { }
			// 		  else if( 논리2 ) { }
			//	      else if( 논리3 ) { }
            //        else if( 논리4 ) { }
			//  	  else 
	public static void main(String[] args) {  // m s
		// 예1)  true 이면 실행문 실행 
		if( 3>1 ) System.out.println("3이 1보다 크다");
		
		// 예2) false 이면 행문 실행x 
		if( 3>5 ) System.out.println("3이 5보다 크다");
		
		// 예3) true false 이면 실행문 실행 
		if( 3 > 5 ) System.out.println("3이 5보다 크다");
		else System.out.println("3이 5보다 작다");
		
		// 예4) { }가 사용되는 경우 => 실행문 2개 이상일때 
		if( 3 > 2 ) { 
			System.out.println("true이면 실행되는 자리");
			System.out.println("3이 2보다 크다");
		}
		else {
			System.out.println("false이면 실행되는 자리");
			System.out.println("3이 2보다 작다. ");
		}
		
		// 예5) 다양한 경우의수의 따른 제어 
		if( 3 > 5) System.out.println("3이 5보다 크다");
		else if( 3 > 4 ) System.out.println("3이 4보다 크다");
		else if( 3 > 3 ) System.out.println("3이 3보다 크다");
		else if( 3 > 2 ) System.out.println("3이 2보다 크다");
		else System.out.println("true가 없다 ");
		
		// 예 5_2)
		if( 3 > 5) System.out.println("3이 5보다 크다");
		if( 3 > 4 ) System.out.println("3이 4보다 크다");
		if( 3 > 3 ) System.out.println("3이 3보다 크다");
		if( 3 > 2 ) System.out.println("3이 2보다 크다");
		else System.out.println("true가 없다 ");
		
		// p.109 예
		int score = 93;
		// 점수가 90보다 크기 때문에 실행
		if(score >= 90) {System.out.println("점수가 90보다 큽니다"); System.out.println("등급은 A입니다.");}
		// 점수가 90보다 미만 아니기 때문에 실행 x
		if(score < 90) {System.out.println("점수가 90보다 작습니다"); System.out.println("등급은 B입니다");}
		
		// p.111 예
		int score2 = 85;
		if(score2 >= 90) {System.out.println("점수가 90보다 큽니다"); System.out.println("등급은 A입니다.");}
		else {System.out.println("점수가 90보다 작습니다"); System.out.println("등급은 B입니다");}
		
		// p.112 예
		int score3 = 75;
		if(score3 >= 90) {System.out.println("점수가 100~90입니다 "); System.out.println("등급은 A입니다.");}
		else if(score3 >= 80) {System.out.println("점수가 88~89 입니다 "); System.out.println("등급은 B입니다");}
		else if(score3 >= 70) {System.out.println("점수가 70~79 입니다 "); System.out.println("등급은 C입니다");}
		else { System.out.println("점수가 70 미만 입니다"); System.out.println("등급은 D입니다"); }
		
	} // m e
} // c e
