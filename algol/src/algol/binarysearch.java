package algol;

import java.util.Scanner;

public class binarysearch {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 이진 검색합니다.
		static int binSearch(int[] a, int n, int key) {
			int pl = 0;			// 검색 범위의 첫 인덱스
			int pr = n - 1;		// 검색 범위의 끝 인덱스

			do {                            // do while문 무조건 한번 실행 후 조건 검사 후 반복 결정 
				int pc = (pl + pr) / 2;		// 중앙 pc 값 찾기
				if (a[pc] == key)
					return pc;				// 검색 성공하면 중앙 pc==key값을 반환
				else if (a[pc] < key)
					pl = pc + 1;			// 중앙값이 찾는 키값보다 작다면 pl 왼쪽 값의 범위를 뒤쪽 절반으로 잡는다.
				else
					pr = pc - 1;			// 검색 범위를 앞쪽 절반으로 좁힘
			} while (pl <= pr);

			return -1;						// -1 반환 검색 실패 
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("요솟수：");
			int num = sc.nextInt();
			int[] x = new int[num];				// 요솟수 크기 지정

			System.out.println("오름차순으로 입력하세요.");

			System.out.print("x[0]：");			/////////////////////////////////////////////////st
			x[0] = sc.nextInt();

			for (int i = 1; i < num; i++) {
				do {
					System.out.print("x[" + i + "]：");  // x[0] 부터 값을 가져오는게 살짝 이해가 안되려고 하네.. 
				} while (x[i] < x[i - 1]);		// do while문은 먼저 실행을 하고나서 조건문을 따지기때문에
												// x[i] < x[i-1] 와 같이 저장된 x[i] 값이 x[i-1]보다 작다면 해당 구문 반복 
			}
												
			System.out.print("검색할 값：");		// 키값을 입력
			int ky = sc.nextInt();

			int idx = binSearch(x, num, ky);	// 배열x에서 값이 ky인 요소를 검색

			if (idx == -1)
				System.out.println("그 값의 요소가 없습니다.");
			else
				System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
		}
}
