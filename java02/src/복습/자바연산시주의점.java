package 복습;

public class 자바연산시주의점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자바 연산시 주의점
		int x = 20;
		double y = 30;
		
		System.out.println(x / y);
		// 소수점까지 구하고 싶은 경우에는 X
		// 정수와 정수의 계산은 무조건 정수
		// 연산시 하나라도 실수이면 결관느 무조건 실수
		
		// 이미 정수로 저장된 값을 cpu가 가져다가 실수연산을 하고 싶은 경우
		// cpu가 정수를 실수로 변환해서 할 수 있음.
		System.out.println(x / (double)y); // 정수인 y값을 강제로 실수로 바꿈 (강제타입변환:강제형변환)
										   // 변환하고 싶은 변수 앞에 () 하고 변환하고자 하는 타입 적기
	}

}
