package 상속;

import java.awt.Color;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CatGame extends JFrame {

	public static void main(String[] args) {
		CatGame f = new CatGame();
	}

	public CatGame() {
		setTitle("버블버블");
		setSize(1000, 400);
		setLayout(null);
		getContentPane().setBackground(Color.black);
		
		MyThread b = new MyThread("bubble1.jpg", 100, 200);
		MyThread2 b1 = new MyThread2("bubble2.jpg", 750, 200);
		
		b.start();
		b1.start();
		
		
		setVisible(true);
	}
	
	public class MyThread extends Thread {
		int x, y;
		JLabel label;
		
		public MyThread(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 200, 100);
			add(label);
		}
		
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 100; i++) {
				if (x < 850) {
					int move = r.nextInt(50);
					x += move;
					System.out.println(x);
					label.setBounds(x, y, 200, 100);
				} else {
					JOptionPane.showMessageDialog(label, "초록이 끝!");
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
	}
	
	public class MyThread2 extends Thread {
		int x, y;
		JLabel label;
		
		public MyThread2(String file, int x, int y) {
			this.x = x;
			this.y = y;
			ImageIcon icon = new ImageIcon(file);
			label = new JLabel();
			label.setIcon(icon);
			label.setBounds(x, y, 200, 100);
			add(label);
		}
		
		public void run() {
			Random r = new Random();
			for (int i = 0; i < 100; i++) {
				if (x > 0) {
					int move = r.nextInt(50);
					x -= move;
					System.out.println(x);
					label.setBounds(x, y, 200, 100);
				} else {
					JOptionPane.showMessageDialog(label, "파랑이 끝!");
					break;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
	}
	

}
