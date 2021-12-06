package algol;

import java.util.Scanner;

public class search {
	static int seqSearch(int[] a, int n, int key) {
		int i = 0;
		
		while(true) {               
			if(i == n)           // 요솟수의 크기만큼 돌리기위한 i다. 
								// [ 현재 지정크기를 서치할 넘버가 넘어선다면 요소가 없다고 판단]
				return -1;   
			if(a[i] == key)    // 검색할 값과 요솟수 서치값이 같으면 해당 요솟수값 반환
				return i;
			i++;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = sc.nextInt();	     //요솟수 개수를 입력 요솟수 크기 지정!!
		int [] x = new int[num];     //요솟수의 개수를 x의 배열크기로 만들겠다. 요소수는 num인 배열
		
		for(int i = 0; i<num; i++) {
			System.out.println("x[" + i + "] :"); // x의 배열  요솟수의 크기만큼 출력 
			x[i] = sc.nextInt();				  // 요솟수의 배열에 값을 다 입력 
		}
		
		System.out.println("검색할 값 : ");
		int ky = sc.nextInt();                   // 검색할 번호[요솟수]를 입력
		
		int idx = seqSearch(x, num, ky);         // 해당 함수 [ 요솟수 , 요솟수의 크기 , 검색할 값] 
		
		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
	}
}
