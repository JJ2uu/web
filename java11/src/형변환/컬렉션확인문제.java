package 형변환;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션확인문제 {

	public static void main(String[] args) {
		// 1번
		LinkedList trip = new LinkedList();
		trip.add("도쿄");
		trip.add("오사카");
		trip.add("교토");
		trip.add("삿포로");
		trip.add("오키나와");
		System.out.println(trip);
		
		for (int i = 0; i <= trip.size() + 1; i++) {
			trip.remove(0);
			System.out.println(trip);	
		}
		
		// 중복 제거에 좋은 set 을 이용
		//	HashSet tour = new HashSet();
		//	tour.add("일본");
		//	tour.add("중국");
		//	tour.add("미국");
		//	tour.add("싱가폴");
		//	tour.add("한국");
		
		System.out.println("-------------------------------");
		
		// 2번
		HashMap home = new HashMap();
		home.put("안방", "TV");
		home.put("거실", "소파");
		home.put("부엌", "냉장고");
		home.put("현관", "신발");
		
		System.out.println(home);
		home.put("거실", "책상");
		System.out.println(home);
	
		System.out.println("-------------------------------");
		
		// 3번
		ArrayList toDo = new ArrayList();
		toDo.add("공부");
		toDo.add("산책");
		toDo.add("저녁준비");
		toDo.add("복습");
		toDo.add("휴식");
		
		System.out.println(toDo);
		System.out.println(toDo.get(0));
		System.out.println(toDo.get(toDo.size() - 1));
		toDo.set(1, "청소");
		System.out.println(toDo);
	}

}
