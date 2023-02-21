package 복습;

import java.util.ArrayList;

import javax.swing.JButton;

public class 아무거나 {

	public static void main(String[] args) {
		// index, 순서, 직접접근 ==> ArrayList
		ArrayList list = new ArrayList();
		list.add("홍길동"); // object <- String (자동형변환)
		list.add(100); // object <- Integer (랩퍼클래스) <- 오토박싱 - int (기본형)
		list.add(11.2); // object <- Double(랩퍼클래스, 포장클래스) <- 오토박싱 - double(기본형)
		list.add(new JButton()); // object <- JButton

		
		String name = (String)list.get(0); // 직접접근 가능 랜덤엑세스 가능!
		// String <- Object, 강제형변환
		
		int age = (Integer)list.get(1);
		// int <- Integer <- Object, 오토언박싱, 강제형변환
		
		// 큰 것을 작은 것으로 바꿀 때에는 강제형변환
		// 작은 것을 큰 것으로 넣을 때는 자동형변환
	}

}
