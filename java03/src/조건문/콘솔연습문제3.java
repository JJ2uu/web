package 조건문;

import java.util.Scanner;

public class 콘솔연습문제3 {

	public static void main(String[] args) {
		// 1.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1번문제");
		System.out.print("아이디: ");
		String id = sc.next();
		System.out.print("패스워드: ");
		String pw = sc.next();
		
		if (id.equals("root") && pw.equals("1234")) {
			System.out.println("로그인 성공!");
		} else {
			System.out.println("로그인 실패!");
		}
		
		
		
		System.out.println();
		System.out.println("2번문제");
		
		System.out.print("사과 구매 갯수: ");
		int ap = sc.nextInt();
		System.out.print("사과 한 개당 가격: ");
		int apPrice = sc.nextInt();
		int apResult = ap * apPrice;
		
		System.out.print("딸기 구매 갯수: ");
		int stb = sc.nextInt();
		System.out.print("딸기 한 개당 가격:");
		sc.nextLine();
		int stbPrice = sc.nextInt();
		int stbResult = stb * stbPrice;
		
		System.out.println("사과 구매 가격은 " + apResult + "원 입니다.");
		System.out.println("딸기 구매 가격은 " + stbResult + "원 입니다.");
		System.out.println("전체 구매 가격은 " + (apResult + stbResult) + "원 입니다.");
		
		
		
		System.out.println();
		System.out.println("3번문제");
		
		System.out.print("시작값 = ");
		int start = sc.nextInt();
		
		System.out.print("종료값 = ");
		int end = sc.nextInt();
		
		int result = 0;
		
		for (int i = start; i <= end; i++) {
			result = result + i;
		}
		System.out.println("다 더한 값은 " + result + "입니다.");
		
		
		
		System.out.println();
		System.out.println("4번문제");
		
		System.out.print("시작값 = ");
		int start2 = sc.nextInt();
		
		System.out.print("종료값 = ");
		int end2 = sc.nextInt();
		
		System.out.print("점프값 = ");
		int jump = sc.nextInt();
		
		int sum = 0;
		
		for (int i = start2; i <= end2; i = i + jump) {
			sum = sum + i;
		}
		System.out.println("다 더한 값은" + sum + "입니다.");
		if (sum > 100) {
			System.exit(0);
		}
		
		
		
		sc.close();

	}

}
