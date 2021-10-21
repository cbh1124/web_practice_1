package 연습;

import java.util.ArrayList;
import java.util.Scanner;

public class Gradecard_main2 {
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Gradecard2> students = new ArrayList<>();
		
		while (true) {
			try {
				System.out.println("1.성적기입 2.성적출력"); int ch = sc.nextInt();
				
				if(ch == 1) {
					System.out.println("번호 : "); int num = sc.nextInt();
					System.out.println("이름 : "); String name = sc.next();
					System.out.println("국어 : "); int kor = sc.nextInt();
					System.out.println("영어 : "); int eng = sc.nextInt();
					System.out.println("수학 : "); int math = sc.nextInt();
					int sum = kor + eng + math; 
					double avg = sum/3; 
					int rank =1;
					
					Gradecard2 gradecard2 = new Gradecard2(num,name,kor,eng,math,sum,avg,rank);
					students.add(gradecard2); System.out.println("성공적으로 점수가 기입되었습니다.");
					
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
						System.out.println("\t\t성적표");
						System.out.println("------------------------------------------");
						System.out.printf("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차\n");
					for(Gradecard2 temp : students ) {
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",temp.getNum(), temp.getName(),
								temp.getKor(),temp.getEng(), temp.getMath(), temp.getSum(), temp.getAvg(), temp.getRank() );
						
					}
					
					
				}
			}catch (Exception e) {
				sc = new Scanner(System.in);
				System.out.println("입력오류입니다. 다시 입력해주세요");

			}
			
			
		}
	}
}
