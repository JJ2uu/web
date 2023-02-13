package 배열응용;

import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열2 {

	public static void main(String[] args) {
		// 1. 프레임 만들기
		JFrame f = new JFrame();
		
		// 2. 프레임 설정
		//	    레이아웃 부품 설정 X
		f.setSize(1200, 800);
		f.setLayout(null);
		
		// 3. 버튼을 넣을 배열을 먼저 만들기. 500개
		JButton[] bs = new JButton[500];
		// 기본형이 아닌 데이터는 참조형
		// 참조형은 배열에 null로 초기화
		             // { null, null, null, null, ... 500개 }
		
		// 4. 버튼을 500개 만들어서 배열에 넣어주세요.
		for (int i = 0; i < bs.length; i++) {
			bs[i] = new JButton("버튼 " + i);
		}
		
		// 5. 배열에 있는 버튼을 꺼내서 위치를 지정 후, F에 붙여주세요.
		Random r = new Random();
		
		for (int i = 0; i < bs.length; i++) {
			int x = r.nextInt(1100); // 가로 위치
			int y = r.nextInt(700); // 세로 위치
			bs[i].setBounds(x, y, 100, 50);
			f.add(bs[i]);
		}
		
		// 심화-1 >> 버튼 색을 몇 가지 지정해서 임의로 설정 (컬러 배열)
		Color[] color = {Color.gray, Color.magenta, Color.white, Color.pink, Color.CYAN}; // 1. 컬러배열만들기
		for (int i = 0; i < bs.length; i++) { // bs.length 만큼 
			bs[i].setBackground(color[r.nextInt(color.length)]); //color[r.nextInt(color.length)컬러배열값을 length만큼랜덤으로돌려주기]
			// bs 배열 index에 랜덤으로 color[컬러배열length만큼랜덤값]을 적용시켜준다는 뜻
		}
		
		// 심화-2 >> f에 배경색 넣어보기.
		f.getContentPane().setBackground(Color.white);
		
		f.setVisible(true);
	}
}
