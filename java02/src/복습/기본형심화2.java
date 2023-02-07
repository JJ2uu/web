package 복습;

public class 기본형심화2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 4가지
		//     > -128~127, 1바이트 byte
		//     > -3만~3만, 2바이트 short
		//     > -21억~21억, 4바이트 int
		//     > 21억 이상, 8바이트 long
		byte age = 127;
		short days = 1000;
		int money = 100000;
		long bank = 2300000000L; // jdk가 무조건 int로 인식하기 때문에 long 을 쓸 때는 숫자 뒤에 대문자 L을 붙여준다.
		
		// 실수형 2가지
		//     > 소수점 4자리까지 4바이트 float
		//     > 소수점 4자리이상 8바이트 double
		float height = 170.4444F; // jdk문제 > 뒤에 F붙여주기
		double weight = 43.33333333;
		
		// 문자형 1가지
		//     > 한 글자 char
		
		// 논리형 1가지
		//     > boolean
	}
}
