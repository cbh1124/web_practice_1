package ����;

import java.util.ArrayList;
import java.util.Scanner;

public class Gradecard_main2 {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Gradecard2> students = new ArrayList<>();
		
		while (true) {
			try {
				System.out.println("1.�������� 2.�������"); int ch = sc.nextInt();
				
				if(ch == 1) {
					System.out.println("��ȣ : "); int num = sc.nextInt();
					System.out.println("�̸� : "); String name = sc.next();
					System.out.println("���� : "); int kor = sc.nextInt();
					System.out.println("���� : "); int eng = sc.nextInt();
					System.out.println("���� : "); int math = sc.nextInt();
					int sum = kor + eng + math; 
					double avg = sum/3; 
					int rank =1;
					
					Gradecard2 gradecard2 = new Gradecard2(num,name,kor,eng,math,sum,avg,rank);
					students.add(gradecard2); System.out.println("���������� ������ ���ԵǾ����ϴ�.");
					
					for(int i =0; i<students.size(); i++) {
						for (int j = 0; j<students.size(); j++) {
							if(students.get(i).getSum() < students.get(j).getSum()) {
								rank++;
								students.get(i).setRank(rank);
							}
						}
						rank = 1;
					}	
				}
				if(ch == 2) {
						System.out.println("\t\t����ǥ");
						System.out.println("------------------------------------------");
						System.out.printf("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����\n");
					for(Gradecard2 temp : students ) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",temp.getNum(), temp.getName(),
								temp.getKor(),temp.getEng(), temp.getMath(), temp.getSum(), temp.getAvg(), temp.getRank() );
						
					}
					
					
				}
			}catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("�Է¿����Դϴ�. �ٽ� �Է����ּ���");

			}
			
			
		}
	}
}
