package 형변환;

import java.util.ArrayList;

public class 컬렉션테스트 {

	public static void main(String[] args) {
		// 많은 양의 데이터를 다루는 부품류 : collection
		// => 종류가 많다
		// => 많은 양의 데이터들도 특징이 있고, 그 특징에 따라 컬렉션의 종류도 많다.
		// => 배열 + 크기조절 + 타입 무관 = ArrayList
		ArrayList list = new ArrayList(); // 멤버변수와 멤버메서드가 존재, list. 눌러서 확인
		list.add("홍길동");
		list.add(100);
		list.add(11.2);
		list.add(true);
		System.out.println(list); // 본래 참조형은 주소가 출력되어야 하지만 ArrayList는 toString()이 재정의 되어있어 값들이 출력된다.
		System.out.println(list.get(0)); // 값을 꺼낼 때에는 get을 활용해 꺼낸다.
		System.out.println(list.get(1)); // 값을 꺼낼 때에는 get을 활용해 꺼낸다.
		System.out.println(list.get(2)); // 값을 꺼낼 때에는 get을 활용해 꺼낸다.
		System.out.println(list.get(3)); // 값을 꺼낼 때에는 get을 활용해 꺼낸다.
		
		// 중간 삽입
		list.add(0, "김길동");
		System.out.println(list);
		
		// 중간 제거
		list.remove(0); // 파괴함수
		// 파괴함수 : 원본을 파괴시켜버리는 함수 (원본이 변형, ram에 있는 데이터가 변경)
		// 비파괴함수 : 원본은 파괴되지 않는 함수 (ram에 있는 데이터는 불변, CPU가 바꿈)
		System.out.println(list);
		
		// 변경
		list.set(0, "정길동"); // 파괴함수
		System.out.println(list);
		
		// index 위치 확인
		int index = list.indexOf(true);
		System.out.println(index);
		
		// 포함여부 확인
		boolean result = list.contains(11.2);
		System.out.println(result);
	}

}
