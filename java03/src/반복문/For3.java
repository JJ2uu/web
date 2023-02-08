package 반복문;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class For3 {

	public static void main(String[] args) {
		// 버튼 4개
		
		Font font = new Font("Noto Sans CJK", 1, 30);
		
		JFrame f = new JFrame();
		f.setSize(300, 270);
		f.getContentPane().setBackground(Color.darkGray);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JButton b1 = new JButton("별 10개");
		b1.setBackground(Color.pink);
		b1.setPreferredSize(new Dimension(250, 50));
		JButton b2 = new JButton("커피 5개");
		b2.setBackground(Color.white);
		b2.setPreferredSize(new Dimension(250, 50));
		JButton b3 = new JButton("커피/우유 3개");
		b3.setBackground(Color.pink);
		b3.setPreferredSize(new Dimension(250, 50));
		JButton b4 = new JButton("1:짱!");
		b4.setBackground(Color.white);
		b4.setPreferredSize(new Dimension(250, 50));
	
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);
		
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		// 1)버튼에대가 액션기능을 추가하겠다고 설정
		// 2)클릭액션이 있을 때 어떤 부품이 액션처리를 어떻게 할지 코딩
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 클릭했을 때 처리되는 내용을 여기에 작성
				for (int i = 0; i < 10; i++) {
					System.out.print("*");
				}
				System.out.println();
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 5; i++) {
					System.out.print("커피");
				}
				System.out.println();
			}
		});
		
		b3.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						for (int i = 0; i <3; i++) {
							System.out.println("커피/우유");
						}
					}
				});

		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < 3; i++) {
					System.out.println((i + 1) + ":짱!");
				}
			}
		});
		
		f.setVisible(true);
	}

}
