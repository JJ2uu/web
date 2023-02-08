package 반복문;

public class For1 {

	public static void main(String[] args) {
		// 3번 반복
		//for (초기값, 조건식, 증감식) < 기본
		for (int i = 0; i < 3; i++) {
			System.out.println(i + " 내가 반복 1");
		}
		
		//100번 반복
		for (int i2 = 0; i2 < 100; i2++) {
			System.out.println("내가반복2 >> " + (i2 + 1));
		}

		//10번 반복
		for (int i3 = 0; i3 < 10; i3++) {
			System.out.println("내가반복3 " + (i3 + 1) + "번째 실행 중");
		}
	}

}
