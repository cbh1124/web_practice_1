package ����;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ��ö���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		��ö�� ������ = new ��ö��();
			������.��ö���.offer(new ��ö1("1"));
			������.��ö���.offer(new ��ö1("2"));
			������.��ö���.offer(new ��ö1("3"));
			
			
		��ö�� ��꿪 = new ��ö��();
		/*
			��꿪.��ö���.offer(new ��ö1("1"));
			��꿪.��ö���.offer(new ��ö1("2"));
			��꿪.��ö���.offer(new ��ö1("3"));
			
			*/
		��ö�� ���￪ = new ��ö��();
		/*
			���￪.��ö���.offer(new ��ö1("1"));
			���￪.��ö���.offer(new ��ö1("2"));
			���￪.��ö���.offer(new ��ö1("3"));
			
			*/
		��ö�� ���ο� = new ��ö��();
		/*
			���ο�.��ö���.offer(new ��ö1("1"));
			���ο�.��ö���.offer(new ��ö1("2"));
			���ο�.��ö���.offer(new ��ö1("3"));
			
			*/
		
		
		while(true) {
			System.out.println(������.��ö���.poll());
			System.out.println("------��߽�ȣ �޴�------");
			System.out.println("1.���� 2. ��� 3. ���� 4. ����"); int ch = sc.nextInt();
			if(ch == 1) {
				if(!������.��ö���.isEmpty()) {
					������.��ö���.offer(new ��ö1("3"));
				}
				
					
			}
		}
		
		
		
		
		
		
	}
}
