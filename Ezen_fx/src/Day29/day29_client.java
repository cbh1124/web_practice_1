package Day29;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class day29_client {
	
	// ��ſ� Ŭ���̾�Ʈ ���� �����
	
	public static void main(String[] args) {
		
		Socket socket = new Socket();
		try {
			while(true) {
				socket.connect(new InetSocketAddress("127.168.102.50", 5000));
				System.out.println("[[ ������ ���� ���� ]]1 ");
				
				// 4. 
				Scanner scanner  = new Scanner(System.in);
				System.out.println(" �������� ���� �޽��� : ");
				String msg = scanner.next();
				
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write(msg.getBytes());
				System.out.println(" �������� �޽��� ���� ���� ");
				
				InputStream inputStream = socket.getInputStream(); // ���� �Է� ��Ʈ�� 
				byte[] bytes = new byte[1000];
				inputStream.read(bytes);
				System.out.println(" ������ �޽��� : " + new String(bytes));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
