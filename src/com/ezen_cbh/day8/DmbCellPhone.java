package com.ezen_cbh.day8;

public class DmbCellPhone extends CellPhone{
					//extends: 연장하다 // 상속 1개
	// 핸드폰 기본기능 => CellPhone 상혹 
	// 1. 필드
	int channel;
	
	// 2. 생성자
	public DmbCellPhone(String model, String color, int channel) {
			// this : 현재 클래스내 멤버
		//this.model = model; // 부모클래스내 멤버사용
		//this.color = color; // 부모클래스내 멤버사용
		//this.channel = channel; // 본인클래스 멤버 사용
		//  부모 클래스가 생성자 있을때 => super()  키워드를 이용한 부모클래스 생성자 호출
		super(model, color); // super() : 부모 클래스내 생성자 호출
		this.channel = channel;
	}
	
	// 3. 메소드
	void turnOnDmb() {
		System.out.println("채널" + channel + "빈 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDmb(int channel) {
		this.channel = channel;
		// this.channel : 파랑색 => 현재 클래스내 멤버
		// channel : 빨강색 => 메소드에 외부로부터 들어온 변수
		System.out.println("채널 : " + channel + "번으로 바꿉니다");
	}
	
	void turnOffDmb() {System.out.println("DMB 방송 수신을 멈춥니다.");}


	// 오버라이딩 [부모클래스내 메소드 재정의 ] : 자동완성 
	 //재정의 => 코드변경 // @ :  어노테이션 
	@Override
	void powerOn() {
		// super.powerOn();
		System.out.println("전원 메소드 재정의 : DMB폰 켭니다");
	}
	
}	