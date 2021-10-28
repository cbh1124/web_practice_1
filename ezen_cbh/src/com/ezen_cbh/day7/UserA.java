package com.ezen_cbh.day7;

public class UserA {
	//1. 필드
	private String u_id;
	private String u_pws;
	private String u_name;
	private String u_phone;
	// 2. 생성자
	public UserA(String u_id, String u_pws, String u_name, String u_phone) {
		this.u_id = u_id;
		this.u_pws = u_pws;
		this.u_name = u_name;
		this.u_phone = u_phone;
	}
	// 2. 빈생성자 
		// 2. 회원가입 메소드 [입력받은 정보로 객체 생성해서 배열에 저장]
	public UserA() {
		
	}
	//3. 메소드 [동작]
		// 2. 회원가입 메소드 [입력받은 정보로 객체 생성해서 배열에 저장]
	public static boolean signup() {
		// public: main이 속한 클래스 (외부클래스) 로 호출하기 위해 
		// 반환값 : 회원가입성공/실패 => true/false
		
		System.out.println("회원 가입 창 입니다."); 
		System.out.println("아이디를 입력하세요 : "); String u_id = Library.sc.next();
			//아이디 중복체크
			boolean check = idcheck(u_id);
			if(check) {
				System.out.println("사용할수 없는 아이디 입니다.");
				return false; // 회원가입 실패
			}
		System.out.println("비밀번호를 입력하세요 :  "); String u_pws = Library.sc.next();
		System.out.println("이름을 입력하세요 : "); String u_name = Library.sc.next();
		System.out.println("전화번호를 입력하세요 ; "); String u_phone = Library.sc.next();
		
		// 객체 생성 [ 입력받은 변수값을 객체 생성자에 넣음 ]
		UserA userA = new UserA(u_id, u_pws, u_name, u_phone);
		
		// 배열저장 [ 배열 내 빈공간을 찾아서 해당 회원가입 값을 저장 ]
		for(int i = 0; i<Library.userArray.length; i++) {
			// 
			if(Library.userArray[i] == null) {
				Library.userArray[i] = userA;
				return true; // 회원가입 성공
			}
		}
		return false; 
	}
		// 3. 로그인 메소드[입력받은 아이디와 비밀번호가 배열내 존재하면 로그인 성공 아니면 실패]
	public static String login() {
		// 반환값 : 로그인 성공시 => 성공한 아이디 /실패시 null
		System.out.println("-----------로그인 페이지 -----------");
		System.out.println("아이디 : "); String u_id = Library.sc.next();
		System.out.println("비밀번호 : "); String u_pws = Library.sc.next();
		// 2. 배열내 존재하면 로그인 성공 
		for(int i=0; i<Library.userArray.length; i++) {
			if(Library.userArray[i] != null &&
					Library.userArray[i].getU_id().equals(u_id) &&
					Library.userArray[i].getU_id().equals(u_pws)) {
				return u_id; // 로그인 성공시 아이디 반환 
			}
		}
		return null; // 로그인 실패
	}
		
		//4. 아이디 찾기 메소드 (이름, 연락처 입력받아 => 아이디 알려주기)
	public static String findid() {
		System.out.println("아이디 찾기");
		System.out.println("회원가입하신 이름을 입력하세요 :"); String u_name = Library.sc.next();
		System.out.println("회원가입하신 연락처를 입력하세요 :"); String u_phone = Library.sc.next();
		
		System.out.println("매칭------------------------");
		// 배열 내 이름 존재 확인하기
		for(int i=0; i<Library.userArray.length; i++) {
			if(Library.userArray[i] != null &&
					Library.userArray[i].getU_id().equals(u_name) &&
					Library.userArray[i].getU_phone().equals(u_phone)) {
				return Library.userArray[i].getU_id(); // 로그인 성공시 아이디 반환 
			}
		}
		return null; // 반환값 : 찾았을경우 => 아이디/ 실패시 null
	}
	
	//5. 비밀번호찾기 메소드 (아이디, 연락처 입력받아 => 비밀번호 알려주기)
	public static String findpw() {
		System.out.println("비밀번호 찾기");
		System.out.println("회원가입하신 아이디를 입력하세요 :"); String u_id = Library.sc.next();
		System.out.println("회원가입하신 연락처를 입력하세요 :"); String u_phone = Library.sc.next();
		
		System.out.println("매칭------------------------");
		// 배열 내 이름 존재 확인하기
		for(int i=0; i<Library.userArray.length; i++) {
			if(Library.userArray[i] != null &&
					Library.userArray[i].getU_name().equals(u_id) &&
					Library.userArray[i].getU_phone().equals(u_phone)) {
				return Library.userArray[i].getU_pws(); // 로그인 성공시 비밀번호 반환 
			}
		}
		return null; // 반환값 : 찾았을경우 => 비밀번호/ 실패시 null
	}
	//6. 아이디 체크(중복체크) 메소드
	public static boolean idcheck(String check_id) {
		for(int i = 0; i<Library.userArray.length; i++) {
			if(Library.userArray[i] != null && Library.userArray[i].getU_id().equals(check_id)) {
				return true;
			}
		}
		return false;
	}
	
	// get, set 메소드 사용
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_pws() {
		return u_pws;
	}
	public void setU_pws(String u_pws) {
		this.u_pws = u_pws;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	


	
	

	
}

