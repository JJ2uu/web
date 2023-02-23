package 복습;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 나의그래픽 {

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 이벤트 처리");
		f.setSize(300, 300);
		
		JButton b = new JButton("Click");
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 처리할 내용 코딩!
				// 인터페이스에 반드시 actionPerformed()를 쓰라고 규칙이 정해져있는 것. 그래서 자동호출됨
				// 절대 변경하면 안된다.
				System.out.println("버튼이 클릭되었습니다.");
			}
		});
		
		f.add(b);
		
		f.setVisible(true);
	}

}
