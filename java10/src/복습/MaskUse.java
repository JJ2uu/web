package 복습;

public class MaskUse {

	public static void main(String[] args) {
		Mask m1 = new Mask("검정색", 3000, 3);
		// m1.color = "검정색";
		// m1.price = 3000;
		// m1.count = 3;
		
		// System.out.println(m1.color);
		// System.out.println(m1.price);
		// System.out.println(m1.count);
		// System.out.printLn(m1); => Mask 멤버변수가 있는 파일에 toString() 이 없으면 m1의 주소가 출력된다.
		//                         => 멤버변수에 있는 값을 전부 출력하고 싶다면 Mask.java에 Generate toString()... 을 추가한다.
		//						   => 기존 toString(주소출력)에 오버라이드(Override 덮어쓰기)
		System.out.println(m1);
	
	}

}
