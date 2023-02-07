package 반복문;

import java.awt.Button;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 영화예매좌석만들기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(1000, 500);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		// 반복하고 싶은 부분을 전체드래그로 잡은 후 > 우클릭 > surrond with > for문
		for (int i = 0; i < 100; i++) {
			JButton b1 = new JButton("나는 버튼");
			f.add(b1);
		}
		
		f.setVisible(true);
	}

}
