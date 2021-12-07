package algol;

import java.util.Scanner;

public class stackex {
	String m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 데이터 입력
		stack s = new stack(4);	

		while (true) {
			System.out.println("마지막 위치추적 경로 찾기");
			System.out.println("메뉴 1. 경로 입력하기 2. 마지막 위치 찾기");
			
			
			int menu = sc.nextInt();
			int x = 0;
			String m;
			if(menu == 1) {
				System.out.print("(1)안산　(2)안양　(3)수원　" +
						  "(4)시흥　");
				System.out.println("이동 경로를 입력해주세요 (문자열로) ");
				m = sc.next();
				x = rsw(m);
				
				try {
					s.push(x);
				}catch (queue.OverflowIntQueueException e) {
					System.out.println("이동경로의 한계입니다.");
				}
				
			}
			if(menu == 2) {
				try {
			 		x = s.peek();				// 피크 : 스택 정상의 데이터 값을 가져옴 
			 		m = rsw2(x);
					System.out.println("위치의 마지막 경로는\r" + m + "입니다.");
			 	} catch (stack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				
			}
		}
	}
	
	public static int rsw(String m) {
		
		if(m.equals("안산")) {
			return 1; 
		}
		else if(m.equals ("안양")) {
			return 2; 
		}
		else if(m.equals ("수원")) {
			return 3; 
		}
		else if(m.equals("시흥")) {
			return 4; 
		}
		else return 0;
	}
	
	public static String rsw2(int x) {
		
		if(x == 1) {
			return "안산"; 
		}
		else if(x == 2) {
			return "안양"; 
		}
		else if(x == 3) {
			return "수원"; 
		}
		else if(x == 4) {
			return "시흥"; 
		}
		else return null;
	}
}
