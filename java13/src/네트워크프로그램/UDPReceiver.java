package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		// 받는 소켓이 있어야 한다. (port)
		DatagramSocket socket = new DatagramSocket(8888); // 전화를 받음
		System.out.println("받을 준비중...");
		
		// 패킷으로 보냈기 때문에 빈 패킷을 만들어두기소
		// => 빈 byte[]
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		
		//소켓이 밧아서 알아서 빈 패킷에 넣는다.
		socket.receive(packet);
		
		// byte[]에 받은 데이터를 String으로 바꾸어준다.
		System.out.println("받은 데이터는 " + new String(data));
		
		socket.close(); // 받았다고 하고 전화 끊기
		
		// 받는 소켓을 먼저 실행 시켜야 보냈을 때 받을 수 있다.
	}

}
