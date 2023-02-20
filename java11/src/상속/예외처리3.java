package 상속;

public class 예외처리3 {

	public static void main(String[] args) {
		int[] num = new int[3];
		try {
			num[3] = 2; // 문제가 생길 코드
		} catch (Exception e) {
			// e.printStackTrace();
			System.out.println("에러코드발생");
		}
		System.out.println(num.length); //배열의 개수
		

	}

}
