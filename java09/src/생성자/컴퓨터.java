package 생성자;

public class 컴퓨터 {
	public int price; //가격
	public String company; //회사
	public int size; // 크기
	
	public 컴퓨터(int price, String company, int size) {
		this.price = price;
		this.company = company;
		this.size = size;
	}

	@Override
	public String toString() {
		return "컴퓨터 [가격=" + price + ", 제조회사=" + company + ", 모니터크기=" + size + "]";
	}
	
	
	
}
