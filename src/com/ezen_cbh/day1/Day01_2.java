package com.ezen_cbh.day1;

public class Day01_2 { // c s
	// ��� 
	// System.out.print() // main ���� ���� �Ұ� 
	// main + ctrl + �����̽���
	public static void main(String[] args) { // m s
		// 1. ���
			// print
			// print(����� ����); : ��� �� �ٹٲ�[���ιٲ�]
			// printf(���Ĺ���, ��¹���); : ���Ĺ��� �´� ���
				// f : format : ���
				// ���Ĺ��� 
					// %d : ����
					// %f : �Ǽ� 
					// %s : ���ڿ� 
					// %c : ����
				// ����� [ p.35 ]
					// \ : �������� ��ȭ��ȣ \
					// \n : �ٹٲ� 
		   			// \t : ��[�鿩���� => 5ĭ]
					// \r : ���� [�� ������ �̵� ]
					// \\ : \ ���
		// ��1 : syso + ctrl + �����̽���
		System.out.println("java");
		System.out.println(12345); //���� �̱� ������ ���ڿ��� ����ó�� x
		System.out.println("java10"); // ���� + ���� => ���� 
		
			// System : �̸� ������� �ý����̶�� Ŭ���� 
				// out : ��� ��Ʈ�� 
					// print(�μ� : ����ϰ� ������) : ��� �Լ�
			// . : Ŭ���� �� ���(�Լ�, ����) ���� ������[Ư������]
			// " " : Ű����[�̸� �ۼ��� �ܾ�], ���� �� ������ ��� ���ڿ��� ����ó��
			// ; : ������ �����ڵ� �� [ ��ó�� ]
		
		// ctrl + f11 : ������
		
		// ����2
		System.out.println("java");
		System.out.println(12345);
		System.out.println("java10");
		
		// ����3
		System.out.printf("%s", "java");
		System.out.printf("%d", 12345);
		System.out.printf("%s", "java10");
		
		// printf ����
		System.out.printf("���̴� %d�Դϴ�", 20);
		System.out.printf("���̴�"+ 20 + "�Դϴ�");
			// + : ���� ������ 
		
		// �����
		System.out.print("\njava\n"); // �յڷ� �ٹٲ�
		System.out.print("\t 12345");
		System.out.print("\rjava10");
		
		// ���� 1 
		/* ��� ��� 
		 *           [[ �⼮�� ]]
		 * --------------------------------
		 * �̸�	1����		2����		3���� 	���
 		 * ��ȣ��  �⼮	�Ἦ 		�⼮ 
 		 * ���缮	 �⼮ 	�Ἦ 		�⼮ 
 		 * -------------------------------- 
		 */
		System.out.println();
		System.out.println("\t[[ �⼮�� ]]\t");
		System.out.println("---------------------------------");
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		System.out.println("��ȣ��\t�⼮\t�Ἦ\t�⼮");
		System.out.println("���缮\t�⼮\t�Ἦ\t�⼮");
		System.out.println("---------------------------------");
		
		//���� 2 
		System.out.println("\t\\    /\\");
		System.out.println("\t )  ( ')");
		System.out.println("\t(  /  )");
		System.out.println("\t \\(__)|");
		// ����� ���� 2��
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		System.out.println();
		
		//���� 3 
		System.out.println("|\\_/|");
		System.out.println("|q p|\t/}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"'\t |");
		System.out.println("||_/=\\\\__|");
		System.out.println();
		// ����� ���� 3�� 
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"'    |");
		System.out.println("||_/=\\\\__|");
	} // m e
} // c e
