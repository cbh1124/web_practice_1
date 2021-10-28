package com.ezen_cbh.day15;

import java.util.HashSet;
import java.util.Scanner;

public class Lotto_set {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 HashSet<Integer> set = new HashSet<>();
		 
		 while(true) {
			 System.out.println("1~45 ���� ����(�ߺ��Ұ�) :");
			 int num = sc.nextInt();
			 
			 if(num < 1 || num > 45) {
				 System.out.println("�����Ҽ� ���� ��ȣ");
			 }
			 else {
				 // �ߺ�Ȯ��
				 if(set.contains(num)) {
					 System.out.println("** �ߺ� ��ȣ �Դϴ�");
				 }else {
					 set.add(num);
					 System.out.println("Ȯ�� : " + set);
				 }
			 }
			// ���ѷ��� ������ ���� : 6�� ��� �Է� �Ǿ�����
			if(set.size() == 6) break;
		 }	 
			 
	}
}
