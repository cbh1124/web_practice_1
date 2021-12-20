package algol2;

import java.util.Scanner;

public class BubbleSort {
	
	// a[idx1] a[idx]의 값을 바꿔줌
	// 임시변수 t에 값을 저장 이후 a[1]에 a[2]값을 넣어줌 이후 a[2]값을 임시변수 t 값을 가져와서 저장 
	static void swap(int[] a, int idx1, int idx2) { // (요소의 크기 지정, 왼쪽 요소, 오른쪽 요소 ) 
		int t = a[idx1];  // 임시 변수 선언 t = [1]   
		a[idx1] = a[idx2]; // ex ) a[1]= a[2]
		a[idx2] = t;	// 			a[2] =t 
	}
	
	// 크기 배열 객체 전달, 요소 크기 전달 
	static void bubbleSort(int[] a, int n) {  // 요소 개수가 5개 4번 교환 시도 할거인데 4번중 1번에서 
		for(int i = 0; i< n-1; i++) {    	 	//  n-1은 요소수 크기의 -1(해당 값은 교환시도 횟수) 요소크기만큼 반복하겠다 선언
			for(int j = n - 1; j > i; j--) {    // 시작포인트는 요소수 크기-1부터 시작해서  
				if(a[j-1]> a[j]) {
					swap(a , j-1, j); // (요소의 크기 지정, 왼쪽 요소, 오른쪽 요소) 
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("버블 정렬 (버전 1)");
		System.out.print("요솟수 : ");
		int nx = sc.nextInt();
		int[] x = new int[nx]; // 요소의 갯수를 추가
		
		
		for(int i = 0; i<nx; i++) { //
			System.out.println("x[" + i +"] :"); // 요소 갯수만큼 생성 [요소 크기]
			x[i] = sc.nextInt(); // 요소[1] ~ 요소 [nx]만큼 데이터 삽입 
		}
		
		bubbleSort(x , nx);// 크기 배열 객체 전달, 요소 크기 전달
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i = 0; i< nx; i++) {
			System.out.println("x[" + i + "]=" + x[i]);
		}
		
		
	}
}
