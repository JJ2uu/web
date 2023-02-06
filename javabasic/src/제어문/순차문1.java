package 제어문;

import javax.swing.JOptionPane;

public class 순차문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 프로그램을 어떤 순서대로 짜야할까?
		// 1. 입력 : 데이터를 가져오기
		// 2. 처리 : 특정한 작업을 시행
		// 3. 출력 : 처리한 내용을 확인
		// 자바는 자주 사용하는 부품은 대문자로 바로 쓴다
		// 외부에서 대화창같은 것으로 입력받은 경우엔 무조건 컴퓨터는 String(문자열)로 인식한다.
		
		// 입력(Input)
		String name = JOptionPane.showInputDialog("당신의 이름은?");
		
		// 처리
		String result = "나의 이름은 " + name + "입니다.";
		
		// 출력
		System.out.println(result);
	}

}
