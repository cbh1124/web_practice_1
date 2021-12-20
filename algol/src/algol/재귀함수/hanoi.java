package algol;

import java.util.Scanner;

public class hanoi {
	
	// 분할 정복법으로 3가지의 해결법으로 작은 문제를 나눠서 전체문제를 풀이 했음 
	static void move(int no, int x, int y) {
		if (no > 1)  // 원반의 갯수가 1이상이면 
			move(no - 1, x, 6 - x - y);  // 먼저 원반의 갯수를 하나 줄이고 1번 기둥  6-x-y는 총 번호 기둥에서 카운팅 하는 식
											// 초기에는 x와 y를 알면 값이 2가 나오면서 해당 값을 다음 하노이 탑 move에 전달 n,1,2 -> n,1,1 
		System.out.println("원반[" + no + "]을 " + x + "기둥에서 " + y + "기둥으로 옮김");

		if (no > 1)
			move(no - 1, 6 - x - y, y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 값 입력
		System.out.println("하노이의 탑"); 
		System.out.print("원반 개수：");
		int n = sc.nextInt(); 
		move(n, 1, 3);   // 전달 1번 기둥의 n개의 원반을 3번기둥으로 옮긴다 why? : 
		
		// 1. 바닥 원반을 제외한 그룹을 시작 기둥에서 중간 기둥으로 옮깁니다.
		// 2. 바닥 원반 no를 시작 기둥에서 목표기둥으로 옮겼음을 출력합니다.
		// 3. 바닥 원반을 제외한 그룹을 중간 기둥에서 목표기둥으로 옮깁니다. 
		// 처음에는 바닥원반을 제외한 그룹이라는게 핵심.. 
		
		// 1. 그룹을 시작 기둥에서 중간 기둥으로 
		// 2. 시작 기둥의 바닥원반을 목표기둥으로 
		// 3. 중간기둥으로 이동된 그룹을 목표기둥으로 옮김 
		
	}
}
