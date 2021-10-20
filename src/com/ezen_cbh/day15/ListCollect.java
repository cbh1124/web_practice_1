package com.ezen_cbh.day15;

import java.util.ArrayList;
import java.util.Scanner;

public class ListCollect {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 명단 추가 리스트 배열 선언 
		ArrayList<ListC> members = new ArrayList<>();
		
		int count = 0;
		while(true) {
			
			System.out.println("1. 명단 추가 2. 명단 취소 3. 명단 입장 4. 명단확인"); int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.println("명단 팀을 추가합니다."); String member = sc.next();
				System.out.println("인원수를 추가합니다."); int memberC = sc.nextInt();
				ListC member2 = new ListC(member, memberC);
				members.add(member2);
				
				count ++;
				
			}
			
			if(ch == 2) {
				System.out.println("명단을 취소합니다.");
			}
			
			if(ch == 3) {
				System.out.println("명단 입장!!!");
			}
			if(ch == 4) {
				System.out.println("------------명단록-----------");
				System.out.println("팀\t인원\t대기번호");
				for(ListC temp : members) {
					System.out.println(temp.getMember()+"\t"+temp.getMemberC()+"\t"+count);
				}
			}
		}
		
	}
}
