package 조건문;

public class if문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// x와 y가 같은지 비교하고, 같으면 "동일합니다" 라고 프린트
		// 같지 않으면 "동일하지 않아요" 프린트
		
		int x = 0;
		int y = 0;
		
		if (x == y) {
			System.out.println("동일합니다.");
		} else {
			System.out.println("동일하지 않습니다.");
		}
		
		int id1 = 1111;
		int id2 = 2222;
		
		if (id1 == id2) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
		
		
		
	}

}
