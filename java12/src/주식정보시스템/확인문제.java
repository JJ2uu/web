package 주식정보시스템;

public class 확인문제 {

	public static void main(String[] args) {
		//	1. 기본형 형변환 중, 아래 코드를 수정해보세요.
		 // int x = 100;
		 // byte y = x;
			 
			 int x = 100;
			 byte y = (byte)x;
			 
		//	2. 참조형 형변환이 되는 조건은?
			 System.out.println("상속관계에 있을 때에만 가능");
		//	3. 상속에서 위에 물려주는 클래스를 무엇이라고 부르는가?
			 System.out.println("3. 부모클래스 super");
		//	4. 상속에서 아래 물려받는 클래스를 무엇이라고 부르는가?
			 System.out.println("4. 자식클래스 sub");
		//	5. 상속을 사용할 때 키워드는 다음중 무엇? 1) extend 2) extends 3) implements
			 System.out.println("2. extends");
		//	6. 기본형 데이터 4가지
			 System.out.println("정수, 실수, 논리, 문자");
		//	7. 참조형 데이터 2가지 이상
			 System.out.println("String, System => 배열, 클래스");
		//	8. 참조형 형변환 중, 아래 코드를 수정해보세요.
		//		   Car c = new Car();
		//		   Truck t = new Truck(); //Truck은 Car를 상속받아 만들었음.
		//		   t = (Truck)c; //수정해보세요.
			 System.out.println("String t = (String)c;");
		//	9. 기본형, 참조형 변수에 각각 들어있는 것은?
			 System.out.println("기본형: 값, 참조형: 주소");
		//	10. 참조형 변수를 초기화하려고 한다. 무엇으로 초기화해야할까?
			 System.out.println("null");
		//	11. null이란?
			 System.out.println("참조형 변수에 주소가 없다");
		//	12. 포장클래스(랩퍼클래스)란? 종류 2가지
			 System.out.println("기본형을 클래스로 만들어놓은 것 => Integer, Double, Boolean, Character");
		//	13. 업캐스팅이란?
			 System.out.println("부모클래스로 자식클래스의 타입을 자동형변환 ( Object <- String )");
		//	14. 다운캐스팅이란?
			 System.out.println("자식클래스로 부모클래스의 타입을 강제형변환 ( String <- Object ");
	}

}
