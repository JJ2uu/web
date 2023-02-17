package 상속기본;

public class 학용품 {
	int price;
	String company;
	
	public void buy() {
		System.out.println("학용품을 구매하다.");
	}

	@Override
	public String toString() {
		return "학용품 [price=" + price + ", company=" + company + "]";
	}
	
	
}
