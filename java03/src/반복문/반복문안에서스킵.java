package 반복문;

public class 반복문안에서스킵 {

	public static void main(String[] args) {
		// 1번부터 10번까지 데이터 중에서 짝수만 프린트
		for (int i = 1; i <= 10; i++) {
			// i가 8이 되면 종료
			if (i == 8) {
				//break; > for문 종료, for문 아래에 있는 syso 실행 X
				System.exit(0); // 0: 정상종료
				//0이 아닌 다른 값 : 바정상 종료(강제종료)
			}
			if (i % 2 != 0) { // 2로 나눈 나머지가 0이면 짝수, 0이 아니면 홀수
				continue; // 스킵하고 실행해라 라는 의미 > 이번i만 
			}
			System.out.println(i);
		}
		System.out.println("휴~for문 끝");

	}

}
