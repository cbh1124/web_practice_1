package com.ezen_cbh.day15;

import java.util.ArrayList;
import java.util.Scanner;

public class ListCollect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ��� �߰� ����Ʈ �迭 ���� 
		ArrayList<ListC> members = new ArrayList<>();
		
		int count = 0;
		while(true) {
			
			System.out.println("1. ��� �߰� 2. ��� ��� 3. ��� ���� 4. ���Ȯ��"); int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("��� ���� �߰��մϴ�."); String member = sc.next();
				System.out.println("�ο����� �߰��մϴ�."); int memberC = sc.nextInt();
				ListC member2 = new ListC(member, memberC);
				members.add(member2);
				
				count ++;
				
			}
			
			if(ch == 2) {
				System.out.println("����� ����մϴ�.");
			}
			
			if(ch == 3) {
				System.out.println("��� ����!!!");
			}
			if(ch == 4) {
				System.out.println("------------��ܷ�-----------");
				System.out.println("��\t�ο�\t����ȣ");
				for(ListC temp : members) {
					System.out.println(temp.getMember()+"\t"+temp.getMemberC()+"\t"+count);
				}
			}
		}
		
	}
}
