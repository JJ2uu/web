package 네트워크프로그램;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class 메신저A extends JFrame{
	
	DatagramSocket socket;
	JTextArea list;
	JTextField input;
	String myName;
	String yourName;
	
	public 메신저A() {
		
		try {
			// 받는부분 무한루프에서 계속 소켓을 만들어 내니 전역변수로 빼서 만든다.
			socket = new DatagramSocket(7777);
		} catch (Exception e) {
			// TODO: handle exception
		}
		myName = JOptionPane.showInputDialog("당신의 이름은?");
		yourName = JOptionPane.showInputDialog("어느 분과 채팅을 하실건가요?");
		
		setTitle(yourName + "과의 채팅창");
		setSize(400, 400);
		setLocationRelativeTo(null);
		
		
		// 채팅 리스트
		list = new JTextArea();
		
		// 채팅 입력창
		input = new JTextField(10);
		input.setPreferredSize(new Dimension(300, 50));
		
		add(list, BorderLayout.CENTER);
		add(input, BorderLayout.SOUTH);
		
		Font font = new Font("NanumGothic", Font.BOLD, 20);
		list.setFont(font);
		input.setFont(font);
		list.setBackground(Color.white);
		input.setBackground(Color.darkGray);
		input.setForeground(Color.white);
		list.setEditable(false);
		
		input.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// 1. 입력한 것 가지고 오세요
					DatagramSocket socket = new DatagramSocket();
					String s = input.getText();
					byte[] data = s.getBytes();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, 5555);
					list.append("나 >> " + s + "\n");
					input.setText("");
					socket.send(packet);
					socket.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		
		setVisible(true);
	}
	// 받는 부분 무한루프 먼저 실행
	public void process() {
		while(true) {
			try {
//				System.out.println("받을 준비중...");
				byte[] data = new byte[256];
				DatagramPacket packet = new DatagramPacket(data, data.length);
				socket.receive(packet);
				list.append("상대 ("+ yourName + ") >>" + new String(data) + "\n");
				//socket.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
	
	public static void main(String[] args) {
		메신저A f = new 메신저A();
		f.process();
	}
	
}
