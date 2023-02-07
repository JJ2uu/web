package 조건문;

import java.util.function.IntPredicate;

import javax.swing.JOptionPane;


public class 조건문연습문제2 {

	public static void main(String[] args) {
		
		// 1번문제
		String pw = JOptionPane.showInputDialog("암호를 입력하세요");

		if (pw.equals("pass")) {
			System.out.println("들어오세요.");
		} else {
			System.out.println("나가세요.");
		}
		
		// 2번문제
		String menu = JOptionPane.showInputDialog("당신이 먹고싶은 저녁 메뉴(자장면, 라면, 회)는?");
		
		if (menu.equals("자장면")) {
			System.out.println("중국집으로 가요");
		} else if (menu.equals("라면")) {
			System.out.println("분식집으로 가요");
		} else if (menu.equals("회")) {
			System.out.println("횟집으로 가요");
		} else {
			System.out.println("그냥 안먹어요.");
		}
		
		// 3번문제
		String num1 = JOptionPane.showInputDialog("첫 번째 정수를 입력하시오");
		String num2 = JOptionPane.showInputDialog("두 번째 정수를 입력하시오.");
		
		int num11 = Integer.parseInt(num1);
		int num22 = Integer.parseInt(num2);
		
		if (num11 > num22) {
			System.out.println(num11 + "이 " + num22 + "보다 더 큽니다.");
		} else if (num11 == num22) {
			System.out.println("두 값이 같습니다.");
		} else {
			System.out.println(num11 + "이 " + num22 + "보다 더 작습니다.");
		}
		
		// 4번문제
		String no = "A100EX";
		
		char no1 = no.charAt(0);
		
		if (no1 == 'A') {
			System.out.println("기획부");
		} else if (no1 == 'B') {
			System.out.println("총무부");
		} else if (no1 == 'C') {
			System.out.println("개발부");
		} else {
			System.out.println("해당부서 없음");
		}
		
	}

}
