package 배열;

public class 배열연습문제 {

	public static void main(String[] args) {
		// 1. 배열에 일주일간 공부한 시간을 저장해보세요.
		int[] week = {8, 9, 10, 9, 8, 9, 10};
		
		System.out.println("월요일: " + week[0] + "시간");
		System.out.println("화요일: " + week[1] + "시간");
		System.out.println("변수 개수: " + week.length);
		
		week[2] = 10;
		week[4] = 12;
		
		System.out.println("수요일: " + week[2] + "시간");
		System.out.println("금요일: " + week[4] + "시간");
		
		// 2. 초기값을 모를 때 크기는 4개
		
		int[] tour = new int[4];
		
		tour[0] = 20;
		tour[2] = 30;
		
		System.out.println("첫 번째: " + tour[0]);
		System.out.println("세 번째: " + tour[2]);
		System.out.println("변수 개수: " + tour.length);
	}

}
