package algol;

import java.util.Scanner;

public class stacktest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 데이터 입력
		stack s = new stack(64);	// 64개의 크기의 스택 생성 해당 값은 stack생성자에서 64개의 용량을 생성 

		while (true) {
			System.out.println("현재 데이터 수：" + s.size() + " / "
															  + s.capacity());
			System.out.print("(1)푸시　(2)팝　(3)피크　" +
								  "(4)덤프　(0)종료：");

			int menu = sc.nextInt();
			if (menu == 0) break;

			int x;
			switch (menu) {
			 case 1: 							
				System.out.print("데이터：");
				x = sc.nextInt();
				try {
					s.push(x);					// 푸시
			 	} catch (stack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			 case 2: 							
				try {
			 		x = s.pop();				// 팝
					System.out.println("팝한 데이터는 " + x + "입니다.");
			 	} catch (stack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 3: 							
				try {
			 		x = s.peek();				// 피크 : 스택 정상의 데이터 값을 가져옴 
					System.out.println("피크한 데이터는 " + x + "입니다.");
			 	} catch (stack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			 case 4: 							// 데이터 전부 가져와서 출력 근데 밑에서부터 위로 출력 ??? 
				 								// 스택이라고 하면 뭔가 비효율적인 자료구조인것 같은데 그냥 다가져오면 배열 가져오는거 아닌가
				s.dump();
				break;
			}
		}
	}
}
