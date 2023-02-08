package 복습;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품조립하기 {

	public static void main(String[] args) {
		// 1. 자주써서 RAM에 언제든 사용할 수 있도록 준비되어있음.
		//    부품명.기능() -> 망치
		
		// 2. 쓸때마다 제공되는 틀을 이용해서 찍어내어 여러개 만들어
		//    RAM에 저장해두고 사용. -> 벽돌

		Font font = new Font("Noto Sans CJK", 1, 15);
		Font font2 = new Font("Noto Sans CJK", 1, 30);
		
		int num = 2002;
		
		JFrame f = new JFrame();
		f.setSize(400, 250);
		f.getContentPane().setBackground(Color.white);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel title = new JLabel("국가대표 축구팀이 4강진출에 성공한 년도는?");
		
		JTextField text = new JTextField(15);
		text.setBackground(Color.white);
		
		JButton b = new JButton("정답확인");
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		
		title.setFont(font);
		text.setFont(font2);
		b.setFont(font);
		
		f.add(title);
		f.add(text);
		f.add(b);
		
		f.setVisible(true);
		
	}

}
