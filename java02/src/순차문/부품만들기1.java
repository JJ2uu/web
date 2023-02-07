package 순차문;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 부품만들기1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 자주 사용하지 않는 부품을 만들어보자.
		// 틀이 있어서 틀을 이용하여 필요한 부품을 만들어 CPU가 조립
		
		// new : 틀을 이용하여 찍어낼 때 사용
		// new JFrame()는 JFrame이라는 틀을 이용하여 부품을 찍어내는 작업
		// 만든 부품은 무조건 ram에 저장되어야 한다.
		// f변수를 만들어서 JFrame(부품)을 저장한다.	
		JFrame f = new JFrame();
		f.setSize(450, 150);
		
		// 물 흐르듯이 순서대로 배치(FlowLayout)해주는 부품을 렘에 복사해서 가져다 놓기
		// f에 해당 부품을 쓰겠다라고 조립
		FlowLayout flow = new FlowLayout(); // 생성
		f.setLayout(flow); // 조립
		
		JButton b1 = new JButton();
		b1.setText("나는 버튼");
		JButton b2 = new JButton();
		b2.setText("나는 버튼");
		
		JLabel text1 = new JLabel(); //글씨를 넣고 싶을 때 부품
		text1.setText("아이디");
		JLabel text2 = new JLabel();
		text2.setText("패스워드");
		
		JTextField input1 = new JTextField(10); // 입력 input 부품
		JTextField input2 = new JTextField(10);
		
		Font font = new Font("굴림", 1, 20);
		text1.setFont(font);
		input1.setFont(font);
		b1.setFont(font);
		text2.setFont(font);
		input2.setFont(font);
		b2.setFont(font);
		
		
		f.add(text1);
		f.add(input1);
		f.add(b1);
		f.add(text2);
		f.add(input2);
		f.add(b2);
		
		
		// 보여주는 것은 맨 밑에다가!
		f.setVisible(true);
		
	}

}
