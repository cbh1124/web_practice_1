package Day29;

import java.net.InetAddress;

public class day29_1 {
	// 네트워크 : 두 대 이상의 컴퓨터들을 연결하고 통신할수 있는 것 
		// 통신망 : 전자신호를 통해 통신하는 모든 기기가 서로 통신하기 위한 하나의 망 
			// LAN, MAN, WAN 
	
	public static void main(String[] args) {
		// 1. 현재 PC의 호스트 가져오기 (192.168.17.33)
		try {
			InetAddress inetAddress = InetAddress.getLocalHost(); 
			System.out.println("현재 PC의 정보객체 : " + inetAddress);
			System.out.println("INET host :  " + inetAddress.getHostName());
			System.out.println("INET 주소 : " + inetAddress.getHostAddress());
			
		// 2. 네이버 회사의 호스트 가져오기 
			InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
			System.out.println("네이버의 pc 객체 : " + inetAddress2);
			System.out.println("네이버 PC의 이름 : " + inetAddress2.getHostName());
			System.out.println("네이버 PC의 주소 : " + inetAddress2.getHostAddress());
			
		// 3. 
		} catch (Exception e) {
			
		}
		
		
	}
}
