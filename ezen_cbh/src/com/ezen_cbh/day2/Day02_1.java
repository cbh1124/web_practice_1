package com.ezen_cbh.day2;

import java.util.Scanner;

public class Day02_1 { // ���� Ŭ������ ���� ��Ű���� 
	// public :  ���� ������ 
				// class :  Ŭ���� ����� ���Ǵ� Ű���� [�̸� ������� �ܾ�]
					// Ŭ������[����] : ù���ڸ� �빮�� (����)
	// �ڵ��ϼ� ����Ű : ctrl + �����̽��� 
	// Ex:  syso // main
	public static void main(String[] args) {
		// main �޼ҵ忡�� main ������ ���� [ ������ : �ڵ带 �о��ִ� ����]
			// main �޼ҵ� ��ȣ �ۿ� �ִ� �ڵ�� ���� �Ұ� 
	
		System.out.println("java");
		// 1. �Է� ��ü ���� [ Ű����κ��� �Է¹��� ���� �����ϴ� ��ü ]
		Scanner �Է°�ü = new Scanner(System.in); // ?????? ����� �س����� ������� üũ
		// 2. next() �޼ҵ带 �̿��� ��ü�� �Է°� ������
		String ���ڿ� = �Է°�ü.next();
		// 3. ��� [ + :  ���Ῥ���� (���� + ���� ���� )
		System.out.println("�Է� ���� : " + ���ڿ� );
			// " " ����ó�� : Ű���� [�̸� ������� �ܾ�] , ��ü, Ŭ������, ����, ���� �� ����
		
	}
}