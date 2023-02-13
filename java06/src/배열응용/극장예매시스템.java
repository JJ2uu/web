package 배열응용;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class 극장예매시스템 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(420, 415);
		f.setTitle("극장예매시스템");
		f.getContentPane().setBackground(Color.white);
		
		Font font1 = new Font("Noto Sans CJK", Font.BOLD, 60);
		Font font2 = new Font("Noto Sans CJK", Font.BOLD, 50);
		Font font3 = new Font("Noto Sans CJK", Font.BOLD, 20);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel title = new JLabel("극장예매시스템");
		f.add(title);
		title.setFont(font2);
		
		// 버튼 배열 많이 만들어서 집어 넣을 배열 생성
		// 반복해서 f에 넣어주세요.
		JButton[] btns = new JButton[10];
		JLabel result = new JLabel("결과 보이는 곳");
		result.setForeground(Color.red);
		result.setFont(font3);
		
		// 예약 여부를 저장하는 배열을 만들어줍시다!
		int[] seat = new int[10]; // {0, 0, 0, 0, ... 10개 }
		// 각 자리에 저장된 값이 0이면 아직 예약 안되었음. 예약되면 1로 바꿈
	
		for (int i = 0; i < btns.length; i++) {
			btns[i] = new JButton(i + ""); // i 혼자만 쓰는 스트링은 없어서 ""를 붙여줘야함
			btns[i].setFont(font1);
			f.add(btns[i]);
			
			// 버튼에 액션기능 add해보자
			// 1. add기능 추가
			// 2. 클릭했을 때 어떤 부품이 담당할지 부품을 만들기
			// 3. 클릭했을 때 어떻게 처리할지
			
					// add 추가                     // 클릭했을 때 부품
			btns[i].addActionListener(new ActionListener() {
				
				@Override                            // e는 클릭했을 때의 버튼을 인식
				public void actionPerformed(ActionEvent e) {
					// 클릭했을 때 어떻게 처리할지 코딩
					// e.getActionCommand(); => 클릭한 버튼의 글자를 가지고 와줌
					String text = e.getActionCommand();
					int no = Integer.parseInt(text);
					System.out.println(text);
					// 이미 해당 좌석번호가 1로 저장되어있는지 확인하고 1이 아니면 예약 가능. 1이면 예약 불가
					if (seat[no] == 0) { // seat[no] 에 0이면 1을 넣어주고 예약완료 멘트
						seat[no] = 1; // i에는 String을 넣을 수 없어 int로 변환시켜서 넣어줘야함.
						result.setText(text + "번 예약완료.");
					} else if (seat[no] == 1) { // seat[no] 에 1이 들어가 있으면 예약불가 멘트
						result.setText("이미 예약된 좌석입니다.");
					}
				}
			}); // addAction
		} // for
		
		f.add(result);

		JButton total = new JButton("전체 예약 내역");
		total.setBackground(Color.blue);
		total.setForeground(Color.white);
		total.setFont(font2);
		
		total.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 배열에 몇개가 1인지 세어서 더해줌
				// 영화티켓값 한 장당 10000원
			
				int count = 0; // 1. count 변수 하나 만들기
				for (int x : seat) { // 2. 배열에 있는 값이 1인지 비교
					if (x == 1) {
						count++; // 3. 1이면 카운트 ++;
					} // if문
				} // for 문
				JOptionPane.showMessageDialog(f, "총 결제금액: " + (10000*count) + "원");
			}
		});
		
		f.add(total);
		
		f.setVisible(true);
	}

}
