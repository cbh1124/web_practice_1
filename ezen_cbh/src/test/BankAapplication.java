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
				listA();
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
			}

		}
		System.out.println("�ý����� �����ϼ̽��ϴ�.");
	}
	
	
	private static void createA() {
		System.out.println("-----------------------------------------");
		System.out.println("���� ������ �����ϼ̽��ϴ�.");
		System.out.println("-----------------------------------------");
		
		System.out.println("�����Է� : "); String ago = sc.next();
		System.out.println("������ : ");	String owner = sc.next();
		System.out.println("�ʱ� ���� �ݾ� �Է� : "); int balance = sc.nextInt();
		// �ʱ� ���� �ݾ��� �뷱���� �ְ� ���� 
		
		Account account = new Account(ago,owner,balance);
		
		for(int i=0; i<ac.length;i++ ) {
			if(ac[i] == null) {
				ac[i] = account;
				System.out.println("���� ���� �Ϸ�");
				break;
			}
		}
			
	}
	
	// ���¸�Ϻ��� 
	// ���� ����Ʈ�� �迭���� �ݺ������� �ٰ����´����� 
	// null�� ������ ������ ������ �迭�������� ���̱⶧���� �׶� ����
	// null�� ������������ �迭 �ϳ��� ��� / ���� ac�迭�� ���� null���� ���ö����� �������� �迭 ���
	private static void listA() {
		System.out.println("-----------------------------------------");
		System.out.println("���� ����Ʈ ���");
		System.out.println("-----------------------------------------");
		
		for(int i = 0; i<ac.length; i++) {
			if(ac[i] == null) {
				break;
			}
		System.out.println(ac[i].getAgo() +"\t" + ac[i].getOwner()+ "\t"+ ac[i].getBalance());		
			
		}
	}
	//??????????????????????????????????????????????????�ָ��ϱ�.. 
	private static Account findAccount(String ago) {
		Account accout = null;
		for(int i = 0; i<ac.length; i++) {
			if(ac[i] != null) {
				if(ac[i].getAgo().equals(ago)) {
					account = ac[i];
					break;
				}
			}
		}
		return account; 
	}
	// ����    
	/*
	 * ���� -> �Է� : ���¹�ȣ ���ݾ� -> ���¹�ȣ ��ġ Ȯ�� ->
	 * */
	private static void setA() {
		System.out.println("-----------------------------------------");
		System.out.println("����");
		System.out.println("-----------------------------------------");
		
		//�Է�
		System.out.println("���¹�ȣ�� �Է��ϼ��� : "); String.ago = sc.next();
		System.out.println("���ݾ��� �Է��ϼ��� : "); String.owner = sc.next();
		
		// 2. �Է¹��� ���� ��ȣ ��ġ
		for(i=0;i<ac.length;i++) {
			
		}
	}
		
}
	
	


