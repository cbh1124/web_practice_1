package com.ezen_cbh.day10;

public class Day10_5 {
	
	public static void main(String[] args) {
		Anonymous annonymous = new Anonymous();
		
		annonymous.field.wake(); // �͸� �ڽ� ��ü �� �޼ҵ� ȣ�� 
		annonymous.method1(); // ��ü�� �޼ҵ� ȣ�� => �޼ҵ峻 �͸�ü 
		annonymous.method2(
				
				new Person() {
					void study() {
						System.out.println("�����սô�");
					}
					@Override
					void wake() {
						System.out.println("8�ÿ� �Ͼ�ϴ�");
						study();
					}
				}
		);
		
	}
}
