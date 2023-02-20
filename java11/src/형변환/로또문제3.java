package 형변환;

import java.util.HashSet;
import java.util.Random;

public class 로또문제3 {

	public static void main(String[] args) {
		Random r = new Random(); // 42번 랜덤값
		HashSet lotto = new HashSet();
		System.out.println(lotto.size());
		
					// lotto.size가 6개 될 때 까지 무조건 돌린다.
		for (int i = 0; lotto.size() < 6; i++) {
			lotto.add(r.nextInt(45) + 1); // 1 ~ 45
		}
		System.out.println(lotto.size());
		System.out.println(lotto);
	}

}
