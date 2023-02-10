package 배열응용;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		// 1번문제
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("정수를 입력하세요.");
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
		}
		System.out.println(num[0] + num[2]);

		// 2번문제
		String[] s = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("문자를 입력하세요.");
			s[i] = sc.next();
		}
		System.out.println(s[0] + " 보다는 " + s[1]);
		
		sc.close();
	}

}
