package 배열;

import javax.swing.JOptionPane;

public class 배열확인문제2 {

	public static void main(String[] args) {
		String[] trip = {"도쿄", "오사카", "후쿠오카", "삿포로", "훗카이도"};
		for (int i = 0; i < trip.length; i++) {
			System.out.print(trip[i] + " ");
		}
		System.out.println();
		
		char[] color = {'b', 'p', 's', 'p', 'w', 'b'};
		for (int i = 0; i < color.length; i++) {
			System.out.print(color[i] + " ");
		}
		System.out.println();
		
		double[] height = {187.7, 177.7, 167.7, 197.7, 152.3};
		for (int i = 0; i < height.length; i++) {
			System.out.print(height[i] + " ");
		}
	}

}
