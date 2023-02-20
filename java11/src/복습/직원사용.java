package 복습;

public class 직원사용 {

	public static void main(String[] args) {
		직원 work = new 직원();
		work.name = "홍길동"; // public
		work.address = "강남구"; // normal
		work.salary = 2000; // protected
		// work.rrn > 에러 , privite은 같은 클래스 안에서만 사용 가능
		
	}

}
