package 복습;

public class 배열기본확인문제 {

	public static void main(String[] args) {
		String[] trip = {"일본", "대만", "부산", "전주", "홍콩"};
		for (String t : trip) {
			System.out.println(t);
		}
		
		char[] color = {'b', 'r', 'p', 'b', 'w'};
		for (char c : color) {
			System.out.println(c);
		}
		
		double[] height = {155.5, 166.6, 177.7, 188.8, 199.9};
		for (double h : height) {
			System.out.println(h);
		}
	}

}
