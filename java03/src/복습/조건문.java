package 복습;

import javax.swing.JOptionPane;

public class 조건문 {

	public static void main(String[] args) {
		// 숫자 맞추기 해보기
		int target = 77;
		int me = 88;
		
		// 조건은 비교하는 코드가 들어가고 결과는 무조건 논리형(true / false)
		if (target == me) {
			System.out.println("정답입니다.");
		} else {
			System.out.println("오답입니다.");
		} // if문은 조건이 만족하면 처리 후 더이상 실행되지 않음. (자체 break 기능 탑재)
	
		String target2 = "로또";
		String you = "신나";
		
		switch (you) {
		case "로또":
			System.out.println("정답이야");
			break;
		case "신나": case "놀자": case "나가자":
			System.out.println("정답이야");
			break;
		default:
			System.out.println("틀렸어");
			break;
		}
	}

}
