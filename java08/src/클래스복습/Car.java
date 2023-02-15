package 클래스복습;

public class Car {
	// 성질 : 변수로 구현, 멤버 변수
	String color; // 같은 pakage 안에서 쓸 경우 public은 굳이 안써도 된다.
				  // 클래스 바로 아래 선언된 변수는 클래스 전체영역에서 사용 가능한 전역변수(글로벌변수)
				  // 멤버변수는 전역변수로 자동초기화
	
	// 동작 : 기능, 멤버메서드, 함수(method, 방법)
	public void run() {
		System.out.println("부릉부릉 달리다");
	}
	
	public void up() {
		System.out.println("비싼 휘발유를 먹으러 미친듯이 속도 up!");
	}
	
}
