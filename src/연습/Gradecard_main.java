package ����;

import java.util.ArrayList;
import java.util.Scanner;

public class Gradecard_main {
	/*
	 *  1. �����ʹ� Ű����� �Է¹޾� �迭�� �����մϴ� .
	 *  2. ���� �Է��� 5������ �ϵ� ������ �Է��� �����ϵ��� �ۼ��մϴ�.
	 *  3. ��ȣ, �̸�, ����, ����, ������ �Է��ϰ�, ������ ����� ���Ͽ� ����մϴ�.
	 *  4. ����� �Ҽ��� ���� 2�ڸ������� �մϴ�.
	 *  5. ������ �̿��Ͽ� ������ ���մϴ�.
	 *  6. �Է� ������ ���Ͽ� ���ܹٻ� ��Ȳ�� ���� ó�����մϴ�. 
	 *  
	 *  �ش� ������ Ǫ�� �ð� 50�� 
	 *  
	 *  ��ŸƮ �迭 ���� = ��ü�� ���� ������ �� 
	 *  ��ȣ �̸� ���� ���� ������ �Է��ϰ�, ������ ����� �ڵ�        ���� : ��ȣ , �̸�, ����, ����, ����  5�� ���� ����
	 *  
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� ����Ʈ ���� : �л� ������ ��� Ŭ���� 
		ArrayList<Gradecard> students = new ArrayList<>();
		
		while(true) {
			System.out.println("1.��������  2.������ȸ");
			int ch = sc.nextInt();
			if(ch == 1) {
				System.out.println("��ȣ�� �Է��ϼ���!! >>>"); int numbers = sc.nextInt();
				System.out.println("�̸��� �Է��ϼ��� !! >>>"); String name = sc.next();
				System.out.println("���� ������ �Է��ϼ���  >>>"); int kor = sc.nextInt();
				System.out.println("���� ������ �Է��ϼ��� >>>"); int eng = sc.nextInt();
				System.out.println("���� ������ �Է��ϼ��� >>>"); int math = sc.nextInt();
				int sumpoint = kor + eng + math; int avg = sumpoint/3; 
				
				Gradecard student = new Gradecard(numbers, name, kor, eng, math,sumpoint,avg, null);
				
				for(int i = 0; i<students.size(); i++) {
					for(int j = 0; j<students.size(); i++) {
						if(students.get(i).getSumpoint() > students.get(j).getSumpoint()) {
							int temp = students.get(i).getSumpoint();
							students.get(i).setSumpoint(students.get(j).getSumpoint());
							students.get(j).setSumpoint(temp);
						}
					}
					// students.get(i).setRank();
				}
				
				 students.add(student); System.out.println("���������� �������� �Ϸ�");
				 
			}
			if(ch == 2) {
				System.out.println("----------------------------------------");
				System.out.println("����ǥ ");
				System.out.println("----------------------------------------");
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t����\t���\t����"        );
				for(Gradecard temp : students) {
					System.out.println(temp.getNumbers()+"\t"+temp.getName()+"\t"+ temp.getKor()
					+"\t"+temp.getEng()+"\t"+temp.getMath());
				}
				System.out.println("----------------------------------------");
			}

		}
		
		
		
	}
}
