package 반복문;

import javax.swing.JOptionPane;

public class For2 {

	public static void main(String[] args) {
		for (; ;) { // while(true)
			//무한 루프(반복 
			System.out.println("잘 쓰지 않음.");
			String data = JOptionPane.showInputDialog("종료할까요? y를 입력");
			if (data.equals("y")) {
				System.out.println("안녕히가세요.");
				break; //if문은 이미 break가 있으니 for문 break로 실행
			} 
		}
	}
}
