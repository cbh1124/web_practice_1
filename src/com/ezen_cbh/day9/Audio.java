package com.ezen_cbh.day9;

public class Audio implements RemoteControl {
	// implements : 클래스에 인터페이스 연결
	
	// 1. 필드 
	private int volume;
	private boolean mute;
	// 2. 생성자
	// 3. 메소드
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio 켭니다");
		
	}
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio 끕니다");
	}
	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 audio 볼륨 : " + this.volume);
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {System.out.println("오디오 무음 처리 합니다");}
		else {System.out.println("오디오 무음 해제합니다");}
	}
}



// 인터페이스 작성할때  내가 만들고 싶은 기능을 적어놓고 그 기능을 오버라이딩하여 (재정의 하여) 각 기능 해당구조를 실행
// 인터페이스 첫 화면에서 기능들을 한번에 볼수가 있음 