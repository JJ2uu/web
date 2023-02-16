package 스태틱;

public class 나의일지 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 8, "삼성역");
		// 객체를 생성할 때마다 나타낼 정보는 객체마다 써준다.
		System.out.println(Day.count); // italic체로 표현되는 것은 static변수
		System.out.println(Day.timeTotal);
		// static이 붙은 메서드나 변수는 class 이름을 써주어도 사용 가능하다.
		
		Day day2 = new Day("주변산책", 1, "코엑스근방");
		System.out.println(Day.count);
		System.out.println(Day.timeTotal);
		
		Day day3 = new Day("시험요약정리", 2, "강의장 5");
		System.out.println(Day.count);
		System.out.println(Day.timeTotal);
		
		// 총 12개 다이나믹 생성, 멤버변수 ==> 객체 생성할 때마다 다이나믹하게 무더기영역(heap)에 생긴 변수
		// ==> 인스턴스 변수
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);

	}

}
