package 메서드연습;

public class 내가게3 {

	public static void main(String[] args) {
		계산기3 cal3 = new 계산기3();
		int price = 7000;
		int count1 = 5; //오전에 온 손님 수
		int count2 = 4; //오후에 온 손님 수
		
		// 계산기3을 이용해서 풀기
		// 1. 전체 손님 수를 반환받아서 다음과 같이 프린트
		//    => 오늘 온 손님의 총합은 9명입니다.
		int num = cal3.add(count1, count2);
		String num2 = cal3.string("오늘 온 손님의 총합은 ", num, "명입니다.");
		System.out.println(num2);
		
		// 2. 오전과 오후의 손님 수 차이는?
		//    => 손님 수 차이는 1명입니다.
		int num3 = cal3.minus(count1, count2);
		String num4 = cal3.string("손님 수 차이는 ", num3, "명입니다.");
		System.out.println(num4);
		
		// 3. 오전에 들어온 손님의 결제 금액은?
		//    => 오전 결제 금액은 35000원입니다.
		int price1 = cal3.mul(price, count1);
		String price11 = cal3.string("오전 결제 금액은 ", price1, "원입니다.");
		System.out.println(price11);
		
		// 4. 오후에 들어온 손님의 결제 금액은?
		//    => 오후 결제 금액은 28000원입니다.
		int price2 = cal3.mul(price, count2);
		String price22 = cal3.string("오후 결제 금액은 ", price2, "원입니다.");
		System.out.println(price22);
		
		// 5. 오전과 오후에 들어온 손님의 총 결제 금액은?
		//    => 오늘 하루 총 결제금액은 63000원입니다.
		int price3 = cal3.mul(price, count1);
		int price4 = cal3.mul(price, count2);
		int price5 = cal3.add(price3, price4);
		String price55 = cal3.string("오늘 하루 총 결제금액은 ", price5, "원입니다.");
		System.out.println(price55);
		
		// 6. 5번에서 계산한 결제 금액으로 1인당 결제 금액을 계산해주세요.
		//    => 1인당 결제 금액은 7000원 입니다.
		int price6 = cal3.div(price5, num);
		String price66 = cal3.string("1인당 결제 금액은 ", price6, "원입니다.");
		System.out.println(price66);
		
	}

}
