package 조건문;

import javax.swing.JOptionPane;

public class 인기투표10명 {

	public static void main(String[] args) {
		// 1)아이유 2)뉴진스 3)엔믹스
		int iu = 0;
		int njs = 0;
		int nmx = 0;
		
		for (int i = 0; i < 10; i++) {
			String data = JOptionPane.showInputDialog("가장 좋아하는 가수 선택 1)아이유 2)뉴진스 3)엔믹스");
			if (data.equals("1")) {
				iu++;
			} else if (data.equals("2")) {
				njs++;
			} else if (data.equals("3")) {
				nmx++;
			}
		}
		
		System.out.println("아이유 " + iu + "표" );
		System.out.println("뉴진스 " + njs + "표" );
		System.out.println("엔믹스 " + nmx + "표" );
	}

}
