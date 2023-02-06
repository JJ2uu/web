package 제어문;

import javax.swing.JOptionPane;

public class 순차문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 입력
		// 변수명은 조금 더 직관적이게 짓기
		String sports = JOptionPane.showInputDialog("당신이 좋아하는 운동은?");
		String week = JOptionPane.showInputDialog("당신이 운동하기 좋아하는 요일은?");
		
		// 처리
		String result = week + "에 저는 " + sports + "를(을) 합니다.";
		
		// 출력
		System.out.println(result);
	}

}
