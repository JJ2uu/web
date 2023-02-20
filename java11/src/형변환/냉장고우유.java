package 형변환;

import java.util.LinkedList;

public class 냉장고우유 {

	public static void main(String[] args) {
		// Queue 대기줄, 먼저 들어온 값이 먼저 나감
		LinkedList milk = new LinkedList();
		milk.add("어제 상한 우유");
		milk.add("오늘 싱싱 우유");
		milk.add("내일 더 싱싱 우유");
		milk.remove(); // 첫 번째 값 지우기
		System.out.println(milk);
		milk.remove(); // 두 번째 값 지우기
		System.out.println(milk);
	
	
	}

}
