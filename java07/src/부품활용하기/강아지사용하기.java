package 부품활용하기;

import 부품만들기.강아지;

public class 강아지사용하기 {

	public static void main(String[] args) {
		강아지 puppy = new 강아지();
		puppy.tail = 1;
		puppy.point = "깜찍하다.";
		
		System.out.println("강아지는 꼬리: " + puppy.tail + "개");
		System.out.println("강아지는 매우 " + puppy.point);
		puppy.꼬리를흔든다();
		
		강아지 puppy2 = new 강아지();
		System.out.println("---------------------------");
		puppy2.tail = 1;
		puppy2.point = "귀엽다.";
		System.out.println("강아지는 꼬리: " + puppy.tail + "개");
		System.out.println("강아지는 매우 " + puppy2.point);
		puppy2.애교를피운다();

	}

}
