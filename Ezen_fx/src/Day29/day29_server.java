package Day29;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class day29_server {
	
	// 통신용 서버 만들기 
		// 1. 서버 소켓 만들기 [ ServerSocket클래스 ]
			// 소켓 : pc간의 통신 종착점 [ server소켓이 허락하여 client와 연결]
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.168.102.50" , 5000));
			while(true) {
				System.out.println("[[ 서버에서 연결 대기중 ]]1 ");
				Socket socket = serverSocket.accept(); // 3. accept() : 클라이언트 요청시 수락
				
				// 4. 수락된 클라이언트 소켓 확인
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println(" [[  클라이언트와 연결이 완료되었습니다. 클라이언트 정보 : " + socketAddress.getHostName() );
				
				// 데이터 수신하기 [ 받기 ] : 스트림을 이용한 외부 네트워크 통신 
				InputStream inputStream = socket.getInputStream(); // 소켓 입력 스트림 
				byte[] bytes = new byte[1000];
				inputStream.read(bytes);
				System.out.println(" 클라이언트의 메시지 : " + new String(bytes));
				// 데이터 송신하기 [ 보내기 ] 
				OutputStream outputStream = socket.getOutputStream();
				Scanner scanner  = new Scanner(System.in);
				System.out.println(" 클라이언트에게 보낼 메시지 : ");
				String msg = scanner.nextLine();
				OutputStream outStream = socket.getOutputStream();
				outputStream.write(msg.getBytes());
			}
		} catch (Exception e) { }
		
	}
}
