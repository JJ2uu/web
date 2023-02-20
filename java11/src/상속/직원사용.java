package 상속;

import 복습.직원;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원(); // 그냥 복사했을 경우 import를 해주지 않아 에러가 난다.
		work.name = "홍길동"; // public
		// work.address = "강남구"; // normal // 같은 패키지인 경우에만 사용 가능 (상속인 경우 에러)
		// work.salary = 2000; // protected  // 다른 패키지인 경우 상속인 경우에만 사용 가능
		// work.rrn > 에러 , privite은 같은 클래스 안에서만 사용 가능
		
	}

}
