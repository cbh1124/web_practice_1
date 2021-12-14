package algol;

import java.util.Scanner;

public class Factorial {
	
	static int factorial(int n) {   // factorial 
		if(n > 0)					// 만약 인수값이 0이상이라면 
			return n * factorial(n-1); // n!= n*(n-1)! 반복  n*(n-1)*(n-2)...n의 값이 0이상이면 계속 반복  
		else						   // 그게 아니라면 
			return 1;				   // 값을 1을 반환한다. 
	}
									   
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 값을 입력
		 
		System.out.println("정수를 입력하세요 : "); 
		int x = sc.nextInt();				  // 정수를 입력
		
		System.out.println(x + "의 팩토리얼은 " + factorial(x) + "입니다.");	//factorial() 에 인수값을 전달 
		
	}
}
