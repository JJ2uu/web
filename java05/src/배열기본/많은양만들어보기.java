package 배열기본;

// Random의 위치는 java 폴더 안에 pakage 안에 있어요.
import java.util.Random;

public class 많은양만들어보기 {

	public static void main(String[] args) {
		int[] jumsu = new int[999];
		for (int x : jumsu) {
			System.out.println(x);
		}
		
		System.out.println("======================");
		
		Random r = new Random();
//		int data = r.nextInt(4) + 1; // 0~3 => 1~4
//		System.out.println(data);
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(4) + 1;
		}
		for (int x : jumsu) {
			System.out.println(x);
		}
	}

}
