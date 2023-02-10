package 배열응용;

import javax.swing.JOptionPane;

public class 입력받아평균 {

	public static void main(String[] args) {
		// 입력을 여러번 여러개 받아서 저장공간에 넣고 싶을 때 ==> 배열을 사용
		
		// 1. 배열 만들기
		int[] jumsu = new int[5];
		
		// 배열에 값을 넣을 때는 index가 반드시 필요
		for (int i = 0; i < jumsu.length; i++) {
			String data = JOptionPane.showInputDialog("점수를 입력하세요.");
			jumsu[i] = Integer.parseInt(data); //int를 5개 만들어 놓은 index에 바로 넣기
		}
		for (int x : jumsu) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println("===================");
		
		int sum = 0;
		for (int y : jumsu) {
			sum = sum + y;
		}
		System.out.println("합계: " + sum);
		System.out.println("평균값: " + (double)sum/jumsu.length);
									// double avg = (double)sum / jumsu.length;
		
		int sum2 = 0;
		for (int k : jumsu) {
			if (k >= 300) {
				sum2 = sum2 + k;
			}
		}
//		for (int i = 0; i < jumsu.length; i++) {
//			if (jumsu[i] >= 300) {
//				sum2 = sum2 + jumsu[i];
//			}
//		}
		
		System.out.println("300이상 합계: " + sum2);
		
		System.out.println("========================");
		
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] >= 300) {
				System.out.print(i + " ");
			}
		}
		
		
		
		
	}

}
