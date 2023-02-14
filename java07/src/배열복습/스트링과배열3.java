package 배열복습;

public class 스트링과배열3 {

	public static void main(String[] args) {
		// 전화번호 입력
		String phone = "    011-245-1234    ";
		
		// 1) 양쪽 공백을 제거하세요
		String phone1 = phone.replace("    ", "");
		System.out.println(phone1);
		
		// 2) -을 기준으로 분리해내세요 (String[])
		String[] phone2 = phone1.split("-");
		System.out.println(phone2[0]);
		System.out.println(phone2[1]);
		System.out.println(phone2[2]);
		
		// 3) 첫번째 문자열이 011이면 SK, 019이면 LG, 나머지이면 Apple
		if (phone2[0].equals("011")) {
			System.out.println("SK사용자시군요!");
		} else if (phone2[0].equals("019")) {
			System.out.println("LG사용자시군요!");
		} else {
			System.out.println("Apple사용자시군요!");
		}
		
		// 4) 두번째 문자열의 길이가 4개이상이면 최신폰, 아니면 올드폰
		String phone3 = phone2[1].trim();
		
		if (phone3.length() >= 4) {
			System.out.println("최신폰이시네요!");
		} else {
			System.out.println("아직도 올드폰?");
		}
		
		// 5) 전체 전화번호의 길이가 10글자 이상이면 유효, 아니면 무효
		int total = phone2[0].length() + phone2[1].length() + phone2[2].length();
		
		if (total >= 10) {
			System.out.println("유효한 전화번호입니다.");
		} else {
			System.out.println("유효하지 않은 전화번호입니다.");
		}
		
		
		// for문 이용하는 방법
		int total2 = 0;
		for (int i = 0; i < phone2.length; i++) {
			total2 = total + phone2[i].length();
		}
		if (total2 >= 10) {
			System.out.println("유효한 전화번호입니다.");
		} else {
			System.out.println("유효하지 않은 전화번호입니다.");
		}
		
		// - 를 제거 후 구하는 방법
		String phone11 = phone1.replace("-", "");
		System.out.println(phone11);
		if (phone11.length() >= 10) {
			System.out.println("유효한 전화번호입니다.");
		} else {
			System.out.println("유효하지 않은 전화번호입니다.");
		}
	}

}
