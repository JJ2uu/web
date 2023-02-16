package 연습문제;

public class 우리집 {

	public static void main(String[] args) {
		딸 d1 = new 딸("장유진", "여");
		딸 d2 = new 딸("장지윤", "여");

		System.out.println(d1);
		System.out.println(d2);
		System.out.println("딸 " + 딸.count + "명");
		System.out.println("아빠 지갑에 남은 돈 " + 딸.father + "원");
		d1.TV보다();
	}

}
