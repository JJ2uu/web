package 배열복습;

public class 이차원배열프린트2 {

	public static void main(String[] args) {
		String[][] s = {
				{"떡볶이", "곱창", "피자"},
				{"김치찌개", "감자탕", "곰탕"},
				{"대창", "육회", "삼겹살"}
		}; // String s
		
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}
		}
	}

}
