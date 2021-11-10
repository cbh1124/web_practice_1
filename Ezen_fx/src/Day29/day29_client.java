package Day29;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class day29_client {
	
	// 통신용 클라이언트 서버 만들기
	
	public static void main(String[] args) {
		
		Socket socket = new Socket();
		try {
			while(true) {
				socket.connect(new InetSocketAddress("127.168.102.50", 5000));
				System.out.println("[[ 서버와 연결 성공 ]]1 ");
				
				// 4. 
				Scanner scanner  = new Scanner(System.in);
				System.out.println(" 서버에게 보낼 메시지 : ");
				String msg = scanner.next();
				
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write(msg.getBytes());
				System.out.println(" 서버에게 메시지 전송 성공 ");
				
				InputStream inputStream = socket.getInputStream(); // 소켓 입력 스트림 
				byte[] bytes = new byte[1000];
				inputStream.read(bytes);
				System.out.println(" 서버의 메시지 : " + new String(bytes));
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
