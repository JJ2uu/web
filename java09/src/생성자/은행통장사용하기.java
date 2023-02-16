package 생성자;

public class 은행통장사용하기 {

	public static void main(String[] args) {
		통장 여행통장 = new 통장("홍길동", "20230216", 10000);
		통장 주택청약통장 = new 통장("홍길동", "20230216", 20000);
		
		//	System.out.println(여행통장.name);
		//	System.out.println(여행통장.money);
		System.out.println(여행통장); // 원래는 참조형이라 주소가 적히지만, toString()이 있는 경우 주소가 아닌 그 주소가 가리키는 멤버변수값들을 출력해준다.
		System.out.println(주택청약통장);
	}

}
