package algol;

import java.util.Scanner;

public class queueExam {
	private static queueExam queueexam = new queueExam ();
	public static queueExam getqueueExam() {return queueexam;}
	public static queue s = new queue(100); // 임의의 인큐 생성 큐 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Runnableth obj1 = new Runnableth();
		Thread th1 = new Thread(obj1);
		th1.start();
		
		
		while(true) {
			System.out.println("프린트 대기열 출력 ");
			System.out.println("1. 프린트하기 2. 프린트 대기열 확인 3.현재 진행중인 프린트 0.종료");
			
			int menu = sc.nextInt();
			if(menu == 0) break;
			
			int x;
			
			if(menu == 1) {
				System.out.println("프린트 시도한 pc번호");
				x = sc.nextInt();
				try {
					s.enque(x);
				}catch (queue.OverflowIntQueueException e) {
					System.out.println("프린트 대기열 추가가 불가능합니다.");
				}
				
			}
			
			if(menu == 2) {
				
				System.out.println("전체 프린트 대기열 입니다.");
				s.dump();
				
				 System.out.println("테스트");
			}
			
			if(menu == 3) {
				try {
			 		x = s.peek();
					System.out.println("현재 진행중인 프린트 번호는 " + x + "입니다.");

			 	} catch (queue.EmptyIntQueueException e) {
					System.out.println("프린트 대기열 명단이 존재하지 않습니다.");
				}
				
			}
			

			
			
				
			
		}
	}
}
