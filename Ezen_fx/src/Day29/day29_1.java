package Day29;

import java.net.InetAddress;

public class day29_1 {
	// ��Ʈ��ũ : �� �� �̻��� ��ǻ�͵��� �����ϰ� ����Ҽ� �ִ� �� 
		// ��Ÿ� : ���ڽ�ȣ�� ���� ����ϴ� ��� ��Ⱑ ���� ����ϱ� ���� �ϳ��� �� 
			// LAN, MAN, WAN 
	
	public static void main(String[] args) {
		// 1. ���� PC�� ȣ��Ʈ �������� (192.168.17.33)
		try {
			InetAddress inetAddress = InetAddress.getLocalHost(); 
			System.out.println("���� PC�� ������ü : " + inetAddress);
			System.out.println("INET host :  " + inetAddress.getHostName());
			System.out.println("INET �ּ� : " + inetAddress.getHostAddress());
			
		// 2. ���̹� ȸ���� ȣ��Ʈ �������� 
			InetAddress inetAddress2 = InetAddress.getByName("www.naver.com");
			System.out.println("���̹��� pc ��ü : " + inetAddress2);
			System.out.println("���̹� PC�� �̸� : " + inetAddress2.getHostName());
			System.out.println("���̹� PC�� �ּ� : " + inetAddress2.getHostAddress());
			
		// 3. 
		} catch (Exception e) {
			
		}
		
		
	}
}
