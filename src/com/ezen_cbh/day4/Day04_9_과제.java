package com.ezen_cbh.day4;

import java.util.Scanner;

public class Day04_9_���� { // cs
	// 2. ȸ���� �湮�� ���α׷�
	// [����1] : �ִ� 100���� �����Ҽ� �ִ� ȸ�� �迭[ ���̵� , ��й�ȣ ]
	// [����2] : �ʱ� �޴�
		// 1. �α��� 
		// 2. ȸ������ 
	// [ ȸ�������� ���������� ]
		// 1.���̵�� ��й�ȣ�� �Է¹޾� �迭�� ���� 
		// 2.���̵� �ߺ��Ұ� [ �迭�� ���� ���̵� �����ϸ� ȸ������ ���� ] 
	// [ �α����� ���������� ]
		// 1. ���̵�� ��й�ȣ�� �Է¹޾� �迭�� �����ϸ� �α��� ���� // �ƴϸ� ���� 
	// [ �α��� ������ �޴� ] 
		// 1.�湮�� �����
		// 2. �α׾ƿ� 
	// [ �湮�� ����� ���������� ] 
		// ������ �Է¹޾� �迭�� ���� [ ����� �ۼ��� ���̵� ���� ]
		// ���� �湮�� ��� ��� 
	// [ �α׾ƿ� ] 
	//	�ʱ�޴��� ���ư��� 
	public static void main(String[] args) {// ms
		
		Scanner sc = new Scanner(System.in);
		// [����1] : �ִ� 100���� �����Ҽ� �ִ� ȸ�� �迭[ ���̵� , ��й�ȣ ]
		String[] id1 = new String[100];
		String[] pw1 = new String[100];
		String[] cyworld = new String[1000];
		String[] cy_log = new String[1000];
		while(true) {
			// [����2] : �ʱ� �޴� 1. �α��� 2. ȸ������ 
			System.out.println("===========================================");
			System.out.println("1.�α���   2.ȸ������ ");
			int choice = sc.nextInt();
			// [ ȸ�������� ���������� ]
			// 1.���̵�� ��й�ȣ�� �Է¹޾� �迭�� ���� 
			// 2.���̵� �ߺ��Ұ� [ �迭�� ���� ���̵� �����ϸ� ȸ������ ���� ] 
			
			// 2. ȸ������
			if(choice == 2) {
				System.out.println("ȸ�� ���Կ� �����մϴ�.");
				System.out.println("���̵� : "); String id = sc.next();
				System.out.println("��й�ȣ : "); String pw = sc.next();
				
				Boolean check = true; // �ߺ��� ������� true �ߺ��� �������� false
				// �ߺ�üũ : ���࿡ �Է��� ���� �迭�� ������ ���� �����ϸ� �ٽ� �Է� 
				
				// �ߺ��� ������� ȸ������ ����
				for( int i = 0 ; i<id1.length ; i++ ) {
					if( id1[i]!= null && id1[i].equals(id) ) { // �ߺ�ã�� ���� 
						System.out.println(" �ߺ��� ���̵� �����մϴ�. " );
						System.out.println(" ȸ������ ����" );
						check = false; // �ߺ��� �ִ°�� 
						break;
					}
				}
				// �ߺ��� ���ٸ� ȸ������ �Ϸ�
				if(check == true) {
					for(int i = 0; i<id1.length; i++) {
						// �� �迭�� ���̵� �н����� �Է� 
						if(id1[i] == null && pw1[i] == null) {
							id1[i] = id;
							pw1[i] = pw;
						}
					}
					System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
				}
			} // ȸ������ e
			
			// 1. �α��� 
			else if(choice == 1) {
				System.out.println("�α��ο� �����մϴ�.");
				System.out.println("���̵� : "); String id = sc.next();
				System.out.println("��й�ȣ : "); String pw = sc.next();
				
				Boolean logcheck = true;
				//�α��� ����
				for (int i = 0; i<id1.length; i++) {
					if(id1[i].equals(id) && pw1[i].equals(pw) && id1[i] != null && pw1[i] != null) {
						System.out.println("�α��ο� �����ϼ̽��ϴ�.");
						// [ �α��� ������ �޴� ] 
						// 1.�湮�� �����
						// 2. �α׾ƿ� 
						System.out.println("===== �޴� =====");
						System.out.println("1.�湮�� ����� 2. �α׾ƿ�");
						
						int logch = sc.nextInt(); // �α��� ������ ������ ���ñ� 
						// [ �湮�� ����� ���������� ] 
						// ������ �Է¹޾� �迭�� ���� [ ����� �ۼ��� ���̵� ���� ]
						// ���� �湮�� ��� ���
						
						// 1. �湮�� �����
						if(logch == 1) {
							for (int s=0; s<cyworld.length; s++) {
								if(cyworld[s] != null) {
									System.out.println("�ۼ���\t�湮��");
									System.out.printf("%s\t%s\n",cy_log[s],cyworld[s]);
								}
							}	
								// �� �迭�� �ۼ��� ���� ��ϵ� �湮�� �Է�
							for(int j=0; j<cyworld.length; j++) {
								if(cyworld[j] == null && cy_log[j] == null) {
									cy_log[j] = id;
									cyworld[j] = sc.next();
									System.out.println("�ۼ���\t�湮��");
									System.out.printf("%s\t%s\n",cy_log[j],cyworld[j]);
									break;
								}
							}
							
						}
						
						
						// 2. �α� �ƿ�
						else if(logch == 2) {
							System.out.println("=====�α׾ƿ�=====");
							break;
						}
						// ��ȣ�� �̻��ϰ� �Է��Ұ�� ���� �߻�
						else {System.out.println("�߸� �Է��ϼ̽��ϴ�1.");}
					}
				}
				
				// �α��� ����
				if(logcheck == false) {
					System.out.println("�α��� ����");
					break;
				}
			
			} //1. �α��� e
			
			// ��ȣ�� �̻��ϰ� �Է��Ұ�� ���� �߻�
			else {System.out.println("�߸� �Է��ϼ̽��ϴ�2.");}
			
			
		} // ��ü �ݺ� e
		
	} // me

} // ce
