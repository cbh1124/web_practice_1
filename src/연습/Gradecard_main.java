package 연습;

import java.util.ArrayList;
import java.util.Scanner;

public class Gradecard_main {
	/*
	 *  1. 데이터는 키보드로 입력받아 배열에 저장합니다 .
	 *  2. 성적 입력은 5명으로 하되 무제한 입력이 가능하도록 작성합니다.
	 *  3. 번호, 이름, 국어, 영어, 수학을 입력하고, 총점과 평균을 구하여 출력합니다.
	 *  4. 평균은 소숫점 이하 2자리까지로 합니다.
	 *  5. 총점을 이용하여 석차를 구합니다.
	 *  6. 입력 오류에 대하여 예외발생 상황에 대한 처리를합니다. 
	 *  
	 *  해당 문제를 푸는 시간 50분 
	 *  
	 *  스타트 배열 저장 = 객체로 만들어서 생성할 것 
	 *  번호 이름 국어 영어 수학을 입력하고, 총점과 평균은 자동        변수 : 번호 , 이름, 국어, 영어, 수학  5개 변수 선언
	 *  
	 * */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 설정 리스트 선언 : 학생 정보를 담는 클래스 
		ArrayList<Gradecard> students = new ArrayList<>();
		
		
		while(true) {
			
			try {
				System.out.println("1.성적기입  2.성적조회");
				int ch = sc.nextInt();
				if(ch == 1) { 
					System.out.println("번호를 입력하세요!! >>>"); int numbers = sc.nextInt();
					System.out.println("이름을 입력하세요 !! >>>"); String name = sc.next(); 
					System.out.println("국어 점수를 입력하세요  >>>"); int kor = sc.nextInt();
					System.out.println("영어 점수를 입력하세요 >>>"); int eng = sc.nextInt();
					System.out.println("수학 점수를 입력하세요 >>>"); int math = sc.nextInt();
					int sumpoint = kor + eng + math; 
					double avg = sumpoint/3.00; 
					int rank = 1;
					
					Gradecard student = new Gradecard(numbers, name, kor, eng, math,sumpoint,avg, rank);
					students.add(student); System.out.println("성공적으로 성적기입 완료");
					
					for(int i = 0; i<students.size(); i++) {
						for(int j = 0; j<students.size(); j++) {
							if(students.get(i).getSumpoint() < students.get(j).getSumpoint()) {
								rank++;
								students.get(i).setRank(rank) ;
							}
						}
						rank = 1;
					} 
				}
				
				if(ch == 2) {
					System.out.println("------------------------------------------------------------");
					System.out.println("\t\t\t"+"성 "+"\t"+"적"+"\t"+"표");
					System.out.println("------------------------------------------------------------");
					System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
					for(Gradecard temp : students) {
						/*
						System.out.println(temp.getNumbers()+"\t"+temp.getName()+"\t"+ temp.getKor()
						+"\t"+temp.getEng()+"\t"+temp.getMath()+"\t"+temp.getSumpoint()+"\t"+temp.getAvg()
						+"\t"+temp.getRank());*/
						
						System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",temp.getNumbers(),temp.getName(),temp.getKor(),
								temp.getEng(), temp.getMath(), temp.getSumpoint(), temp.getAvg(),temp.getRank() );
					}
					System.out.println("------------------------------------------------------------");
				}
			}catch (Exception e) {
				sc= new Scanner(System.in);
				System.out.println("정수를 다시 입력해주세요"); 
			}
		}
		
		
		
	}
}
