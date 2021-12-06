package algol;
import java.util.Scanner;

public class searchbocho {
	// 요솟수가 n인 배열 a에서 key와 같은 요소를 보초법으로 선형 검색합니다.
		static int searchbocho(int[] a, int n, int key) {
			int i = 0;

			a[n] = key;					// 보초를 추가  a[n]값은 빈값임 why? a[0]~a[n-1] 까지만 값의 입력했음 

			while (true) {
				if (a[i] == key)		// 검색 성공!
					break;
				i++;                    // i가 
			}
			return i == n ? -1 : i;     // 삼항연산자 
										/*(i==n)조건 ? -1(참) : i(거짓)*/	
				
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);

			System.out.print("요솟수：");
			int num = sc.nextInt();					// 요솟수 크기 입력
			int[] x = new int[num + 1];				// 요솟수 크기 + 1

			for (int i = 0; i < num; i++) {	 		// 요솟수 값 입력 ( a[0]~a[n-1] 까지 입력한거임 why ? num전까지 i가 작동 )  
				System.out.print("x[" + i + "]：");
				x[i] = sc.nextInt();
			}

			System.out.print("검색할 값：");			// 키값을 입력
			int ky = sc.nextInt();

			int idx = searchbocho(x, num, ky);		// 배열 x에 ky값을 찾겠다. num는 요솟수 크기를 넘겨줌 

			if (idx == -1)
				System.out.println("그 값의 요소가 없습니다.");
			else
				System.out.println(ky+"은(는) x[" + idx + "]에 있습니다.");
		}
}
