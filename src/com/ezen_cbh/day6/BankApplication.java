package com.ezen_cbh.day6;

import java.util.Scanner;

public class BankApplication {
			// ���������� 
				// public : ������Ʈ�� �������� ȣ�� ���� 
				// private : �������ϳ������� ȣ�� ���� 
				// default[����] : ������ ��Ű���������� ȣ�� ���� 
				// protected : ������ ��Ű���������� ȣ�� ����
	
	// 100�� ���°�ü�� ������ �� �ִ� �迭 ���� 
		// main �޼ҵ� �ۿ� ����� : main�޼ҵ� �� ��� �޼ҵ忡�� ȣ�� ���� 
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);
		// private : ���� Ŭ���� �������� ȣ�� ���� 
			// static : �������� : ���α׷� ���ݿ� ���� ���� ���� 
				// main �޼ҵ�� ���� ���α׷� ���۽� �޸� �Ҵ�
				// ��� �޼ҵ忡 ���Ǵ� �ʵ忡 ���� 
				// <----> �������� : ����� { } �ȿ����� ��� --> {} ������ ������ �ʱ�ȭ
	
	public static void main(String[] args) {
		// main�޼ҵ忡�� main������ ����
		
		boolean run = true;
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("----------------------------");
			System.out.println("����> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo == 2) {
				accountList();
			}else if(selectNo == 3) {
				deposit();
			}else if(selectNo == 4) {
				withdraw();
			}else if(selectNo == 5) {
				run = false;
			}
			System.out.println("���α׷� ����");
		}
	}	
		// ���»����ϱ� [�μ�X ��ȯX]
		// static ������� : main���� ȣ���ϱ� ���� [ �� ���� : main �ش� �޼ҵ� ���Ұ� ]
		private static void createAccount() {
			// 1. �Է¹ޱ�
			System.out.println("------------");
			System.out.println("���� ����");
			System.out.println("------------");
			
			System.out.println(">> ���¹�ȣ : "); String ano = sc.next();
			System.out.println(">> ������ : "); String owner = sc.next();
			System.out.println(">> �ʱ��Աݾ� : "); int balance = sc.nextInt();
			//2. ��ü ���� [ �Է¹��� �������� ��ü �����ڿ� �־ ��ü �����]
			Account account = new Account(ano, owner, balance);
			
			//3. �迭 ���� [ �迭�� �����[null]�� ã�Ƽ� ����� �ε����� ��ü ���� ]
			for(int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null) {
					accountArray[i] = account; 
					System.out.println("���: ���°� �����Ǿ����ϴ�.");
					break;
				}
			}
		}
		
		// ���¸�Ϻ��� [�μ�X ��ȯX]
		private static void accountList() {
			System.out.println("------------");
			System.out.println("���� ���");
			System.out.println("------------");
			// 1. �迭�� ��� �ε����� ȣ�� [ ���� ���� ]
			for(int i = 0; i<accountArray.length; i++) {
				if(accountArray[i] == null) break;
				
				System.out.println(accountArray[i].getAno() + "\t"
						+ accountArray[i].getOwner() + "\t"
						+ accountArray[i].getBalance() );
			}
		}
			
		// �����ϱ� [�μ�X ��ȯX]
		private static void deposit() {
			// �ۼ���ġ 
			System.out.println("------------");
			System.out.println("����");
			System.out.println("------------");
			// 1. �Է¹ޱ�
			System.out.println(">> ���¹�ȣ : "); String ano = sc.next();
			System.out.println(">> ���ݾ� : "); int balance = sc.nextInt();
			// 2. �Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ�� 
			Account account = findAccount(ano);
				// findAccount ��Ⱥ : ã�� ��ü Ȥ�� null
			// 3.
			if(account == null) { // ��ȯ�� null �ϰ��
				System.out.println("��� : ���°� �������� �ʽ��ϴ�.");
				return; // ���� �޼ҵ� ���� ����
			}
			
			account.setBalance(account.getBalance() + balance );
								// �������ݾ� + �Է¹��� �Աݾ� 
				// set �޼ҵ� : �ʵ忡 �� ���� �޼ҵ�
			 	// get �޼ҵ� : �ʵ��� �� ȣ�� �޼ҵ�
			System.out.println("��� : ������ �����Ǿ����ϴ�.");
		}
		
		// ����ϱ� [�μ�X ��ȯX]
		private static void withdraw() {
			// 1. �Է¹ޱ�
			// 2. �Է¹��� ���¹�ȣ �����ϴ��� üũ�ϴ� �޼ҵ� ȣ�� 
			System.out.println("------------");
			System.out.println("���");
			System.out.println("------------");
			
			System.out.println(">> ���¹�ȣ : "); String ano = sc.next();
			System.out.println(">> ��ݾ� : "); int balance = sc.nextInt();
			
			Account account = findAccount(ano);
			
			if(account == null) { // ��ȯ�� null �ϰ��
				System.out.println("��� : ���°� �������� �ʽ��ϴ�.");
				return; // ���� �޼ҵ� ���� ����
			}
			if(account.getBalance()<balance) {
				//��ݾ��� �������ݾ� ���� ũ�� ��� �Ұ� 
				System.out.println("���ݾ׺��� ���� �ݾ��� ����� �� �����ϴ�."); 
			}
			// 4. 
			account.setBalance(account.getBalance() - balance );
								// �������ݾ� + �Է¹��� �Աݾ� 
				// set �޼ҵ� : �ʵ忡 �� ���� �޼ҵ�
			 	// get �޼ҵ� : �ʵ��� �� ȣ�� �޼ҵ�
			System.out.println("��� : ����� �����Ǿ����ϴ�.");
			
		}
		
		// Account �迭���� ano�� ������ Account ��ü ã�� [ �μ�o (String ano) ��ȯ o (Account ��ü)]
		private static Account findAccount(String ano) {
			Account account = null; //�ӽð�ü
			for(int i =0; i<accountArray.length; i++) { // i��° �ε����� ������ �ƴϸ鼭
				
				if(accountArray[i] != null) { 
					if(accountArray[i].getAno().equals(ano)) { 
						// i��° �ε����� ��ü�� ���¹�ȣ
						account = accountArray[i];
						break;
					}
				}
			}
			return account;
		}
	
}
