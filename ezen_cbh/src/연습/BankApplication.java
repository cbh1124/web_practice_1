package ����;

import java.util.Scanner;

public class BankApplication {
	// main �޼ҵ� �ۿ� ����� : main �޼ҵ� �� ��� �޼ҵ忡�� ȣ�Ⱑ�� 
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("----------------------");
			System.out.println("1.���»��� | 2. ���¸�� | 3.���� | 4. ��� | 5.����");
			System.out.println("----------------------");
			System.out.println("����> ");
			
			int ch = sc.nextInt();
			
			if(ch == 1) {
				// �޼ҵ�
			}
			if(ch == 2) {
				// �޼ҵ� 
			}
			if(ch == 3) {
				// �޼ҵ� 
			}
			if(ch == 4) {
				// �޼ҵ� 
			}
			if(ch == 5) {
				run = false; 
			}
			System.out.println("�ý��� ����");
		}
		private static void createA() {
			System.out.println("----------------------");
			System.out.println("���� ����");
			System.out.println("----------------------");
			
			System.out.println("���¹�ȣ : "); String ano = sc.next();
			System.out.println("������ : "); String owner = sc.next();
			System.out.println("�ʱ� �Ա� �ݾ�"); int balance = sc.nextInt();

			Account account = new Account(ano,owner,balance);
			
			for(int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = account;
					System.out.println("��� ���°� �����Ǿ����ϴ�.");
					break;
				}
			}
		}
	
		
	}
}
