package 복습;

public class 기본형심화 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본형 4가지
		// 정수, 실수, 문자, 논리
		// int, double, char, boolean
		
		// 온도
		double temp = 1.2;
		int floor = 3;
		char color = 'b';
		boolean juice = false;
		
		String location = "선릉역";
		
		// syso + 컨트롤 + 스페이스바
		// 망치(String, System) 처럼 자주 사용하는 부분은 대문자로 바로 씁니다.
		// System : 컴퓨터, out : 출력장치(모니터)
		//				   in : 입력장치(키보드)
		System.out.println("오늘 온도는 " + temp + "도");
		System.out.println("나는 " + floor + "층에 있습니다.");
		System.out.println("오늘 컬러는 " + color + "lue 입니다.");
		System.out.println("나는 오늘 쥬스를 마셨습니다. " + juice );
	}

}
