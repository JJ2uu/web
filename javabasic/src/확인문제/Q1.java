package 확인문제;

import javax.swing.JOptionPane;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String day = JOptionPane.showInputDialog("오늘은 무슨 요일인가요?");
		String plan = JOptionPane.showInputDialog("오늘 수업이 끝나고 무엇을 하실 예정인가요?");
		
		String result = "오늘 " + day + "에 " + "수업 후 나는 " + plan + "을(를) 할 예정입니다.";
		
		System.out.println(result);
	}

}
