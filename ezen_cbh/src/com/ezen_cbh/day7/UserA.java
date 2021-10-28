package com.ezen_cbh.day7;

public class UserA {
	//1. �ʵ�
	private String u_id;
	private String u_pws;
	private String u_name;
	private String u_phone;
	// 2. ������
	public UserA(String u_id, String u_pws, String u_name, String u_phone) {
		this.u_id = u_id;
		this.u_pws = u_pws;
		this.u_name = u_name;
		this.u_phone = u_phone;
	}
	// 2. ������� 
		// 2. ȸ������ �޼ҵ� [�Է¹��� ������ ��ü �����ؼ� �迭�� ����]
	public UserA() {
		
	}
	//3. �޼ҵ� [����]
		// 2. ȸ������ �޼ҵ� [�Է¹��� ������ ��ü �����ؼ� �迭�� ����]
	public static boolean signup() {
		// public: main�� ���� Ŭ���� (�ܺ�Ŭ����) �� ȣ���ϱ� ���� 
		// ��ȯ�� : ȸ�����Լ���/���� => true/false
		
		System.out.println("ȸ�� ���� â �Դϴ�."); 
		System.out.println("���̵� �Է��ϼ��� : "); String u_id = Library.sc.next();
			//���̵� �ߺ�üũ
			boolean check = idcheck(u_id);
			if(check) {
				System.out.println("����Ҽ� ���� ���̵� �Դϴ�.");
				return false; // ȸ������ ����
			}
		System.out.println("��й�ȣ�� �Է��ϼ��� :  "); String u_pws = Library.sc.next();
		System.out.println("�̸��� �Է��ϼ��� : "); String u_name = Library.sc.next();
		System.out.println("��ȭ��ȣ�� �Է��ϼ��� ; "); String u_phone = Library.sc.next();
		
		// ��ü ���� [ �Է¹��� �������� ��ü �����ڿ� ���� ]
		UserA userA = new UserA(u_id, u_pws, u_name, u_phone);
		
		// �迭���� [ �迭 �� ������� ã�Ƽ� �ش� ȸ������ ���� ���� ]
		for(int i = 0; i<Library.userArray.length; i++) {
			// 
			if(Library.userArray[i] == null) {
				Library.userArray[i] = userA;
				return true; // ȸ������ ����
			}
		}
		return false; 
	}
		// 3. �α��� �޼ҵ�[�Է¹��� ���̵�� ��й�ȣ�� �迭�� �����ϸ� �α��� ���� �ƴϸ� ����]
	public static String login() {
		// ��ȯ�� : �α��� ������ => ������ ���̵� /���н� null
		System.out.println("-----------�α��� ������ -----------");
		System.out.println("���̵� : "); String u_id = Library.sc.next();
		System.out.println("��й�ȣ : "); String u_pws = Library.sc.next();
		// 2. �迭�� �����ϸ� �α��� ���� 
		for(int i=0; i<Library.userArray.length; i++) {
			if(Library.userArray[i] != null &&
					Library.userArray[i].getU_id().equals(u_id) &&
					Library.userArray[i].getU_id().equals(u_pws)) {
				return u_id; // �α��� ������ ���̵� ��ȯ 
			}
		}
		return null; // �α��� ����
	}
		
		//4. ���̵� ã�� �޼ҵ� (�̸�, ����ó �Է¹޾� => ���̵� �˷��ֱ�)
	public static String findid() {
		System.out.println("���̵� ã��");
		System.out.println("ȸ�������Ͻ� �̸��� �Է��ϼ��� :"); String u_name = Library.sc.next();
		System.out.println("ȸ�������Ͻ� ����ó�� �Է��ϼ��� :"); String u_phone = Library.sc.next();
		
		System.out.println("��Ī------------------------");
		// �迭 �� �̸� ���� Ȯ���ϱ�
		for(int i=0; i<Library.userArray.length; i++) {
			if(Library.userArray[i] != null &&
					Library.userArray[i].getU_id().equals(u_name) &&
					Library.userArray[i].getU_phone().equals(u_phone)) {
				return Library.userArray[i].getU_id(); // �α��� ������ ���̵� ��ȯ 
			}
		}
		return null; // ��ȯ�� : ã������� => ���̵�/ ���н� null
	}
	
	//5. ��й�ȣã�� �޼ҵ� (���̵�, ����ó �Է¹޾� => ��й�ȣ �˷��ֱ�)
	public static String findpw() {
		System.out.println("��й�ȣ ã��");
		System.out.println("ȸ�������Ͻ� ���̵� �Է��ϼ��� :"); String u_id = Library.sc.next();
		System.out.println("ȸ�������Ͻ� ����ó�� �Է��ϼ��� :"); String u_phone = Library.sc.next();
		
		System.out.println("��Ī------------------------");
		// �迭 �� �̸� ���� Ȯ���ϱ�
		for(int i=0; i<Library.userArray.length; i++) {
			if(Library.userArray[i] != null &&
					Library.userArray[i].getU_name().equals(u_id) &&
					Library.userArray[i].getU_phone().equals(u_phone)) {
				return Library.userArray[i].getU_pws(); // �α��� ������ ��й�ȣ ��ȯ 
			}
		}
		return null; // ��ȯ�� : ã������� => ��й�ȣ/ ���н� null
	}
	//6. ���̵� üũ(�ߺ�üũ) �޼ҵ�
	public static boolean idcheck(String check_id) {
		for(int i = 0; i<Library.userArray.length; i++) {
			if(Library.userArray[i] != null && Library.userArray[i].getU_id().equals(check_id)) {
				return true;
			}
		}
		return false;
	}
	
	// get, set �޼ҵ� ���
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_pws() {
		return u_pws;
	}
	public void setU_pws(String u_pws) {
		this.u_pws = u_pws;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	


	
	

	
}

