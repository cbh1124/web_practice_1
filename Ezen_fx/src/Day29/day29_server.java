package Day29;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class day29_server {
	
	// ��ſ� ���� ����� 
		// 1. ���� ���� ����� [ ServerSocketŬ���� ]
			// ���� : pc���� ��� ������ [ server������ ����Ͽ� client�� ����]
	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.168.102.50" , 5000));
			while(true) {
				System.out.println("[[ �������� ���� ����� ]]1 ");
				Socket socket = serverSocket.accept(); // 3. accept() : Ŭ���̾�Ʈ ��û�� ����
				
				// 4. ������ Ŭ���̾�Ʈ ���� Ȯ��
				InetSocketAddress socketAddress = (InetSocketAddress)socket.getRemoteSocketAddress();
				System.out.println(" [[  Ŭ���̾�Ʈ�� ������ �Ϸ�Ǿ����ϴ�. Ŭ���̾�Ʈ ���� : " + socketAddress.getHostName() );
				
				// ������ �����ϱ� [ �ޱ� ] : ��Ʈ���� �̿��� �ܺ� ��Ʈ��ũ ��� 
				InputStream inputStream = socket.getInputStream(); // ���� �Է� ��Ʈ�� 
				byte[] bytes = new byte[1000];
				inputStream.read(bytes);
				System.out.println(" Ŭ���̾�Ʈ�� �޽��� : " + new String(bytes));
				// ������ �۽��ϱ� [ ������ ] 
				OutputStream outputStream = socket.getOutputStream();
				Scanner scanner  = new Scanner(System.in);
				System.out.println(" Ŭ���̾�Ʈ���� ���� �޽��� : ");
				String msg = scanner.nextLine();
				OutputStream outStream = socket.getOutputStream();
				outputStream.write(msg.getBytes());
			}
		} catch (Exception e) { }
		
	}
}
