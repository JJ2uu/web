package 형변환;

import java.util.LinkedList;

public class Queue확인문제 {

	public static void main(String[] args) {
		LinkedList test = new LinkedList();
		test.add("국어");
		test.add("수학");
		test.add("영어");
		test.add("컴퓨터");
		System.out.println(test);
		System.out.println(test.size());
		
		for (int i = 0; i < test.size() + 1; i++) {
			test.remove();
			System.out.println(test);
		}
		
		// -1 일때 i 값이 3, 국어가 사라짐
		// -1 일때 i 값이 2, 수학이 사라짐
		// -1 일때 i 값이 1, 영어가 사라짐
		// -1 일때 i 값이 0 이라 맨 앞에있는 컴퓨터가 사라져 제대로 출력되지 않음. 그래서 1을 더해준다.
		
		
		
//		test.remove();
//		System.out.println(test);
//		test.remove();
//		System.out.println(test);
//		test.remove();
//		System.out.println(test);
	}

}
