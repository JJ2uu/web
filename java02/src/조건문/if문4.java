package 조건문;

import java.io.ObjectInputStream.GetField;
import java.util.Date;

public class if문4 {

	public static void main(String[] args) {
		// 시간을 구해주는 Date부품 (년월일시분초) java.util.Date
		
		Date date = new Date();
		
		int hour = date.getHours();
		
		if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 14) {
			System.out.println("굿애프터눈");
		} else if (hour < 20) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
		
		int month = date.getMonth() + 1; //getMonth는 음력기준이라 +1을 더해줘야함
		System.out.println(month);
		System.out.println(date.getMinutes());
		System.out.println(date.getSeconds());
		System.out.println(date.getYear() + 1900); //1900년도를 기준으로 만들어져 1900을 더해주어야 한다
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getDate());
		System.out.println(date.getDay()); //요일, 0부터 시작. 0이 일요일
	
		switch (month) {
		case 3:
		case 4:
		case 5: // 3,4,5가 되는 이유 > break가 걸려있지 않아서 다음 조건까지 진행
			System.out.println("봄");
			break;
		case 6: case 7: case 8:
			System.out.println("여름");
			break;
		case 9: case 10: case 11:
			System.out.println("가을");
			break;
		default:
			System.out.println("겨울");
			break;
		}
		
	}

}
