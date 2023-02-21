package 형변환;

import java.util.ArrayList;

import javax.swing.JButton;

public class 참조형형변환 {

	public static void main(String[] args) {
		// 클래스형변환 == 클래스 형변환
		// 상속관계일 때만 가능하다.
		
		ArrayList list = new ArrayList();
		
		// 자동형변환(업캐스팅)
		list.add("홍길동"); // Object(큰) <- String(작)
		list.add(100);  // Object(큰) <- Integer(작)
		list.add(11.2);  // Object(큰) <- Double(작)
		list.add(new JButton("나는 버튼")); // Object(큰) <- JButton(작)
		
		// 강제형변환(다운캐스팅)
		String name = (String)list.get(0);
		System.out.println(name.charAt(0)); // String으로 변환해주어야 String이 가진 기본 메서드들을 쓸 수 있다.
		System.out.println(name.length());
		
		int age = (Integer)list.get(1);
		System.out.println(age + 1);
		
		double jumsu = (Double)list.get(2);
		System.out.println(jumsu + 10); //강제 형변환이 이루어졌기 때문에 연산이 가능하다.
		
		JButton b = (JButton)list.get(3);
		b.setText("나는 진짜 버튼");
	
	}
}
