package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class 그래픽형변환 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 500);
		
		// 주소값을 한 번만 쓰고 쓸 일이 없을 때, 변수를 만들지 않고 바로 넣어줄 수 있다. (jbutton의 폰트설정, 색상은 못한다)
		f.setLayout(new FlowLayout()); // Component 자리에 <- FlowLayout(자동형변환)
		f.add(new JButton("나는 버튼"));
		f.add(new JLabel("나는 라벨"));
		f.add(new JTextField(10));
		
	
		
		
		f.setVisible(true);
	}

}
