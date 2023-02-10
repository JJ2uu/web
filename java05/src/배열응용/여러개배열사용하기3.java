package 배열응용;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class 여러개배열사용하기3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] lastYear = new String[3];
		String[] thisYear = new String[3];

		for (int i = 0; i < lastYear.length; i++) {
			System.out.println("작년에 가고싶었던 곳을 입력하세요.");
			lastYear[i] = sc.next(); // 입력값을 lastYea에 입력 순서대로 집어 넣는다.
		}
		for (int i = 0; i < thisYear.length; i++) {
			System.out.println("올해에 가고싶었던 곳을 입력하세요.");
			thisYear[i] = sc.next(); // 입력값을 thisYear에 입력 순서대로 집어 넣는다.
		}
		
		int count1 = 0; //동일한 여행지 카운트
		for (int i = 0; i < thisYear.length; i++) {
			if (lastYear[i].equals(thisYear[i])) { // 같은 index의 위치에 있는 값이 서로 같은지 확인
				count1++;
			}
		}
		System.out.println("우선순위가 동일한 곳은 " + count1 + "곳 입니다.");
	}

}
