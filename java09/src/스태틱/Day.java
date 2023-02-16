package 스태틱;

public class Day {
	String doing;
	int time;
	String location;
	static int timeTotal;
	static int count;
		// int count; 로 쓸 경우
		// : count++;을 해도 1, 1, 1 로 생긴다 => 각 매개변수마다 무더기 영역에 새로운 저장공간에 넣기 때문이다.
		// : 누적시키는 방법은 해당 변수에 static 도구를 사용하여 원본영역에 저장하는 방법이 있다.
	
	public Day(String doing, int time, String location) {
		// new로 부품을 만드는 것(객체생성)
		// 객체생성을 할 때마다 꼭 처리하고 싶은 내용이 있으면
		// 생성자 메서드 내에 써야한다.
		// 객체생성할 때 생성자 메서드가 자동호출되기 때문에 무조건 처리해줌.
		count++;
		timeTotal += time;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
}
