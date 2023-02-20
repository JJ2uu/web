package 형변환;

import java.awt.List;
import java.util.ArrayList;
import java.util.Queue;

public class 스키대회 {

	public static void main(String[] args) {
		ArrayList ski = new ArrayList();
		ski.add("박스키");
		ski.add("송스키");
		ski.add("김스키");
		ski.add("정스키");
		
		ski.remove(1); // 탈락자
		
						 // ArrayList의 길이(사이즈)
		for (int i = 0; i < ski.size(); i++) {
			System.out.println("스키대회: " + (i + 1) + "등: " + ski.get(i));
		}
		
		//	System.out.println("스키대회 1등: " + ski.get(0));
		//	System.out.println("스키대회 2등: " + ski.get(1));
		//	System.out.println("스키대회 3등: " + ski.get(2));
		
		System.out.println(ski.contains("김연아"));
		System.out.println(ski.size());
		
		ArrayList ski2 = new ArrayList();
		ski2.add("이스키");
		ski2.add("박스키");
		ski2.add("양스키");
		ski.addAll(ski2);
		System.out.println(ski); //파괴형함수
		
		System.out.println(ski2.isEmpty());
		ski2.clear(); // ski2 내용 전체 삭제
		System.out.println(ski2);
	}

}
