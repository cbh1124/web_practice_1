package com.ezen_cbh.day14;

public class Day14_1 {
	public static void main(String[] args) {
		
		// ���׸� : Ÿ�� ��ȯ 
		
		// Member<String> member = new Member(); // MemberŬ������ �Ű� ������ ���� String���� ���� �� 
		// ��Ƽ ���׸� 
		Member<String, Integer> member = new Member(); // MemberŬ������ �Ű� ������ ���� String���� ���� �� 
		
		// p.660
		// ���׸� �޼ҵ� : �޼ҵ�� �տ� ���׸��� ����
		Box<Integer> box1 = Util.<Integer>boxing(100);
		System.out.println(box1.getT() );
		
		Box<String> box2 = Util.boxing("ȫ�浿");
		System.out.println(box2.getT());
	}
}
