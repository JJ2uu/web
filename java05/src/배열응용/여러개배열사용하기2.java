package 배열응용;

public class 여러개배열사용하기2 {

	public static void main(String[] args) {
		String[] names = {"홍길원", "홍길투", "홍길삼", "홍길사", "홍길오"};
		int[] term1 = { 77, 88, 99, 55, 70 };
		int[] term2 = { 99, 100, 100, 80, 70 };
		
		int count1 = 0;
		int count2 = 0;
		
		for (int i = 0; i < term2.length; i++) {
			if (term1[i] < term2[i]) {
				count1++; // 1. 2학기 성적이 오른 학생 몇명??
			}
			if (term1[i] == term2[i]) {
				count2++; // 2. 1학기, 2학기 성적이 동일한 학생 몇명??
			}
		}
		
		System.out.println("2학기 성적이 오른 학생 수: " + count1 + "명");
		System.out.println("1학기, 2학기 성적이 동일한 학생 수: " + count2 + "명");
		
		// 3. 2학기 학생 중 만점(100) 인 학생의 이름과 번호는?
		for (int i = 0; i < term2.length; i++) {
			if (term2[i] == 100) {
				System.out.println("2학기 학생 중 만점인 학생: " + (i + 1) + "번 " + names[i]);
			}
		}
		
		// 4. 1학기 성적의 평균과 2학기 성적의 평균 중 어느학기가 더 높았나요?
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < term2.length; i++) {
			sum1 = sum1 + term1[i];
			sum2 = sum2 + term2[i];
		} if (sum1/term1.length > sum2/term2.length) {
			double result = (double)(sum1/term1.length) - (sum2/term2.length);
			System.out.println("1학기 성적 평균이 2학기 성적 평균보다 " + result + "점 높았습니다.");
		} else if (sum1/term1.length < sum2/term2.length) {
			double result2 = (double)(sum2/term2.length) - (sum1/term1.length);
			System.out.println("2학기 성적 평균이 1학기 성적 평균보다 " + result2 + "점 높았습니다.");
		} else {
			System.out.println("1학기, 2학기 성적 평균이 같습니다.");
		}
		
		// 5. 홍길삼의 1학기 성적, 2학기 성적은?
		for (int i = 0; i < term2.length; i++) {
			if (names[i].equals("홍길삼")) {
				System.out.println(names[i] + "의 1학기 성적은 " + term1[i] + "점, 2학기 성적은 " + term2[i] + "점 입니다." );
			}
		}
	}

}
