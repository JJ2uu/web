package 배열응용;

import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 랜덤버튼배열 {

	public static void main(String[] args) {
		// 배열에는 기본형만 들어가는 것이 아니고, 참조형도 가능
		// 정수, 실수, 문자(1글자), 논리 , String, Jbutton, ...
		// 기본형은 변수에 값이 저장
		// 참조형은 무조건 100% 주소가 저장
		
		JFrame f = new JFrame(); // f라는 저장공간(ram)에 Jframe 을 갖다 놓음.
		f.setSize(1200, 800);
		
		// 버튼 200개 들어갈 배열 생성
		JButton[] bs = new JButton[200];
		//            {Jbutton0, Jbutton1, Jbutton2, ...} 
		
		// 버튼 200개를 만들어 배열에 저장
		for (int i = 0; i < bs.length; i++) {
			bs[i] = new JButton("버튼 " + i);
		} // for
		
		// 위치를 지정해서 넣어주자
		f.setLayout(null); // 위치 자동으로 잡아주는 FlowLayout 사용 X => null(조립해서 넣을 주소가 Ram에 없다)
		
		Random r = new Random();
		
		for (int i = 0; i < bs.length; i++) {
			int x = r.nextInt(1100); // 0~1099 까지의 값만
			int y = r.nextInt(700);
			bs[i].setBounds(x, y, 100, 50);
		//	bs[i].setBounds(r.nextInt(1100), r.nextInt(700), 100, 50);
			
			f.add(bs[i]); // f에 올려주자.
		} // for
		
		f.setVisible(true); // 화면에 띄워라
	}

}
