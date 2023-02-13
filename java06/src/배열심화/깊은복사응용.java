package 배열심화;

public class 깊은복사응용 {

	public static void main(String[] args) {
		String[] 과목 = {"국어", "수학", "영어", "컴퓨터", "회화"};
		int[] 학기1성적 = {44, 66, 22, 99, 100};
		int[] 학기2성적 = 학기1성적.clone();
		
		학기2성적[0] = 22;
		학기2성적[2] = 88;
		
		for (int i = 0; i < 학기1성적.length; i++) {
			System.out.print(학기1성적[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < 학기2성적.length; i++) {
			System.out.print(학기2성적[i] + " ");
		}
		System.out.println();
		int sameCount = 0; // 1학기 = 2학기
		int downCount = 0; // 1학기 > 2학기
		int upCount = 0; // 1학기 < 2학기
		String sub = ""; // 과목
		for (int i = 0; i < 학기2성적.length; i++) {
			if (학기1성적[i] == 학기2성적[i]) {
				sameCount++;
			} else if (학기1성적[i] > 학기2성적[i]) {  //if if 연속으로 쓰면 for 문을 돌릴 때마다 하지만 else if 를 사용하면 정지한다.
				downCount++;
			} else if (학기1성적[i] < 학기2성적[i]) {
				upCount++;
				sub = 과목[i] + " ";
			}
		}
		System.out.println("1학기, 2학기 점수가 동일한 과목 수: " + sameCount + "과목");
		System.out.println("2학기 점수가 떨어진 과목 수: " + downCount + "과목");
		System.out.println("2학기 점수가 오른 과목 수: " + upCount + "과목");
		System.out.println("2학기 점수가 오른 과목명: "  + sub);
	}

}
