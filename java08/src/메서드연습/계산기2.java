package 메서드연습;

public class 계산기2 {
	
	// Java는 입력값이 다르면 메소드 이름을 다 똑같이 써도 된다.
	// 하나의 이름으로 다양한 형태를 구현 가능하다.
	// => 다형성(오버로딩)
	// 오버로딩해서 만들어 놓으면 입력값에 따라 알아서 판단한다.
	// 앞의 입력값에 따라서 판단한다. ex) double x, int y 일 경우 3번째
	public int add(int x, int y) {
		return x + y;
	}
	public double add(int x, double y) {
		return x + y;
	}
	public double add(double x, double y) {
		return x + y;
	}
	public String add(String x, int y) {
		return x + y + "시에 점심을 먹겠어.";
	}
}
