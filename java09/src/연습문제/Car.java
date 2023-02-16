package 연습문제;

		// Car extends Object
public class Car {
	String type; //차종
	String color; //색상
	int price; //가격
	int wheel; //바퀴 수
	
	public void run() {
		System.out.println(type + "은 바퀴가 " + wheel + "개로 달린다." );
	}

	@Override
	public String toString() {
		return "내 차 [차종: " + type + ", 색상: " + color + ", 가격: "
							+ price + ", 바퀴수: " + wheel + "]";
	}
	
	
}
