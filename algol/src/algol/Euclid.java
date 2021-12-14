package algol;

import java.util.Scanner;

public class Euclid {
	
	
	static int gcd(int x, int y) {
		if(y == 0) {
			return x;    // y == 0이라면 
		}
		else
			System.out.println();
			return gcd(y, x%y); // 재귀 발동
			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 정수의 최대 공약수를 구합니다.");
		
		System.out.println("정수를 입력하세요 : "); int x = sc.nextInt();
		System.out.println("정수를 입력하세요 : "); int y = sc.nextInt();
		
		System.out.println("최대 공약수는" + gcd(x,y) + "입니다. ");
		
	}
}
