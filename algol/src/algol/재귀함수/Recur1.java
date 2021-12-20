package algol;

import java.util.Scanner;

public class Recur1 {
	 
	static void recur(int n) {
		while (n > 0) {
			recur(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("정수 값 입력하기 : ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		recur(x);
	}
}
