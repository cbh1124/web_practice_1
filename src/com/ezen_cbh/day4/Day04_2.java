package com.ezen_cbh.day4;

import java.util.Random;
import java.util.Scanner;

public class Day04_2 {
		// ���������� 
				// 1. ����ڷκ��� ����[0]����[1]��[2] �� �ϳ��� �Է� �ޱ�
				// 2. ��ǻ�ʹ� �������� ���������� [0~2] �� �ϳ� ���� 
				// 3. �¸��� �÷��̾� ȣ�� 
					// + : ���࿡ ���Ḧ �Է��ϸ� ���� ���� 
					// + : ��������� ���Ӽ� �� ���� �¸� [ ���� ���� �̱� �÷��̾� ȣ�� ]
	public static void main(String[] args) {
		// 1. �ʿ� ���� ���� // 2. Ű���� �Է� // 3. ���� ���� // 4. ����
		int �÷��̾� ;
		int ��ǻ�� ;
		int countP = 0; // �÷��̾� �¸���
		int countC = 0; // ��ǻ�� �÷��̼�
		int countS = 0; // �÷��̾� ��ǻ�� ��� Ƚ��
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("----------[[���� ���� �� ���� ]]---------- ");
			System.out.println(">>>>>> 0.���� 1.���� 2.�� 3.�������� �� ���ڸ� �Է����ּ���  ");
			�÷��̾� = sc.nextInt();
			
			// 2. ��ǻ�ͷκ��� ���� ���� 
			System.out.println(">>>>> ��ǻ�� ���� ��>>>>>");
			Random rd = new Random();
			��ǻ�� = rd.nextInt(3); // 0~2 ���� ����
			
			// 3. �¸��� �Ǵ� 
			if (�÷��̾� == 0)
			{
				if (��ǻ�� == 1)
				{
					System.out.println("��ǻ�Ͱ� �¸��Ͽ����ϴ�.");
					System.out.printf("��ǻ�ʹ� %d\n", ��ǻ��);
					countC++;;
				}
				else if (��ǻ�� == 2 )
				{
					System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
					System.out.printf("��ǻ�ʹ� %d\n", ��ǻ��);
					countP++;
				}
				else { 
					System.out.println("�����ϴ�.");
					System.out.printf("��ǻ�ʹ� %d\n", ��ǻ��);
					countS++;
				}
				
			}
			
			if (�÷��̾� == 1)
			{
				if (��ǻ�� == 2)
				{
					System.out.println("��ǻ�Ͱ� �¸��Ͽ����ϴ�.");
					System.out.printf("��ǻ�ʹ� %d\n", ��ǻ��);
					countC++;;
				}
				else if (��ǻ�� == 0 )
				{
					System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
					System.out.printf("��ǻ�ʹ� %d\n", ��ǻ��);
					countP++;
				}
				else { 
					System.out.println("�����ϴ�.");
					System.out.printf("��ǻ�ʹ� %d\n", ��ǻ��);
					countS++;
				}
				
			}
			
			if (�÷��̾� == 2)
			{
				if (��ǻ�� == 0)
				{
					System.out.println("��ǻ�Ͱ� �¸��Ͽ����ϴ�.");
					System.out.printf("��ǻ�ʹ� %d\n", ��ǻ��);
					countC++;;
				}
				else if (��ǻ�� == 1 )
				{
					System.out.println("����ڰ� �¸��Ͽ����ϴ�.");
					System.out.printf("��ǻ�ʹ� %d\n", ��ǻ��);
					countP++;
				}
				else { 
					System.out.println("�����ϴ�.");
					System.out.printf("��ǻ�ʹ� %d\n", ��ǻ��);
					countS++;
				}
				
			}
			
			if (�÷��̾� == 3) {
				System.out.println("�����մϴ�.");
				
				if(countP>countC) {
					System.out.printf("�� ���Ӽ� %d ���帹�� �̱� �÷��̾� : �����\n ", countP+countC+countS);
					System.out.printf("������� �̱�Ƚ�� : %d", countP);
				}
				else if (countP<countC) {
					System.out.printf("�� ���Ӽ� %d ���帹�� �̱� �÷��̾� : ��ǻ��\n ", countP+countC+countS); 
					System.out.printf("��ǻ���� �̱�Ƚ�� : %d", countC);
				}
				else {
					System.out.printf("�� ���Ӽ� %d ���帹�� �̱� �÷��̾� : �����ϴ�\n", countP+countC+countS);
				}
				break;
			}
			/*
			int keycode = sc.nextInt();
			if (keycode == 0)
			{
				System.out.println("������ �Է��ϼ̽��ϴ�.");
				Random rd = new Random();
				��ǻ�� = rd.nextInt(3);
				if(����)
			}
			*/
		}
		
	}
}
