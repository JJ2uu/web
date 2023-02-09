package 제어문문제;

import java.util.Random;

public class 로또번호생성기 {

	public static void main(String[] args) {
		// 아무값이나 발생시키는 부품 > Random
		Random r = new Random(); //씨앗값, seed값
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호: " + (r.nextInt(44) + 1)); //0~44까지 랜덤
		}
		System.out.println();
		// 2 ~ 10
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호: " + (r.nextInt(9) + 2)); // 0~8
		}
		
		System.out.println();
		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호: " + (r.nextInt(28) + 3)); // 0~27
		}
	}
}
