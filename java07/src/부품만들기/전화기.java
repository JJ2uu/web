package 부품만들기;

public class 전화기 {
	// 성질 : 멤버변수 => 가격, 모양
	// public 을 붙여줘야 다른 패키지에서도 접근하여 사용할 수 있다.(접근제어자)
	public int price; // 멤버변수는 자동초기화 (0) == int price = 0;
	public String shape; // 기본형이 아닌 경우(참조형) null(주소가 없다) 초기화 == String shape = null;
	
	// 동작 : 멤버메서드(==함수), 동적인 기능을 수행
	//      => 인터넷하다, 카톡하다
	public void 인터넷하다() {
		// 기능 처리하는 방법을 나열
		System.out.println("와이파이 연결하다.");
		System.out.println("데이터를 사용하여 네트워크 연결");
	}
	public void 카톡하다() {
		System.out.println("자바 단체톡을 하다.");
		System.out.println("게시물을 올리다.");
	}
}
