package 상속;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame {

	public static void main(String[] args) {
		CarGame f = new CarGame();
	}
	
	public CarGame() {
		setTitle("나의 자동차 경주 게임");
		setSize(1200, 700);
		setLayout(null);
		
		MyThread car1 = new MyThread("image1.jpg", 100, 0);
		MyThread car2 = new MyThread("car02.png", 100, 150);
		MyThread car3 = new MyThread("car03.png", 100, 300);
		
		car1.start();
		car2.start();
		car3.start();
		
		setVisible(true);
	}
	
	public class MyThread extends Thread {
		int x, y;
		JLabel label; // 멤버변수 초기화용
		
		// 자동차 하나에 대한 thread
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 150, 200); // jframe에 붙일 위치
			add(label);
		}
		
		public void run() {
			// 동시에 실행하고 싶은 내용
			// 모든 스레드가 오른쪽으로 움직이고 싶음
			// 화면에서 오른쪽으로 움직이는 것은 x축을 늘려주는 것
			Random r = new Random();
			for (int i = 0; i < 200; i++) {
				int move = r.nextInt(50);
				x += move;
				System.out.println(x);
				label.setBounds(x, y, 150, 200); // 다시 위치 지정
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
