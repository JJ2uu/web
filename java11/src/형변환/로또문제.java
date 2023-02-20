package 형변환;

import java.util.HashSet;

public class 로또문제 {

	public static void main(String[] args) {
		
		// 순서 없는 리스트
		HashSet bag = new HashSet();
		bag.add("휴대폰");
		bag.add("휴지");
		bag.add("볼펜");
		
		System.out.println(bag); // HashSet => toString()이 재정의 되어있음
		
		bag.add("볼펜"); // 중복 안됨
		System.out.println(bag) ;
	}

}
