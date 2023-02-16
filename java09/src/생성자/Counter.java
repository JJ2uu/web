package 생성자;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Counter {

	static int count; // static변수는 자동초기화
	
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
		
		JButton b1 = new JButton("1 더하기");
		JButton b2 = new JButton("0으로 초기화");
		JButton b3 = new JButton("1 빼기");
		b1.setFont(font2);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		b1.setBorderPainted(false);
		b2.setFont(font2);
		b2.setBackground(Color.black);
		b2.setForeground(Color.white);
		b2.setBorderPainted(false);
		b3.setFont(font2);
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		b3.setBorderPainted(false);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count++;
				number.setText(count + "");
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count = 0;
				number.setText(count + "");
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				count--;
				number.setText(count + "");
			}
		});
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(number);
		
		f.setVisible(true);
	}

}
