package test;

import java.util.Scanner;

// �迭���� 
// �Է»��� 

// 1. ���� ���� 2. ���� ��� 3. ���� 4. ��� 5. ���� 

public class BankAapplication {
	private static Account[] ac  = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int ch = 0;
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("���� ����ý���");
			System.out.println("1. ���� ���� 2. ���� ��� 3. ���� 4. ��� 5. ����");
			System.out.println("-----------------------------------------");
			
			ch = sc.nextInt();
			// ���� ���� 
			if(ch == 1) {
				createA();
			}
			// ���� ���
			else if(ch == 2) {
				// �޼ҵ� �Է�
			}
			// ����
			else if(ch == 3) {
				// �޼ҵ� �Է�
			}
			// ���
			else if(ch == 4) {
				
			}
			// ���� 
			else if(ch == 5) {
				run = false;
				System.out.println("�ý����� �����ϼ̽��ϴ�.");
				
			}
			break;
		}
		
	}
	
	
	private static void createA() {
		System.out.println("-----------------------------------------");
		System.out.println("���� ������ �����ϼ̽��ϴ�.");
		System.out.println("-----------------------------------------");
		
		Account account = new Account(ago,owner,balance);
		
		System.out.println("�����Է� : "); String ago = sc.next();
		System.out.println("������ : ");	String owner = sc.next();
		System.out.println("�ʱ� ���� �ݾ� �Է�"); int balance = sc.nextInt();
		// �ʱ� ���� �ݾ��� �뷱���� �ְ� ���� 
		
		for(int i=0; i<ac.length;i++ ) {
			if(ac == null) {
				ac[i] = account;
				System.out.println("���� ���� �Ϸ�");
				break;
			}
		}
			
	}
	
	private static void list() {
		System.out.println("-----------------------------------------");
		System.out.println("���� ����Ʈ ���");
		System.out.println("-----------------------------------------");
		
		
		
}
	
	

}
