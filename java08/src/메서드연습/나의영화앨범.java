package 메서드연습;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 나의영화앨범 {
	
	static int index = 2; //현재 2부터 시작
	
	public static void main(String[] args) {
		
		String[] name = {"더 퍼스트 슬램덩크", "타이타닉", "아바타2-물의 길", "교섭", "영웅"};
		String[] img = {"movie1.jpg", "movie2.jpg", "movie3.jpg", "movie4.jpg", "movie5.jpg"};
		double[] jumsu = {9.46, 9.44, 8.65, 6.07, 9.00};
		
		JFrame f = new JFrame();
		f.setSize(340, 400);
		f.getContentPane().setBackground(new Color(242, 242, 242));
		
		Font font = new Font("NanumGothic", Font.BOLD , 30);
		
		// 배치부품(객체)를 바꾸어주지 않으면 경계레이아웃(BorderLayout)을 사용하도록 세팅이 되어있음.
		JLabel top = new JLabel(name[2]);
		top.setPreferredSize(new Dimension(340, 50));
		top.setHorizontalAlignment(0);
		top.setFont(font);
		
		JLabel center = new JLabel();
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		center.setFont(font);
		
		JLabel bottom = new JLabel(String.valueOf(jumsu[2])); // String.valueOf : int, double, ... -> String으로 변환
		bottom.setPreferredSize(new Dimension(340, 50));
		bottom.setHorizontalAlignment(0);
		bottom.setForeground(Color.red);
		bottom.setFont(font);
		
		JButton left = new JButton("◀");
		left.setBackground(new Color(0, 0, 204));
		left.setForeground(Color.white);
		left.setFont(font);
		
		left.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index > 0) {
					// 현재 index 보다 하나 적은 값들로 top, center, bottom에 setting
					top.setText(name[index - 1]);
					ImageIcon icon = new ImageIcon(img[index - 1]);
					center.setIcon(icon);
					bottom.setText(jumsu[index - 1] + "");
					index--; // index = index - 1; , index-= 1;
				} else {
					index = 4;
					top.setText(name[4]);
					ImageIcon icon = new ImageIcon(img[4]);
					center.setIcon(icon);
					bottom.setText(jumsu[4] + "");
				}
			}
		});
		
		JButton right = new JButton("▶");
		right.setBackground(new Color(0, 0, 204));
		right.setForeground(Color.white);
		right.setFont(font);
		
		right.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (index < 4) {
					top.setText(name[index + 1]);
					ImageIcon icon = new ImageIcon(img[index + 1]);
					center.setIcon(icon);
					bottom.setText(jumsu[index + 1] + "");
					index++;
				} else {
					index = 0;
					top.setText(name[0]);
					ImageIcon icon = new ImageIcon(img[0]);
					center.setIcon(icon);
					bottom.setText(jumsu[0] + "");
				}
			}
		});
		
		f.add(top, BorderLayout.NORTH);
		f.add(center, BorderLayout.CENTER);
		f.add(bottom, BorderLayout.SOUTH);
		
		f.add(left, BorderLayout.WEST);
		f.add(right, BorderLayout.EAST);
		
		// 프로그램 끝나면 자동으로 exit
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setVisible(true);
	}
}
