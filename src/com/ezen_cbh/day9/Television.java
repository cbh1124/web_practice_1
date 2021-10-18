package com.ezen_cbh.day9;

public class Television implements RemoteControl {
	// extends : 설계도 연장
	// implements :  (추상메소드 정의) 구현하다
	
	
	// 1. 필드 
	private int volume;
	// 2. 생성자
	// 3. 메소드 
	
		// 연결된 인터페이스의 추상메소드 정의하기 
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	// ctrl + 스페이스바 : 구현할 추상메소드 목록
	
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	// setVolume() 추상메소드의 실체 메소드 
	
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			// 현재 소음이 최대소음보다 커지면
			this.volume = RemoteControl.MAX_VOLUME;
			// 최대 소음으로 대입하기 [현재소음은 최대소음보다 커질수가 없음]
		}else if (volume < RemoteControl.MIN_VOLUME) {
			// 현재 소음이 최소소음[0]보다 작으면
			this.volume = RemoteControl.MIN_VOLUME;
			// 최소 소음으로 대입하기 [현재소음은 음수가 될수없음]	
		}else {
			this.volume = volume;
		}
		System.out.println("현재 Tv 볼륨 : " + this.volume);
		
	}
}
