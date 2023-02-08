package 복습;

import javax.swing.JOptionPane;

public class 순차문 {

	public static void main(String[] args) {
		// 입력 --> 처리 --> 출력
		// 프로그래밍은 손으로 치는 값은 전부 String(문자열)으로 취급
		// 램에 저장공간을 만드는 것 > 선언
		// 선언할 때 램에 변수(저장공간)가 만들어진다.
		
		// 데이터타입 변수
		String num1 = JOptionPane.showInputDialog("첫 번째 숫자를 입력하세요.");
		String num2 = JOptionPane.showInputDialog("두 번째 숫자를 입력하세요.");
		
				  // 망치(부품).기능
		int num11 = Integer.parseInt(num1); // 정수로 바꾸어주는 부품을 써서 처리
		int num22 = Integer.parseInt(num2);
		
		double result = (double)num11 / num22;
		
		System.out.printf("%.2f", result);

	}

}
