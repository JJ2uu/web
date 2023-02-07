package 조건문;

import javax.swing.JOptionPane;

public class 조건문추가문제 {

	public static void main(String[] args) {
		// 추가문제 1
			String num3 = JOptionPane.showInputDialog("첫 번째 수를 입력하세요.");
			String num4 = JOptionPane.showInputDialog("두 번째 수를 입력하세요.");
			String op = JOptionPane.showInputDialog("사칙연산자를 입력하세요.");
				
			int num33 = Integer.parseInt(num3);
			int num44 = Integer.parseInt(num4);
				
			if (op.equals("+")) {
				System.out.println(num33 + num44);
			} else if (op.equals("-")) {
				System.out.println(num33 - num44);
			} else if (op.equals("*")) {
				System.out.println(num33 * num44);
			} else if (op.equals("/")) {
				System.out.println(num33 / num44);
			}
				
		// 추가문제 2
			String num5 = JOptionPane.showInputDialog("정수1을 입력하시오.");
			String num6 = JOptionPane.showInputDialog("정수2을 입력하시오.");
			
			int num55 = Integer.parseInt(num5);
			int num66 = Integer.parseInt(num6);
			
			double result = (double)num55 / num66;
			
			System.out.printf("%.2f", result);
	}

}
