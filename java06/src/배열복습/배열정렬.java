package 배열복습;

import java.util.Arrays;
import java.util.Random;

public class 배열정렬 {

	public static void main(String[] args) {
		// 정렬을 할 때는 Arrays(망치) 활용
		Random r = new Random(42); //seed값
		int[] jumsu = new int[10000];
		
		for (int i = 0; i < jumsu.length; i++) {
			jumsu[i] = r.nextInt(1000) + 1; // 1~1000
		} // for
		
		// for-each는 알아서 위치값을 옮겨주면서 하나씩 꺼내온다. (index값이 없어 출력용)
		for (int x : jumsu) {
			System.out.println(x);
		} // for
		
		// 오름차순 (작 -> 큰)
		// 내림차순 (큰 -> 작)
		Arrays.sort(jumsu); //파괴형 함수
		// sort(jumsu) ==> jumsu가 완전히 바뀌어버림(원본이 파괴)
		//                 Ram에 저장된 jumsu값들을 완전히 바꿈
		// 똑같은 유형인 Integer.parseInt(n) ==> 은 Ram에 저장된 n이 변경되지는 않음(원본이 비파괴) // 비파괴형 함수
		//                                   Ram에 있는 값을 가져와 CPU가 변환한다.
		
		for (int x : jumsu) {
			System.out.println(x);
		} // for
		
		// 정렬 후 최대값, 최소값
		System.out.println("최소값: " + jumsu[0]);
		System.out.println("최대값: " + jumsu[jumsu.length-1]); // 9999보다 length를 활용한 코드가 더 좋은 코드
		
		// 상위 30%, 인원 3000명, 높은 점수부터 3000개
		int sum30 = 0;
		for (int i = 7000; i < jumsu.length; i++) { // 7000번대부터 3000명
			sum30 = sum30 + jumsu[i]; //sum += jumsu[i];
		}
		System.out.println("상위 30% 학생들의 점수 평균은: " + sum30/3000.0 + "점");
		
		// 하위 30%
		int sum302 = 0;
		for (int i = 0; i < 3000; i++) { // 밑에서부터 3000명
			sum302 = sum302 + jumsu[i];
		}
		System.out.println("하위 30% 학생들의 점수 평균은: " + sum302/3000.0 + "점");
		
		String result = Arrays.toString(jumsu); // 비파괴, CPU가 String으로 다 바꾼다.
		System.out.println(result);
	
	}
	

}
