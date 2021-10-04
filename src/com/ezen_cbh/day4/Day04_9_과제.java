package com.ezen_cbh.day4;

import java.util.Scanner;

public class Day04_9_과제 { // cs
	// 2. 회원제 방문록 프로그램
	// [조건1] : 최대 100명을 저장할수 있는 회원 배열[ 아이디 , 비밀번호 ]
	// [조건2] : 초기 메뉴
		// 1. 로그인 
		// 2. 회원가입 
	// [ 회원가입을 선택했을때 ]
		// 1.아이디와 비밀번호를 입력받아 배열에 저장 
		// 2.아이디 중복불가 [ 배열에 기존 아이디가 존재하면 회원가입 실패 ] 
	// [ 로그인을 선택했을때 ]
		// 1. 아이디와 비밀번호를 입력받아 배열내 존재하면 로그인 성공 // 아니면 실패 
	// [ 로그인 성공시 메뉴 ] 
		// 1.방문록 남기기
		// 2. 로그아웃 
	// [ 방문록 남기기 선택했을때 ] 
		// 내용을 입력받아 배열에 저장 [ 내용과 작성자 아이디 저장 ]
		// 기존 방문록 목록 출력 
	// [ 로그아웃 ] 
	//	초기메뉴로 돌아가기 
	public static void main(String[] args) {// ms
		
		Scanner sc = new Scanner(System.in);
		// [조건1] : 최대 100명을 저장할수 있는 회원 배열[ 아이디 , 비밀번호 ]
		String[] id1 = new String[100];
		String[] pw1 = new String[100];
		String[] cyworld = new String[1000];
		String[] cy_log = new String[1000];
		while(true) {
			// [조건2] : 초기 메뉴 1. 로그인 2. 회원가입 
			System.out.println("===========================================");
			System.out.println("1.로그인   2.회원가입 ");
			int choice = sc.nextInt();
			// [ 회원가입을 선택했을때 ]
			// 1.아이디와 비밀번호를 입력받아 배열에 저장 
			// 2.아이디 중복불가 [ 배열에 기존 아이디가 존재하면 회원가입 실패 ] 
			
			// 2. 회원가입
			if(choice == 2) {
				System.out.println("회원 가입에 진입합니다.");
				System.out.println("아이디 : "); String id = sc.next();
				System.out.println("비밀번호 : "); String pw = sc.next();
				
				Boolean check = true; // 중복이 없을경우 true 중복이 있을경우는 false
				// 중복체크 : 만약에 입력한 값이 배열내 동일한 값이 존재하면 다시 입력 
				
				// 중복이 있을경우 회원가입 실패
				for( int i = 0 ; i<id1.length ; i++ ) {
					if( id1[i]!= null && id1[i].equals(id) ) { // 중복찾기 성공 
						System.out.println(" 중복된 아이디가 존재합니다. " );
						System.out.println(" 회원가입 실패" );
						check = false; // 중복이 있는경우 
						break;
					}
				}
				// 중복이 없다면 회원가입 완료
				if(check == true) {
					for(int i = 0; i<id1.length; i++) {
						// 빈 배열에 아이디 패스워드 입력 
						if(id1[i] == null && pw1[i] == null) {
							id1[i] = id;
							pw1[i] = pw;
						}
					}
					System.out.println("회원가입이 완료되었습니다.");
				}
			} // 회원가입 e
			
			// 1. 로그인 
			else if(choice == 1) {
				System.out.println("로그인에 진입합니다.");
				System.out.println("아이디 : "); String id = sc.next();
				System.out.println("비밀번호 : "); String pw = sc.next();
				
				Boolean logcheck = true;
				//로그인 성공
				for (int i = 0; i<id1.length; i++) {
					if(id1[i].equals(id) && pw1[i].equals(pw) && id1[i] != null && pw1[i] != null) {
						System.out.println("로그인에 성공하셨습니다.");
						// [ 로그인 성공시 메뉴 ] 
						// 1.방문록 남기기
						// 2. 로그아웃 
						System.out.println("===== 메뉴 =====");
						System.out.println("1.방문록 남기기 2. 로그아웃");
						
						int logch = sc.nextInt(); // 로그인 성공시 나오는 선택권 
						// [ 방문록 남기기 선택했을때 ] 
						// 내용을 입력받아 배열에 저장 [ 내용과 작성자 아이디 저장 ]
						// 기존 방문록 목록 출력
						
						// 1. 방문록 남기기
						if(logch == 1) {
							for (int s=0; s<cyworld.length; s++) {
								if(cyworld[s] != null) {
									System.out.println("작성자\t방문록");
									System.out.printf("%s\t%s\n",cy_log[s],cyworld[s]);
								}
							}	
								// 빈 배열에 작성자 현재 등록된 방문록 입력
							for(int j=0; j<cyworld.length; j++) {
								if(cyworld[j] == null && cy_log[j] == null) {
									cy_log[j] = id;
									cyworld[j] = sc.next();
									System.out.println("작성자\t방문록");
									System.out.printf("%s\t%s\n",cy_log[j],cyworld[j]);
									break;
								}
							}
							
						}
						
						
						// 2. 로그 아웃
						else if(logch == 2) {
							System.out.println("=====로그아웃=====");
							break;
						}
						// 번호를 이상하게 입력할경우 오류 발생
						else {System.out.println("잘못 입력하셨습니다1.");}
					}
				}
				
				// 로그인 실패
				if(logcheck == false) {
					System.out.println("로그인 실패");
					break;
				}
			
			} //1. 로그인 e
			
			// 번호를 이상하게 입력할경우 오류 발생
			else {System.out.println("잘못 입력하셨습니다2.");}
			
			
		} // 전체 반복 e
		
	} // me

} // ce
