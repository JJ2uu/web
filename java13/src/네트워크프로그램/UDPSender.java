package 네트워크프로그램;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPSender {

	public static void main(String[] args) throws Exception {
		// UDP용 소켓이 있어야함
		DatagramSocket socket = new DatagramSocket(); //통화를 걸고
		
		// UDP용 패킷이 있어야함 (보낼데이터, 데이터의 크기, ip, port 필요)
		String s = "i am java programmer.";
		byte[] data = s.getBytes(); // s 저장된 데이터를 byte 크기로 변환하여 배열을 만듬
		
		// ip는 부품으로 만들어서 값을 가져와야함
		InetAddress ip = InetAddress.getByName("127.0.0.1");
		DatagramPacket packet = new DatagramPacket(data, data.length, ip, 8888);
		
		// 소켓을 이용해서 패킷을 보낸다.
		socket.send(packet);
		socket.close(); // 할말 하고 통화를 끊는다.
	}

}
