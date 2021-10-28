package com.ezen_cbh.day10;

public class Day10_1 {
	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());
	}
	private static void dbwork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	public static void main(String[] args) {
		
		// p.386 
			// 1. 3[ �������̽��� ����� �޼ҵ常 ����]
			// 2. 4[ ������ü�� �������̽��� �ڵ� ��ȯ]
			// 3. 
		printSound(new Cat());
		printSound(new Dog() );
			// 4.
		dbwork(new OracleDao());
		dbwork(new MysqlDao());
			// 5. �͸� ���� ��ü 
			// �������̽��� ������ = new �������̽���(){ ���� };
		Action �ƹ��ų� = new Action() {
			@Override
			public void work() {
				System.out.println("���縦 �մϴ�");
			}
		}; // ������
		
				// �������̽� ����
			�ƹ��ų�.work();
	}
}
