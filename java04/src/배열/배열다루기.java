package 배열;

public class 배열다루기 {

	public static void main(String[] args) {
		int[] x = new int[10]; // length + 저장공간 까지 12개의 변수가 만들어짐
		
		// index는 0부터 시작, 마지막 위치의 index는 10보다 작음.
		x[0] = 10;
		x[1] = 20;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(x[i] + " ");
		}
		// System.out.println(x[0]);
		// System.out.println(x[1]);
		// System.out.println(x[2]);
		
		// 우리 가족의 성별을 char로 저장
		// 프린트
		
		char[] y = {'남', '여', '여', '여', '남', '여'};
		for (int i = 0; i < y.length; i++) {
			System.out.print(y[i] + " ");
		}
		System.out.println();
		
		String[] n = {"홍길원", "홍길투", "홍길삼", "홍길사", "홍길오", "홍길육"};
		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		System.out.println();
		
		double[] e = {1.0, 0.7, 0.6, -0.5, 1.2, 0.9};
		for (int i = 0; i < e.length; i++) {
			System.out.print(e[i] + " ");
		}
		System.out.println();
		
		boolean[] d = {false, false, false, true, false, false};
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " ");
		}
		
		
		
	}

}
