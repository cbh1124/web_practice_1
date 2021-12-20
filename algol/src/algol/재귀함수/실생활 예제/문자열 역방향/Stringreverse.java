package algol;

import java.util.Scanner;

public class Stringreverse {
	static String[] rev ;
	static String rv;
	static int l;
	static void reverse(String[] rev, int x) {
		
		if( x >= rev.length) {
			return;
		}
		reverse(rev, x+1);
		System.out.println(rev[x]);
	}
	
	public static void main(String[] args) {
		
		System.out.println("문자를 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		rv = sc.next();
		rev = rv.split("");
		
		l = rev.length;
		reverse(rev, 0);
	}
}
