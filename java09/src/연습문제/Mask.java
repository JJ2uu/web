package 연습문제;

public class Mask {
	String color;
	int price;
	int count;
	
	public Mask(String color, int price, int count) {
		super();
		this.color = color;
		this.price = price;
		this.count = count;
	}

	@Override
	public String toString() {
		return "마스크 [ 색상=" + color + ", 가격=" + price + "원, 개수=" + count + "개 ]";
	}
	
}
