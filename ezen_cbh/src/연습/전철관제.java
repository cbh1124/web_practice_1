package ¿¬½À;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ÀüÃ¶°üÁ¦ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ÀüÃ¶¿ª Á¾Á¡¿ª = new ÀüÃ¶¿ª();
			Á¾Á¡¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("1"));
			Á¾Á¡¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("2"));
			Á¾Á¡¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("3"));
			
			
		ÀüÃ¶¿ª ¿ë»ê¿ª = new ÀüÃ¶¿ª();
		/*
			¿ë»ê¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("1"));
			¿ë»ê¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("2"));
			¿ë»ê¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("3"));
			
			*/
		ÀüÃ¶¿ª ¼­¿ï¿ª = new ÀüÃ¶¿ª();
		/*
			¼­¿ï¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("1"));
			¼­¿ï¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("2"));
			¼­¿ï¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("3"));
			
			*/
		ÀüÃ¶¿ª ±¸·Î¿ª = new ÀüÃ¶¿ª();
		/*
			±¸·Î¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("1"));
			±¸·Î¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("2"));
			±¸·Î¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("3"));
			
			*/
		
		
		while(true) {
			System.out.println(Á¾Á¡¿ª.ÀüÃ¶¸ñ·Ï.poll());
			System.out.println("------Ãâ¹ß½ÅÈ£ ¸Þ´º------");
			System.out.println("1.Á¾Á¡ 2. ¿ë»ê 3. ¼­¿ï 4. ±¸·Î"); int ch = sc.nextInt();
			if(ch == 1) {
				if(!Á¾Á¡¿ª.ÀüÃ¶¸ñ·Ï.isEmpty()) {
					Á¾Á¡¿ª.ÀüÃ¶¸ñ·Ï.offer(new ÀüÃ¶1("3"));
				}
				
					
			}
		}
		
		
		
		
		
		
	}
}
