package 조건문;

public class if문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0;
		
		// 비교연산자로 비교할 수 있는 것은 기본형데이터만 가능
		// 조건을 쓸 때는 비교하는 것으로 쓰고, 결과는 므조건 true/false
		if (x == 0) {
			System.out.println("맞습니다.");
		} else {
			System.out.println("틀렸습니다.");
		}
		
		if (x == 1) {
			System.out.println("틀렸습니다");
		}
	}

}
