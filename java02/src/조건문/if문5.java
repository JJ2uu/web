package 조건문;

public class if문5 {

	public static void main(String[] args) {
					//0123456
		String ssn = "2055111";
		
		if (ssn.equals("2055111")) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}
		
		char gender = ssn.charAt(0); //첫번째 자리에 있는 문자 하나 추출
		
		switch (gender) {
		case '2': case '4':
			System.out.println("여자");
			break;
		case '1': case '3':
			System.out.println("남자");
			break;
		}
	}
	

}
