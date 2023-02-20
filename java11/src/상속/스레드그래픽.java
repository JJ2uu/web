package 상속;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class 스레드그래픽 extends JFrame {
	// add, setSize, ... 다 갖고 있음
	JLabel count, image, time; // 전역변수
	
	public static void main(String[] args) {
		스레드그래픽 f = new 스레드그래픽(); // 1번 실행
		// 객체생성시 클래스 이름과 동일한 메서드를 자동호출한다.
	}
	
	public 스레드그래픽() { // 생성자 2번 실행
		setTitle("내 스레드 그래픽");
		setSize(640,590);
		getContentPane().setBackground(Color.white);
		
		FlowLayout flow = new FlowLayout();
		setLayout(flow);
		
		Font font = new Font("NanumGothic", Font.BOLD, 30);
		
		count = new JLabel("카운트");
		ImageIcon icon1 = new ImageIcon("1.jpg");
		image = new JLabel(icon1);
		time = new JLabel("시간");
		
		count.setFont(font);
		time.setFont(font);
		
		add(count);
		add(image);
		add(time);
		
		// 스레드 3개 출발
		타이머스레드2 timer = new 타이머스레드2();
		이미지스레드2 img = new 이미지스레드2();
		카운트스레드2 count2 = new 카운트스레드2();
		
		timer.start();
		img.start();
		count2.start();
		
		setVisible(true);
	}
	
	// inner class 내부클래스
	// 스레드 그래픽 안에 내부클래스 3개
	// 전역변수를 공유할 수는 있지만 내부클래스가 독립적으로 사용 불가능
	public class 카운트스레드2 extends Thread {
		
		public void run() {
			for (int i = 500; i > 0; i--) {
				count.setText("카운트:  " + i);
				// CPU에게 스레드를 실행 후 한 텀 재운다.
				// thread를 잠시 중지
				// CPU는 외부자원입니다.
				// 자바가 외부자원을 연결할 때는 위험신호 알려줘야한다.
				// 만약에 문제가 생기면 어떻게 처리할 지를 반드시 코딩
				try {
					Thread.sleep(2000); //2초 재운다.
				} catch (Exception e) {
					System.out.println("CPU 연결에 문제가 생겼습니다.");
				}
			}
		}
	}
	
	public class 타이머스레드2 extends Thread {
		
		public void run() {
			for (int i = 1000; i > 0; i--) {
				Date date = new Date();
				time.setText("타이머:  " + date);
				try {
					Thread.sleep(1000); //1초 재운다.
				} catch (Exception e) {
					System.out.println("CPU 연결에 문제가 생겼습니다.");
				}
			}
		}
	}
	
	public class 이미지스레드2 extends Thread {
		
		public void run() {
			
			String[] images = {
					"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg",
					"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg",
					"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg",
					"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg",
					"1.jpg", "2.jpg", "3.jpg", "4.jpg", "5.jpg"
			};
			
			for (int i = 0; i < images.length; i++) {
				ImageIcon icon = new ImageIcon(images[i]);
				image.setIcon(icon);
				try {
					Thread.sleep(5000); //2초 재운다. 컴퓨터에서의 1초는 1초를 1000으로 나눴다. ms(밀리세컨즈)
				} catch (Exception e) {
					System.out.println("CPU 연결에 문제가 생겼습니다.");
				}
			}
		}
	}


	
	
	
}



