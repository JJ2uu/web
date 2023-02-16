package 상속;

public class 원더우먼 extends 우먼 {
	boolean fly;
	
	public void information() {
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age);
		System.out.println("성별은 " + gender);
		System.out.println("원더우먼은 날 수 있나? " + fly);
	}
	
	public void vs() {
		System.out.println("원더우먼이 슈퍼맨보다 쌔다.");
	}
	
}
