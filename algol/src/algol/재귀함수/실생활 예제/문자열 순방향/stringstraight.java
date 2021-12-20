package algol;

import java.util.Scanner;

public class stringstraight {
	static String[] rev ;
	   static String rv;
	   static int l;
	   static void reverse(String[] rev, int l) {
	      
	      if(l==1) {
	         System.out.println(rev[0]);
	      }
	      
	      if(l>0) {
	         reverse(rev, l-1);
	         System.out.println(rev[l]);
	      }
	      
	      
	      
	      
	   }
	   
	   public static void main(String[] args) {
	      
	      System.out.println("문자를 입력하세요");
	      Scanner sc = new Scanner(System.in);
	      
	      rv = sc.next();
	      rev = rv.split("");
	      
	      l = rev.length;
	      reverse(rev, l-1);
	   }

}
