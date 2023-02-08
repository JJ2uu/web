package 조건문;

import java.util.Scanner;

public class 콘솔입력1 {

	public static void main(String[] args) {
		// Scanner
		Scanner sc = new Scanner(System.in); //키보드로 입력, (모니터는 out)
		// Java 프로그램과 Console 간의 연결 통로를 만드는 역할 > Scanner
		// 연결 통로 > 강물 (스트림, Stream)
		// Stream은 닫아주지 않으면 계속 살아있음
		// Stream은 반드시 닫아주자!
		System.out.print("요일 입력  1)주중  2)주말");
		int data = sc.nextInt(); // String > int로 바꿔서 가져온다.
		
		if (data == 1) {
			System.out.println("열심히 달리자");
		} else {
			System.out.println("푹 쉬자");
		}
		
		System.out.print("주말에 뭐할까?");
		String data2 = sc.next(); //단어
		System.out.println("나는 주말에 " + data2 + "를 할거야.");
		
		sc.close();
	}

}
