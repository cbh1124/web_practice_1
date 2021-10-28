package com.ezen_cbh.day17;

import java.util.ArrayList;
import java.util.Scanner;

public class Gradecard_main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList <Gradecard> students = new ArrayList<>();
		
		while(true) {
			try {
				System.out.println("1. �������� 2. �������"); int ch = sc.nextInt();
				
				if(ch == 1) {
					System.out.println("��ȣ : "); int num = sc.nextInt();
					System.out.println("�̸� : "); String name = sc.next();
					System.out.println("���� : "); int kor = sc.nextInt();
					System.out.println("���� : "); int eng = sc.nextInt();
					System.out.println("���� : "); int math = sc.nextInt();
					int sum = kor + eng + math; double avg = sum/3.0;
					int rank = 1;
					
					Gradecard student = new Gradecard(num, name, kor, eng, math, sum, avg, rank);
					students.add(student); System.out.println("������ ���������� ���ԵǾ����ϴ�.");
					
					for(int i=0; i<students.size(); i++) {
						for(int j=0; j<students.size(); j++) {
							if(students.get(i).getSum()< students.get(j).getSum()) {
								rank++;
								students.get(i).setRank(rank);
							}
						}
						rank = 1;
					}
					
				}
				
				if(ch == 2) {
					System.out.println("-----------------------------------------------------------");
					System.out.println("\t\t\t��\t��\tǥ");
					System.out.println("-----------------------------------------------------------");
					System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
					System.out.println("-----------------------------------------------------------");
					for(Gradecard temp : students) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n", temp.getNum(), temp.getName(), temp.getKor(), temp.getEng(),
								temp.getMath(), temp.getSum(), temp.getAvg(), temp.getRank() );
					}
					System.out.println("-----------------------------------------------------------");
				}
			}catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("[�˸�] : �Է¿����Դϴ�.");
			}

			
		}
	}
}
