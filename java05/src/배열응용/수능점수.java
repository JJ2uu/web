package 배열응용;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class 수능점수 {

	public static void main(String[] args) {
		int[] jumsu = new int[10000];
		
		Random r = new Random(42);
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(451); // 0~450
		}

		int count1 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 450) {
				count1++;
				System.out.println("만점자: " + i + "번 수험생");
			}
		}
		System.out.println("만점자 총: " + count1 + "명");
		
		System.out.println("============================================");
		
		int count2 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] == 0) {
				count2++;
				System.out.println("0점자: " + i + "번 수험생");
			}
		}
		System.out.println("0점자 총: " + count2 + "명");
		
		int all = 0;
		for (int i = 0; i < jumsu.length; i++) {
			all = all + jumsu[i];
		}
		double avg = (double)all / jumsu.length;
		System.out.println("전체 평균점수: " + avg + "점");
		
		int count3 = 0;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] <= avg + 50 && jumsu[i] >= avg - 50 ) {
				count3++;
			}
		}
		System.out.println("평균 보다 +-50점 인 학생 카운트: " + count3 + "명");
		
		System.out.println("=====================================");
		
		

	}

}
