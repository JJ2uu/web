package 제어문문제;

import java.util.Scanner;

public class 인기투표문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 누적시킬 변수는 반복문 안에 넣으면 실행때마다 초기화되므로 넣지 않는다.
		int iu = 0;
		int njs = 0;
		int nmx = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("인기투표 시스템");
			System.out.print("1)아이유 2)뉴진스 3)엔믹스 4)종료");
			int choice = sc.nextInt(); //sc에 입력한 값을 int로 바꿔주는 작업
			if (choice == 4) { // 종료코드는 조건문 안에 첫번째 조건으로 넣는다.
				System.out.println("투표를 종료합니다.");
				System.out.println("아이유 " + iu + "표");
				System.out.println("뉴진스 " + njs + "표");
				System.out.println("엔믹스 " + nmx + "표");
				break; //4번 종료
			} else if (choice == 1) {
				iu++; // iu에 1씩 추가
			} else if (choice == 2) {
				njs++; // njs에 1씩 추가
			} else if (choice == 3) {
				nmx++; // nmx에 1씩 추가
			} else {
				System.out.println("없는 번호입니다. 다시 입력해주세요.");
			} 
		}
	}
}
