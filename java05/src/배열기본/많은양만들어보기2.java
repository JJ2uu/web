package 배열기본;

import java.util.Random;

public class 많은양만들어보기2 {

	public static void main(String[] args) {
		int[] jumsu2 = new int[1000];
		
		Random r = new Random();
		
		// 2~20까지 임의로 만들어서 배열에 넣어보기
		for (int i = 0; i < jumsu2.length; i++) {
			jumsu2[i] = r.nextInt(19) + 2 ;
		}
		// 전체 프린트
		for (int x : jumsu2) {
			System.out.println(x);
		}
		// 3의 배수 숫자가 몇 개인지 프린트
		System.out.println("=====================");
		
		int count = 0;
		for (int x : jumsu2) {
			if ((x % 3) == 0) {
				count++;
			}
		} System.out.println(count);
		
		System.out.println("=======================");
		
		int sum = 0;
		for (int y : jumsu2) {
			if (y >= 15) {
				sum = sum + y;
			}
		} System.out.println(sum);
		
	}

}
