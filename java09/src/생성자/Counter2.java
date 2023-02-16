package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter2 {

	static int count; // static변수는 자동초기화
	static JButton[] buttons = new JButton[3];
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(300, 300);
		f.getContentPane().setBackground(Color.white);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		Font font = new Font("NanumGothic", Font.BOLD, 170);
		Font font2 = new Font("NanumGothic", Font.BOLD, 13);
		
		JLabel number = new JLabel("0");
		number.setFont(font);
				
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton();
			buttons[i].setForeground(Color.white);
			buttons[i].setFont(font2);
			buttons[i].setBorder(null);
			f.add(buttons[i]);
			
			if (i == 0) {
				buttons[i].setText("1 더하기");
				buttons[i].setBackground(Color.blue);
			} else if (i == 1) {
				buttons[i].setText("0으로 초기화");
				buttons[i].setBackground(Color.black);
			} else {
				buttons[i].setText("1 빼기");
				buttons[i].setBackground(Color.blue);
			}
		}
		

		f.add(number);
		
		f.setVisible(true);
	}

}
