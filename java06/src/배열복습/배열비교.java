package 배열복습;

import java.util.Random;

public class 배열비교 {

	public static void main(String[] args) {
		// 입력 : 많은 양의 저장공간(배열, 2개)
		//       배열 하나당 990개의 저장공간 필요 => 실제 생성된 저장공간개수(990+1+1)*2
		//                                                  답안 변수(990) + length(1) + 답이 들어가 있는 변수(1)
		//       랜덤으로 데이터를 입력(Random)
		//       반복문으로 배열의 위치(index)를 옮기면서 데이터를 넣자.
		
		int[] 답안지 = new int[990]; 
		int[] 내답안 = new int[990]; 
		
		//	System.out.println(답안지.length);
		//	System.out.println(내답안.length);
		//	System.out.println(답안지); => 배열의 주소
		//	System.out.println(내답안); => 배열의 주소
		
		Random r = new Random(42); // => 벽돌같은 역할 ()안에 숫자 42를 쓰면 미리 만들어놓은 랜덤을 보여준다
		for (int i = 0; i < 내답안.length; i++) {
			답안지[i] = r.nextInt(4) + 1; // 숫자 바운더리를 지정해주어야한다. 0~3 > 1~4
			내답안[i] = r.nextInt(4) + 1; // 숫자 바운더리를 지정해주어야한다.
		} // for
		
		// 데이터가 잘 들어가 있는지 확인
		System.out.println("번호:\t답안\t\t내답");
		System.out.println("===========================");
		for (int i = 0; i < 내답안.length; i++) {
			System.out.println( i + ":\t" + 답안지[i] + "\t<->\t" + 내답안[i]);
		} // for
		
		// 처리
		// 두배열의 같은 인덱스가 같은 문항인지 비교
		// 동일하면 count 1증가
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			if (내답안[i] == 답안지[i]) {
				jumsu++;
			} // if
		} // for
		
		System.out.println("토익 점수: " + jumsu);
		
		
		// 출력

	}

}
