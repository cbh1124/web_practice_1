package com.ezen_cbh.day1;

import java.util.Scanner;

public class Day01_4 { //c s
	
	public static void main(String[] args) {
		/*
		// 1. �Է°�ü ���� [Ű����κ��� �Է°��� �����ϴ� ��ü ]
		Scanner �Է°�ü = new Scanner(System.in);
			// ��ü ���� :  Ŭ������ ��ü��[����] =  new ������();
		
		// 2. �Է¹��� �� �����ͼ� ������ ���� 
			// ������ ���� �����Ҽ� �ִ� �޸� [�����ġ]
		System.out.print("ù��° �Է� :");
		String ù��°�Է� = �Է°�ü.next(); 
			// String : ���ڿ� Ŭ���� : ���ڿ��� �����ϴ� ��ü ����
		
		System.out.print("�ι�° �Է� : ");
		int �ι�°�Է� = �Է°�ü.nextInt();
			// int : ������[����] �ڷ��� : ������ �����ϴ� ���� ����
		
		//3. ���� ��� 
		System.out.println("ù��° �Է°��� : " + ù��°�Է�);
		System.out.println("�ι�° �Է°��� : " + �ι�°�Է�);
		
		*/
		
		// ���� 1 
		/*
		 * �л� �Ѹ��� �̸��� 1~3������ ��� ���θ� �Է¹޾� �Է¹��� ���� �Ʒ��� ���� ���
		 */
		
		System.out.print("�л��� �̸��� �Է��Ͻÿ�.  ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		System.out.print("1���� ��� : ");
		Scanner sc2 = new Scanner(System.in);
		String attend1 = sc2.next();
		
		System.out.print("2���� ��� : ");
		Scanner sc3 = new Scanner(System.in);
		String attend2 = sc3.next();
		
		System.out.print("3���� ��� : ");
		Scanner sc4 = new Scanner(System.in);
		String attend3 = sc4.next();
		
		System.out.println();
		System.out.println("\t[[ �⼮�� ]]\t");
		System.out.println("---------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println(name +"\t" + attend1 + "\t"+ attend2 + "\t" + attend3);
		System.out.println("---------------------------------");
		
		// ���� 1 ����� Ǯ��
		Scanner �Է°�ü = new Scanner(System.in);
		System.out.print("�л��� �̸��� �Է��Ͻÿ�.  "); String �̸� = �Է°�ü.next();
		System.out.print("1���� ��� : "); String ����_1 = �Է°�ü.next();
		System.out.print("2���� ��� : "); String ����_2 = �Է°�ü.next();
		System.out.print("3���� ��� : "); String ����_3 = �Է°�ü.next();
		
		System.out.println();
		System.out.println("\t[[ �⼮�� ]]\t");
		System.out.println("---------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println(�̸� +"\t" + ����_1 + "\t"+ ����_2 + "\t" + ����_3);
							// "�����" + ���� + "�����" + ��ü�� : ������ ��ü���� ����ó�� ����
		System.out.println("---------------------------------");
	}
	
}// c e
