package 복습;

public class Mask {
	// 멤버변수
	String color;
	int price;
	int count;
	
	// 클래스 이름과 동일한 메서드를 만들어주면, (Generate Constructor using Field)
	// new를 가지고 객체 생성시 자동호출된다.
	// 생성자(메서드) ==> constructor
	public Mask(String color, int price, int count) {
		this.color = color; //this. 을 안넣어주면 클래스 바로 아래에에 있는 변수를 찾지 못한다. (Mask 클래스 바로 아래에 있다는 의미)
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "마스크 [color=" + color + ", price=" + price + ", count=" + count + "]";
	}
	
	
}
