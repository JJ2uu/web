package 제어문문제;

import java.util.Random;
import java.util.Scanner;

public class 정답맞추기게임 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int target = r.nextInt(100);
		Scanner sc = new Scanner(System.in);
		
		int count = 0; //카운트 변수 선언
		int data = 0;
		while (true) {
			System.out.print("당신이 생각한 정답은? ");
			data = sc.nextInt();
			count++; // 시도할 때마다 카운트 +1
			if (data == target) {
				System.out.println("시도횟수: " + count + "회");
				System.out.println("축하드립니다. 정답입니다.");
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("오답입니다..");
				System.out.println("다시 시도해주세요.");
				if (data > target) {
					System.out.println("너무 큽니다.");
				} else if (data < target) {
					System.out.println("너무 작아요.");
				}
			}
		}
		sc.close();

	}

}
