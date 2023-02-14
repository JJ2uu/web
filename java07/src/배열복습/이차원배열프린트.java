package 배열복습;

public class 이차원배열프린트 {

	public static void main(String[] args) {
		// 배열을 만들 때 이미 알고 있는 경우
		int[][] n1 = {
		//  j    0  1  2      i
				{1, 2, 3}, // 0
				{4, 5, 6} // 1
		};
		System.out.println(n1.length); // 2차원 배열의 length(행), 2개
		System.out.println(n1[0][0]);
		System.out.println(n1[1][2]); //n1[행][열]
		for (int i = 0; i < n1.length; i++) { // 하나의 행에서 => i가 늘어나는 for문
			for (int j = 0; j < n1[i].length; j++) { // j가 늘어나는 for문 생성 (열)
				            // n1[i]는 한 행의 길이를 나타낸다.
				System.out.println(n1[i][j]);
			}
		}
		
		// 배열을 만들 때 아직 모르는 경우, 공간을 먼저 만든다.
		int[][] n2 = new int[2][3]; // 열이 같다면 숫자를 쓰지만 다르다면 쓰지 않는다. => 다를 경우 [2][];
		
	}

}
