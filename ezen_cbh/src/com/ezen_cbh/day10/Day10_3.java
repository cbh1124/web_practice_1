package com.ezen_cbh.day10;

public class Day10_3 {
	public static void main(String[] args) {
		// p.394 : ��øŬ���� 
		
		A a = new A(); // AŬ������ �޸��Ҵ�ɶ� ��ø�� Ŭ�������� �޸��Ҵ�X 
			//a.method(); // D��ü�� �����Ǿ����ϴ�.
		// 2. �ν��Ͻ� ��� Ŭ���� ��ü ���� 
		A.B b = a.new B(); // �ν��Ͻ� Ŭ���� // B��ü�� �����Ǿ����ϴ�.
		//A.B b2 = new A.B(); // ���� Ŭ���� static�� �ƴϱ⶧���� �۵�����
			b.field1 = 3;
			b.method1();
			
		// 3. ���� ��� Ŭ���� ��ü ���� 
			
		A.C c = new A.C(); // C��ü�� �����Ǿ����ϴ�.
		c.field1 = 3;
		c.method1();
		
		A.C.field2 = 3; // static : ��ü �������� ���� ����
		A.C.method2();
		
		
		// 4. ���� Ŭ���� ��ü ����
		a.method();
	}
}
