package test;

import java.util.Scanner;

// 배열생성 
// 입력생성 

// 1. 계좌 생성 2. 계좌 목록 3. 예금 4. 출금 5. 종료 

public class BankAapplication {
	private static Account[] ac  = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		int ch = 0;
		boolean run = true;
		while(run) {
			System.out.println("-----------------------------------------");
			System.out.println("은행 전산시스템");
			System.out.println("1. 계좌 생성 2. 계좌 목록 3. 예금 4. 출금 5. 종료");
			System.out.println("-----------------------------------------");
			
			ch = sc.nextInt();
			// 계좌 생성 
			if(ch == 1) {
				createA();
			}
			// 계좌 목록
			else if(ch == 2) {
				listA();
			}
			// 예금
			else if(ch == 3) {
				// 메소드 입력
			}
			// 출금
			else if(ch == 4) {
				
			}
			// 종료 
			else if(ch == 5) {
				run = false;
			}

		}
		System.out.println("시스템을 종료하셨습니다.");
	}
	
	
	private static void createA() {
		System.out.println("-----------------------------------------");
		System.out.println("계좌 생성을 선택하셨습니다.");
		System.out.println("-----------------------------------------");
		
		System.out.println("계좌입력 : "); String ago = sc.next();
		System.out.println("계좌주 : ");	String owner = sc.next();
		System.out.println("초기 계좌 금액 입력 : "); int balance = sc.nextInt();
		// 초기 계좌 금액을 밸런스에 넣고 저장 
		
		Account account = new Account(ago,owner,balance);
		
		for(int i=0; i<ac.length;i++ ) {
			if(ac[i] == null) {
				ac[i] = account;
				System.out.println("계좌 생성 완료");
				break;
			}
		}
			
	}
	
	// 계좌목록보기 
	// 계좌 리스트를 배열에서 반복문으로 다가져온다음에 
	// null이 나오면 순서상 마지막 배열저장전의 값이기때문에 그때 정지
	// null이 나오기전에는 배열 하나씩 출력 / 따라서 ac배열의 값을 null값이 나올때까지 돌린다음 배열 출력
	private static void listA() {
		System.out.println("-----------------------------------------");
		System.out.println("계좌 리스트 출력");
		System.out.println("-----------------------------------------");
		
		for(int i = 0; i<ac.length; i++) {
			if(ac[i] == null) {
				break;
			}
		System.out.println(ac[i].getAgo() +"\t" + ac[i].getOwner()+ "\t"+ ac[i].getBalance());		
			
		}
	}
	//??????????????????????????????????????????????????애매하군.. 
	private static Account findAccount(String ago) {
		Account accout = null;
		for(int i = 0; i<ac.length; i++) {
			if(ac[i] != null) {
				if(ac[i].getAgo().equals(ago)) {
					account = ac[i];
					break;
				}
			}
		}
		return account; 
	}
	// 예금    
	/*
	 * 예금 -> 입력 : 계좌번호 예금액 -> 계좌번호 일치 확인 ->
	 * */
	private static void setA() {
		System.out.println("-----------------------------------------");
		System.out.println("예금");
		System.out.println("-----------------------------------------");
		
		//입력
		System.out.println("계좌번호를 입력하세요 : "); String.ago = sc.next();
		System.out.println("예금액을 입력하세요 : "); String.owner = sc.next();
		
		// 2. 입력받은 계좌 번호 일치
		for(i=0;i<ac.length;i++) {
			
		}
	}
		
}
	
	


