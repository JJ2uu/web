package 변수;

public class 변수선언확인문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 100;
		double eye = 0.1;
		char firstname = '김';
		boolean lunch = true;
		
		// 기본데이터 X => 너무 많이 쓰이기 때문에 기본형 데이터처럼 사용 가능
		String name = "홍길동"; // 여러글자를 쓸 때는 ""
		// 스트링, 실, 문자열
		
		System.out.println("내 나이는 " + age + "살입니다.");
		System.out.println("내 시력은  " + eye + "입니다.");
		System.out.println("내 성은 " + firstname + "입니다.");
		System.out.println("나는 점심을 먹었습니다. " + lunch);
	}
}
