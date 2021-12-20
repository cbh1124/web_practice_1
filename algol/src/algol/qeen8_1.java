package algol;

public class qeen8_1 {
	// 실행될때 모든 경우의 수를 찾는거임 8의 8승 만큼 
	static int[] pos = new int[8];	// 각 열의 퀸의 위치

	// 각 열의 퀸의 위치를 출력
	static void print() {
		for (int i = 0; i < 8; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();
	}

	// i열에 퀸을 놓는 set 메서드  
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			pos[i] = j;			// 퀸을 j행에 배치
			if (i == 7)			// 모든 열에 배치
				print();
			else
				set(i + 1);		// 다음 열에 퀸을 배치
		}
	}

	public static void main(String[] args) {
		set(0);					// 0열에 퀸을 배치
	}
}
/*
 *  배열 pos는 퀸의 배치를 나타냄 i열에 놓인 퀸의 위치가 j행 이면 pos[i]의 값은 j임
 *  EX ) pos[1]의 값 4는 1열의 퀸이 4행에 배치된 상태 
 *  set메서드는 pos[i]에 0부터 7까지의 값을 순서대로 대입해서 i열에 퀸을 개만 배치하는 8가지 조합을 만드는 재귀 함수 
 * 
 */