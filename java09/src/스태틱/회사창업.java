package 스태틱;

public class 회사창업 {

	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동", 25, "여");
		System.out.println(직원.count);
		System.out.println(직원.ageTotal);
		
		직원 work2 = new 직원("홍길이", 26, "남");
		System.out.println(직원.count);
		System.out.println(직원.ageTotal);
		
		직원 work3 = new 직원("홍길삼", 24, "여");
		System.out.println(직원.count);
		System.out.println(직원.ageTotal);
		
		System.out.println("우리 회사의 직원 수는 " + 직원.count + "명 입니다.");
		System.out.println(work1);
		System.out.println(work2);
		System.out.println(work3);
		System.out.println("우리 회사 직원의 평균 나이는 " + 직원.ageTotal/직원.count + "살 입니다.");
	}

}
