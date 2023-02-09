package 배열;

public class 배열개념 {

	public static void main(String[] args) {
		// 여러개의 데이터를 램에 저장해두고
		// cpu가 접근하여 사용하고싶은 경우 사용하는 부품
		// 1. 값을 이미 알고 있는 경우
		int[] jumsu = {10, 20, 30, 40}; // length를 cpu가 자동으로 만들어서 몇개가 저장되어있는지 세어서 값을 넣어준다.
		System.out.println(jumsu);
		System.out.println(jumsu[0]); // 첫번째 값
		System.out.println(jumsu[1]); // 두번째 값
		System.out.println(jumsu[2]); // 세번쨰 값
		System.out.println(jumsu[3]); // 네번쨰 값 
		System.out.println("전체 개수: " + jumsu.length); // 갯수
		
		jumsu[0] = 100;
		System.out.println(jumsu[0]); //첫번째 값으로 100을 넣으세요.
		
		
		// 2. 값을 아직 모르고 있는데, 먼저 저장공간 만들어주고
		//    나중에 값을 넣는 경우
		
		int[] jumsu2 = new int[4];
		jumsu2[0] = 200;
		System.out.println(jumsu2[0]);

	}

}
